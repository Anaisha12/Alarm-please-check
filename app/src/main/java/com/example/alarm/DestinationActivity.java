package com.example.alarm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class DestinationActivity extends AppCompatActivity {

    Random random = new Random();
    TextView tq;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tq=findViewById(R.id.textview);
        displayQuote();
    }

    public void displayQuote(){
        //random number between 1 and 10(both included)
        int randnum= random.nextInt((10+1) - 1)+1;
        String rq="";
        switch(randnum){
            case 1:
                rq=getString(R.string.Quote1);
                break;
            case 2:
                rq=getString(R.string.Quote2);
                break;
            case 3:
                rq=getString(R.string.Quote3);
                break;
            case 4:
                rq=getString(R.string.Quote4);
                break;
            case 5:
                rq=getString(R.string.Quote5);
                break;
            case 6:
                rq=getString(R.string.Quote6);
                break;
            case 7:
                rq=getString(R.string.Quote7);
                break;
            case 8:
                rq=getString(R.string.Quote8);
                break;
            case 9:
                rq=getString(R.string.Quote9);
                break;
            case 10:
                rq=getString(R.string.Quote10);
                break;
        }
        tq.setText(rq);
    }
}