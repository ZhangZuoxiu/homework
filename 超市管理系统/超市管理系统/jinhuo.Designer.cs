namespace 超市管理系统
{
    partial class jinhuo
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle1 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle2 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle3 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle4 = new System.Windows.Forms.DataGridViewCellStyle();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.codeDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.cnameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.cunitDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.cpriceinDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Cnum1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Cprice = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.productBindingSource1 = new System.Windows.Forms.BindingSource(this.components);
            this.csharpDataSet5 = new 超市管理系统.csharpDataSet5();
            this.csharpDataSet1 = new 超市管理系统.csharpDataSet1();
            this.csharpDataSet1BindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.csharpDataSet2 = new 超市管理系统.csharpDataSet2();
            this.csharpDataSet2BindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.jspDataSet3 = new 超市管理系统.jspDataSet3();
            this.productBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.productTableAdapter = new 超市管理系统.jspDataSet3TableAdapters.productTableAdapter();
            this.productTableAdapter1 = new 超市管理系统.csharpDataSet5TableAdapters.productTableAdapter();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.productBindingSource1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.csharpDataSet5)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.csharpDataSet1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.csharpDataSet1BindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.csharpDataSet2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.csharpDataSet2BindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.jspDataSet3)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.productBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridView1
            // 
            this.dataGridView1.AutoGenerateColumns = false;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.codeDataGridViewTextBoxColumn,
            this.cnameDataGridViewTextBoxColumn,
            this.cunitDataGridViewTextBoxColumn,
            this.cpriceinDataGridViewTextBoxColumn,
            this.Cnum1,
            this.Cprice});
            this.dataGridView1.DataSource = this.productBindingSource1;
            this.dataGridView1.GridColor = System.Drawing.Color.White;
            this.dataGridView1.Location = new System.Drawing.Point(-15, 3);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowTemplate.Height = 23;
            this.dataGridView1.Size = new System.Drawing.Size(650, 240);
            this.dataGridView1.TabIndex = 0;
            this.dataGridView1.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellContentClick);
            // 
            // codeDataGridViewTextBoxColumn
            // 
            this.codeDataGridViewTextBoxColumn.DataPropertyName = "Code";
            dataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            this.codeDataGridViewTextBoxColumn.DefaultCellStyle = dataGridViewCellStyle1;
            this.codeDataGridViewTextBoxColumn.HeaderText = "商品编号";
            this.codeDataGridViewTextBoxColumn.Name = "codeDataGridViewTextBoxColumn";
            this.codeDataGridViewTextBoxColumn.ReadOnly = true;
            this.codeDataGridViewTextBoxColumn.Width = 80;
            // 
            // cnameDataGridViewTextBoxColumn
            // 
            this.cnameDataGridViewTextBoxColumn.DataPropertyName = "Cname";
            dataGridViewCellStyle2.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            this.cnameDataGridViewTextBoxColumn.DefaultCellStyle = dataGridViewCellStyle2;
            this.cnameDataGridViewTextBoxColumn.HeaderText = "商品名称";
            this.cnameDataGridViewTextBoxColumn.Name = "cnameDataGridViewTextBoxColumn";
            this.cnameDataGridViewTextBoxColumn.ReadOnly = true;
            this.cnameDataGridViewTextBoxColumn.Width = 220;
            // 
            // cunitDataGridViewTextBoxColumn
            // 
            this.cunitDataGridViewTextBoxColumn.DataPropertyName = "Cunit";
            this.cunitDataGridViewTextBoxColumn.HeaderText = "单位";
            this.cunitDataGridViewTextBoxColumn.Name = "cunitDataGridViewTextBoxColumn";
            this.cunitDataGridViewTextBoxColumn.ReadOnly = true;
            this.cunitDataGridViewTextBoxColumn.Width = 70;
            // 
            // cpriceinDataGridViewTextBoxColumn
            // 
            this.cpriceinDataGridViewTextBoxColumn.DataPropertyName = "Cpricein";
            this.cpriceinDataGridViewTextBoxColumn.HeaderText = "采购价";
            this.cpriceinDataGridViewTextBoxColumn.Name = "cpriceinDataGridViewTextBoxColumn";
            this.cpriceinDataGridViewTextBoxColumn.ReadOnly = true;
            this.cpriceinDataGridViewTextBoxColumn.Width = 70;
            // 
            // Cnum1
            // 
            this.Cnum1.DataPropertyName = "Cnum1";
            dataGridViewCellStyle3.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            this.Cnum1.DefaultCellStyle = dataGridViewCellStyle3;
            this.Cnum1.HeaderText = "进货量";
            this.Cnum1.Name = "Cnum1";
            this.Cnum1.ReadOnly = true;
            this.Cnum1.Width = 70;
            // 
            // Cprice
            // 
            this.Cprice.DataPropertyName = "Cprice";
            dataGridViewCellStyle4.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            this.Cprice.DefaultCellStyle = dataGridViewCellStyle4;
            this.Cprice.HeaderText = "价格";
            this.Cprice.Name = "Cprice";
            this.Cprice.ReadOnly = true;
            this.Cprice.Width = 80;
            // 
            // productBindingSource1
            // 
            this.productBindingSource1.DataMember = "product";
            this.productBindingSource1.DataSource = this.csharpDataSet5;
            // 
            // csharpDataSet5
            // 
            this.csharpDataSet5.DataSetName = "csharpDataSet5";
            this.csharpDataSet5.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // csharpDataSet1
            // 
            this.csharpDataSet1.DataSetName = "csharpDataSet1";
            this.csharpDataSet1.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // csharpDataSet1BindingSource
            // 
            this.csharpDataSet1BindingSource.DataSource = this.csharpDataSet1;
            this.csharpDataSet1BindingSource.Position = 0;
            // 
            // csharpDataSet2
            // 
            this.csharpDataSet2.DataSetName = "csharpDataSet2";
            this.csharpDataSet2.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // csharpDataSet2BindingSource
            // 
            this.csharpDataSet2BindingSource.DataSource = this.csharpDataSet2;
            this.csharpDataSet2BindingSource.Position = 0;
            // 
            // jspDataSet3
            // 
            this.jspDataSet3.DataSetName = "jspDataSet3";
            this.jspDataSet3.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // productBindingSource
            // 
            this.productBindingSource.DataMember = "product";
            this.productBindingSource.DataSource = this.jspDataSet3;
            // 
            // productTableAdapter
            // 
            this.productTableAdapter.ClearBeforeFill = true;
            // 
            // productTableAdapter1
            // 
            this.productTableAdapter1.ClearBeforeFill = true;
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(362, 267);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 1;
            this.button1.Text = "确认进货";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(198, 267);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(75, 23);
            this.button2.TabIndex = 2;
            this.button2.Text = "返回";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // textBox1
            // 
            this.textBox1.Font = new System.Drawing.Font("宋体", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(134)));
            this.textBox1.Location = new System.Drawing.Point(535, 245);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(100, 26);
            this.textBox1.TabIndex = 3;
            this.textBox1.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(493, 252);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(29, 12);
            this.label1.TabIndex = 4;
            this.label1.Text = "总价";
            // 
            // jinhuo
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(637, 302);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.dataGridView1);
            this.Name = "jinhuo";
            this.Text = "jinhuo";
            this.Load += new System.EventHandler(this.jinhuo_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.productBindingSource1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.csharpDataSet5)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.csharpDataSet1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.csharpDataSet1BindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.csharpDataSet2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.csharpDataSet2BindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.jspDataSet3)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.productBindingSource)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.BindingSource csharpDataSet2BindingSource;
        private csharpDataSet2 csharpDataSet2;
        private csharpDataSet1 csharpDataSet1;
        private System.Windows.Forms.BindingSource csharpDataSet1BindingSource;
        private jspDataSet3 jspDataSet3;
        private System.Windows.Forms.BindingSource productBindingSource;
        private jspDataSet3TableAdapters.productTableAdapter productTableAdapter;
        private csharpDataSet5 csharpDataSet5;
        private System.Windows.Forms.BindingSource productBindingSource1;
        private csharpDataSet5TableAdapters.productTableAdapter productTableAdapter1;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.DataGridViewTextBoxColumn codeDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn cnameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn cunitDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn cpriceinDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn Cnum1;
        private System.Windows.Forms.DataGridViewTextBoxColumn Cprice;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Label label1;
    }
}