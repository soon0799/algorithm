import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static Scanner sc= new Scanner(System.in);	
	static int w ;
	static int h ;
	static int[][] arr;
	static int[][] visited;
	static int[] x = {-1,-1,-1,0,0,1,1,1};
	static int[] y = {-1,0,1,-1,1,-1,0,1};
	public static void main(String[] args) {
		while(true) {
			w=sc.nextInt();
			h=sc.nextInt();
			if(w==0&&h==0)break;
			arr= new int[h][w];
			visited=new int[h][w];
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					arr[i][j]=0;
				}
			}
			int cnt=0;
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					if(arr[i][j]==1&&visited[i][j]==0) {
						dfs(i,j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}


	}
	public static void dfs(int w1,int h1) {
		visited[w1][h1]=1;
		int wx;
		int hy;
		for(int i=0;i<8;i++) {
			wx=w1+x[i];
			hy=h1+y[i];
			if(wx>=0 && wx<h && hy>=0 && hy<w) {
				if(arr[wx][hy]==1&&visited[wx][hy]==0)dfs(wx,hy);
			}
		}
	}
}





