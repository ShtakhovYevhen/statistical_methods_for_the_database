package com.statisticMethod.dao;

import com.statisticMethod.models.Graph;
import com.statisticMethod.models.Project;

import java.util.List;

public interface DatabaseAnaliseProjectDAO {
    Project getProjectById(long id);
    Project getProjectByName(String projectName);
    boolean deleteProject(Project project);
    Project saveProject(String name, String description, List<Graph> graphics);
    List<Graph> getProjectGraphs(Project project);
}
