package com.pattern.products;

public class Coal implements MineProduct{

    @Override
    public void use() {
        burn();
    }

    @Override
    public void throwAway() {
        // stub
    }

    public void burn() {
        // stub
    }
}
