package sister;

import teenager.CommunicationStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kerem
 * 6/15/2020
 */
public class Sister {
    private String name;
    private SisterLocationType sisterLocation;
    private List<SisterObserver> observers;

    public Sister(String name) {
        this.name=name;
        observers = new ArrayList<SisterObserver>();
        sisterLocation = SisterLocationType.AT_HOME;
    }
    public void addObserver(SisterObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(SisterObserver obs) {
        observers.remove(obs);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sisterMoved() {
        SisterLocationType[] enumValues = SisterLocationType.values();
        sisterLocation = enumValues[(sisterLocation.ordinal() + 1) % enumValues.length];
        System.out.println("Sister is moved and Location changed to "+sisterLocation );
        notifyObservers();
    }

    private void notifyObservers() {
        for (SisterObserver obs : observers) {
            obs.update(sisterLocation);
        }
    }

}
