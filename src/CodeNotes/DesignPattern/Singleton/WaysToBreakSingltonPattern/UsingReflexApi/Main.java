package CodeNotes.DesignPattern.Singleton.WaysToBreakSingltonPattern.UsingReflexApi;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String []args){

        System.out.println(SpecialEditionCar.getInstance().hashCode());
        System.out.println(SpecialEditionCar.getInstance().hashCode());
        System.out.println(SpecialEditionCar.getInstance().hashCode());
        Constructor<SpecialEditionCar> sec;
        try{
            sec = SpecialEditionCar.class.getDeclaredConstructor();
            sec.setAccessible(true);

            SpecialEditionCar obj;
             try{
                 obj = sec.newInstance();
                 System.out.println(obj.hashCode());
             }catch (InstantiationException IE){
                 IE.printStackTrace();
             }catch (IllegalAccessException IAE){
                 IAE.printStackTrace();
             }catch (InvocationTargetException ITE){
                 ITE.printStackTrace();
             }

        }catch(NoSuchMethodException NSME){
            NSME.printStackTrace();
        }
    }
}
