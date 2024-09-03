package CodeNotes.MethodReferencing.withStatic;


interface I1{
    void m2();
}

interface I2{
    void m3(String name);
}

public class A {
    public static void m2(){
        System.out.println("hello from static m2");
    }

    public static void m3(String name){
        System.out.println("hello from static m3 "+name);
    }

}

class Main{
    public static void main(String[] args) {
        I1 i = A::m2;
        I2 k = A::m3;
        i.m2();
        k.m3("Ankesh");

    }
}
