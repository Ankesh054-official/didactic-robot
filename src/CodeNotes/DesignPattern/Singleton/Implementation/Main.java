package CodeNotes.DesignPattern.Singleton.Implementation;

public class Main {
    public static void main(String []args){
        System.out.println(SpecialEditionCar.getInstance().hashCode());
        System.out.println(SpecialEditionCar.getInstance().hashCode());
        System.out.println(SpecialEditionCar.getInstance().hashCode());
        System.out.println(SpecialEditionCar.getInstance().hashCode());
    }
}
