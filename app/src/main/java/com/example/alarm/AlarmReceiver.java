package com.example.alarm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import java.util.Random;

public class AlarmReceiver extends BroadcastReceiver {
    String quote = quotes();
    static String quotes(){
        Random random = new Random();
        int a = random.nextInt(10) +1;
        switch (a){
            case 1:
                return "Be the change you wish to see in the world.\\n - Mahatma Gandhi";
            case 2:
                return "Time and Tide wait for none.";
            case 3:
                return "Nothing is impossible. The word itself says I’m possible!\\n— Audrey Hepburn";
            case 4:
                return "There is nothing impossible to they who will try.\\n-Alexander the Great";
            case 5:
                return "Success is not final, failure is not fatal: it is the courage to continue that counts.\\n-Winston Churchill";
            case 6:
                return "You define your own life. Don’t let other people write your script.\\n-Oprah Winfrey";
            case 7:
                return "You are never too old to set another goal or to dream a new dream.\\n-Malala Yousafzai";
            case 8:
                return "Do not allow people to dim your shine because they are blinded. Tell them to put some sunglasses on.\\n-Lady Gaga";
            case 9:
                return "You don’t always need a plan. Sometimes you just need to breathe, trust, let go and see what happens.\\n-Mandy Hale";
            case 10:
                return "Belief creates the actual fact.\\n-William James";
            default:
                return " ";
        }
    }
    @Override
    public void onReceive(Context context, Intent intent) {


        Intent i=new Intent(context,DestinationActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent=PendingIntent.getActivity(context,0,i,0);

        NotificationCompat.Builder builder=new NotificationCompat.Builder(context,"anaisha")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Anaisha Alarm Manager")
                .setContentText(quote)
                .setAutoCancel(true)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(pendingIntent);

        NotificationManagerCompat notificationManagerCompat=NotificationManagerCompat.from(context);
        notificationManagerCompat.notify(123,builder.build());

    }
}