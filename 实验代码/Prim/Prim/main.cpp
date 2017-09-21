#include<iostream>
using namespace std;
const int n=6;//�����
const int e=10;//����
class edgeset
	{
	public :
	int front;//ǰһ������λ��
	int end;//��һ������λ��
	int weight;//Ȩֵ
	};

class tree
	{
	public :
	int s[n+1][n+1];//�ڽӾ���
	edgeset ct[n+1];//�߽��

	void prim(tree &t)
	{
	int i,j,k,min,t1,m,w;
	for(i=1;i<n;i++)//��ʼ���߽��
		{	
			t.ct[i].front=1;
			t.ct[i].end=i+1;
			t.ct[i].weight=t.s[1][i+1];//�ڽӾ����ֵΪ��Ӧ�߽���Ȩֵ
		}

	for(k=2;k<=n;k++)
		{
			min=32767;
			m=k-1;

			for(j=k-1;j<n;j++)
				if(t.ct[j].weight<min)
				{
					min=t.ct[j].weight;
					m=j;
				}
			edgeset temp=t.ct[k-1];
			t.ct[k-1]=t.ct[m];
			t.ct[m]=temp;
			j=t.ct[k-1].end;//�ó�Ȩֵ��С�ı�
			for(i=k;i<n;i++)//���ڽӾ�������߽�㸳ֵ
				{
					t1=t.ct[i].end;
					w=t.s[j][t1];
					if(w<t.ct[i].weight)
						{
							t.ct[i].weight=w;
							t.ct[i].front=j;
						}
				}
		}
	}
	};

void main ()
{	
	int j,i,w;tree t;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
				if(i==j) t.s[i][j]=0;
				else t.s[i][j]=32767;
		}
	}

	for(int k=1;k<=e;k++)
		{
			cout<<"����һ���߼����ϵ�Ȩֵ ";
			cin>>i>>j>>w;
			cout<<endl;
			t.s[i][j]=w;
			t.s[j][i]=w;
		}

	t.prim(t);
	for(i=1;i<n;i++)//n-1���ߵ���С������
		{
			cout<<t.ct[i].front<<""<<t.ct[i].end<<""<<t.ct[i].weight<<endl;
		}
}
