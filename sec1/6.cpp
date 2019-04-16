#include <stdio.h>

int main(){
	int r,i;
	
	for(i=1;i<=100;i++){
	r = i%3;
	if(r==0){
		printf("%d\n",i);
	}
}	

	return 0;
}
