/*********************************************
The main Program generated using JavaEigenbench v0.1 
bench at 2019-03-11 17:51:47.109454
The for construct iteration size is8192
with percentage of atomic operations 15.0
realized without any loop inside for construct
The body of the run() method within the ParallelFor class is
splitted into multiple methods due to 'code too large exception'
*********************************************/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import java.util.concurrent.TimeUnit;

public class Atomictat15n8b4 {
   private static int NSIZE = 16384;
   private static int NTHREADS = 8;

   public static void main (String[] args) {
       AtomicInteger shared = new AtomicInteger(0);
       ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);

       System.err.println("Begin benchmark\n");
       System.err.println("Total Instructions is 9830400");
       System.err.println("percentage of atomic operations is 15.0\n");

       double time;
       long start = System.nanoTime();
       for (int i = 0; i < NTHREADS; i++) {
          ParallelForAtomictat15n8b4 p = new ParallelForAtomictat15n8b4(150, shared);
          executor.submit(p);
       }
       executor.shutdown();

       try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
       } catch (InterruptedException e) {
             e.printStackTrace();
       }

       time = (System.nanoTime() - start) / 1e6;
       System.out.printf("%.3f", time);
       System.err.println("\nEnd benchmark " + shared);
   }
}


class ParallelForAtomictat15n8b4 implements Runnable { 
    int iterationsPerThread; 
    AtomicInteger shared; 
    int op1, op2; 
 
    ParallelForAtomictat15n8b4 (int it, AtomicInteger sh) { 
        iterationsPerThread = it; 
        shared = sh; 
        op1 = (int) Thread.currentThread().getId(); 
        op2 = op1 + 1; 
    } 
 
    public void run() { 
        for (int i = 0; i < iterationsPerThread; i++) { 
           aux0();
        }
    }

    private void aux0() {
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
        aux1();
    }


    private void aux1() {
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic update
       shared.addAndGet(op1);
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       // atomic write
       shared.set(op1);
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
       op1 = op1 + op2; 
    }
}
