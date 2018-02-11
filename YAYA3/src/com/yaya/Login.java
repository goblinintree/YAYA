package com.yaya;

import demo.yaya.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Login extends Activity{
	//退出menu
	protected static final int MENU_Quit = Menu.FIRST;
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		
		
		super.onCreateOptionsMenu(menu);
		menu.add(0,MENU_Quit,0,"结束")
		.setIcon(R.drawable.close_btn);
		return super.onCreateOptionsMenu(menu);
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case MENU_Quit:
			openOptionsDialog();
//			finish();
			break;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
		
	}
	private void openOptionsDialog() {
		new AlertDialog.Builder(Login.this)
		.setTitle("退出")
		.setMessage("确定要退出吗？")
		.setIcon(R.drawable.surequit)
		.setPositiveButton("确定", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface arg0, int arg1) {
				
			}
		})
		.show();
		
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.login);
	setTitle("登录");
	
	Button login_btn = (Button) findViewById(R.id.button_login);
	login_btn.setOnClickListener(new Button.OnClickListener(){

	@Override
	public void onClick(View arg0) {
	Intent intent = new Intent();
	intent.setClass(Login.this,MainFrame.class);
	startActivity(intent);
	}
	});

	Button r_btn = (Button) findViewById(R.id.button_register);
	r_btn.setOnClickListener(new Button.OnClickListener(){

	@Override
	public void onClick(View v) {
	Intent regintent = new Intent();
	regintent.setClass(Login.this,Register.class);
	startActivity(regintent);
	}
	});

	}
}
