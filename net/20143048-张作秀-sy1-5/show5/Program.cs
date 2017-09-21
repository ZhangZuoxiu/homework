using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace show5
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("输入二维数组的长和宽");
            int m, n,i=0,j=0, k=0,l=0;
            m = Convert.ToInt32(Console.ReadLine());
            n = Convert.ToInt32(Console.ReadLine());
            int[,] a = new int[m, n];
            Console.WriteLine("输入二维数组");
            for (i = 0; i < m; i++)
            {
                for (j = 0; j < n; j++)
                    a[i, j] = int.Parse(Console.ReadLine());
            }
            int[] max = new int[m];
            int[] min = new int[n];
            for(i=0;i<m;i++)
            {
                max[i] = a[i,0];
                for (j = 0; j < n; j++)
                {
                    if (a[i, j] >= max[i])
                    {
                        max[i] = a[i, j];
                        k = j;  //求出了当前行最大数所在的列
                    }
                }
                int p = 0;
                for(int o=0;o<n;o++)
                {
                    if (max[i] > a[o, k])
                        p = 1;
                        break;
                }
                if (p == 0)
                {
                    int x = i + 1;
                    int y = k + 1;
                    Console.WriteLine("该数组有位于第" + x + "行" + y + "列的鞍点" + max[i]);
                    break;
                }
                if (p == 1)
                    Console.WriteLine("该二维数组没有鞍点");
            }
               
                
            
        }
    }
}
