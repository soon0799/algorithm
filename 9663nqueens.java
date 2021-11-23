import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static Scanner sc= new Scanner(System.in);	
	public static int n ;
	public static int[] arr;
	public static int cnt=0;
	public static void main(String[] args) {
		n=sc.nextInt();
		arr= new int[n];
		makeb(0);
		System.out.println(cnt);

	}
	public static void makeb(int x) {	
		if(x==n) {
			cnt++;
		}
		else {
			for(int i=0;i<n;i++) {
				arr[x]=i;
				if(possible(x)) {
					makeb(x+1);
				}
			}
		}



	}

	public static boolean possible(int x ) {	
		for(int i=0;i<x;i++) {
			if(arr[x]==arr[i])return false;
		}
		for(int i=0;i<x;i++) {
			if(Math.abs(i-x)==Math.abs(arr[x]-arr[i]))return false;
		}
		return true;


	}
}





