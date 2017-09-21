#include<iostream>
using namespace std;
const int n=6;//结点数
const int e=10;//边数
class edgeset
	{
	public :
	int front;//前一个结点的位置
	int end;//后一个结点的位置
	int weight;//权值
	};

class tree
	{
	public :
	int s[n+1][n+1];//邻接矩阵
	edgeset ct[n+1];//边结点

	void prim(tree &t)
	{
	int i,j,k,min,t1,m,w;
	for(i=1;i<n;i++)//初始化边结点
		{	
			t.ct[i].front=1;
			t.ct[i].end=i+1;
			t.ct[i].weight=t.s[1][i+1];//邻接矩阵的值为对应边结点的权值
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
			j=t.ct[k-1].end;//拿出权值最小的边
			for(i=k;i<n;i++)//将邻接矩阵其余边结点赋值
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
			cout<<"输入一条边及边上的权值 ";
			cin>>i>>j>>w;
			cout<<endl;
			t.s[i][j]=w;
			t.s[j][i]=w;
		}

	t.prim(t);
	for(i=1;i<n;i++)//n-1条边的最小生成树
		{
			cout<<t.ct[i].front<<""<<t.ct[i].end<<""<<t.ct[i].weight<<endl;
		}
}
