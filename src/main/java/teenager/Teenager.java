package teenager;

/**
 * @author Kerem
 * 6/15/2020
 */
public class Teenager {
    private String name;
    private CommunicationStrategy communicationType;

    public Teenager(String name) {
        System.out.println(name);
        this.name = name;
    }

    public void changeCommunicationType(CommunicationStrategy communicationType) {
        this.communicationType = communicationType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void communicateWithBeloved() {
        communicationType.communicate();
    }

}
