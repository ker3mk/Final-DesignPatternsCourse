package teenager;

/**
 * @author Kerem
 * 6/15/2020
 */
public class TeenagerMain {

    public static void main(String[] args) {
        Teenager teenager=new Teenager("JOHN");
        CommunicationStrategy communicationStrategy=new Pigeon();
        teenager.changeCommunicationType(communicationStrategy);
        teenager.communicateWithBeloved();

        communicationStrategy=new Phone();
        teenager.changeCommunicationType(communicationStrategy);
        teenager.communicateWithBeloved();

        communicationStrategy=new Messenger();
        teenager.changeCommunicationType(communicationStrategy);
        teenager.communicateWithBeloved();

        communicationStrategy=new Telegram();
        teenager.changeCommunicationType(communicationStrategy);
        teenager.communicateWithBeloved();

        communicationStrategy=new Smoke();
        teenager.changeCommunicationType(communicationStrategy);
        teenager.communicateWithBeloved();


        communicationStrategy=new Letter();
        teenager.changeCommunicationType(communicationStrategy);
        teenager.communicateWithBeloved();
    }
}
