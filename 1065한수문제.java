import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int i=HanNO(a);
		System.out.println(i);
		sc.close();
	}

	public static int HanNO(int i) {
		int[] num = new int[10];
		int[] numCheck = new int[10];
		int sub;
		int cnt=0;
		
			for(int j=1;j<=i;j++) {
				if(j<100) {
					cnt++;
				}
				else{
					int k=j;
					int l=0;
					while(k>0) {
						num[l]=k%10;
						numCheck[l]=1;
						k=k/10;
						l++;
					}
					l=1;
					sub=num[0]-num[1];
					while(numCheck[l+1]==1) {
						if(sub==num[l]-num[l+1]) {
							l++;
							if(numCheck[l+1]!=1) {
								cnt++;
							}
						}
						else {
							break;
						}
					}
					
				}
				
			}
			
			return cnt;
		}
	
	
}

