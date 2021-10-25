#include <stdio.h>

int main(){
	int input;
	int num=0;;
	int tmp;
	int doomNo;
	scanf("%d", &input);
	
	
	while(input>0){
		num=num+1;
		tmp=num;
		while(tmp>0){
			if(tmp%1000==666){
				input--;
				doomNo=num;
				break;
			}
			else{
				tmp=tmp/10;
			}
			
		}
				
	}
	printf("%d",doomNo);

}
	


