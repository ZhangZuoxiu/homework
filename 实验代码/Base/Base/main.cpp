#include<iostream>
using namespace std;
#define N 5
void main()
{
	int i,j,l=1,r=1,c,m=0,n=0,k;
	int a[5];
	cout<<"������"<<N<<"������"<<endl;
	for(i=0;i<N;i++)
		cin>>a[i];
	int d=1;//ͳ�����λ��
	int p=10;
	int b[10];
	
	for(i=0;i<10;i++)
	{
		b[i]=-1;
	}
	for(i=0;i<N;i++)
	{
		while(a[i]>=p)
		{	p=p*10;
			++d;
		}
	}
	
	
	for(c=0;c<d;c++)
	{	
		m=0;
		for(i=0;i<10;i++)
		{
			for(j=0;j<N;j++)
			{
				k=(a[j]/r)%10;
				if(a[j]<r)
				{
					k=0;
				}
				
				if(k==i&&m<10)
				{	
				
					b[m]=a[j];
				
					m++;
				}
				else cout<<"";
				
				
				
				
			}
			
		}
		for(i=0;i<10;i++)
		{
			if(b[i]==-1)
			b[i]=b[i+1];
		}
         if(i==d-1)
		cout<<"��"<<l<<"������Ľ��Ϊ��"<<endl;
		l++;
		for(i=0;i<N;i++)
		{
			a[i]=b[i];
			cout<<a[i]<<"";
			
		}
		cout<<endl;
		r=r*10;
		for(i=0;i<10;i++)
		{
			b[i]=-1;
		}
		
	}
}
