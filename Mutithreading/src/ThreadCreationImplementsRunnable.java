public class ThreadCreationImplementsRunnable {
    static class MyThread implements Runnable {

        public void run() {
            System.out.println("Thread is running");
        }

        public static void main(String[] args) {
            MyThread task = new MyThread();

            Thread t = new Thread(task);
            t.start();
        }
    }
}