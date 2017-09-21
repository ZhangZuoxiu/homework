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
    public partial class Main : Form
    {
        DataSet ds = new DataSet();

        SqlDataAdapter da = new SqlDataAdapter();

        SqlParameter param = new SqlParameter();
        private DataTable DT = new DataTable();
        private DataTable DT1 = new DataTable();
        private DataTable DT2 = new DataTable();
        private SqlDataAdapter SDA = new SqlDataAdapter();
        public Main()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void tabPage2_Click(object sender, EventArgs e)
        {

        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void toolStripStatusLabel1_Click(object sender, EventArgs e)
        {

        }

        private void toolStripStatusLabel1_Click_1(object sender, EventArgs e)
        {

        }

        private void Main_Load(object sender, EventArgs e)
        {
            SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
            SqlCommand SCD = new SqlCommand("select ID,name,company ,zhuangtai from kuaidi ", conn);
            conn.Open();
            SDA.SelectCommand = SCD;
            SDA.Fill(DT);
            dataGridView3.DataSource = DT;
            SqlCommand SCD2 = new SqlCommand("select ID,name,company ,zhuangtai from kuaidi where zhuangtai='已签收'", conn);
            
            SDA.SelectCommand = SCD2;
            SDA.Fill(DT1);
            dataGridView1.DataSource = DT1;
            SqlCommand SCD3 = new SqlCommand("select ID,name,company ,zhuangtai from kuaidi where zhuangtai='未签收'", conn);

            SDA.SelectCommand = SCD3;
            SDA.Fill(DT2);
            dataGridView2.DataSource = DT2;


        }

        private void Main_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }

        private void dataGridView3_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void dataGridView2_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            chaxun form = new chaxun();
            form.Show();
            this.Hide();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            tianjia form = new tianjia();
            form.Show();
            this.Hide();
        }
    }
}
