package com.statisticMethod.models.impl;

import com.google.gson.JsonObject;
import com.statisticMethod.models.Correlation;
import com.statisticMethod.models.Graph;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

public class GraphImpl implements Graph {
    private JsonObject graphJSON;
    private String name;
    private long id;
    private Map<Graph, Correlation> correlation;
    private BigDecimal average;
    private BigDecimal olympicAverage;
    private BigDecimal dispersion;
    private BigDecimal mathExpectation;

    private GraphImpl(JsonObject graphJSON, String name, long id, Map<Graph, Correlation> correlation, BigDecimal average, BigDecimal olympicAverage, BigDecimal dispersion, BigDecimal mathExpectation) {
        this.graphJSON = graphJSON;
        this.name = name;
        this.id = id;
        this.correlation = correlation;
        this.average = average;
        this.olympicAverage = olympicAverage;
        this.dispersion = dispersion;
        this.mathExpectation = mathExpectation;
    }

    public void setGraphJSON(JsonObject graphJSON) {
        this.graphJSON = graphJSON;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Map<Graph, Correlation> getCorrelation() {
        return correlation;
    }

    public void setCorrelation(Map<Graph, Correlation> correlation) {
        this.correlation = correlation;
    }

    public BigDecimal getAverage() {
        return average;
    }

    public void setAverage(BigDecimal average) {
        this.average = average;
    }

    public BigDecimal getOlympicAverage() {
        return olympicAverage;
    }

    public void setOlympicAverage(BigDecimal olympicAverage) {
        this.olympicAverage = olympicAverage;
    }

    public BigDecimal getDispersion() {
        return dispersion;
    }

    public void setDispersion(BigDecimal dispersion) {
        this.dispersion = dispersion;
    }

    public BigDecimal getMathExpectation() {
        return mathExpectation;
    }

    public void setMathExpectation(BigDecimal mathExpectation) {
        this.mathExpectation = mathExpectation;
    }

    public JsonObject getGraphJSON() {
        return graphJSON;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
