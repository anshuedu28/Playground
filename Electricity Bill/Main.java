#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e;
  std::cin>>a;
  if(a<=200)
  {
    b=(0.5*a);
    std::cout<<"Rs."<<b;
  }
  else if(a<=400)
  {
    c=(a*0.65)+100;
    std::cout<<"Rs."<<c;
  }
  else if(a<=600)
  {
    d=(a*0.80)+200;
    std::cout<<"Rs."<<d;
  }
  else if(a>600)
  {
    e=(a*1.25)+425;
    std::cout<<"Rs."<<e;
  }
    
}