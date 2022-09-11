package com.kanbanboard.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping
    public ResponseEntity getProjectList(){
        return new ResponseEntity(projectService.getAllProjects(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewProject(@RequestBody ProjectEntity project){
        projectService.addNewProject(project);
        return new ResponseEntity(project, HttpStatus.CREATED);
    }

    @GetMapping("/{pid}")
    public ResponseEntity findProjectByPid(@PathVariable("pid") String pid){
        return new ResponseEntity(projectService.findProjectByPid(pid), HttpStatus.OK);
    }
}
