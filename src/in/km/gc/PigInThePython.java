/**
 * 
 */
package in.km.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Madan Kavarthapu
 * {@link https://plumbr.io/blog/garbage-collection/garbage-collection-increasing-the-throughput}
 */
public class PigInThePython {
	static volatile List pigs = new ArrayList();
	static volatile int pigsEaten = 0;
	static final int ENOUGH_PIGS = 500;

	public static void main(String[] args) throws InterruptedException {
		new PigEater().start();
		new PigDigester().start();
	}

	static class PigEater extends Thread {

		@Override
		public void run() {
			while (true) {
				System.out.format("Eating Pig - %d \n", pigsEaten);
				pigs.add(new byte[32 * 1024 * 1024]); // 2MB per pig
				if (pigsEaten > ENOUGH_PIGS)
					return;
				takeANap(1000);
			}
		}
	}

	static class PigDigester extends Thread {
		@Override
		public void run() {
			long start = System.currentTimeMillis();

			while (true) {
				takeANap(2000);
				System.out.println("Increasing Pigs size.");
				pigsEaten += pigs.size();
				pigs = new ArrayList();
				if (pigsEaten > ENOUGH_PIGS) {
					System.out.format("Digested %d pigs in %d ms.%n",
							pigsEaten, System.currentTimeMillis() - start);
					return;
				}
			}
		}
	}

	static void takeANap(int ms) {
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/*
  First configuration:

    4G of heap (-Xms4g –Xmx4g)
    Using CMS to clean old (-XX:+UseConcMarkSweepGC) and Parallel to clean young generation -XX:+UseParNewGC)
    Has allocated 12,5% of the heap (-Xmn512m) to young generation, further restricting the sizes of Eden and Survivor spaces to equally sized.

Second configuration is a bit different:

    2G of heap (-Xms2g –Xmx2g)
    Using Parallel GC to conduct garbage collection both in young and tenured generations(-XX:+UseParallelGC)
    Has allocated 75% of the heap to young generation (-Xmn1536m)
*/