using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace show4
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("输入要计算的数组的长度");
            int b = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("输入一个长度为"+b+"的数组");
            int[] a=new int [b];
            int i;
            for(i=0;i<b;i++)
            {
                a[i] = Convert.ToInt32(Console.ReadLine());
            }
            int m = 0, n = 0;
            for (i = 0; i < b; i++)
            {
                if (a[i] % 2 == 0)
                {
                    n = n + a[i];
                }
                else m = m + a[i];
            }
            Console.WriteLine("输入的数组中质数之和为"+m);
            Console.WriteLine("输入的数组中偶数之和为"+n);

        }
    }
}
