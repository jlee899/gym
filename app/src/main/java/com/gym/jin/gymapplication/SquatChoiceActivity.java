package com.gym.jin.gymapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class SquatChoiceActivity extends AppCompatActivity {
    GridView gridview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squat_choice);
        gridview = (GridView) findViewById(R.id.squatParamGridview);
        gridview.setAdapter(new SquatParamAdapter(this  ));



    }

    public void startSquat(View view) {
        SquatParams params = new SquatParams();
        params.setRepeat(getIntValue(gridview, 1));
        params.setCount(getIntValue(gridview, 3));
        params.setWeight(getIntValue(gridview, 5));
        params.setIntervalTime(getIntValue(gridview, 7));
        params.setSpeed(getIntValue(gridview, 9));

        Intent intent = new Intent(this, SquatWorkingActivity.class);
        intent.putExtra("SquatParams", params);
        startActivity(intent);
    }

    private int getIntValue(View view, int position) {
        TextView v = (TextView)gridview.getChildAt(position);
        String s = v.getText().toString();
        return (new Integer(s)).intValue();
    }
}
