package project.mapper;

import java.time.LocalDate;
import org.springframework.stereotype.Component;
import project.dto.KnowledgePackageRequestDto;
import project.dto.KnowledgePackageResponseDto;
import project.model.KnowledgePackage;
import project.service.KnowledgePackageService;

@Component
public class KnowledgePackageMapper {
    private final KnowledgePackageService knowledgePackageService;

    public KnowledgePackageMapper(KnowledgePackageService knowledgePackageService) {
        this.knowledgePackageService = knowledgePackageService;
    }

    public KnowledgePackageResponseDto toDto(KnowledgePackage knowledgePackage) {
        KnowledgePackageResponseDto knowledgePackageResponseDto = new KnowledgePackageResponseDto();
        knowledgePackageResponseDto.setId(knowledgePackage.getId());
        knowledgePackageResponseDto.setTitle(knowledgePackage.getTitle());
        knowledgePackageResponseDto.setDescription((knowledgePackage.getDescription()));
        knowledgePackageResponseDto.setCreationDate(knowledgePackage.getCreationDate());
        return knowledgePackageResponseDto;
    }

    public KnowledgePackage toModel(KnowledgePackageRequestDto knowledgePackageRequestDto) {
        KnowledgePackage knowledgePackage = new KnowledgePackage();
        knowledgePackage.setTitle(knowledgePackageRequestDto.getTitle());
        knowledgePackage.setDescription(knowledgePackageRequestDto.getDescription());
        knowledgePackage.setCreationDate(LocalDate.now());
        return knowledgePackage;
    }
}
