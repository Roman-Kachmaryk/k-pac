package project.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.dto.KnowledgePackageResponseDto;
import project.mapper.KnowledgePackageMapper;
import project.service.KnowledgePackageSetService;

@RestController
@RequestMapping("/set")
public class SetController {
    private final KnowledgePackageSetService knowledgePackageSetService;
    private final KnowledgePackageMapper knowledgePackageMapper;

    public SetController(KnowledgePackageSetService knowledgePackageSetService,
                         KnowledgePackageMapper knowledgePackageMapper) {
        this.knowledgePackageSetService = knowledgePackageSetService;
        this.knowledgePackageMapper = knowledgePackageMapper;
    }

    @GetMapping("/{id}")
    public List<KnowledgePackageResponseDto> getAllKpacsById(@PathVariable Long id) {
        return knowledgePackageSetService.getAllKpacsById(id).stream()
                .map(knowledgePackageMapper::toDto)
                .collect(Collectors.toList());
    }
}
