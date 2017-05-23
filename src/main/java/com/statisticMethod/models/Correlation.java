package com.statisticMethod.models;

import java.math.BigDecimal;

public interface Correlation {

    Graph getFirstGraphic();

    Graph getSecondGraphic();

    BigDecimal getCorrelation();
}
