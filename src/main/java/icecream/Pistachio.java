package icecream;

/**
 * @author Kerem
 * 6/15/2020
 */
public class Pistachio extends NutsDecorator {
    public Pistachio(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", +Walnut";
    }

    public double cost() {
        return .11 + iceCream.cost();
    }
}
