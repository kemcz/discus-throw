package com.example.discusthrow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.discusthrow.Start.EXTRA_NUMBER;

public class Result extends AppCompatActivity {



    private static String EXTRA_TEXT;
    private static String EXTRA_NUMBER, EXTRA_NUMBER2;
    Button button6;
    TextView textView1,textView2,textView3,textView4,textView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getSupportActionBar().setTitle(" Game Result");

        Intent intent = getIntent();




        int number = intent.getIntExtra(Start.EXTRA_NUMBER, 0);
        int number2 = intent.getIntExtra(Start.EXTRA_NUMBER2,0);
        int number3 = intent.getIntExtra(Start.EXTRA_NUMBER3,0);
        int number4 = intent.getIntExtra(Start.EXTRA_NUMBER4,0);
        int number5 = intent.getIntExtra(Start.EXTRA_NUMBER5,0);
        int number6 = intent.getIntExtra(Start.EXTRA_NUMBER6,0);
        int number7 = intent.getIntExtra(Start.EXTRA_NUMBER7,0);
        int number8 = intent.getIntExtra(Start.EXTRA_NUMBER8,0);
        int number9 = intent.getIntExtra(Start.EXTRA_NUMBER9,0);
        int number10 = intent.getIntExtra(Start.EXTRA_NUMBER10,0);
        int number11 = intent.getIntExtra(Start.EXTRA_NUMBER11,0);
        int number12 = intent.getIntExtra(Start.EXTRA_NUMBER12,0);
        int number13 = intent.getIntExtra(Start.EXTRA_NUMBER13,0);
        int number14 = intent.getIntExtra(Start.EXTRA_NUMBER14,0);
        int number15 = intent.getIntExtra(Start.EXTRA_NUMBER15,0);

        TextView textView11 = (TextView) findViewById(R.id.textView11);
        textView11.setText("" + number);

        TextView textView12 = (TextView) findViewById(R.id.textView12);
        textView12.setText("" + number2);

        TextView textView13 = (TextView) findViewById(R.id.textView13);
        textView13.setText("" + number3);

        TextView textView14 = (TextView) findViewById(R.id.textView14);
        textView14.setText("" + number4);

        TextView textView15 = (TextView) findViewById(R.id.textView15);
        textView15.setText("" + number5);

        TextView textView16 = (TextView) findViewById(R.id.textView16);
        textView16.setText("" + number6);

        TextView textView17 = (TextView) findViewById(R.id.textView17);
        textView17.setText("" + number7);

        TextView textView18 = (TextView) findViewById(R.id.textView18);
        textView18.setText("" + number8);

        TextView textView19 = (TextView) findViewById(R.id.textView19);
        textView19.setText("" + number9);

        TextView textView20 = (TextView) findViewById(R.id.textView20);
       textView20.setText("" + number10);

        TextView textView21 = (TextView) findViewById(R.id.textView21);
       textView21.setText("" + number11);

        TextView textView22 = (TextView) findViewById(R.id.textView22);
        textView22.setText("" + number12);

        TextView textView23 = (TextView) findViewById(R.id.textView23);
       textView23.setText("" + number13);

        TextView textView24 = (TextView) findViewById(R.id.textView24);
       textView24.setText("" + number14);

        TextView textView25 = (TextView) findViewById(R.id.textView25);
        textView25.setText("" + number15);


    }
    }

