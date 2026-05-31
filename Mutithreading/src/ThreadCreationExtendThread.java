public class ThreadCreationExtendThread {

     static class Mythread extends Thread{
        public void run(){
            System.out.println("Tread is Running.");
        }
    }
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();

    }
}
