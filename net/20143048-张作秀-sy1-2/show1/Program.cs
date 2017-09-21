using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace show1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("请输入1至12月中任意一个月份的数字");
            float a = Convert.ToSingle(Console.ReadLine());
            if(a==1||a==2||a==3)
            {
                Console.WriteLine("该季节为春季！");
            }
            if (a == 4 || a == 5 || a == 6)
            {
                Console.WriteLine("该季节为夏季！");
            }
            if (a == 7 || a == 8 || a == 9)
            {
                Console.WriteLine("该季节为秋季！");
            }
            if (a == 10 || a == 11 || a == 12)
            {
                Console.WriteLine("该季节为冬季！");
            }
        }

    }
}
