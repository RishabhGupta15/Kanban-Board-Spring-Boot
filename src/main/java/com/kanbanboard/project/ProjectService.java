package com.kanbanboard.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public List<ProjectEntity> getAllProjects(){
        return projectRepository.findAll();
    }

    public void addNewProject(ProjectEntity project){
        projectRepository.save(project);
    }

    public ProjectEntity findProjectByPid(String pid){
        return projectRepository.findBypID(pid);
    }
}
