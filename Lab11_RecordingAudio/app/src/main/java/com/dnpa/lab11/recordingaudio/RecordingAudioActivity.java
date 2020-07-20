package com.dnpa.lab11.recordingaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioRecord;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RecordingAudioActivity extends AppCompatActivity {

    private AudioRecord recorder = null;
    private Thread recordingThread = null;
    private boolean isRecording = false;
    private Button btnStart, btnStop, btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart= findViewById(R.id.btnStart);
        btnStop= findViewById(R.id.btnStop);
        btnPlay= findViewById(R.id.btnPlay);

        btnStop.setEnabled(false);
        btnPlay.setEnabled(false);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Toast.makeText(getApplicationContext(), "Recording Audio", Toast.LENGTH_LONG).show();
                    btnStop.setEnabled(true);
                    btnPlay.setEnabled(false);
                } catch (Exception e) {
                    // make something
                }
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Toast.makeText(getApplicationContext(), "Stopping Recording", Toast.LENGTH_LONG).show();
                    btnStop.setEnabled(false);
                    btnPlay.setEnabled(true);
                } catch (Exception e) {
                    // make something
                }
            }
        });

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Toast.makeText(getApplicationContext(), "Playing Audio", Toast.LENGTH_LONG).show();

                } catch (Exception e) {
                    // make something
                }
            }
        });
    }

    // onClick of backbutton finishes the activity.
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }

}