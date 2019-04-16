#include<stdio.h>

int main (){
	int x,y;
	printf ("nhap vao so x\n");
	scanf("%d",&x);
	printf ("nhap vao so y\n");
	scanf("%d",&y);
	int tem;
	tem =x;
	x=y;
	y=tem;
	printf("sau khi doi la :x= %d y=%d",x,y);
	
	return 0;
	
}
