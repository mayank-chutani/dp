package main.java.Decorator;

/**
 * Created by mchutani on 9/8/16.
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }
}
