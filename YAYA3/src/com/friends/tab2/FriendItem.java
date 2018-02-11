package com.friends.tab2;

import android.app.ListActivity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import demo.yaya.R;

public class FriendItem extends ListActivity {
    private static class ImageAdapter extends BaseAdapter {
        private LayoutInflater mInflater;
        private Bitmap mIcon1;
        private Bitmap mIcon2;

        private static final String[] DATA = {"Jacob", "Emdy", "Michal", "Isabella"};

        public ImageAdapter(Context context) {
            mInflater = LayoutInflater.from(context);
            mIcon1 = BitmapFactory.decodeResource(context.getResources(), android.R.drawable.sym_action_call);
            mIcon2 = BitmapFactory.decodeResource(context.getResources(), android.R.drawable.sym_call_incoming);

        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return DATA.length;
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            ViewHolder holder;
            if (convertView == null) {
                // 重复的布局，放入迭代器
                convertView = mInflater.inflate(R.layout.frienditem, null);

                holder = new ViewHolder();
                holder.text = (TextView) convertView.findViewById(R.id.text);
                holder.icon = (ImageView) convertView.findViewById(R.id.icon);
                convertView.setTag(holder);
            }
            else {
                holder = (ViewHolder) convertView.getTag();
            }
            holder.text.setText(DATA[position]);
            holder.icon.setImageBitmap((position & 1) == 1 ? mIcon1 : mIcon2);
            return convertView;
        }

        static class ViewHolder {
            TextView text;
            ImageView icon;
        }

    }

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ImageAdapter(this));
        // setContentView(R.layout.main);//
    }
}
