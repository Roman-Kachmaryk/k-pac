package project.dao.impl;

import java.sql.PreparedStatement;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import project.dao.KnowledgePackageSetDao;
import project.model.KnowledgePackage;
import project.model.KnowledgePackageSet;

@Repository
public class KnowledgePackageSetDaoImpl implements KnowledgePackageSetDao {
    private final JdbcTemplate jdbcTemplate;

    public KnowledgePackageSetDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<KnowledgePackageSet> getAll() {
        return jdbcTemplate.query("SELECT * FROM knowledge_package_sets;",
                new BeanPropertyRowMapper<>(KnowledgePackageSet.class));
    }

    @Override
    public KnowledgePackageSet create(KnowledgePackageSet knowledgePackageSet) {
        String query = "INSERT INTO knowledge_package_sets (title)"
                + " VALUES(?);";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement
                    = connection.prepareStatement(query, new String[] {"id"});
            preparedStatement.setString(1, knowledgePackageSet.getTitle());
            return preparedStatement;
        }, keyHolder);
        knowledgePackageSet.setId(keyHolder.getKey().longValue());
        return knowledgePackageSet;
    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("DELETE FROM knowledge_package_sets WHERE id = ?;", id);
    }

    @Override
    public List<KnowledgePackage> getAllKpacsById(Long id) {
        String query = "SELECT kp.*"
                + " FROM knowledge_packages AS kp"
                + " INNER JOIN pac_sets AS ps"
                + " ON kp.id = ps.knowledge_package_id"
                + " INNER JOIN knowledge_package_sets AS kps"
                + " ON ps.knowledge_package_set_id = kps.id"
                + " WHERE kps.id = ?;";
        return jdbcTemplate.query(
                query, new Object[]{id}, new BeanPropertyRowMapper<>(KnowledgePackage.class));
    }
}
