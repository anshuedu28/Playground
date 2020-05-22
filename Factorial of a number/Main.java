#include<iostream>
int main(){
 int a,i;
  std::cin>>a;
  int fact=1;
  for(i=1;i<=a;i++)
  {
    fact=fact*i;
  }
  std::cout<<fact;
    
}