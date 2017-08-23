package main.java.Decorator;

/**
 * Created by mchutani on 9/8/16.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House blend";
    }

    public double cost() {
        return .89;
    }
}
