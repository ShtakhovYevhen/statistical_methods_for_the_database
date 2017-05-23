package com.statisticMethod.models.impl;

import com.statisticMethod.models.Graph;
import com.statisticMethod.models.Project;
import com.statisticMethod.models.ProjectTypes;

import java.util.Date;
import java.util.List;

public abstract class AbstractProject implements Project{
    private long id;
    private String name;
    private Date creationDate;
    private String description;
    private ProjectTypes type;
    private List<Graph> graphs;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectTypes getType() {
        return type;
    }

    public void setType(ProjectTypes type) {
        this.type = type;
    }

    public List<Graph> getGraphs() {
        return graphs;
    }

    public void setGraphs(List<Graph> graphs) {
        this.graphs = graphs;
    }
}
