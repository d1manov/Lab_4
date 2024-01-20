package com.example.lab_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.os.Bundle;

public class day extends AppCompatActivity {
    private static String CHANNEL_ID="ch2";
    private NotificationManagerCompat notificationManagerCompat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID,
                    "channel 2",
                    NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
        notificationManagerCompat=NotificationManagerCompat.from(this);
    }
    @SuppressLint("MissingPermission")
    public void btn_push(View view) {
        NotificationCompat.Builder builder=
                new NotificationCompat.Builder(day.this, CHANNEL_ID)
                        .setSmallIcon(R.drawable.ic_launcher_foreground)
                        .setContentTitle("ВНИМАНИЕ")
                        .setContentText("Конец рабочего дня!")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);
        notificationManagerCompat.notify(2,builder.build());
        Intent intent = new Intent(day.this, evening.class);
        startActivity(intent);
    }
}