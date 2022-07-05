package project.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.dto.KnowledgePackageSetRequestDto;
import project.dto.KnowledgePackageSetResponseDto;
import project.mapper.KnowledgePackageMapper;
import project.mapper.KnowledgePackageSetMapper;
import project.service.KnowledgePackageSetService;

@RestController
@RequestMapping("/sets")
public class KnowledgePackageSetController {
    private final KnowledgePackageSetService knowledgePackageSetService;
    private final KnowledgePackageMapper knowledgePackageMapper;
    private final KnowledgePackageSetMapper knowledgePackageSetMapper;

    public KnowledgePackageSetController(KnowledgePackageSetService knowledgePackageSetService,
                                         KnowledgePackageMapper knowledgePackageMapper,
                                         KnowledgePackageSetMapper knowledgePackageSetMapper) {
        this.knowledgePackageSetService = knowledgePackageSetService;
        this.knowledgePackageMapper = knowledgePackageMapper;
        this.knowledgePackageSetMapper = knowledgePackageSetMapper;
    }

    @GetMapping
    public List<KnowledgePackageSetResponseDto> getAll() {
        return knowledgePackageSetService.getAll().stream()
                .map(knowledgePackageSetMapper::toDto)
                .collect(Collectors.toList());
    }

    @PostMapping
    public KnowledgePackageSetResponseDto create(
            @RequestBody KnowledgePackageSetRequestDto knowledgePackageSetRequestDto) {
        return knowledgePackageSetMapper.toDto(knowledgePackageSetService.create(
                knowledgePackageSetMapper.toModel(knowledgePackageSetRequestDto)));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        knowledgePackageSetService.delete(id);
    }
}
