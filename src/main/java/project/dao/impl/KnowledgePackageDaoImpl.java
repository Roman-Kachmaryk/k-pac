package project.dao.impl;

import java.sql.PreparedStatement;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import project.dao.KnowledgePackageDao;
import project.model.KnowledgePackage;

@Repository
public class KnowledgePackageDaoImpl implements KnowledgePackageDao {
    private final JdbcTemplate jdbcTemplate;

    public KnowledgePackageDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<KnowledgePackage> getAll() {
        return jdbcTemplate.query("SELECT * FROM knowledge_packages;",
                new BeanPropertyRowMapper<>(KnowledgePackage.class));
    }

    @Override
    public KnowledgePackage create(KnowledgePackage knowledgePackage) {
        String query = "INSERT INTO knowledge_packages (title, description)"
                    + " VALUES(?, ?);";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement
                    = connection.prepareStatement(query, new String[] {"id"});
            preparedStatement.setString(1, knowledgePackage.getTitle());
            preparedStatement.setString(2, knowledgePackage.getDescription());
            return preparedStatement;
        }, keyHolder);
        knowledgePackage.setId(keyHolder.getKey().longValue());
        return knowledgePackage;
    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("DELETE FROM knowledge_packages WHERE id = ?;", id);
    }
}
