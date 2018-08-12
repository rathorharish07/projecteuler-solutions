#include<conio.h>
#include<stdio.h>
void main()
{
int i,a=0,c=0,d=0 ;
clrscr();
for(i=1;i<1000;i++)
{
if(i%3==0 || i%5==0)
  {
      a=a+i;
      
      }

      if(i%15==0)
      {
      c=c+i;
     
      }
    
      }
      d=a-c;
printf("%d",d)  ;

		 
}