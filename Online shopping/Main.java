#include<iostream>
using namespace std;
int main()
{
int a,b,c,d,e,f,g,h,i;
 std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
 int d1=(a*b)/100;
 int d2=(d*e)/100;
 int d3=(g*h)/100;
 int F=a-d1+c;
 int S=d-d2+f;
 int A=g-d3+i;
  std::cout<<"In Flipkart Rs."<<F<<"\n";
  std::cout<<"In Snapdeal Rs."<<S<<"\n";
  std::cout<<"In Amazon Rs."<<A<<"\n";
  if(F<S && F<A)
  {
    std::cout<<"He will prefer Flipkart";
  }
  else if(S<A && S<F)
  {
    std::cout<<"He will prefer Snapdeal";
  }
  else if(F==S && F<A && S<A)
  {
     std::cout<<"He will prefer Flipkart";
  }
  else 
  {
  std::cout<<"He will prefer Amazon";
  }
    
}