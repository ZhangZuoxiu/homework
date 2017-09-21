using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace show2._1
{
    class Program
    {
        public abstract class people
        {
            protected string name;
            public string Name
            {
                get
                {
                    return name;
                }
                set
                {
                    name = value;
                }
            }
            protected int age;
            public int Age
            {
                get { return age; }
                set { age = value; }
            }
            public void work()
            {
                Console.WriteLine("每个人都必须工作！！！");
            }


        }
        public class Student : people
        {
            public string school;
            public string School
            {
                get { return school; }
                set { school = value; }
            }
            public new void work()
            {
                Console.WriteLine("主要工作：学习");
            }

        public Student(string name1,int age1,string school1)
            {
                Name = name1;
                Age = age1;
                School = school1;
                Console.WriteLine("学生姓名:{0}",Name);
                Console.WriteLine("年龄:{0}", Age);
                Console.WriteLine("所在学校:{0}", School);
                base.work();
                this.work();
        
        }
        }
        public class Employer : people
        {
            public string Company;
            public string company
        {
            get{return Company;}
            set { Company = value; }

        }
            public new void work()
            {
                Console.WriteLine("主要工作：员工");
            }

                   public Employer(string name1,int age1,string company1)
                   {   
                Name = name1;
                Age = age1;
               company = company1;
               
                Console.WriteLine("员工姓名:{0}",Name);
                Console.WriteLine("年龄:{0}", Age);
                Console.WriteLine("所在公司:{0}", company);
                base.work();
                this.work();
        
        }
        }
        static void Main(string[] args)
        {
            
            Student z=new Student("张作秀",20,"石家庄铁道大学");
            Console.WriteLine("");
            Employer x = new Employer("马云", 40, "阿里巴巴");
           
            
        }
    }
}
