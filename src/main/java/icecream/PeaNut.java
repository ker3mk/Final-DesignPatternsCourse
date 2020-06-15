package icecream;

/**
 * @author Kerem
 * 6/15/2020
 */
public class PeaNut extends NutsDecorator {
    public PeaNut(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", +PeaNut";
    }

    public double cost() {
        return .15 + iceCream.cost();
    }
}
