package com.pattern;

import com.pattern.products.Coal;
import com.pattern.products.Jewel;
import com.pattern.products.MineProduct;
import com.pattern.products.ProductType;

public class Miner { // Client Class

    private MineProduct jewel;
    private MineProduct coal;

    private Jewel properJewel;
    private Coal properCoal;

    public void Client() {
        Mine mine = new Mine();

        this.jewel = mine.createProduct(ProductType.JEWEL);
        this.coal = mine.createProduct(ProductType.COAL);

        this.properJewel = mine.createJewel();
        this.properCoal = mine.createCoal();
    }

    public static void main (String args[]){
        Miner miner = new Miner();

        miner.jewel.use();
        miner.coal.use();

        miner.properCoal.burn();
        miner.properJewel.mount();

    }
}
