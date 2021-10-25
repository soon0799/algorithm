#include <stdio.h>

void makeSum(int input);
int main(){
	int input;
	scanf("%d", &input);
	
	makeSum(input);
	
}

void makeSum(int input){
	int sum=0;;
	int i;
	int tmp;
	int num;
	while(i<input){
		tmp=i;
		sum=sum+tmp;
		while(tmp>0){
			sum=sum+(tmp%10);
			tmp=tmp/10;
		}
		if(sum==input){
			num=i;
			break;
			
		}
		
		sum=0;
		i++;
	}
	if(i==input){
		printf("0");
	}
	else{
	printf("%d", num);
	}
}
