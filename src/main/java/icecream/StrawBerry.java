package icecream;

/**
 * @author Kerem
 * 6/15/2020
 */
public class StrawBerry extends CondimentDecorator {
    public StrawBerry(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", BlackBerry";
    }

    public double cost() {
        return .30 + iceCream.cost();
    }
}
