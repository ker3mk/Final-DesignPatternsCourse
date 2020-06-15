package icecream;

/**
 * @author Kerem
 * 6/15/2020
 */
public class Caramel extends CondimentDecorator {
    public Caramel(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", Caramel";
    }

    public double cost() {
        return .25 + iceCream.cost();
    }
}
