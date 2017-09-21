using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace show3._2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        string a;
        string b;
        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
          
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            
        }

        private void button1_Click(object sender, EventArgs e)
        {


            if(textBox1.Text=="")
              {
                  MessageBox.Show("请输入姓名");
              }
            else if (textBox2.Text == "")
            {
                MessageBox.Show("请输入学院");
            }
            else if(comboBox1.SelectedIndex==-1)
            {
                MessageBox.Show("请选择年级");
            }
            else if(radioButton1.Checked==false&&radioButton2.Checked==false)
            {
                MessageBox.Show("请选择性别");
            }
            else if (checkBox1.Checked==false&&checkBox2.Checked==false&&checkBox3.Checked==false)
            {
               MessageBox.Show("请选择爱好");
            }
            else
                foreach (Control c in groupBox1.Controls)//遍历groupBox1内的所有控件
                {
                    if (c is CheckBox)//只遍历CheckBox控件 
                    {
                        if((c as CheckBox).Checked==true)
                            {
                                b += c.Text;
                            }
                    }
                }
                
                listBox1.Items.Add("我是" + textBox1.Text + "，来自" + textBox2.Text + "学院，" );
                listBox1.Items.Add( "是一名"+comboBox1.Text + "的" + a + "同学，我喜欢");
                listBox1.Items.Add(b);
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
         
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButton1.Checked == true)
                a = "男";
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButton2.Checked == true)
                a = "女";
        }
    }
}
