package CodeNotes.DesignPattern.Singleton.WaysToBreakSingltonPattern.UsingCloning;


public class Main {
    public static void main(String []args){
        SpecialEditionCar obj = SpecialEditionCar.getInstance();
        System.out.println(SpecialEditionCar.getInstance().hashCode());
        System.out.println(SpecialEditionCar.getInstance().hashCode());
        System.out.println(obj.hashCode());

        SpecialEditionCar clonedObj;
        try{
            clonedObj = (SpecialEditionCar) obj.clone();
            System.out.println(clonedObj.hashCode());
        }catch(CloneNotSupportedException cNSE){
            cNSE.getStackTrace();
        }



    }
}
