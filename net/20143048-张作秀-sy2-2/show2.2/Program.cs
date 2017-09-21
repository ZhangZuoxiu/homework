using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace show2._2
{
    class Program
    {
        
        interface IShape
        {
            decimal initialize();
            decimal getParameter();
            decimal getArea();
        }
        interface IDisplayresult
        {
            void display();
        }
       
        
        class Square :IShape,IDisplayresult
        {
            public int a;
            public int b;
            public int area;
            public int para;
            public Square(int a,int b)
            {
                this.a=a;
                this.b=b;
            }
            public decimal initialize()
            {
                Console.WriteLine("输入长方形的长和宽");
                a = Convert.ToInt16(Console.ReadLine());
                b = Convert.ToInt16(Console.ReadLine());
                return 0;
            }
            public decimal getParameter()
            {
                para = 2 * (a + b);
                return 0;
            }
            public decimal getArea()
            {
                area= a *b;
                return 0;
            }
            public void display()
            {
                Console.WriteLine("长方形周长"+para);
                Console.WriteLine("长方形面积" + area);
            }
        }
        class Circle : IShape, IDisplayresult
        {
            public double r;       
            public double area;
            public double para;
            public Circle(double r)
            {
                this.r = r;
                
            }
            public decimal initialize()
            {
                Console.WriteLine("输入圆形的半径");
                r = Convert.ToInt32(Console.ReadLine());
                return 0;
            }
            public decimal getParameter()
            {
                para = 2*r*Math.PI;
                return 0;
            }
            public decimal getArea()
            {
                area = Math.PI*r*r;
                return 0;
            }
            public void display()
            {
                Console.WriteLine("圆形周长" + para);
                Console.WriteLine("圆形面积" + area);
            }
        }
        static void Main(string[] args)
        {
           
            while (1 != 0)
            {
                Console.WriteLine("请选择要操作的图形：");
                Console.WriteLine("1:长方形");
                Console.WriteLine("2：圆形");
                Console.WriteLine("3：退出");
                int a = Convert.ToInt16(Console.ReadLine());
                if (a == 1)
                {
                    Square z = new Square(0, 0);
                    z.initialize();
                    z.getParameter();
                    z.getArea();
                    z.display();
                    Console.WriteLine("");
                }
                else if (a == 2)
                {
                    Circle x = new Circle(0);
                    x.initialize();
                    x.getParameter();
                    x.getArea();
                    x.display();
                    Console.WriteLine("");
                }
                else if (a==3) break;
                else Console.WriteLine("输入有误，请重新输入");
            }
        }
    }
}
