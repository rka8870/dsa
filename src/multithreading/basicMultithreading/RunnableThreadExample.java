package multithreading.basicMultithreading;

public class RunnableThreadExample {

    public static void main(String[] args){
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    System.out.println("Thread 3");
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }


     static class Thread1 implements Runnable{

        @Override
        public void run() {
            for(int i=0;i<50;i++){
                System.out.println("Thread 1");
            }
        }
    }

     static class Thread2 implements Runnable{

        @Override
        public void run() {
            for(int i=0;i<50;i++){
                System.out.println("Thread 2");
            }

        }
    }


}
