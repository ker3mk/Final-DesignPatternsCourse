package icecream;

/**
 * @author Kerem
 * 6/15/2020
 */
public class IceCreamMain {
    public static void main(String[] args) {
        IceCream iceCream=new Lemon();
        System.out.println(iceCream.getDescription()
                + " $" + iceCream.cost());

        IceCream iceCream2 = new Blue();
        iceCream2 = new Chocolate(iceCream2);
        iceCream2 = new Caramel(iceCream2);
        iceCream2 = new BlackBerry(iceCream2);
        iceCream2 = new HazelNut(iceCream2);
        iceCream2 = new PeaNut(iceCream2);

        System.out.println(iceCream2.getDescription()
                + " $" + iceCream2.cost());

    }
}
