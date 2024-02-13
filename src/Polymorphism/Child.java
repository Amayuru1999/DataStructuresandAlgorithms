package Polymorphism;

public class Child extends Parent{
    //Method Overriding
    public void Phone(){
        System.out.println("Nokia");
    }
    public static void main(String[] args){
        Child obj=new Child();
        obj.Phone();
    }
}
