import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		String input1 =sc.nextLine();
		String input2 =sc.nextLine();
		int max=0;
		char[] input1array = new char[input1.length()];
		char[] input2array = new char[input2.length()];
		
		for(int i=0;i<input1.length();i++) {
			input1array[i]=input1.charAt(i);
		}
		for(int i=0;i<input2.length();i++) {
			input2array[i]=input2.charAt(i);
		}	
		
		int[][] check=new int[input1array.length][input2array.length];
		
		for(int i=0;i<input1array.length;i++) {
			for(int j=0;j<input2array.length;j++) {
				check[i][j]=0;
				if(input1array[i]==input2array[j]) {
					check[i][j]=1;
					if(i>0&&j>0&&check[i-1][j-1]>0)check[i][j]=check[i][j]+check[i-1][j-1];
				}
			}
		}
		for(int i=0;i<input1array.length;i++) {
			for(int j=0;j<input2array.length;j++) {
				if(check[i][j]>max)max=check[i][j];
				}
			}
		System.out.println(max);
		}
	}


