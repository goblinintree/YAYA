package com.yaya;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import demo.yaya.R;

public class YaYa extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.welcome);
        new Handler().postDelayed(new Runnable() {// �½�һ��handlerʵ����ʾ��ת

                    @Override
                    public void run() {
                        Intent i = new Intent();
                        i.setClass(YaYa.this, Login.class);
                        startActivity(i);
                    }
                }, 5000);
    }
}
