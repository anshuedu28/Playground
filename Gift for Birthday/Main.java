#include<iostream>
using namespace std;
int main()
{
  int a;
  std::cin>>a;
  if(a%400==0)
  {
    std::cout<<a<<" is a leap year"<<endl;
  }
  else if(a%4==0)
  {
     std::cout<<a<<" is a leap year"<<endl;
  }
  else if(a%100==0)
  {
    std::cout<<a<<" is not a leap year"<<endl;
  }
  else
  {
    std::cout<<a<<" is not a leap year"<<endl;
  }
}