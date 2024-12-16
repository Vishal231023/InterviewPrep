package CoreJava;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        // String buffer is thread safe, better for multi threaded environment
        // and so it is slower in comparison to string builder


        StringBuilder objectBuilder = new StringBuilder();

        Thread t1 = new Thread(() ->{

            for (int i = 0;i< 600000000; i++){

                objectBuilder.append("A");
            }
        });


        StringBuffer objectBuffer = new StringBuffer();

        Thread t2 = new Thread(() -> {
            for(int i = 0; i< 1000000; i++){
                objectBuffer.append("B");
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(objectBuffer.toString().length());
        System.out.println(objectBuilder.toString().length());



    }
}
