import java.util.Scanner;


public class Main {
	public static Scanner sc= new Scanner(System.in);
	public static int[] fnum= {2,3,5,7};
	public static int[] anum = {1,3,7,9};
	public static int n;
	public static void main(String[] args){
		n= sc.nextInt();
		if(n==1) {
			for(int i=0;i<fnum.length;i++) {
				System.out.println(fnum[i]);
			}
		}
		else {
			for(int i=0;i<4;i++) {
				makeNum(1,fnum[i]);
			}
		}

	}

	public static void makeNum(int len,int pastnum) {
		
		if(len==n) {
			int num = pastnum;
			System.out.println(num);
		}
		
		else {
			for(int i=0;i<4;i++) {
				int cntnum=len+1;
				int tmp =(pastnum*10)+anum[i];
				if(checknum(tmp)) {
					makeNum(cntnum,tmp);
				}
			}
		}
		
	}

	public static boolean checknum(int num) {
		boolean check=true;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				check=false;
				break ;
			}
		}
		return check;
	}


}





