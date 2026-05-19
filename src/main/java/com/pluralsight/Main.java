package com.pluralsight;

import com.pluralsight.interfaces.Valuable;
import com.pluralsight.models.Gold;
import com.pluralsight.models.House;
import com.pluralsight.models.Jewelry;
import com.pluralsight.models.Portfolio;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        List<Valuable> assets = new ArrayList<>();
        Portfolio bobbi = new Portfolio("Bobbi's Portfolio", "Bobbi", assets);

        House house = new House("Bobbi's Mansion", 50000000,2026,67000, 12);
        Jewelry jewelry = new Jewelry("Bobbi's AP", 325000, 18);
        Gold gold = new Gold("Bobbi's Gold", 87642323, 77777777);

        bobbi.add(house);
        bobbi.add(jewelry);
        bobbi.add(gold);

        bobbi.printPortfolio();


        Portfolio Jacintha = new Portfolio("")
    }
}