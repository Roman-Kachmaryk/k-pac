package project.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import project.dao.KnowledgePackageSetDao;
import project.model.KnowledgePackage;
import project.model.KnowledgePackageSet;
import project.service.KnowledgePackageSetService;

@Service
public class KnowledgePackageSetServiceImpl implements KnowledgePackageSetService {
    private final KnowledgePackageSetDao knowledgePackageSetDao;

    public KnowledgePackageSetServiceImpl(KnowledgePackageSetDao knowledgePackagSetDao) {
        this.knowledgePackageSetDao = knowledgePackagSetDao;
    }

    @Override
    public List<KnowledgePackageSet> getAll() {
        return knowledgePackageSetDao.getAll();
    }

    @Override
    public KnowledgePackageSet create(KnowledgePackageSet knowledgePackageSet) {
        return knowledgePackageSetDao.create(knowledgePackageSet);
    }

    @Override
    public void delete(Long id) {
        knowledgePackageSetDao.delete(id);
    }

    @Override
    public List<KnowledgePackage> getAllKpacsById(Long id) {
        return knowledgePackageSetDao.getAllKpacsById(id);
    }
}
