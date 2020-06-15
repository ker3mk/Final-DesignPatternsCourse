package icecream;

/**
 * @author Kerem
 * 6/15/2020
 */
public abstract class IceCream {
    String description = "Unknown IceCream";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}