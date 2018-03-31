package com.gym.jin.gymapplication;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<MenuItem> menuItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createMenu();

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this, menuItems));
    }

    public ArrayList<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    private void createMenu(){
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("squat", new Integer( R.drawable.squatup),new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SquatChoiceActivity.class);
                startActivity(intent);
            }
        }));
        menuItems.add(new MenuItem("pushup", new Integer( R.drawable.pushup),new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SquatChoiceActivity.class);
                startActivity(intent);
            }
        }));
    }
}
