package finalKeyword;


    class Parent{
        final public void say(){
            System.out.println("Hi");
        }
    }
    class Child extends Parent{

    }
    public class Test{
        public static void main(String[] args) {
            Child Obj=new Child();
            Obj.say();
        }
    }

