package Abstract;

public class Kamal extends Nimal {
    void drink(){
        System.out.println("Drinking");
    }
    void run(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Kamal obj1=new Kamal();
        obj1.drink();
    }
}
