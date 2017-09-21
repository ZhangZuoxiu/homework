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
    public partial class jinhuo : Form
    {
        DataSet ds = new DataSet();
        string user;
        SqlDataAdapter da = new SqlDataAdapter();

        SqlParameter param = new SqlParameter();
        private DataTable DT = new DataTable();
        private DataTable DT1 = new DataTable();
        private SqlDataAdapter SDA = new SqlDataAdapter();
        public jinhuo(string user)
        {
            InitializeComponent();
            this.user = user;
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
           

        }
      

        private void jinhuo_Load(object sender, EventArgs e)
        {

            SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
            conn.Open();
            string str = "select sum(Cprice) as a from product ";
            SqlCommand cmd = new SqlCommand(str,conn);
            textBox1.Text = cmd.ExecuteScalar().ToString();
            
 
            SqlCommand SCD = new SqlCommand("select  Code,Cname,Cunit,Cpricein,Cnum1  from product where Cnum1!=0", conn);
            SDA.SelectCommand = SCD;
            SDA.Fill(DT);
            dataGridView1.DataSource = DT;
        }

        private void button2_Click(object sender, EventArgs e)
        {
             SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
            conn.Open();

            string str1 = null;

            

            for (int i = 0; i < dataGridView1.Rows.Count; i++)
            {



                str1 = "update product set Cnum1=0,Cprice=0 where Code='" + dataGridView1.Rows[i].Cells[0].Value + "'";


                SqlCommand sqlcom1 = new SqlCommand(str1, conn);
            }
            this.Close();

        }

        private void button1_Click(object sender, EventArgs e)
        {
            SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
            conn.Open();

            string str1 = null;

            int j = 0;
           
            for (int i = 0; i < dataGridView1.Rows.Count; i++)
            {



                str1 = "update product set Cnum=Cnum+Cnum1,Cprice=0,Cnum1=0 where Code='" + dataGridView1.Rows[i].Cells[0].Value + "'";


                SqlCommand sqlcom1 = new SqlCommand(str1, conn);

            


                int count1 = sqlcom1.ExecuteNonQuery();

                if (count1 < 0)
                {
                    MessageBox.Show("订单有误");
                    conn.Close();
                    break;
                }
                else
                {
                    j = 1;

                }

                str1 = null;


            }
            if (j == 1)
            {
                MessageBox.Show("进货成功");
                DataTable dt = (DataTable)dataGridView1.DataSource;
                Main form2 = new Main(user);
                form2.Show();
                this.Close();

            
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
