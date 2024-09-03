package CodeNotes.DesignPattern.Singleton.WaysToBreakSingltonPattern.UsingSerializableNDeserializable;

import java.io.*;

public class Main {

    public static void main(String []args){
        ObjectOutputStream oos = null;
        SpecialEditionCar obj = SpecialEditionCar.getInstance();
        SpecialEditionCar obj2 = SpecialEditionCar.getInstance();
        System.out.println(obj2.hashCode());
        System.out.println(obj.hashCode());

        try{
            oos = new ObjectOutputStream(new FileOutputStream("ObjectHashByeCode.txt"));
            oos.writeObject(obj);
        }catch (FileNotFoundException FNFE){
            FNFE.printStackTrace();
        }catch (IOException IOE){
            IOE.printStackTrace();
        }finally {
            if(oos != null){
                try{
                    oos.close();
                }catch (IOException IOE){
                    IOE.printStackTrace();
                }
            }
        }

        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream(new FileInputStream("ObjectHashByeCode.txt"));
            try{
                SpecialEditionCar ss = (SpecialEditionCar) ois.readObject();
                System.out.println(ss.hashCode());
            }catch (ClassNotFoundException CNFE){
                CNFE.printStackTrace();
            }
        }catch (FileNotFoundException FNFE){
            FNFE.printStackTrace();
        }catch (IOException IOE){
            IOE.printStackTrace();
        }finally {
            try{
                ois.close();
            }catch (IOException IOE){
                IOE.printStackTrace();
            }
        }

    }
}
