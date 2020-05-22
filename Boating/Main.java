#include<iostream>

int main()
{
  int a,b,c,d,e;
  std::cin>>a>>b>>c;
  d=b*75;
  e=c*30;
  if((d+e)<=a)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }
  
  
}