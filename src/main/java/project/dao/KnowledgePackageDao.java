package project.dao;

import java.util.List;
import project.model.KnowledgePackage;

public interface KnowledgePackageDao {
    List<KnowledgePackage> getAll();

    KnowledgePackage create(KnowledgePackage knowledgePackage);

    void delete(Long id);
}
