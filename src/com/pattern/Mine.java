package com.pattern;

import com.pattern.products.MineProduct;
import com.pattern.products.Coal;
import com.pattern.products.Jewel;
import com.pattern.products.ProductType;

public class Mine {

    public MineProduct createProduct(ProductType type) {
        try {
            return switch (type) {
                case JEWEL -> Mine.createJewel();
                case COAL -> Mine.createCoal();
            };
        } catch(Exception e){
            return null;
        }
    }

    public static Jewel createJewel(){
        return new Jewel();
    }

    public static Coal createCoal(){
        return new Coal();
    }
}
