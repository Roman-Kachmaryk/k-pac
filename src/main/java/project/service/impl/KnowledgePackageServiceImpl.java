package project.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import project.dao.KnowledgePackageDao;
import project.model.KnowledgePackage;
import project.service.KnowledgePackageService;

@Service
public class KnowledgePackageServiceImpl implements KnowledgePackageService {
    private final KnowledgePackageDao knowledgePackageDao;

    public KnowledgePackageServiceImpl(KnowledgePackageDao knowledgePackageDao) {
        this.knowledgePackageDao = knowledgePackageDao;
    }

    @Override
    public List<KnowledgePackage> getAll() {
        return knowledgePackageDao.getAll();
    }

    @Override
    public KnowledgePackage create(KnowledgePackage knowledgePackage) {
        return knowledgePackageDao.create(knowledgePackage);
    }

    @Override
    public void delete(Long id) {
        knowledgePackageDao.delete(id);
    }
}
