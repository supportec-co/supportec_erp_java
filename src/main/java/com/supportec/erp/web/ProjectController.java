package com.supportec.erp.web;

import com.supportec.erp.service.ProjectService;
import com.supportec.erp.web.dto.ProjectResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/projects")
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping
    public List<ProjectResponseDto> findAll() {
        return projectService.findAll();
    }

}
