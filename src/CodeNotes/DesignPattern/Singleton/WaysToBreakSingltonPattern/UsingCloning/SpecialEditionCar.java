package CodeNotes.DesignPattern.Singleton.WaysToBreakSingltonPattern.UsingCloning;

public class SpecialEditionCar implements Cloneable{

    private static SpecialEditionCar instance;

    private SpecialEditionCar(){
    }

    public static SpecialEditionCar getInstance(){
        if(instance == null){
            instance = new SpecialEditionCar();
        }

        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
