package com.pattern.products;

public class Rock implements MineProduct{
    @Override
    public void use() {
        leave();
    }

    @Override
    public void throwAway() {
        // stub
    }

    @Override
    public void appreciate() {
        //stub
    }

    private void leave(){
        // stub
    }
}
