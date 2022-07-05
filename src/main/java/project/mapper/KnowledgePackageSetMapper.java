package project.mapper;

import org.springframework.stereotype.Component;
import project.dto.KnowledgePackageSetRequestDto;
import project.dto.KnowledgePackageSetResponseDto;
import project.model.KnowledgePackageSet;
import project.service.KnowledgePackageSetService;

@Component
public class KnowledgePackageSetMapper {
    private final KnowledgePackageSetService knowledgePackageSetService;

    public KnowledgePackageSetMapper(KnowledgePackageSetService knowledgePackageSetService) {
        this.knowledgePackageSetService = knowledgePackageSetService;
    }

    public KnowledgePackageSetResponseDto toDto(KnowledgePackageSet knowledgePackageSet) {
        KnowledgePackageSetResponseDto knowledgePackageSetResponseDto
                = new KnowledgePackageSetResponseDto();
        knowledgePackageSetResponseDto.setId(knowledgePackageSet.getId());
        knowledgePackageSetResponseDto.setTitle(knowledgePackageSet.getTitle());
        return knowledgePackageSetResponseDto;
    }

    public KnowledgePackageSet toModel(
            KnowledgePackageSetRequestDto knowledgePackageSetRequestDto) {
        KnowledgePackageSet knowledgePackageSet = new KnowledgePackageSet();
        knowledgePackageSet.setTitle(knowledgePackageSetRequestDto.getTitle());
        return knowledgePackageSet;
    }
}
