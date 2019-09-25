/*********************************************
The main Program generated using JavaEigenbench v0.1 
bench at 2019-03-11 17:51:59.698287
The for construct iteration size is2048
with percentage of branches operations 15.0
realized without any loop inside for construct
The body of the run() method within the ParallelFor class is
splitted into multiple methods due to 'code too large exception'
*********************************************/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Branchtbr15n4b4 {
   private static int NSIZE = 16384;
   private static int NTHREADS = 4;

   public static void main (String[] args) {
       float[] ops = new float[16];
       ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);

       System.err.println("Begin benchmark\n");
       System.err.println("Total # of Instructions is 16384000");
       System.err.println("number of branch operations is 15.0\n");

       double time;
       long start = System.nanoTime();
       for (int i = 0; i < NTHREADS; i++) {
          ParallelForBranchtbr15n4b4 p = new ParallelForBranchtbr15n4b4(2000, ops);
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
       System.err.println("\nEnd benchmark ");
       for (float op : ops) 
           System.err.printf("%f ", op);
       System.err.println();
   }
}


class ParallelForBranchtbr15n4b4 implements Runnable { 
    int iterationsPerThread; 
    float[] ops1; 
    float ops2; 
 
    ParallelForBranchtbr15n4b4 (int it, float[] ops) { 
        iterationsPerThread = it; 
        ops1 = ops;
        ops2 = 0.1f * Thread.currentThread().getId();
    } 
 
    public void run() { 
        for (int i = 0; i < iterationsPerThread; i++) { 
           aux0();
        }
    }

    private void aux0() {
      if(ops1[1] < 2) {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
      } else {
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
      }
      if(ops1[2] < 3) {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
      } else {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] * ops2;
      }
      if(ops1[3] < 0) {
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      } else {
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] * ops2;
      }
      if(ops1[4] < 3) {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      } else {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      }
      if(ops1[5] < 3) {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] * ops2;
      } else {
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      }
      if(ops1[6] < 3) {
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] * ops2;
      } else {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
      }
      if(ops1[7] < 1) {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] * ops2;
      } else {
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
      }
      if(ops1[8] < 1) {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
      } else {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
      }
      if(ops1[9] < 3) {
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] * ops2;
      } else {
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
      }
      if(ops1[10] < 0) {
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
      } else {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] * ops2;
      }
      if(ops1[11] < 3) {
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] * ops2;
      } else {
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
      }
      if(ops1[12] < 2) {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
      } else {
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
      }
      if(ops1[13] < 2) {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
      } else {
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
      }
      if(ops1[14] < 2) {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
      } else {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
      }
      if(ops1[15] < 0) {
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
      } else {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
      }
      if(ops1[0] < 2) {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
      } else {
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
      }
      if(ops1[1] < 1) {
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] + ops2;
      } else {
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
      }
      if(ops1[2] < 2) {
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
      } else {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
      }
      if(ops1[3] < 2) {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
      } else {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] - ops2;
      }
      if(ops1[4] < 1) {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      } else {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] * ops2;
      }
      if(ops1[5] < 0) {
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] - ops2;
      } else {
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] - ops2;
      }
      if(ops1[6] < 1) {
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
      } else {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] * ops2;
      }
      if(ops1[7] < 3) {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      } else {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      }
      if(ops1[8] < 0) {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
      } else {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] * ops2;
      }
      if(ops1[9] < 0) {
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
      } else {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] - ops2;
      }
      if(ops1[10] < 4) {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
      } else {
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
      }
      if(ops1[11] < 1) {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
      } else {
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] * ops2;
      }
      if(ops1[12] < 3) {
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
      } else {
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
      }
      if(ops1[13] < 2) {
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] + ops2;
      } else {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] * ops2;
      }
      if(ops1[14] < 0) {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
      } else {
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      }
      if(ops1[15] < 0) {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
      } else {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
      }
      if(ops1[0] < 0) {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
      } else {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] - ops2;
      }
      if(ops1[1] < 4) {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
      } else {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
      }
      if(ops1[2] < 0) {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
      } else {
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
      }
      if(ops1[3] < 0) {
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      } else {
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] - ops2;
      }
      if(ops1[4] < 1) {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      } else {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      }
      if(ops1[5] < 0) {
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      } else {
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] - ops2;
      }
      if(ops1[6] < 3) {
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
      } else {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] - ops2;
      }
      if(ops1[7] < 4) {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] * ops2;
      } else {
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      }
      if(ops1[8] < 2) {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
      } else {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] - ops2;
      }
      if(ops1[9] < 0) {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
      } else {
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
      }
      if(ops1[10] < 4) {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] * ops2;
      } else {
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
      }
      if(ops1[11] < 0) {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
      } else {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
      }
      if(ops1[12] < 2) {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] * ops2;
      } else {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
      }
      if(ops1[13] < 1) {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] - ops2;
      } else {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] - ops2;
      }
      if(ops1[14] < 2) {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] - ops2;
      } else {
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] * ops2;
      }
      if(ops1[15] < 3) {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
      } else {
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
      }
      if(ops1[0] < 1) {
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
      } else {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
      }
      if(ops1[1] < 4) {
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] + ops2;
      } else {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] + ops2;
      }
      if(ops1[2] < 4) {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
      } else {
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
      }
      if(ops1[3] < 0) {
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      } else {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
      }
      if(ops1[4] < 2) {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] * ops2;
      } else {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] - ops2;
      }
      if(ops1[5] < 0) {
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] * ops2;
      } else {
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] - ops2;
      }
      if(ops1[6] < 0) {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
      } else {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
      }
      if(ops1[7] < 0) {
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      } else {
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      }
      if(ops1[8] < 3) {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] * ops2;
      } else {
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
      }
      if(ops1[9] < 0) {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
      } else {
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
      }
      if(ops1[10] < 3) {
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
      } else {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
      }
      if(ops1[11] < 4) {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
      } else {
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
      }
      if(ops1[12] < 3) {
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
      } else {
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
      }
      if(ops1[13] < 2) {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] - ops2;
      } else {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
      }
      if(ops1[14] < 0) {
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
      } else {
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] * ops2;
      }
      if(ops1[15] < 4) {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] * ops2;
      } else {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
      }
      if(ops1[0] < 4) {
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
      } else {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
      }
      if(ops1[1] < 2) {
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
      } else {
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
      }
      if(ops1[2] < 1) {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
      } else {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
      }
      if(ops1[3] < 2) {
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      } else {
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] * ops2;
      }
      if(ops1[4] < 1) {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      } else {
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
      }
      if(ops1[5] < 3) {
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
      } else {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      }
      if(ops1[6] < 1) {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
      } else {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
      }
      if(ops1[7] < 0) {
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      } else {
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
      }
      if(ops1[8] < 1) {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
      } else {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
      }
      if(ops1[9] < 0) {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
      } else {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
      }
      if(ops1[10] < 3) {
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] * ops2;
      } else {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] * ops2;
      }
      if(ops1[11] < 2) {
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] * ops2;
      } else {
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
      }
      if(ops1[12] < 1) {
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
      } else {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
      }
      if(ops1[13] < 1) {
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] + ops2;
      } else {
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
      }
      if(ops1[14] < 4) {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] * ops2;
      } else {
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] * ops2;
      }
      if(ops1[15] < 2) {
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
      } else {
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] - ops2;
      }
      if(ops1[0] < 3) {
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
      } else {
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
      }
      if(ops1[1] < 3) {
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
      } else {
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
      }
      if(ops1[2] < 2) {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] - ops2;
      } else {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
      }
      if(ops1[3] < 4) {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] - ops2;
      } else {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      }
      if(ops1[4] < 0) {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      } else {
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
      }
      if(ops1[5] < 2) {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] - ops2;
      } else {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] * ops2;
      }
      if(ops1[6] < 2) {
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
      } else {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
      }
      if(ops1[7] < 3) {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      } else {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
      }
      if(ops1[8] < 3) {
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] * ops2;
      } else {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
      }
      if(ops1[9] < 0) {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] * ops2;
      } else {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
      }
      if(ops1[10] < 3) {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
      } else {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] * ops2;
      }
      if(ops1[11] < 1) {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
      } else {
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] - ops2;
      }
      if(ops1[12] < 3) {
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
      } else {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
      }
      if(ops1[13] < 1) {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] - ops2;
      } else {
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
      }
      if(ops1[14] < 1) {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      } else {
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] + ops2;
      }
      if(ops1[15] < 2) {
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
      } else {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] * ops2;
      }
      if(ops1[0] < 2) {
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] - ops2;
      } else {
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
      }
      if(ops1[1] < 3) {
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] - ops2;
      } else {
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
      }
      if(ops1[2] < 3) {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] - ops2;
      } else {
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
      }
      if(ops1[3] < 3) {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] + ops2;
      } else {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      }
      if(ops1[4] < 1) {
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      } else {
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] + ops2;
      }
      if(ops1[5] < 3) {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] * ops2;
      } else {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
      }
      if(ops1[6] < 0) {
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
      } else {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
      }
      if(ops1[7] < 3) {
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
      } else {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
      }
      if(ops1[8] < 4) {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] - ops2;
      } else {
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
      }
      if(ops1[9] < 0) {
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
      } else {
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
      }
      if(ops1[10] < 0) {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
      } else {
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
      }
      if(ops1[11] < 2) {
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
      } else {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
      }
      if(ops1[12] < 3) {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] * ops2;
      } else {
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
      }
      if(ops1[13] < 2) {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
      } else {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
      }
      if(ops1[14] < 2) {
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      } else {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] * ops2;
      }
      if(ops1[15] < 1) {
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
      } else {
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
      }
      if(ops1[0] < 3) {
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
      } else {
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
      }
      if(ops1[1] < 1) {
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
      } else {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
      }
      if(ops1[2] < 1) {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
      } else {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
      }
      if(ops1[3] < 2) {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] - ops2;
      } else {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] * ops2;
      }
      if(ops1[4] < 1) {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] * ops2;
      } else {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      }
      if(ops1[5] < 2) {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      } else {
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
      }
      if(ops1[6] < 3) {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
      } else {
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
      }
      if(ops1[7] < 1) {
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      } else {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
      }
      if(ops1[8] < 1) {
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
      } else {
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
      }
      if(ops1[9] < 0) {
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
      } else {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
      }
      if(ops1[10] < 3) {
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] * ops2;
      } else {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
      }
      if(ops1[11] < 1) {
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
      } else {
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
      }
      if(ops1[12] < 0) {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
      } else {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
      }
      if(ops1[13] < 2) {
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
      } else {
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
      }
      if(ops1[14] < 0) {
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      } else {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
      }
      if(ops1[15] < 4) {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] - ops2;
      } else {
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
      }
      if(ops1[0] < 0) {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
      } else {
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] * ops2;
      }
      if(ops1[1] < 0) {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] * ops2;
      } else {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
      }
      if(ops1[2] < 2) {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
      } else {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
      }
      if(ops1[3] < 3) {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      } else {
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] - ops2;
      }
      if(ops1[4] < 4) {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      } else {
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] * ops2;
      }
      if(ops1[5] < 4) {
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      } else {
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      }
      if(ops1[6] < 4) {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
      } else {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
      }
      if(ops1[7] < 2) {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] - ops2;
      } else {
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
      }
      if(ops1[8] < 1) {
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
      } else {
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] + ops2;
      }
      if(ops1[9] < 3) {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
      } else {
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
      }
      if(ops1[10] < 0) {
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
      } else {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
      }
      if(ops1[11] < 1) {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
      } else {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] * ops2;
      }
      if(ops1[12] < 3) {
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] - ops2;
      } else {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
      }
      if(ops1[13] < 1) {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
      } else {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
      }
      if(ops1[14] < 0) {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
      } else {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      }
      if(ops1[15] < 3) {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
      } else {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
      }
      if(ops1[0] < 0) {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] - ops2;
      } else {
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
      }
      if(ops1[1] < 2) {
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
      } else {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
      }
      if(ops1[2] < 4) {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
      } else {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] - ops2;
      }
      if(ops1[3] < 3) {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      } else {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] - ops2;
      }
      if(ops1[4] < 0) {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      } else {
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] * ops2;
      }
      if(ops1[5] < 0) {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      } else {
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] - ops2;
      }
      if(ops1[6] < 4) {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
      } else {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
      }
      if(ops1[7] < 3) {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] + ops2;
      } else {
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
      }
      if(ops1[8] < 4) {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
      } else {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] + ops2;
      }
      if(ops1[9] < 1) {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
      } else {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] * ops2;
      }
      if(ops1[10] < 2) {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] - ops2;
      } else {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
      }
      if(ops1[11] < 2) {
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
      } else {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
      }
      if(ops1[12] < 1) {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
      } else {
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] + ops2;
      }
      if(ops1[13] < 4) {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] - ops2;
      } else {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] - ops2;
      }
      if(ops1[14] < 3) {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      } else {
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] - ops2;
      }
      if(ops1[15] < 3) {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
      } else {
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
      }
      if(ops1[0] < 3) {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
      } else {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
      }
      if(ops1[1] < 2) {
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
      } else {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] - ops2;
      }
      if(ops1[2] < 3) {
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] * ops2;
      } else {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] + ops2;
      }
      if(ops1[3] < 2) {
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      } else {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      }
      if(ops1[4] < 1) {
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
      } else {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      }
      if(ops1[5] < 2) {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
      } else {
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      }
      if(ops1[6] < 1) {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
      } else {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
      }
      if(ops1[7] < 0) {
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] * ops2;
      } else {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      }
      if(ops1[8] < 0) {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
      } else {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
      }
      if(ops1[9] < 2) {
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
      } else {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
      }
      if(ops1[10] < 0) {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
      } else {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
      }
      if(ops1[11] < 4) {
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
      } else {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
      }
      if(ops1[12] < 3) {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] * ops2;
      } else {
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
      }
      if(ops1[13] < 0) {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
      } else {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
      }
      if(ops1[14] < 2) {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
      } else {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      }
      if(ops1[15] < 3) {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
      } else {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] - ops2;
      }
      if(ops1[0] < 3) {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
      } else {
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
      }
      if(ops1[1] < 1) {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
      } else {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] - ops2;
      }
      if(ops1[2] < 1) {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
      } else {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
      }
      if(ops1[3] < 1) {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] * ops2;
      } else {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] * ops2;
      }
      if(ops1[4] < 4) {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      } else {
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
      }
      if(ops1[5] < 2) {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      } else {
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      }
      if(ops1[6] < 2) {
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
      } else {
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] * ops2;
      }
      if(ops1[7] < 4) {
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      } else {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      }
      if(ops1[8] < 1) {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
      } else {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
      }
      if(ops1[9] < 0) {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
      } else {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
      }
      if(ops1[10] < 4) {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
      } else {
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
      }
      if(ops1[11] < 1) {
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
      } else {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
      }
      if(ops1[12] < 0) {
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
      } else {
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
      }
      if(ops1[13] < 0) {
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] + ops2;
      } else {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
      }
      if(ops1[14] < 4) {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      } else {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      }
      if(ops1[15] < 1) {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] - ops2;
      } else {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] * ops2;
      }
      if(ops1[0] < 1) {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
      } else {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
      }
      if(ops1[1] < 3) {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
      } else {
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] - ops2;
      }
      if(ops1[2] < 0) {
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
      } else {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
      }
      if(ops1[3] < 0) {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      } else {
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      }
      if(ops1[4] < 1) {
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      } else {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] * ops2;
      }
      if(ops1[5] < 3) {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
      } else {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      }
      if(ops1[6] < 0) {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] * ops2;
      } else {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
      }
      if(ops1[7] < 2) {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
      } else {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] - ops2;
      }
      if(ops1[8] < 2) {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
      } else {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
      }
      if(ops1[9] < 3) {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
      } else {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
      }
      if(ops1[10] < 0) {
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
      } else {
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
      }
      if(ops1[11] < 3) {
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
      } else {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
      }
      if(ops1[12] < 3) {
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
      } else {
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
      }
      if(ops1[13] < 1) {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
      } else {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
      }
      if(ops1[14] < 3) {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      } else {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] - ops2;
      }
      if(ops1[15] < 1) {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
      } else {
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
      }
      if(ops1[0] < 2) {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
      } else {
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
      }
      if(ops1[1] < 2) {
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
      } else {
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
      }
      if(ops1[2] < 1) {
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
      } else {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
      }
      if(ops1[3] < 0) {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] * ops2;
      } else {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      }
      if(ops1[4] < 2) {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      } else {
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
      }
      if(ops1[5] < 1) {
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      } else {
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      }
      if(ops1[6] < 1) {
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
      } else {
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] - ops2;
      }
      if(ops1[7] < 0) {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
      } else {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
      }
      if(ops1[8] < 1) {
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
      } else {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
      }
      if(ops1[9] < 4) {
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] - ops2;
      } else {
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
      }
      if(ops1[10] < 1) {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
      } else {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
      }
      if(ops1[11] < 1) {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
      } else {
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
      }
      if(ops1[12] < 0) {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
      } else {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
      }
      if(ops1[13] < 4) {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
      } else {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
      }
      if(ops1[14] < 4) {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      } else {
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
      }
      if(ops1[15] < 2) {
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
      } else {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
      }
      if(ops1[0] < 4) {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
      } else {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
      }
      if(ops1[1] < 0) {
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] + ops2;
      } else {
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
      }
      if(ops1[2] < 0) {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] + ops2;
      } else {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
      }
      if(ops1[3] < 1) {
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] * ops2;
      } else {
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      }
      if(ops1[4] < 4) {
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
      } else {
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      }
      if(ops1[5] < 4) {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
      } else {
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
      }
      if(ops1[6] < 2) {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
      } else {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] - ops2;
      }
      if(ops1[7] < 0) {
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      } else {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      }
      if(ops1[8] < 0) {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] - ops2;
      } else {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
      }
      if(ops1[9] < 2) {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] * ops2;
      } else {
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] * ops2;
      }
      if(ops1[10] < 4) {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
      } else {
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] * ops2;
      }
      if(ops1[11] < 1) {
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] * ops2;
      } else {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
      }
      if(ops1[12] < 1) {
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
      } else {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
      }
      if(ops1[13] < 2) {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
      } else {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] - ops2;
      }
      if(ops1[14] < 4) {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      } else {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
      }
      if(ops1[15] < 1) {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
      } else {
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
      }
      if(ops1[0] < 1) {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
      } else {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
      }
      if(ops1[1] < 2) {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] * ops2;
      } else {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] - ops2;
      }
      if(ops1[2] < 3) {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
      } else {
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] - ops2;
      }
      if(ops1[3] < 1) {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      } else {
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] * ops2;
      }
      if(ops1[4] < 1) {
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] * ops2;
      } else {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
      }
      if(ops1[5] < 2) {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      } else {
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] - ops2;
      }
      if(ops1[6] < 3) {
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
      } else {
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
      }
      if(ops1[7] < 4) {
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      } else {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      }
      if(ops1[8] < 2) {
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
      } else {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
      }
      if(ops1[9] < 2) {
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
      } else {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
      }
      if(ops1[10] < 2) {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
      } else {
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
      }
      if(ops1[11] < 1) {
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
      } else {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
      }
      if(ops1[12] < 3) {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
      } else {
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] * ops2;
      }
      if(ops1[13] < 0) {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
      } else {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
      }
      if(ops1[14] < 2) {
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      } else {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      }
      if(ops1[15] < 1) {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
      } else {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
      }
      if(ops1[0] < 2) {
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] * ops2;
      } else {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
      }
      if(ops1[1] < 0) {
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] - ops2;
      } else {
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
      }
      if(ops1[2] < 4) {
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] * ops2;
      } else {
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
      }
      if(ops1[3] < 4) {
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] - ops2;
      } else {
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] - ops2;
      }
      if(ops1[4] < 0) {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
      } else {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] + ops2;
      }
      if(ops1[5] < 0) {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] * ops2;
      } else {
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
      }
      if(ops1[6] < 3) {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] - ops2;
      } else {
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
      }
      if(ops1[7] < 3) {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
      } else {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      }
      if(ops1[8] < 3) {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
      } else {
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
      }
      if(ops1[9] < 0) {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
      } else {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
      }
      if(ops1[10] < 4) {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
      } else {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
      }
      if(ops1[11] < 0) {
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] * ops2;
      } else {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
      }
      if(ops1[12] < 4) {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
      } else {
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
      }
      if(ops1[13] < 1) {
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] * ops2;
      } else {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
      }
      if(ops1[14] < 4) {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
      } else {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      }
      if(ops1[15] < 0) {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
      } else {
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] * ops2;
      }
      if(ops1[0] < 4) {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
      } else {
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
      }
      if(ops1[1] < 4) {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
      } else {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
      }
      if(ops1[2] < 2) {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
      } else {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] + ops2;
      }
      if(ops1[3] < 4) {
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      } else {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      }
      if(ops1[4] < 4) {
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] - ops2;
      } else {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
          ops1[4] = ops1[4] + ops2;
      }
      if(ops1[5] < 1) {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      } else {
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] - ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      }
      if(ops1[6] < 3) {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
      } else {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] + ops2;
      }
      if(ops1[7] < 2) {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] + ops2;
      } else {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
      }
      if(ops1[8] < 2) {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] * ops2;
      } else {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] * ops2;
          ops1[8] = ops1[8] + ops2;
      }
      if(ops1[9] < 3) {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
      } else {
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
      }
      if(ops1[10] < 1) {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
      } else {
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
      }
      if(ops1[11] < 1) {
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
      } else {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] - ops2;
      }
      if(ops1[12] < 4) {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
      } else {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] - ops2;
      }
      if(ops1[13] < 1) {
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] * ops2;
      } else {
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
      }
      if(ops1[14] < 2) {
          ops1[14] = ops1[14] * ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      } else {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
      }
      if(ops1[15] < 2) {
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] + ops2;
      } else {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
      }
      if(ops1[0] < 4) {
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] - ops2;
      } else {
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] + ops2;
      }
      if(ops1[1] < 4) {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
      } else {
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
          ops1[1] = ops1[1] - ops2;
      }
      if(ops1[2] < 4) {
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
      } else {
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
      }
      if(ops1[3] < 4) {
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] - ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      } else {
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
      }
      if(ops1[4] < 0) {
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
      } else {
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] * ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] + ops2;
          ops1[4] = ops1[4] - ops2;
      }
      if(ops1[5] < 4) {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      } else {
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] * ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
          ops1[5] = ops1[5] + ops2;
      }
      if(ops1[6] < 0) {
          ops1[6] = ops1[6] - ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] * ops2;
          ops1[6] = ops1[6] * ops2;
      } else {
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
          ops1[6] = ops1[6] + ops2;
      }
      if(ops1[7] < 1) {
          ops1[7] = ops1[7] * ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
          ops1[7] = ops1[7] * ops2;
      } else {
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] + ops2;
          ops1[7] = ops1[7] - ops2;
      }
      if(ops1[8] < 1) {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] - ops2;
      } else {
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
          ops1[8] = ops1[8] + ops2;
          ops1[8] = ops1[8] - ops2;
      }
      if(ops1[9] < 3) {
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] + ops2;
      } else {
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] - ops2;
          ops1[9] = ops1[9] * ops2;
          ops1[9] = ops1[9] + ops2;
          ops1[9] = ops1[9] * ops2;
      }
      if(ops1[10] < 3) {
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
      } else {
          ops1[10] = ops1[10] - ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] * ops2;
          ops1[10] = ops1[10] + ops2;
          ops1[10] = ops1[10] + ops2;
      }
      if(ops1[11] < 3) {
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] * ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] * ops2;
      } else {
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] + ops2;
          ops1[11] = ops1[11] - ops2;
          ops1[11] = ops1[11] + ops2;
      }
      if(ops1[12] < 4) {
          ops1[12] = ops1[12] - ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] + ops2;
      } else {
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
          ops1[12] = ops1[12] + ops2;
          ops1[12] = ops1[12] * ops2;
      }
      aux1();
    }


    private void aux1() {
      if(ops1[13] < 1) {
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] - ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
      } else {
          ops1[13] = ops1[13] * ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
          ops1[13] = ops1[13] + ops2;
      }
      if(ops1[14] < 4) {
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
      } else {
          ops1[14] = ops1[14] - ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
          ops1[14] = ops1[14] + ops2;
      }
      if(ops1[15] < 2) {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] * ops2;
      } else {
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] - ops2;
          ops1[15] = ops1[15] + ops2;
          ops1[15] = ops1[15] + ops2;
      }
      if(ops1[0] < 4) {
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] + ops2;
          ops1[0] = ops1[0] - ops2;
      } else {
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] * ops2;
          ops1[0] = ops1[0] - ops2;
          ops1[0] = ops1[0] + ops2;
      }
      if(ops1[1] < 2) {
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] + ops2;
      } else {
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] + ops2;
          ops1[1] = ops1[1] * ops2;
          ops1[1] = ops1[1] * ops2;
      }
      if(ops1[2] < 4) {
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] - ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] - ops2;
      } else {
          ops1[2] = ops1[2] * ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
          ops1[2] = ops1[2] + ops2;
      }
      if(ops1[3] < 4) {
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] * ops2;
      } else {
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] * ops2;
          ops1[3] = ops1[3] + ops2;
          ops1[3] = ops1[3] - ops2;
      }
    }
}
