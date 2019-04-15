#include<stdio.h>

int main() {
int a, b;
printf("Nhap gia tri a: ");
scanf("%d", &a);
printf("Nhap gia tri b: ");
scanf("%d", &b);

if(a > b)
    printf("a lon hon b");
else if(a<b)
    printf("a be hon b");
else
    printf("a bang b");
return 0;
}

