using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace show
{
    class Program
    {
        static void Main(string[] args)
        {
            int p = 1;
          while(p > 0)
            {
                Console.WriteLine("请输入操作：");
                Console.WriteLine("1:三角形");
                Console.WriteLine("2:长方形");
                Console.WriteLine("3:退出");
                float i = Convert.ToSingle(Console.ReadLine());
                if (i == 1)
                {
                    Console.WriteLine("输入一个三角形的三条边：");
                    float a = Convert.ToSingle(Console.ReadLine());
                    float b = Convert.ToSingle(Console.ReadLine());
                    float c = Convert.ToSingle(Console.ReadLine());
                    while(a + b <= c || b + c <= a || a + c <= b)
                    {
                        Console.WriteLine("这三条边无法构成一个三角形：");
                        Console.WriteLine("请重新输入一个三角形的三条边：");
                        a = Convert.ToSingle(Console.ReadLine());
                        b = Convert.ToSingle(Console.ReadLine());
                        c = Convert.ToSingle(Console.ReadLine());
                       
                    }
                 
                     float d = (a + b + c) / 2;
                        double e = Math.Sqrt(d * (d - a) * (d - b) * (d - c));
                        Console.WriteLine("三角形面积为：" + e);
                        Console.WriteLine("三角形周长为：" + 2 * d); 
                    
                   
                }
               else if (i == 2)
                {
                    Console.WriteLine("输入一个长方形的长和宽：");
                    float m = Convert.ToSingle(Console.ReadLine());
                    float n = Convert.ToSingle(Console.ReadLine());


                    Console.WriteLine("长方形面积为：" + m * n);
                    Console.WriteLine("长方形周长为：" + 2 * (m + n));
                }
                else p=-1;
            }
        }
    }
}
