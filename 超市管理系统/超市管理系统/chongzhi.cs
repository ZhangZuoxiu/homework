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
    public partial class chongzhi : Form
    {
        string user;
        DataSet ds = new DataSet();
       

        SqlDataAdapter da = new SqlDataAdapter();

        SqlParameter param = new SqlParameter();
        private DataTable DT = new DataTable();
        private DataTable DT1 = new DataTable();
        private DataTable DT2 = new DataTable();
        private SqlDataAdapter SDA = new SqlDataAdapter();
        public chongzhi(string user)
        {
            InitializeComponent();
            this.user = user;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
            conn.Open();
            string str = "update Login set money=money+'"+textBox1.Text+"' where username='"+user+"'";
            SqlCommand sqlcom1 = new SqlCommand(str, conn);
            int count1 = sqlcom1.ExecuteNonQuery();

            if (count1 < 0)
            {
                MessageBox.Show("充值失败");
                conn.Close();
            
            }
            else
            {

                MessageBox.Show("充值成功");
                Main form2 = new Main(user);
                form2.Show();
                this.Close();
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            MessageBox.Show("充值失败");
            Main form2 = new Main(user);
            form2.Show();
            this.Close();
        }
    }
}
