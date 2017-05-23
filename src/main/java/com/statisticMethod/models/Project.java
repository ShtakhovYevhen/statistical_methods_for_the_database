package com.statisticMethod.models;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public interface Project {
    long getId();

    String getName();

    Date getCreationDate();

    ProjectTypes getType();

    String getDescription();

    void setId(long id);

    List<Graph> getGraphs();
}
