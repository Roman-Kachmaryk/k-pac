package project.service;

import java.util.List;
import project.model.KnowledgePackage;

public interface KnowledgePackageService {
    List<KnowledgePackage> getAll();

    KnowledgePackage create(KnowledgePackage knowledgePackage);

    void delete(Long id);
}
