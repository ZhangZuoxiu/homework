#include<iostream>
#include<stack>
using namespace std;  
#define MAX_VERTEX_NUM 26  

stack<int> s;  

typedef struct ArcNode//�߽��
{  
int adjvex;  //�ñ�ָ��Ķ����λ��
struct ArcNode *nextarc;  //ָ����һ���ߵ�ָ��
    ArcNode(){nextarc=0;}   
}ArcNode;  

typedef struct VNode//������
{  
int data;  //������
    ArcNode *firstarc;  //ָ���һ�������ö���ı�
    VNode(){firstarc=0;}  
}VNode,AdjList[MAX_VERTEX_NUM];  

typedef struct
{  
    AdjList vertices;  
int vexnum,arcnum;  //�������ͱ���
int kind;  
}ALGraph;  

bool Tuopu(ALGraph G,int *indegree)  
{  
int i,k;  
	
for(i=1;i<G.vexnum+1;i++)  //ѡȡһ�����Ϊ�ĵ�ѹ��ջ
    {  
if(!indegree[i])
		{
			s.push(i);
		}  
    }  
int a=0;  //�Ƕ�����
    ArcNode *p;  
while(!s.empty())  
    {  
        i = s.top();  
        s.pop();  //ջ��������Ϊ0����ջ
        cout<<G.vertices[i].data<<"-->";  
        a++;  
for(p=G.vertices[i].firstarc;p;p=p->nextarc)//P���ڽӵ���ȼ�һ����Ϊ����ջָ����һ�����
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
    cout<<"����ڵ����ͱ�����";  
    cin>>g.vexnum>>g.arcnum;  
for(i=1;i<g.vexnum+1;i++)  
        g.vertices[i].data = i;  //����������Ϊ�����±�

int b,e;  
    ArcNode *p;  
int *indegree = new int[g.vexnum+1];      //�������

    memset(indegree,0,sizeof(int)*(g.vexnum+1));  
    cout<<"��һ����ߵĶ���ԣ�����3 5 "<<endl;  
for(i=1;i<g.arcnum+1;i++)  //������ջ�Լ�����ȵĲ���
    {  
        cout<<"��"<<i<<"���ߣ�";  
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
		cout<<"������ͼ���Թ���AOV-����"<<endl;  
	}
else cout<<"������ͼ�޷�����AOV-����?"<<endl;  
return 0;  
} 
