package com.example.chronometer2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {
    Chronometer FirstChronometer;
    Button start, stop, restart, setFormat, clearFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstChronometer = findViewById(R.id.chronometer);
        start =  findViewById(R.id.str_button);
        stop = findViewById(R.id.stp_button);
        restart = findViewById(R.id.rs_button);
        setFormat = findViewById(R.id.sf_button);
        clearFormat = findViewById(R.id.clr_button);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstChronometer.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstChronometer.stop();
            }
        });
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstChronometer.setBase(SystemClock.elapsedRealtime());
            }
        });
        setFormat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstChronometer.setFormat("Time (%s)");
            }
        });
        clearFormat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstChronometer.setFormat(null);
            }
        });
    }

}
