package icecream;

/**
 * @author Kerem
 * 6/15/2020
 */
public class HazelNut extends NutsDecorator {
    public HazelNut(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", +HazelNut";
    }

    public double cost() {
        return .10 + iceCream.cost();
    }
}
