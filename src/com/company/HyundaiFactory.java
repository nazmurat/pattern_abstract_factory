package com.company;

public class HyundaiFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new  HyundaiSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new HyundaiCoupe();
    }
}
