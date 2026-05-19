package com.pluralsight.models;

import com.pluralsight.abstractions.FixedAsset;

public class Jewelry extends FixedAsset {
    double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}