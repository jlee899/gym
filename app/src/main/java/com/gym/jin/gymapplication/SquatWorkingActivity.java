package com.gym.jin.gymapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class SquatWorkingActivity extends AppCompatActivity {
    private SquatParams params;

    ImageView squatUpView;
    ViewSwitcher viewSwitcher;
    Button buttonPause, buttonContinue ;
    private ImageSwitcher sw;

    TextView workingCountText;
    private Handler imageSwitcherHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squat_working);
        params =(SquatParams) getIntent().getExtras().getParcelable("SquatParams");
        Toast.makeText(getApplicationContext(),
               "Repeat times" + params.getRepeat(), Toast.LENGTH_SHORT).show();
        if (params.getRepeat()>0) {
            startWorking();
        }
        else {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    }

        public void startWorking() {
            buttonPause = (Button) findViewById(R.id.buttonPause);
            buttonContinue = (Button) findViewById(R.id.buttonPause);
            viewSwitcher = (ViewSwitcher) findViewById(R.id.viewSwitcher);
            squatUpView = (ImageView) findViewById(R.id.squatup);
            imageSwitcherHandler = new Handler(Looper.getMainLooper());
            imageSwitcherHandler.post(new Runnable() {
                int workingCounter = 0;

                @Override
                public void run() {

                    if (workingCounter < params.getCount()) {
                        viewSwitcher.showNext();
                        workingCountText = (TextView) findViewById(R.id.workingCount);
                        workingCountText.setText("" + (workingCounter+1));
                        if (viewSwitcher.getCurrentView() == squatUpView) {
                            workingCounter++;
                        } else {
                            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.glassping);
                            // mediaPlayer.start();
                        }
                        imageSwitcherHandler.postDelayed(this,params.getSpeed()*1000);
                    }
                    else {
                        Intent intent = new Intent(getApplicationContext(), RestActivity.class);
                        params.setRepeat(params.getRepeat()-1);
                        intent.putExtra("SquatParams", params);
                        startActivity(intent);
                    }
                }
            });

        }
}
