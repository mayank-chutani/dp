package main.java.Decorator;

/**
 * Created by mchutani on 9/8/16.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

