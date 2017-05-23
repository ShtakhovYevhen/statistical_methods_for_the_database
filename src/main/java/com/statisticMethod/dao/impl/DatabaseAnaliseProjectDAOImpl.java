package com.statisticMethod.dao.impl;

import com.statisticMethod.dao.DatabaseAnaliseProjectDAO;
import com.statisticMethod.models.Graph;
import com.statisticMethod.models.Project;

import java.util.List;

public class DatabaseAnaliseProjectDAOImpl implements DatabaseAnaliseProjectDAO {
    public Project getProjectById(long id) {
        return null;
    }

    public Project getProjectByName(String projectName) {
        return null;
    }

    public boolean deleteProject(Project project) {
        return false;
    }

    public Project saveProject(String name, String description, List<Graph> graphics) {
        return null;
    }

    public List<Graph> getProjectGraphs(Project project) {
        return null;
    }
}
