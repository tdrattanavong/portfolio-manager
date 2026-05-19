package com.pluralsight.models;

import com.pluralsight.interfaces.Valuable;

import java.util.List;

public class Portfolio implements Valuable {
    private String name;
    private String owner;
    List<Valuable> assets;

    public Portfolio(String name, String owner, List<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public List<Valuable> getAssets() {
        return assets;
    }

    public void add(Valuable asset){
        assets.add(asset);
    }

    @Override
    public double getValue() {
        double total = 0;

        for(Valuable asset : assets){
            total += asset.getValue();
        }
        return total;
    }

    public Valuable getMostValuable(){
//        Here we're checking to see if the list is empty
//        If it is empty then there is no need to find the greatest!
        if(assets.isEmpty()) return null;

//        Here we're grabbing the first item in the list
//        We use this item to compare and check to find the greatest in the list
        Valuable most = assets.get(0);

//        For each asset...
        for (Valuable asset : assets){
//            If the asset is greater than the greatest we've seen...
            if(asset.getValue() > most.getValue()){
//                Change the greatest we've seen to that asset!
                most = asset;
            }
        }

        return most;
    }

    public Valuable getLeastValuable(){
        if(assets.isEmpty()) return null;

        Valuable least = assets.get(0);

        for (Valuable asset : assets){
            if(asset.getValue() <  least.getValue()){
                least = asset;
            }
        }
        return least;
    }



    public void printPortfolio(){
        IO.println("===================================");
        IO.println("          " + name);
        IO.println("          " + owner);
        IO.println("===================================");

        for(Valuable asset : assets){
            System.out.printf(" %-20s $%10.2f%n", asset.getClass().getSimpleName() + ":", asset.getValue());
        }
        IO.println("===================================");
        System.out.printf(" %-20s $%10.2f%n", "Next Value: ", getValue());
    }


}
