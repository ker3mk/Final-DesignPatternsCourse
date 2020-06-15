package icecream;

/**
 * @author Kerem
 * 6/15/2020
 */
public class Chocolate extends CondimentDecorator {
    public Chocolate(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", Chocolate";
    }

    public double cost() {
        return .35 + iceCream.cost();
    }
}
