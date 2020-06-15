package sister;

/**
 * @author Kerem
 * 6/15/2020
 */
public class SisterMain {

    public static void main(String[] args) {
        AzmanFamilyMember azmanFamilyMember=new AzmanBrother("Azman Brother Recep");
        Sister sister=new Sister("Ayşe");
        sister.addObserver(azmanFamilyMember);
        sister.sisterMoved();
        sister.sisterMoved();
    }


}
