package com.yaya;

import android.app.AlertDialog;
import android.app.TabActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

import com.chatting.tab1.Chatting;
import com.friends.tab2.FriendItem;
import com.setting.tab3.Setting;

import demo.yaya.R;

public class MainFrame extends TabActivity
// implements android.widget.TabHost.TabContentFactory
{

    // 功能菜单
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabHost = getTabHost(); // The activity TabHost
        TabHost.TabSpec spec; // Resusable TabSpec for each tab
        Intent intent; // Reusable Intent for each tab

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, Chatting.class);

        // Initialize a TabSpec for each tab and add it to the TabHost
        spec =
                tabHost.newTabSpec("artists").setIndicator("会话", res.getDrawable(R.drawable.chatting_tab1)).setContent(
                        intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs
        intent = new Intent().setClass(this, FriendItem.class);
        spec =
                tabHost.newTabSpec("albums").setIndicator("好友", res.getDrawable(R.drawable.friends_tab2)).setContent(
                        intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, Setting.class);
        spec =
                tabHost.newTabSpec("songs").setIndicator("设置", res.getDrawable(R.drawable.setting_tab3)).setContent(
                        intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(2);
    }

    // 退出menu
    protected static final int MENU_Quit = Menu.FIRST;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
        menu.add(0, MENU_Quit, 0, "结束").setIcon(R.drawable.close_btn);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_Quit :
                openOptionsDialog();
                // finish();
                break;
            default :
                break;
        }
        return super.onOptionsItemSelected(item);

    }

    private void openOptionsDialog() {
        new AlertDialog.Builder(MainFrame.this).setTitle("退出").setMessage("确定要退出吗？").setIcon(R.drawable.surequit)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                }).show();

    }

}
