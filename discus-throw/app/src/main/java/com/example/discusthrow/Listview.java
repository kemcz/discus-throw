package com.example.discusthrow;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.discusthrow.Signup.EXTRA_TEXT;
import static com.example.discusthrow.Signup.EXTRA_TEXT2;
import static com.example.discusthrow.Signup.EXTRA_TEXT3;
import static com.example.discusthrow.Signup.EXTRA_TEXT4;
import static com.example.discusthrow.Signup.EXTRA_TEXT5;


public class Listview extends AppCompatActivity {

    Button button5;
    TextView textView1,textView2,textView3,textView4,textView5;
    TextView textView6,textView7,textView8,textView9,textView10;
    String st1,st2,st3,st4,st5;
    String mytoast = "Registration Complete!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        getSupportActionBar().setTitle("List of Player");


        textView6 = (TextView) findViewById(R.id.textView6);
        st1 = getIntent().getExtras().getString("Value1");
        textView6.setText(st1);

        textView7 = (TextView) findViewById(R.id.textView7);
        st2 = getIntent().getExtras().getString("Value2");
        textView7.setText(st2);

        textView8 = (TextView) findViewById(R.id.textView8);
        st3 = getIntent().getExtras().getString("Value3");
        textView8.setText(st3);

        textView9 = (TextView) findViewById(R.id.textView9);
        st4 = getIntent().getExtras().getString("Value4");
        textView9.setText(st4);

        textView10 = (TextView) findViewById(R.id.textView10);
        st5 = getIntent().getExtras().getString("Value5");
        textView10.setText(st5);

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(Listview.this);
                    builder.setTitle("Registration Confirmation");
                    builder.setMessage("Do you want to Continue?");
                    builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            openStart();
                                Toast.makeText(getApplicationContext(), mytoast, Toast.LENGTH_LONG).show();
                        }

                    });
                    builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int a) {

                        }
                    });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });


        Intent i = getIntent();
        String text = i.getStringExtra(Signup.EXTRA_TEXT);
        String text2 = i.getStringExtra(Signup.EXTRA_TEXT2);
        String text3 = i.getStringExtra(Signup.EXTRA_TEXT3);
        String text4 = i.getStringExtra(Signup.EXTRA_TEXT4);
        String text5 = i.getStringExtra(Signup.EXTRA_TEXT5);

        textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText(text);

        textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(text2);

        textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(text3);

        textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText(text4);

        textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText(text5);

    }
        public void openStart()
    {
        textView1 = (TextView) findViewById(R.id.textView1);
        String t1 = textView1.getText().toString();

        textView2 = (TextView) findViewById(R.id.textView2);
        String t2 = textView2.getText().toString();

        textView1 = (TextView) findViewById(R.id.textView3);
        String t3 = textView3.getText().toString();

        textView4 = (TextView) findViewById(R.id.textView4);
        String t4 = textView4.getText().toString();

        textView5 = (TextView) findViewById(R.id.textView5);
        String t5 = textView5.getText().toString();


        Intent i = new Intent(this,Start.class);

        i.putExtra(EXTRA_TEXT,t1);
        i.putExtra(EXTRA_TEXT2,t2);
        i.putExtra(EXTRA_TEXT3,t3);
        i.putExtra(EXTRA_TEXT4,t4);
        i.putExtra(EXTRA_TEXT5,t5);

        i.putExtra("Value1",st1);
        i.putExtra("Value2",st2);
        i.putExtra("Value3",st3);
        i.putExtra("Value4",st4);
        i.putExtra("Value5",st5);

        startActivity(i);

        }

    }

