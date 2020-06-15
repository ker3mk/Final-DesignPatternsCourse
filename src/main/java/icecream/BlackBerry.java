package icecream;

/**
 * @author Kerem
 * 6/15/2020
 */
public class BlackBerry extends CondimentDecorator {
    public BlackBerry(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", StrawBerry";
    }

    public double cost() {
        return .30 + iceCream.cost();
    }
}
