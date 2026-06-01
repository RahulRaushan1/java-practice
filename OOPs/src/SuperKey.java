public class SuperKey {
    static class Parent{
        int x=10;
        int run(){
            System.out.println("parent is running");
            return 0;
        }
    }
    static class Child extends Parent{
        int x=20;

        int run(){
            System.out.println("child is running");
            return 4;
        }

        int show(){
            return super.x;
        }
    }

    public static void main(String[] args) {
        Parent p = new Child();

        System.out.println(p.x);

        System.out.println(p.run());
        System.out.println(((Child)p).show());
    }
}


//You need to use a Child reference if you want to call show():

//Child c = new Child();
//System.out.println(c.show());  // works fine
//Or, if you already have a Parent reference, you can cast it to Child:

//Parent p = new Child();
//System.out.println(((Child)p).show());