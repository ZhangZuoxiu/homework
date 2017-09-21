using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace 超市管理系统
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private String Get_rili()
        {
            int YEAR = DateTime.Now.Year;
            int MONTH = DateTime.Now.Month;
            int DAY = DateTime.Now.Day;
            int HOUR = DateTime.Now.Hour;
            int MIN = DateTime.Now.Minute;
            int SECOND = DateTime.Now.Second;
            String Time = YEAR.ToString();
            if (MONTH < 10)
            {
                Time = Time + "0" + MONTH.ToString();
            }
            else
            {
                Time = Time + MONTH.ToString();
            }
            if (DAY < 10)
            {
                Time = Time + "0" + DAY.ToString();
            }
            else
            {
                Time = Time + DAY.ToString();
            }
            if (HOUR < 10)
            {
                Time = Time + "0" + HOUR.ToString();
            }
            else
            {
                Time = Time + HOUR.ToString();
            }
            if (MIN < 10)
            {
                Time = Time + "0" + MIN.ToString();
            }
            else
            {
                Time = Time + MIN.ToString();
            }
            if (SECOND < 10)
            {
                Time = Time + "0" + SECOND.ToString();
            }
            else
            {
                Time = Time + SECOND.ToString();
            }
            return (Time);

        }
        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
           
            if (textBox1.Text=="")
            {
                MessageBox.Show("请输入用户名 ");
             
            }
            else if (textBox2.Text == "")
            {
                MessageBox.Show("请输入密码 ");
                
            }
            else
            {
                SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
                conn.Open();

                string check = "select username from Login where username='" + textBox1.Text + "'";
                
                SqlDataAdapter da = new SqlDataAdapter(check, conn);
                DataSet ds = new DataSet();
                da.Fill(ds, "table");
                if (da.Fill(ds, "table") <= 0)
                {
                    MessageBox.Show("没有此用户");
                }
                else
                {

                    SqlCommand com = new SqlCommand("select password from Login where username='" + textBox1.Text + "'");
                    com.Connection = conn;
                    SqlDataReader read = com.ExecuteReader();
                    read.Read();
                   
                   
                    if(read.HasRows)
                    {
                        
                        Main form2 = new Main(textBox1.Text);
                        form2.Show();
                        this.Hide();
                    }
                    else MessageBox.Show("密码不正确");
                }
               
            }

        }

        private void button2_Click(object sender, EventArgs e)
        {
            Resgiter form1 = new Resgiter();
            form1.Show();
            this.Hide();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
        
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            textBox2.PasswordChar = '*';
        }
    }
}
