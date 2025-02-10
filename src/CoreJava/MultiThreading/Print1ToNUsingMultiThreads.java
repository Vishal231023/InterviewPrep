package CoreJava.MultiThreading;

public class Print1ToNUsingMultiThreads {
    public static void main(String[] args) {
        MultiThreadedPrintNumber multiThreadedPrintNumber = new MultiThreadedPrintNumber(20);

        Thread t1 = new Thread(multiThreadedPrintNumber::oddPrint);
        Thread t2 = new Thread(multiThreadedPrintNumber::evenPrint);
        t1.start();
        t2.start();



    }

}
class MultiThreadedPrintNumber{
    private int n ;
    private int count = 1;

    public MultiThreadedPrintNumber(int n) {
        this.n = n;
    }

    public synchronized  void evenPrint()  {

        while(count<n){
            while(count %2 != 0){
                try {
                    wait();
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
            }
            if(count > n)  break;

            System.out.println("Even Thread" +count);
            count++;
            notify();
        }

    }


    public synchronized  void oddPrint(){
        while(count<n){
            while(count %2 == 0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(count > n)  break;
            System.out.println("Odd Thread" +count);
            count++;
            notify();
        }

    }
}
