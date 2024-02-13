package Polymorphism;

public class Meth_Overloading {
    public void meth(){
        System.out.println("method 1");
    }
    public void meth(int x){
        System.out.println("method 2");
    }
    public void meth(int x,int y){
        System.out.println("method 3");
    }
    public static void main(String[] args){
        Meth_Overloading obj =new Meth_Overloading();
        obj.meth();
    }
}
