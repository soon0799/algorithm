import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

	public static class node{
		public int[] cnt = new int[2];
		public int value;		
		public int getValue() {
			return this.value;
		}
		public node(int i,int j,int v) {
			this.cnt[0]=i-1;
			this.cnt[1]=j-1;
			this.value=v;
		}
	}
	
	public static void main(String[] args) {
		int tmp;
		int cnt=0;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] union = new int[n];
		for(int i=0;i<n;i++) {
			union[i]=i;
		}
		node[] nodes = new node[m];
		for(int i=0;i<m;i++) {
			int s=sc.nextInt();
			int f=sc.nextInt();
			int v=sc.nextInt();
			nodes[i]=new node(s,f,v);
		}
		
		Arrays.sort(nodes, new Comparator<node>() {
			public int compare(node n1,node n2) {
				return Integer.compare(n1.getValue(), n2.getValue());
			}
			
		});
		while(cnt<m) {
			if(union[nodes[cnt].cnt[0]]!=union[nodes[cnt].cnt[1]]) {
				sum=sum+nodes[cnt].value;
				tmp=union[nodes[cnt].cnt[1]];
				union[nodes[cnt].cnt[1]]=findParrent(union, nodes[cnt].cnt[0]);
				ChangeFamily(union, tmp, union[nodes[cnt].cnt[1]]);
			}
			cnt++;			
		}
		
		System.out.println(sum);

	}
	
	public static int findParrent(int[] arr, int i) {
		if(arr[i]==i)return i;
		else return findParrent(arr,arr[i]);
	}
	public static void ChangeFamily(int[] arr,int pastNo, int preNo) {
		int i=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==pastNo) {
				arr[i]=preNo;
			}
		}
	}
}	


