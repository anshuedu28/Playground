#include<iostream>
using namespace std;
int main()
{
int a=3,b=4;
  int x,y,i,j,k,m,n;
 int temp,sqrt;
  std::cin>>x>>y;
  i=(x-a);
  j=(y-b);
  k=i*i;
  m=j*j;
  n=k+m;
  sqrt=n/2;
  temp=0;
  while(sqrt != temp)
  {
    temp=sqrt;
    sqrt=(n/temp + temp)/2;
    }
  std::cout<<sqrt;  
}