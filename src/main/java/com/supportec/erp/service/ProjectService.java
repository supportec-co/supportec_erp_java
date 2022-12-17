package com.supportec.erp.service;

import com.supportec.erp.domain.project.Project;
import com.supportec.erp.domain.project.ProjectRepository;
import com.supportec.erp.web.dto.ProjectResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public List<ProjectResponseDto> findAll() {
        List<ProjectResponseDto> projects = new ArrayList<>();
        projectRepository.findAll().forEach(p -> projects.add(new ProjectResponseDto(p)));
        return projects;
    }

}
