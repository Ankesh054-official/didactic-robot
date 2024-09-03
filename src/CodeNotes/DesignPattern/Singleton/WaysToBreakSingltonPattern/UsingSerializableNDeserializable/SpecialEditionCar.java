package CodeNotes.DesignPattern.Singleton.WaysToBreakSingltonPattern.UsingSerializableNDeserializable;

import java.io.Serializable;

public class SpecialEditionCar implements Serializable {

    private static SpecialEditionCar instance;

    private SpecialEditionCar() {
    }

    public static SpecialEditionCar getInstance() {
        if (instance == null) {
            instance = new SpecialEditionCar();
        }

        return instance;
    }

    public Object readObject(){
        return instance;
    }
}