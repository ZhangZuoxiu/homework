#include<iostream>

using namespace std;  

void Hill( )  
{  
int d,i,j,k,temp,m;  
	int l=1;
	int a[11];
	int c;
	cout<<"����һ������Ϊ10������"<<endl;
	for(i=0;i<10;i++)
		cin>>a[i];
	cout<<"����֮ǰ������Ϊ";
	for(i=0;i<10;i++)
		cout<<a[i];
	cout<<endl;
for(d = 4; d >0; d--)  
    {  
for(i=0; i<d; i++)  
        {  
			
for(j = i+d; j<10; j=j+d)  
            {  
if(a[j]<a[j-d])  
                {  
                    temp = a[j];  
                    k = j-d;  
while(k>=0&&a[k]>temp)  
                    {  
                        a[k+d] = a[k];  
                        k = k-d;  
                    }  
                    a[k+d] = temp;  
                }  
				
            }  
			

			cout<<"��"<<l<<"������Ľ��Ϊ"<<endl;
			l++;
			for(m=0;m<10;m++)
				{
				
				cout<<a[m]<<"";
				}
				cout<<endl;
			
        }  
    }  
}  

int main()  
{  
	
     Hill();  
     system("pause");  
}  
