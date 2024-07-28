package deco;

import products.Boisson;

public class Vanille extends DecorateurBoisson{
    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au Vanille";
    }

    @Override
    public double cout() {
        return 1.5 + boisson.cout();
    }
}
