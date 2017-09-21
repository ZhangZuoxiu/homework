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
    public partial class chaxun : Form
    {
        DataSet ds = new DataSet();

        SqlDataAdapter da = new SqlDataAdapter();

        SqlParameter param = new SqlParameter();
        private DataTable DT = new DataTable();
        private DataTable DT1 = new DataTable();
        private DataTable DT2 = new DataTable();
        private SqlDataAdapter SDA = new SqlDataAdapter();
        public chaxun()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(textBox1.Text=="")
            {
                MessageBox.Show("请输入快递单号");
            }
            else
            {
                SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
                conn.Open();

                string check = "select * from kuaidi where ID='" + textBox1.Text + "'";

                SqlDataAdapter da = new SqlDataAdapter(check, conn);
                DataSet ds = new DataSet();
                da.Fill(ds, "table");
                if (da.Fill(ds, "table") <= 0)
                {
                    MessageBox.Show("没有此单号");
                }
                else
                {

                 
                    SqlCommand SCD = new SqlCommand("select ID,name,company ,zhuangtai from kuaidi where ID='"+textBox1.Text+"'", conn);
                  
                    SDA.SelectCommand = SCD;
                    SDA.Fill(DT);
                    dataGridView1.DataSource = DT;

                }
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void chaxun_Load(object sender, EventArgs e)
        {
            

        }

        private void button2_Click(object sender, EventArgs e)
        {
            Main form = new Main();
            form.Show();
            this.Close();
        }
    }
}
