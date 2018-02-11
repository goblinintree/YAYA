package com.chatting.tab1;

import demo.yaya.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Chatting extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView textview = new TextView(this);
		textview.setText("This is the Artists tab");
		setContentView(R.layout.tab1_chatting);
	}
}
