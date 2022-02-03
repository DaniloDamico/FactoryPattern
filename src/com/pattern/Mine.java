package com.pattern;

import com.pattern.products.MineProduct;
import com.pattern.products.Coal;
import com.pattern.products.Jewel;
import com.pattern.products.ProductType;

public class Mine { // Factory Class

    public MineProduct createProduct(ProductType type) {
        try {
            return switch (type) {
                case JEWEL -> new Jewel();
                case COAL -> new Coal();
            };
        } catch(Exception e){
            return null;
        }
    }

    public Jewel createJewel(){
        return new Jewel();
    }

    public Coal createCoal(){
        return new Coal();
    }
}
