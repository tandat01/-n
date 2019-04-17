#include<stdio.h>

#include<math.h>

int main (){
	 int n;
		   printf("Nhap n: ");

             scanf("%d",&n);
      int i;

       int snt=1;
	   if(n==1)//dieu kien la  n bang 1

          printf("%d");
		else {
                                             	
         for(i=2; i<=sqrt(n); i++) {// sqrt ham tra ve cang bac hai cua n

             snt=1;

              if(n%i==0) {//phep chia lay du

                     snt=0;
                }

                }

           if(snt==1)

                printf("%d la so nguyen to",n);

                  else

                  printf("%d khong phai la so nguyen to",n);

      }

}
