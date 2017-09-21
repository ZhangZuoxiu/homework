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
    public partial class tianjia : Form
    {
        public tianjia()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

            
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Main form = new Main();
            form.Show();
            this.Close();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "")
            {
                MessageBox.Show("请输入快递单号");
            }
            else if (textBox2.Text == "")
            {
                MessageBox.Show("请输入快递名称");
            }
            else if (comboBox1.SelectedIndex == -1)
            {
                MessageBox.Show("请选择快递公司");
            }
            else
            {
                SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
                conn.Open();
                string sql = "insert into kuaidi values('" + textBox1.Text + "','" + textBox2.Text + "','" + comboBox1.Text + "','未签收00000000000')";
                SqlCommand cmd = new SqlCommand(sql, conn);
                int i = cmd.ExecuteNonQuery();
                if (i < 0)
                {
                    MessageBox.Show("添加失败");
                }
                else
                {
                    MessageBox.Show("添加成功");
                    Main form = new Main();
                    form.Show();
                    this.Close();
                }
            }
        }
    }
}
