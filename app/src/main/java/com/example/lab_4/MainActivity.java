package com.example.lab_4;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    private static final int NOTIFICATION_ID=101;
    private static final String CHANNEL_ID="123";
    private  NotificationManager notificationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("MissingPermission")
    public void morning_click(View view) {
        Intent intent = new Intent(MainActivity.this, morning.class);
        startActivity(intent);
    }
    public void day_click(View view) {
        Intent intent = new Intent(MainActivity.this, day.class);
        startActivity(intent);
    }
    public void evening_click(View view) {
        Intent intent = new Intent(MainActivity.this, evening.class);
        startActivity(intent);
    }
    public void night_click(View view) {
        Intent intent = new Intent(MainActivity.this, night.class);
        startActivity(intent);
    }
}