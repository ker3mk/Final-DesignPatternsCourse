package icecream;

/**
 * @author Kerem
 * 6/15/2020
 */
public class Walnut extends NutsDecorator {
    public Walnut(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", +Walnut";
    }

    public double cost() {
        return .09 + iceCream.cost();
    }
}
