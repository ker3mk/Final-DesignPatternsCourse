package icecream;

/**
 * @author Kerem
 * 6/15/2020
 */
public abstract class CondimentDecorator extends IceCream {
    IceCream iceCream;
    public abstract String getDescription();
}
