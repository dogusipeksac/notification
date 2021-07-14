package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int notId=0;
    public void notifyButton(View view) {
        //create notify
        NotificationCompat.Builder nBuild=
                new NotificationCompat.Builder(this);
        nBuild.setContentTitle("Danger")
                .setContentText("it will run soon")
                .setSmallIcon(R.drawable.warningg);

        NotificationManager manager=
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(1,nBuild.build());
       // manager.cancel(1);
        notId++;
    }
}