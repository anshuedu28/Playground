#include<iostream>
using namespace std;
int main()
{
int a,b,c;
  float d,e,f,g;
  std::cin>>a;
   std::cin>>b;
   std::cin>>c;
  d=(a*b*c)/100;
  e=a+d;
  f=0.02*d;
  g=e-f;
  std::cout<<d<<"\n";
  std::cout<<e<<"\n";
  std::cout<<f<<"\n";
  std::cout<<g; 
}