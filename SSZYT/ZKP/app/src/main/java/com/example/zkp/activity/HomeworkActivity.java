package com.example.zkp.activity;

import java.util.ArrayList;

import com.example.zkp.R;
import com.example.zkp.beans.Cuns;
import com.example.zkp.luoji.MyAdapter;
import com.example.zkp.luoji.MyDataBase;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.ListView;

/*
 * 这个类主要包括五个点击事件，分别为
 * 1，ListView的长按点击事件，用来AlertDialog来判断是否删除数据。
 * 2，ListView的点击事件，跳转到第二个界面，用来修改数据
 * 3，新建作业按钮的点击事件，跳转到第二界面，用来新建作业
 * 4，menu里的退出事件，用来退出程序
 * 5，menu里的新建事件，用来新建作业
 */
public class HomeworkActivity extends Activity {

	Button bt;
	ListView lv;
	LayoutInflater inflater;
	ArrayList<Cuns> array;
	MyDataBase mdb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lv=(ListView) findViewById(R.id.listView1);
		bt=(Button) findViewById(R.id.button1);
		inflater=getLayoutInflater();

		mdb=new MyDataBase(this);
		array=mdb.getArray();
		MyAdapter adapter=new MyAdapter(inflater,array);
		lv.setAdapter(adapter);
		/*
		 * 点击listView里面的item,进入到第二个页面，用来修改作业
		 */
		lv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
									int position, long id) {
				// TODO Auto-generated method stub				
				Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
				intent.putExtra("ids",array.get(position).getIds() );
				startActivity(intent);
				HomeworkActivity.this.finish();
			}
		});
		/*
		 * 长点后来判断是否删除数据
		 */
		lv.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view,
										   final int position, long id) {
				// TODO Auto-generated method stub
				//AlertDialog,来判断是否删除作业
				new AlertDialog.Builder(HomeworkActivity.this)
						.setTitle("删除")
						.setMessage("确定删除作业？")
						.setNegativeButton("取消", new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog, int which) {
								// TODO Auto-generated method stub

							}
						})
						.setPositiveButton("确定", new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog, int which) {
								// TODO Auto-generated method stub
								mdb.toDelete(array.get(position).getIds());
								array=mdb.getArray();
								MyAdapter adapter=new MyAdapter(inflater,array);
								lv.setAdapter(adapter);
							}
						})
						.create().show();
				return true;
			}
		});
		/*
		 * 按钮点击事件，用来新建作业
		 */
		bt.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
				startActivity(intent);
				HomeworkActivity.this.finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
			case R.id.item1:
				Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
				startActivity(intent);
				this.finish();
				break;
			case R.id.item2:
				this.finish();
				break;
			default:
				break;
		}
		return true;
	}
}
