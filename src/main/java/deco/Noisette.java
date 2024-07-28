package deco;

import products.Boisson;

public class Noisette extends DecorateurBoisson{
    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au Noisette";
    }

    @Override
    public double cout() {
        return 3 + boisson.cout();
    }
}
