import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int cnt=1;
		
		for(int i=0;i<input;i++) {
			cnt=cnt*2;
		}
		cnt=cnt-1;
		
		System.out.printf("%d",cnt);
		hanoi(input,1,3);
		
	}



	

	public static void hanoi(int n,int from, int to) {
		
		int middle = 6-(from+to);
		if(n==1) {
			System.out.printf("%d %d",from,to);
			
		}
		if(n>=2) {
			hanoi(n-1,from,middle);
			hanoi(1,from,to);
			hanoi(n-1,middle,to);
			
		}
	}
	
}	


