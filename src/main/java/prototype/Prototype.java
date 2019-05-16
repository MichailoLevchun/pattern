package prototype;

import prototype.patternLogic.Droid;
import prototype.patternLogic.DroidFactory;

public class Prototype {

    public void startPrototypeDemo() {
        Droid originalDroid = new Droid("Sphero BB-8", 1000, 120);
        System.out.println("Original " + originalDroid + " HashCode - " + originalDroid.hashCode());
        DroidFactory factory = new DroidFactory(originalDroid);
        Droid copyDroid = factory.makeCopy();
        System.out.println("Cloned " + copyDroid + " HashCode - " + copyDroid.hashCode());
    }
}