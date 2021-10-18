
public class Main {

	public static void main(String[] args) {

		SelfNo();

	}

	public static void SelfNo() {
		int[] num = new int [10001];
		int sum=0;
		for(int i=1;i<10000;i++) {
			int k=i;
			sum=sum+k;
			while(k>0) {
				sum=sum+k%10;
				k=k/10;
			}
			if(sum<=10000) {
				num[sum]=1;
			}
			sum=0;
		}
		
		for(int j=1;j<10001;j++) {
			if(num[j]!=1) {
				System.out.println(j);
			}
		}
		
	}
	
	
}

