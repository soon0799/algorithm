import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		if(input==0) {
			System.out.println(0);
		}
		else if(input==1) {
			System.out.println(1);
		}
		else {
			System.out.println(fibonacci(input, 0, 1, 0));
		}
		

	}



	public static int fibonacci(int i, int postnum,int num,int j) {
		int nextnum;
		nextnum=num+postnum;
		j++;
	
	
		if(j==i) {
			return num;
		}
		else {
			return fibonacci(i, num, nextnum, j);
		}
	}

	
}	


