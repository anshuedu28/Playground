#include<iostream>
using namespace std;
int main()
{
 int a,b,c;
 std::cin>>a>>b>>c;
 if(2*(a+b)==c)
 {
   std::cout<<"It is a mango tree";
 }
  else if((a+b)==c)
  {
    std::cout<<"It is a mango tree";
  }
  else
  {
    std::cout<<"It is not a mango tree";
  }
}