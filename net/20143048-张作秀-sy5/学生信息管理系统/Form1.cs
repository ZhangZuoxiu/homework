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
namespace 学生信息管理系统
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            textBox2.PasswordChar = '*';
        }

        private void button1_Click(object sender, EventArgs e)
        {


            if (textBox1.Text == "")
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

                string check = "select username from login1 where username='" + textBox1.Text + "'";

                SqlDataAdapter da = new SqlDataAdapter(check, conn);
                DataSet ds = new DataSet();
                da.Fill(ds, "table");
                if (da.Fill(ds, "table") <= 0)
                {
                    MessageBox.Show("没有此用户");
                }
                else
                {

                   SqlCommand com = new SqlCommand("select password from login1 where username='" + textBox1.Text + "'");
                    com.Connection = conn;
                    SqlDataReader read = com.ExecuteReader();
                    read.Read();


                    if (read.HasRows)
                    {

                        Main form2 = new Main();
                        form2.Show();
                        this.Hide();
                    }
                    else MessageBox.Show("密码不正确");
                }

            }
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
