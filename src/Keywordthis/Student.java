package Keywordthis;

public class Student {
    String name;
    int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Student obj=new Student("Amayuru",24);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
