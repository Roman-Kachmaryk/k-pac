package project.dao;

import java.util.List;
import project.model.KnowledgePackage;
import project.model.KnowledgePackageSet;

public interface KnowledgePackageSetDao {
    List<KnowledgePackageSet> getAll();

    KnowledgePackageSet create(KnowledgePackageSet knowledgePackageSet);

    void delete(Long id);

    List<KnowledgePackage> getAllKpacsById(Long id);
}
