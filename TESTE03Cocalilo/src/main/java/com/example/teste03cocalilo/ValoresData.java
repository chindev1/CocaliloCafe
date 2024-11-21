package com.example.teste03cocalilo;

public class ValoresData {


    private static final ValoresData instance = new ValoresData();

    Double valoresTotal = 0.1;

    ValoresData() {}

    public static ValoresData getInstance() {
        return instance;
    }

    public Double valor() {
        return valoresTotal;
    }

    public void setValoresTotal(Double valoresTotal) {
        this.valoresTotal += valoresTotal;
    }
}

