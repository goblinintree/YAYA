package com.friends.tab2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import demo.yaya.R;

public class Friends extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textview = new TextView(this);
        textview.setText("This is the Artists tab");
        setContentView(R.layout.tab2_friends);

        // Intent intent = new Intent().setClass(this, FriendItem.class);

    }

}
