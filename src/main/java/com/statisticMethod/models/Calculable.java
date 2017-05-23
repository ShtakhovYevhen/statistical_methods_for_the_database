package com.statisticMethod.models;

import java.math.BigDecimal;
import java.util.Map;

public interface Calculable {
    Map<Graph, Correlation> getCorrelation();
    BigDecimal getAverage();
    BigDecimal getOlympicAverage();
    BigDecimal getDispersion();
    BigDecimal getMathExpectation();
}
