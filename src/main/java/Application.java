
import deco.Chocolat;
import deco.Lait;
import deco.Noisette;
import products.Boisson;
import products.Espresso;
import products.Sumatra;

public class Application {
    public static void main(String[] args) {
        Boisson boisson;
        boisson = new Sumatra();
        System.out.println(boisson.getDescription() + " : " + boisson.cout());

        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription() + " : " + boisson.cout());

        boisson = new Noisette(boisson);
        System.out.println(boisson.getDescription() + " : " + boisson.cout());

        System.out.println("*******************************");

        Boisson b = new Chocolat(new Noisette( new Lait( new Chocolat(new Espresso()))));
        System.out.println(b.getDescription() + " : " + b.cout());

    }
}
