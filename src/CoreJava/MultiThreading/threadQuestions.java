package CoreJava.MultiThreading;

public class threadQuestions {
    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread( () -> {
//            for(int i =0;i<5;i++){
//                System.out.println(i);
//            }
//        });
//        t.start();
//        t.sleep(1000);
//
//        System.out.println("Main Thread");
//
//        Runnable r = () -> {
//            int counter = 0;
//            while (counter < 2) {
//                System.out.println(Thread.currentThread()
//                        .getName());
//                counter++;
//                Thread.yield();
//            }
//        };
//        new Thread(r).start();
//        new Thread(r).start();

        Runnable r1 = () -> {
            int counter = 0;
            while (counter < 2) {
                System.out.println(Thread.currentThread()
                        .getName());
                counter++;
                Thread.yield();
            }
        };
        new Thread(r1).start();
        new Thread(r1).start();

    }
}
