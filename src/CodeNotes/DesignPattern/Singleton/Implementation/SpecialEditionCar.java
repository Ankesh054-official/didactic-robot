package CodeNotes.DesignPattern.Singleton.Implementation;

public class SpecialEditionCar {
    private static SpecialEditionCar instance;

    private SpecialEditionCar(){
    }

    public static SpecialEditionCar getInstance(){
        if (SpecialEditionCar.instance == null){
            instance = new SpecialEditionCar();
        }
        return instance;
    }
}
