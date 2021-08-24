
#include<iostream>

using namespace std;

class ArithmeticX
{
    public:
        void Table(int);
};

void ArithmeticX::Table(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    int i = 1;

    while(i <= 10)
    {
        cout<<i++*iNo<<" ";
    }
    cout<<endl;
}

int main()
{
    int iValue = 0, iRet = 0;

    cout<<"Enter Number\n";
    cin>>iValue;

    ArithmeticX aobj;
    aobj.Table(iValue);

    return 0;
}