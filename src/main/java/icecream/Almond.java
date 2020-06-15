package icecream;

/**
 * @author Kerem
 * 6/15/2020
 */
public class Almond extends NutsDecorator {
    public Almond(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", +Almond";
    }

    public double cost() {
        return .16 + iceCream.cost();
    }
}
