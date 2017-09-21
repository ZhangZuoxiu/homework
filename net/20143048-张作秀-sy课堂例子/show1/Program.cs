using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace show1
{
    class Program
    {
        static void Main(string[] args)
        {
            Person person = new Person("张作秀", "男", 1996);
            person.Print();
            Teacher teacher = new Teacher("张作秀", "男", 1996, "20143048 ", 2015);
            teacher.Print();
        }
    }
}

