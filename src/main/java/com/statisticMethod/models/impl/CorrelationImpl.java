package com.statisticMethod.models.impl;

import com.statisticMethod.models.Graph;

import java.math.BigDecimal;

public class CorrelationImpl {
    private Graph firstGraphic;
    private Graph secondGraphic;

    public Graph getFirstGraphic() {
        return firstGraphic;
    }

    public void setFirstGraphic(Graph firstGraphic) {
        this.firstGraphic = firstGraphic;
    }

    public Graph getSecondGraphic() {
        return secondGraphic;
    }

    public void setSecondGraphic(Graph secondGraphic) {
        this.secondGraphic = secondGraphic;
    }

    public BigDecimal getCorrelationValue() {
        return correlationValue;
    }

    public void setCorrelationValue(BigDecimal correlationValue) {
        this.correlationValue = correlationValue;
    }

    private BigDecimal correlationValue;

}
