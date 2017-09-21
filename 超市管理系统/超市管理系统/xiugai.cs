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
    
        
    public partial class xiugai : Form
    {
        string user;
        string password;
        DataSet ds = new DataSet();


        SqlDataAdapter da = new SqlDataAdapter();

        SqlParameter param = new SqlParameter();
        private DataTable DT = new DataTable();
        private DataTable DT1 = new DataTable();
        private DataTable DT2 = new DataTable();
        private SqlDataAdapter SDA = new SqlDataAdapter();
        public xiugai(string user,string password)
        {
            InitializeComponent();
            this.user = user;
            this.password = password;
        }

        private void xiugai_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(textBox1.Text!=password)
            {
                MessageBox.Show("原密码错误");
            }
            else if (textBox2.Text != textBox3.Text)
            {
                MessageBox.Show("请确认密码一致");
            }
            else
            {
                SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
                conn.Open();
                string str = "update Login set password='" + textBox2.Text + "' where username='" + user + "'";
                SqlCommand sqlcom1 = new SqlCommand(str, conn);
                int count1 = sqlcom1.ExecuteNonQuery();

                if (count1 < 0)
                {
                    MessageBox.Show("修改失败");
                    conn.Close();

                }
                else
                {

                    MessageBox.Show("修改成功");
                    this.Close();
                }
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            textBox1.PasswordChar = '*';
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            textBox1.PasswordChar = '*';
        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {
            textBox1.PasswordChar = '*';
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
