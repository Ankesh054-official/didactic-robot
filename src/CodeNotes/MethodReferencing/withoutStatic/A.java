package CodeNotes.MethodReferencing.withoutStatic;

interface I1{
    void m2();
}

public class A{
    public void m2(){
        System.out.println("hello from non static m2");
    }
}

class Main{
    public static void main(String[] args) {
        A obj = new A();
        I1 i = obj::m2;
        i.m2();
    }
}