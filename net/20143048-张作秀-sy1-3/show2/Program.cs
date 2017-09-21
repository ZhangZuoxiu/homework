using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace show2
{abstract
    class Program
    {
        static void Main(string[] args)
        {
            int a = 2;
            while(a%2!=1||a%3!=1||a%4!=1)
            {
                a++;
            }
            Console.WriteLine("框里至少有" + a + "个鸡蛋");
        }
    }
}
