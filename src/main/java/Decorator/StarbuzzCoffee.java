package main.java.Decorator;

/**
 * Created by mchutani on 9/8/16.
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        Beverage beverage1 = new Mocha(beverage);


        System.out.println(beverage1.getDescription()
                + " $" + beverage1.cost());

    }
}
