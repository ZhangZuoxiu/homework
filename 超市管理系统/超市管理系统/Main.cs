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
    public partial class Main : Form
    {

        string user;
        DataSet ds = new DataSet();
        
        SqlDataAdapter da = new SqlDataAdapter();
        
        SqlParameter param = new SqlParameter();
        private DataTable DT = new DataTable();
        private DataTable DT1 = new DataTable();
        private DataTable DT2 = new DataTable();
        private SqlDataAdapter SDA = new SqlDataAdapter();
        public Main(string user)
        {
            InitializeComponent();
            this.user = user;
        }
       

      
      
       
       
        private void label1_Click(object sender, EventArgs e)
        {

        }



     

        private void tabPage1_Click(object sender, EventArgs e)
        {

        }

        private void Main_Load(object sender, EventArgs e)
        {
            textBox14.Text = user;
            textBox15.Text = "的零食店";
           

            SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
            SqlCommand SCD = new SqlCommand("select  Code,Cname,Ctype,Cunit,Cpricein,Cpricrout,Cnum  from product where Cname!=''", conn);
            conn.Open();
            SDA.SelectCommand = SCD;
            SDA.Fill(DT);
            dataGridView1.DataSource = DT;

            SqlCommand SCD1 = new SqlCommand("select  Code,Cname,Ctype,Cunit,Cpricein,Cnum1 from product where Cname!=''and Cnum1='0'", conn);
            SDA.SelectCommand = SCD1;
            SDA.Fill(DT1);
            dataGridView2.DataSource = DT1;
            SqlCommand SCD2 = new SqlCommand("select  Code,Cname,Ctype,Cunit,Cpricrout,Cnum1,Cnum from product", conn);
            SDA.SelectCommand = SCD2;
            SDA.Fill(DT2);
            dataGridView3.DataSource = DT2;
            string str1 = "select username  from Login where username='" + user + "'";
            SqlCommand cmd1 = new SqlCommand(str1, conn);
            textBox5.Text = cmd1.ExecuteScalar().ToString();
            string str2 = "select password  from Login where username='" + user + "'";
            SqlCommand cmd2 = new SqlCommand(str2, conn);
            textBox6.Text = cmd2.ExecuteScalar().ToString();
            string str3 = "select money  from Login where username='" + user + "'";
            SqlCommand cmd3 = new SqlCommand(str3, conn);
            textBox7.Text = cmd3.ExecuteScalar().ToString();
            string str4 = "select school  from Login where username='" + user + "'";
            SqlCommand cmd4 = new SqlCommand(str4, conn);
            textBox8.Text = cmd4.ExecuteScalar().ToString();
            string str5 = "select ins  from Login where username='" + user + "'";
            SqlCommand cmd5 = new SqlCommand(str5, conn);
            textBox10.Text = cmd5.ExecuteScalar().ToString();
            string str6 = "select zhuanye  from Login where username='" + user + "'";
            SqlCommand cmd6 = new SqlCommand(str6, conn);
            textBox11.Text = cmd6.ExecuteScalar().ToString();
            string str7 = "select sno  from Login where username='" + user + "'";
            SqlCommand cmd7 = new SqlCommand(str7, conn);
            textBox12.Text = cmd7.ExecuteScalar().ToString();
            string str8 = "select phone  from Login where username='" + user + "'";
            SqlCommand cmd8 = new SqlCommand(str8, conn);
            textBox9.Text = cmd8.ExecuteScalar().ToString();
            string str9 = "select address  from Login where username='" + user + "'";
            SqlCommand cmd9 = new SqlCommand(str9, conn);
            textBox13.Text = cmd9.ExecuteScalar().ToString();
            string str10 = "select grade  from Login where username='" + user + "'";
            SqlCommand cmd10 = new SqlCommand(str10, conn);
            textBox16.Text = cmd10.ExecuteScalar().ToString();
            
      
            

        }
        public void showinfo3()
        {
            SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
            conn.Open();
            string str1 = "select username  from Login where username='" + user + "'";
            SqlCommand cmd1 = new SqlCommand(str1, conn);
            textBox5.Text = cmd1.ExecuteScalar().ToString();
            string str2 = "select password  from Login where username='" + user + "'";
            SqlCommand cmd2 = new SqlCommand(str2, conn);
            textBox6.Text = cmd2.ExecuteScalar().ToString();
            string str3 = "select money  from Login where username='" + user + "'";
            SqlCommand cmd3 = new SqlCommand(str3, conn);
            textBox7.Text = cmd3.ExecuteScalar().ToString();
            string str4 = "select school  from Login where username='" + user + "'";
            SqlCommand cmd4 = new SqlCommand(str4, conn);
            textBox8.Text = cmd4.ExecuteScalar().ToString();
            string str5 = "select ins  from Login where username='" + user + "'";
            SqlCommand cmd5 = new SqlCommand(str5, conn);
            textBox10.Text = cmd5.ExecuteScalar().ToString();
            string str6 = "select zhuanye  from Login where username='" + user + "'";
            SqlCommand cmd6 = new SqlCommand(str6, conn);
            textBox11.Text = cmd6.ExecuteScalar().ToString();
            string str7 = "select sno  from Login where username='" + user + "'";
            SqlCommand cmd7 = new SqlCommand(str7, conn);
            textBox12.Text = cmd7.ExecuteScalar().ToString();
            string str8 = "select phone  from Login where username='" + user + "'";
            SqlCommand cmd8 = new SqlCommand(str8, conn);
            textBox9.Text = cmd8.ExecuteScalar().ToString();
            string str9 = "select address  from Login where username='" + user + "'";
            SqlCommand cmd9 = new SqlCommand(str9, conn);
            textBox13.Text = cmd9.ExecuteScalar().ToString();
            string str10 = "select grade  from Login where username='" + user + "'";
            SqlCommand cmd10 = new SqlCommand(str10, conn);
            textBox16.Text = cmd10.ExecuteScalar().ToString();

        }
 public void showinfo()
        {
            SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
            SqlCommand SCD = new SqlCommand("select  Code,Cname,Ctype,Cunit,Cpricein,Cnum1 from product where Cname!=''", conn);
            SDA.SelectCommand = SCD;
            SDA.Fill(DT);
            dataGridView2.DataSource = DT;
        }
 public void showinfo1()
 {
     SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
     SqlCommand SCD = new SqlCommand("select  Code,Cname,Ctype,Cunit,Cpricein,Cpricrout,Cnum  from product where Cname!=''", conn);
     SDA.SelectCommand = SCD;
     SDA.Fill(DT);
     dataGridView1.DataSource = DT;
 }

        public void showinfo2()
    {
        SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
        SqlCommand SCD = new SqlCommand("select  Code,Cname,Ctype,Cunit,Cpricrout,Cnum1,Cnum from product", conn);
        SDA.SelectCommand = SCD;
        SDA.Fill(DT);
        dataGridView3.DataSource = DT;
    }

      
        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void dataGridView2_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
       
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void button6_Click(object sender, EventArgs e)
        {
            
      
               
        }

        private void tabControl1_Click(object sender, EventArgs e)
        {

            
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            DataTable dt = (DataTable)dataGridView1.DataSource;

            dt.Rows.Clear();
            dataGridView1.DataSource = dt;

            SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
            conn.Open();
            
            string sql = "select  Code,Cname,Ctype,Cunit,Cpricein,Cpricrout,Cnum from product where Cname!=''";
            
            if(textBox1.Text!="")
            {
                
                sql = sql + "and Cname like" + "'%" + textBox1.Text + "%'";
               
            }
            if (comboBox1.SelectedIndex!=-1)
            {
                sql = sql + "and Ctype =" + "'" + comboBox1.Text + "'";

            }
            
            if (textBox2.Text!="")
            {
                sql = sql + "and Cpricrout>=" + "'" + textBox2.Text + "'";

            }
            if(textBox3.Text!="")
            {

                sql = sql + "and Cpricrout<=" + "'" + textBox3.Text + "'";

            }
            SqlCommand str = new SqlCommand(sql, conn);
            
            SDA.SelectCommand = str;
            SDA.Fill(DT);
            dataGridView1.DataSource = DT;
        }

        private void dataGridView3_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void dataGridView1_CellContentClick_1(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void dataGridView2_CellContentClick_1(object sender, DataGridViewCellEventArgs e)
        {
            

        }

        private void button7_Click(object sender, EventArgs e)
        {


            int i = dataGridView1.CurrentRow.Index;
            string a = dataGridView1.Rows[i].Cells[0].Value.ToString();

                 SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
                 conn.Open();

                 string sql = "delete from product where Code='" + a + "'";

                 SqlCommand sqlcom1 = new SqlCommand(sql, conn);

                 int count1 = sqlcom1.ExecuteNonQuery();
                 if (count1 < 0)
                 {
                     MessageBox.Show("下架失败");
                 }
                 else
                 {
                     MessageBox.Show("下架成功");
                     DataTable dt = (DataTable)dataGridView1.DataSource;

                     dt.Rows.Clear();
                     dataGridView1.DataSource = dt;
                     showinfo1();
                 }
             
        }

     

        private void button8_Click(object sender, EventArgs e)
        {

        }

        private void button6_Click_2(object sender, EventArgs e)
        {
            SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
            conn.Open();
            
            string str1 = null;
            
            int j = 0;

            for (int i = 0; i < dataGridView2.Rows.Count; i++)
            {



                str1 = "update product set Cnum1='" + dataGridView2.Rows[i].Cells[5].Value + "',Cprice=Cpricein*'" + dataGridView2.Rows[i].Cells[5].Value + "' where Code='" + dataGridView2.Rows[i].Cells[0].Value + "'";

               
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
            if(j==1)
            {
                
                MessageBox.Show("已保存订单");
                DataTable dt = (DataTable)dataGridView2.DataSource;
                jinhuo form = new jinhuo(textBox14.Text);
                form.Show();
                this.Hide();
            }
        }

        private void groupBox1_Enter(object sender, EventArgs e)
        {

        }
       
        private void button6_Click_1(object sender, EventArgs e)
        {
            SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
            conn.Open();
            string str1 = null;
            int j = 0;

            for (int i = 0; i < dataGridView2.Rows.Count; i++)
            {



                str1 = "update product set Cpricrout='" + dataGridView1.Rows[i].Cells[5].Value + "'where Code='" + dataGridView1.Rows[i].Cells[0].Value + "'";

                SqlCommand sqlcom1 = new SqlCommand(str1, conn);

                int count1 = sqlcom1.ExecuteNonQuery();

                if (count1 < 0)
                {
                    MessageBox.Show("修改价格失败");
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
                MessageBox.Show("修改价格成功");
                DataTable dt = (DataTable)dataGridView1.DataSource;

                dt.Rows.Clear();
                dataGridView1.DataSource = dt;
                showinfo1();
            }
        }

        private void Main_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }

        private void dataGridView3_CellContentClick_1(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void button8_Click_1(object sender, EventArgs e)
        {
            DataTable dt = (DataTable)dataGridView3.DataSource;

            dt.Rows.Clear();
            dataGridView3.DataSource = dt;

            SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
            conn.Open();

            string sql = "select  Code,Cname,Ctype,Cunit,Cpricrout,Cnum1 from product where Cname!=''";

            if (textBox4.Text != "")
            {

                sql = sql + "and Cname like" + "'%" + textBox2.Text + "%'";

            }
            if (comboBox2.SelectedIndex != -1)
            {
                sql = sql + "and Ctype =" + "'" + comboBox2.Text + "'";

            }

        
         
            SqlCommand str = new SqlCommand(sql, conn);

            SDA.SelectCommand = str;
            SDA.Fill(DT);
            dataGridView3.DataSource = DT;

        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {

        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button9_Click(object sender, EventArgs e)
        {
            SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
            conn.Open();

            string str1 = null;

            int j = 0;

            for (int i = 0; i < dataGridView2.Rows.Count; i++)
            {
                


                str1 = "update product set Cnum1='" + dataGridView3.Rows[i].Cells[5].Value + "',Cprice=Cpricrout*'" + dataGridView3.Rows[i].Cells[5].Value + "' where Code='" + dataGridView2.Rows[i].Cells[0].Value + "'";


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

                MessageBox.Show("订单添加成功");
                DataTable dt = (DataTable)dataGridView2.DataSource;
                shouhuo form1 = new shouhuo(textBox14.Text);
                form1.Show();

                this.Hide();
            }
        }

        private void groupBox4_Enter(object sender, EventArgs e)
        {

        }

        private void label8_Click(object sender, EventArgs e)
        {

        }

        private void label16_Click(object sender, EventArgs e)
        {


        }

        private void button12_Click(object sender, EventArgs e)
        {

            SqlConnection conn = new SqlConnection("server='(local)';database='csharp';uid='sa';pwd='123456'");
            conn.Open();
            string str = "update Login set school='" + textBox8.Text + "',grade='" + textBox16.Text + "',ins='" + textBox10.Text + "',zhuanye='" + textBox11.Text + "',sno='" + textBox12.Text + "',phone='" + textBox9.Text + "',address='" + textBox13.Text + "'where username='" + textBox5.Text + "' ";

            
           
            SqlCommand sqlcom1 = new SqlCommand(str, conn);
            int count1 = sqlcom1.ExecuteNonQuery();
            if (count1 == 1)
            {
                MessageBox.Show("资料修改成功");
                Main form = new Main(user);
                form.Show();
                this.Hide();
            }
            else MessageBox.Show("保存失败");
        }

        private void textBox6_TextChanged(object sender, EventArgs e)
        {
            textBox6.PasswordChar = '*';
        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox7_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox8_TextChanged(object sender, EventArgs e)
        {

        }

        private void comboBox3_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void textBox10_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox11_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox12_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox9_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox14_TextChanged(object sender, EventArgs e)
        {
            
        }

        private void textBox15_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox13_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox16_TextChanged(object sender, EventArgs e)
        {

        }

        private void button11_Click(object sender, EventArgs e)
        {

            chongzhi form = new chongzhi(textBox5.Text);
            form.Show();
            
            //this.Refresh();
        }

        private void button10_Click(object sender, EventArgs e)
        {
            xiugai form = new xiugai(textBox5.Text,textBox6.Text);
            form.Show();
        }
    }
}

