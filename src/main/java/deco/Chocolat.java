package deco;

import products.Boisson;

public class Chocolat extends DecorateurBoisson{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au Chocolat";
    }

    @Override
    public double cout() {
        return 1 + boisson.cout();
    }
}
