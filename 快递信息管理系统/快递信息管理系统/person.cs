using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace 快递信息管理系统
{
    public partial class person : Form
    {
        public person()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("修改成功");
           
            this.Close();
        }

        private void button2_Click(object sender, EventArgs e)
        {
           
            this.Close();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            密码 form = new 密码();
            form.Show();
        }
    }
}
