package com.pattern;

import com.pattern.products.Coal;
import com.pattern.products.Jewel;
import com.pattern.products.MineProduct;
import com.pattern.products.ProductType;

public class Miner {
    private MineProduct jewel;
    private MineProduct coal;

    public void client() {
        Mine mine = new Mine();

        this.jewel = mine.createProduct(ProductType.JEWEL);
        this.coal = mine.createProduct(ProductType.COAL);

    }

    public static void main (String[] args){
        Miner miner = new Miner();

        miner.jewel.use();
        miner.coal.use();

    }
}
