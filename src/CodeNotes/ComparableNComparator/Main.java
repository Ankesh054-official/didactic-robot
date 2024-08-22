package CodeNotes.ComparableNComparator;


import java.util.TreeSet;


class Student implements Comparable{
    int roll_no;
    String name;

    public Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public int compareTo(Object o){
        Student s = (Student) o;
        return this.name.compareTo(s.name);
    }

    @Override
    public String toString() {
        return this.name+" "+this.roll_no;
    }
}

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student(1,"Ankesh");
        Student std2 = new Student(2,"A");
        Student std3 = new Student(3,"An");
        Student std4 = new Student(4,"Ank");
        Student std5 = new Student(5,"Anke");
        Student std6 = new Student(6,"Ankes");

        TreeSet ts = new TreeSet();

        ts.add(std1);
        ts.add(std2);
        ts.add(std3);
        ts.add(std4);
        ts.add(std5);
        ts.add(std6);
//        java.lang.ClassCastException
        System.out.println(ts);

    }
}
