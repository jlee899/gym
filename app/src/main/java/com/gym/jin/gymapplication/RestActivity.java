package com.gym.jin.gymapplication;

import android.app.ActionBar;
import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;

public class RestActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private int progressBarStatus = 0;
    private Handler progressBarbHandler = new Handler();
    MediaPlayer mediaPlayer;

    private SquatParams params;
    private int musicLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);

        progressBar.setProgress(0);
        progressBar.setMax(100);
        progressBarStatus = 0;

        params =(SquatParams) getIntent().getExtras().getParcelable("SquatParams");

        new Thread(new Runnable() {
            public void run() {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.music);
                mediaPlayer.setScreenOnWhilePlaying(true);
                mediaPlayer.start();
                while (progressBarStatus < 100) {
                    progressBarStatus++;

                    try {
                        Thread.sleep(params.getIntervalTime()*1000/100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    progressBarbHandler.post(new Runnable() {
                        public void run() {
                            progressBar.setProgress(progressBarStatus);
                        }
                    });
                }

                if (progressBarStatus >= 100) {

                    mediaPlayer.stop();
                    Intent intent = new Intent(getApplicationContext(), SquatWorkingActivity.class);
                    intent.putExtra("SquatParams", params);
                    startActivity(intent);
                }
            }
        }).start();

    }


    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        mediaPlayer.stop();
    }

}
