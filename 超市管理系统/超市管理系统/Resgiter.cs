﻿using System;
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
    public partial class Resgiter : Form
    {
 
        public Resgiter()
        {
            InitializeComponent();
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
            else if (textBox3.Text == "")
            {
                MessageBox.Show("请确认密码");

            }
            else if(textBox2.Text!=textBox3.Text)
            {
                MessageBox.Show("请确认密码");
            }
            else
            {

                SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
                conn.Open();
               
                    string check = "select username from Login where username='" + textBox1.Text + "'";
                    SqlDataAdapter da = new SqlDataAdapter(check, conn);
                    DataSet ds = new DataSet();
                    da.Fill(ds, "table");
                    if (da.Fill(ds, "table") > 0)
                    {
                        MessageBox.Show("用户名已存在");
                    }
                    else
                    {
                        string sql = "Insert into Login values('" + textBox1.Text + "','" + textBox2.Text + "','','','','','','','','')";
                        SqlCommand cmd = new SqlCommand(sql,conn);
                        cmd.ExecuteNonQuery();
                        MessageBox.Show("注册成功");
                        Form1 form2 = new Form1();
                        form2.Show();
                        this.Hide();
                    }
                
               
            }

        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "")
            {
                MessageBox.Show("请输入用户名 ");

            }
            else if (textBox1.Text.Length!=0&&textBox1.Text.Length<6)
            {
                MessageBox.Show("用户名不少于六位 ");

            }
            else if (textBox2.Text == "")
            {
                MessageBox.Show("请输入密码 ");

            }
            else if (textBox2.Text.Length != 0 && textBox2.Text.Length < 6)
            {
                MessageBox.Show("密码不少于六位");

            }
            else if (textBox3.Text == "")
            {
                MessageBox.Show("请确认密码");

            }
            else if (textBox3.Text!=textBox2.Text)
            {
                MessageBox.Show("请确认密码");

            }
            else
            {
               
                Form1 form3 = new Form1();
                form3.Show();
                this.Close();
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            textBox2.PasswordChar = '*';
        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {
            textBox3.PasswordChar = '*';
        }

        private void Resgiter_Load(object sender, EventArgs e)
        {

        }
    }
}
