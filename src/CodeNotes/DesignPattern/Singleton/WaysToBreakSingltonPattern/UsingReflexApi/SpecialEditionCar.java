package CodeNotes.DesignPattern.Singleton.WaysToBreakSingltonPattern.UsingReflexApi;

public class SpecialEditionCar {

    private static SpecialEditionCar instance;

    private SpecialEditionCar(){
    }

    public static SpecialEditionCar getInstance(){
        if(instance == null){
            instance = new SpecialEditionCar();
        }

        return instance;
    }
}