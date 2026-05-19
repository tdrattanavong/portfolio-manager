package com.pluralsight.models;

import com.pluralsight.interfaces.Valuable;

import java.util.List;

public class Portfolio extends Valuable {
    private String name;
    private String owner;
    List<Valuable> assets;

    public Portfolio(String name, String owner, List<Valuable> assets){
        this.name = name;
        this.name = owner;

    }
}
