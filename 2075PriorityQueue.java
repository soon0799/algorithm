import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		int n = sc.nextInt();

		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				q.offer(sc.nextInt());
			}

		}
		for(int k=0;k<n-1;k++) {
			q.poll();
		}
		System.out.println(q.poll());

	}


}





