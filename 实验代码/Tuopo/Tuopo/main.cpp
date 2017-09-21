#include<iostream>
#include<stack>
using namespace std;  
#define MAX_VERTEX_NUM 26  

stack<int> s;  

typedef struct ArcNode//边结点
{  
int adjvex;  //该边指向的顶点的位置
struct ArcNode *nextarc;  //指向下一条边的指针
    ArcNode(){nextarc=0;}   
}ArcNode;  

typedef struct VNode//顶点结点
{  
int data;  //数据域
    ArcNode *firstarc;  //指向第一条依附该顶点的边
    VNode(){firstarc=0;}  
}VNode,AdjList[MAX_VERTEX_NUM];  

typedef struct
{  
    AdjList vertices;  
int vexnum,arcnum;  //顶点数和边数
int kind;  
}ALGraph;  

bool Tuopu(ALGraph G,int *indegree)  
{  
int i,k;  
	
for(i=1;i<G.vexnum+1;i++)  //选取一个入度为的点压入栈
    {  
if(!indegree[i])
		{
			s.push(i);
		}  
    }  
int a=0;  //记顶点数
    ArcNode *p;  
while(!s.empty())  
    {  
        i = s.top();  
        s.pop();  //栈顶结点入度为0，出栈
        cout<<G.vertices[i].data<<"-->";  
        a++;  
for(p=G.vertices[i].firstarc;p;p=p->nextarc)//P的邻接点入度减一，若为则入栈指向下一个结点
        {  

            k = p->adjvex;  
            indegree[k]--;  
if(!indegree[k]) s.push(k); 
			

        }  
    }  
if(a<G.vexnum) return false;  
return true;  
}  


int main()  
{  
int i;  
    ALGraph g;  
    cout<<"输入节点数和边数：";  
    cin>>g.vexnum>>g.arcnum;  
for(i=1;i<g.vexnum+1;i++)  
        g.vertices[i].data = i;  //结点的数据置为结点的下标

int b,e;  
    ArcNode *p;  
int *indegree = new int[g.vexnum+1];      //入度数组

    memset(indegree,0,sizeof(int)*(g.vexnum+1));  
    cout<<"逐一输入边的顶点对，形如3 5 "<<endl;  
for(i=1;i<g.arcnum+1;i++)  //结点的入栈以及对入度的操作
    {  
        cout<<"第"<<i<<"条边：";  
        cin>>b>>e;  
        p = new ArcNode();  
        p->adjvex = e;  
        p->nextarc = g.vertices[b].firstarc;  
        g.vertices[b].firstarc = p;  
        indegree[e]++;  
        cout<<endl;  
    }  
if(Tuopu(g,indegree)) 
	{
		cout<<endl;
		cout<<"该有向图可以构成AOV-网！"<<endl;  
	}
else cout<<"该有向图无法构成AOV-网！?"<<endl;  
return 0;  
} 
