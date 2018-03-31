package com.gym.jin.gymapplication;

import android.content.Context;
import android.support.design.widget.TextInputEditText;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static java.lang.Integer.*;

/**
 * Created by Jin on 3/28/2018.
 */

public class SquatParamAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public SquatParamAdapter(Context c) {
        mContext = c;
    }
    public int getCount() {
        return AppData.SQUAT_PARAMS.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView view = new TextView(mContext);;

        if (convertView == null) {
            switch(position%2) {
                case 0:
                    view = new TextView(mContext);
                    view.setLayoutParams(new GridView.LayoutParams(380, 80));
                    break;
                case 1:
                    view = new TextInputEditText(mContext);
                    view.setLayoutParams(new GridView.LayoutParams(80, 80));
                    break;
            }
            view.setTextSize(20);
            view.setText(AppData.SQUAT_PARAMS[position]);
            view.setPadding(8, 8, 8, 8);
        }
        else
        {
            view = (TextView) convertView;
        }
        return view;
    }
}
