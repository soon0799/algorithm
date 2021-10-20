#include <stdio.h>


void hanoi(int n,int from,int to);

int main(){
	
	int input;
	scanf("%d",&input);
	int cnt=1;
	int i;
	for(i=0;i<input;i++){
		cnt=cnt*2;
	}
	cnt=cnt-1;
	printf("%d\n",cnt);
	hanoi(input,1,3);
	
}

void hanoi(int n,int from,int to){
	
	int middle = 6-(from+to);
	
	if(n==1) {
		printf("%d %d\n",from,to);
			
		}
		if(n>=2) {
			hanoi(n-1,from,middle);
			hanoi(1,from,to);
			hanoi(n-1,middle,to);
			
		}
}
