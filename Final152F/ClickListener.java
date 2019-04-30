import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ClickListener implements ActionListener {
	static double PROCESS = 3;// Math.random() *( 7 -2) + 2;
	static int thetime = 0;
	static int totalpeople = 0;

	static int MAX_Representative = 12;
	static int Num_phonecalls;
	final static int Max_phonecalls = 100;

	public void actionPerformed(ActionEvent event) {

		if (jf.jfget()) {

			long starttime = System.nanoTime();
			// methodToTime();
			long endtime = System.nanoTime();
			long duration = (endtime - starttime);

			int arrived = 0;
			workItem workItem = new workItem(arrived);
			LinkedQueue<workItem> customerQueue = new LinkedQueue<workItem>();

			double[] cashierTime = new double[MAX_Representative];
			List<Integer> lList = new ArrayList<Integer>();
			double totalTime;
			double averageTime, departs;
			int Representative = 0;

			for (Representative = 0; Representative < MAX_Representative; Representative++) {
				System.out.println(" Representative Number: " + (Representative + 1));
				// initially set each Representative time to zero .
				for (int counta = 0; counta < Representative; counta++)
					cashierTime[counta] = 0;
				// load customer queue.

				workItem.setcallStart((double) Math.random());
				Random rand = new Random();

				Num_phonecalls = rand.nextInt((Max_phonecalls - 1) + 1) + 1;
				for (int countc = 0; countc <= Num_phonecalls; countc++)
					customerQueue.enqueue(workItem);

				// process all customers in the queue
				while (!customerQueue.isEmpty()) {
					arrived++;
					customerQueue.dequeue();
					for (int ca = 0; ca <= Representative; ca++) {

						int total = 0;

						total = total + ca;

						total++;
						if (!(customerQueue.isEmpty())) {

						}

						if (workItem.getcallStart() > cashierTime[ca])
							departs = workItem.getcallStart() + PROCESS;
						else
							departs = cashierTime[ca] + PROCESS;
						workItem.setcallEnd(departs);

						cashierTime[ca] = departs;
						totalTime = +workItem.totalTime();

						averageTime = totalTime / Num_phonecalls;
						DecimalFormat fmt = new DecimalFormat("#.##");
						fmt.format(averageTime);

					}
					Random rand2 = new Random();
					int randtime = rand2.nextInt((360 - 30) + 1) + 30;
					int elaspetime = customerQueue.size() * randtime;

					thetime = thetime + elaspetime;
					lList.add(elaspetime);
				}
				Collections.sort(lList);

				for (int i = 0; i < lList.size(); i++) {
					System.out.println("caller Number " + (i + 1) + " took " + lList.get(i) + " seconds");
				}
				totalpeople = totalpeople + arrived;

				System.out.println(arrived + " people who called in" + "\n");

				// output results for this simulation.
			}
			totalTime = +workItem.totalTime();
			System.out.println(" Number of Representative: " + (MAX_Representative));
			System.out.println(" Total Number of Callers: " + totalpeople);

			System.out.println("Avareg time per call in second " + totalTime + "\n");
			System.out.println("New total in minutes is " + thetime / 3600 + "\n");

		}
	}
}
