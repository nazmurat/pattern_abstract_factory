package com.company;

public class NissanFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new  NissanSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new NissanCoupe();
    }
}
