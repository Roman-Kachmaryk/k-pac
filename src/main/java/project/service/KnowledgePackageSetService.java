package project.service;

import java.util.List;
import project.model.KnowledgePackage;
import project.model.KnowledgePackageSet;

public interface KnowledgePackageSetService {
    List<KnowledgePackageSet> getAll();

    KnowledgePackageSet create(KnowledgePackageSet knowledgePackageSet);

    void delete(Long id);

    public List<KnowledgePackage> getAllKpacsById(Long id);
}
