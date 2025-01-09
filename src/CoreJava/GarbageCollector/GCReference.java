package CoreJava.GarbageCollector;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class GCReference {


    public static void main(String[] args) {

        //Strong Reference object
        Object strongRef = new Object();

        // weak Reference object, are claimed by gc when object becomes not reachable(Caching)

        WeakReference<Object> weakReference = new WeakReference<>(new Object());

        //Soft refernce object, these are claimed  by GC when the memory is less, or memory pressure increases

        SoftReference<Object> softReference = new SoftReference<>(new Object());

        // Phantom Reference (Memory manangement frameworks)
        // this is weakest type of reference
        // and mainly used to track the reference eof the object
        // bu they are not claimed by GC immediately when refernece becomes weak, they are enqueued for cleanup actions

        ReferenceQueue<Object> phantomQueue = new ReferenceQueue<>();

        PhantomReference<Object> phantomReference = new PhantomReference<>(new Object(),phantomQueue);

        // simulating GC
        System.gc();


        System.out.println("StrongReferenceObject: " + strongRef);
        System.out.println("WeakReferenceObject: " + weakReference.get());
        System.out.println("SoftReferenceObject: "+ softReference.get());
        System.out.println("PhantomReferenceObject: " + phantomReference.get());

        // GC can be enforced to run using System.gc() or Runtime.getRuntime().gc(), but there is no gurantee
        // that gc will run immediately upon invocation

        //Common JVM options for tuning GC

        // -Xms for setting initial GC size
        // -Xmx for setting maximum GC size
        // -XX:+UseG1GC to enable G1 Gc collector
        // -XX:MaxGCPauseMillis to set maximum pause time goal for gc
        // -XX:+PrintGCDetails to the print GC logs
        for (int i =0; i<100000;i++){
            Object obj = new Object();
        }

        System.gc();
        //printing gc logs :vishalsaxena@Vishals-MacBook-Air GarbageCollector % java -XX:+PrintGCDetails -Xmx256m GCReference.java > /Users/vishalsaxena/IdeaProjects/InterviewPreparation/src/gcLog.txt





    }
}
