package com.example.discusthrow;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.icu.util.Calendar;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

import static com.example.discusthrow.Signup.EXTRA_TEXT;
import static com.example.discusthrow.Signup.EXTRA_TEXT2;
import static com.example.discusthrow.Signup.EXTRA_TEXT3;
import static com.example.discusthrow.Signup.EXTRA_TEXT4;
import static com.example.discusthrow.Signup.EXTRA_TEXT5;

public class Start extends AppCompatActivity {


    Button button6;
    TextView textView6, textView7, textView8, textView9, textView10;
    String st1, st2, st3, st4, st5;

    public static final String EXTRA_NUMBER = "com.example.application.example.EXTRA_NUMBER";
    public static final String EXTRA_NUMBER2 = "com.example.application.example.EXTRA_NUMBER2";
    public static final String EXTRA_NUMBER3 = "com.example.application.example.EXTRA_NUMBER3";
    public static final String EXTRA_NUMBER4 = "com.example.application.example.EXTRA_NUMBER4";
    public static final String EXTRA_NUMBER5 = "com.example.application.example.EXTRA_NUMBER5";

    public static final String EXTRA_NUMBER6 = "com.example.application.example.EXTRA_NUMBER6";
    public static final String EXTRA_NUMBER7 = "com.example.application.example.EXTRA_NUMBER7";
    public static final String EXTRA_NUMBER8 = "com.example.application.example.EXTRA_NUMBER8";
    public static final String EXTRA_NUMBER9 = "com.example.application.example.EXTRA_NUMBER9";
    public static final String EXTRA_NUMBER10 = "com.example.application.example.EXTRA_NUMBER10";

    public static final String EXTRA_NUMBER11 = "com.example.application.example.EXTRA_NUMBER11";
    public static final String EXTRA_NUMBER12 = "com.example.application.example.EXTRA_NUMBER12";
    public static final String EXTRA_NUMBER13 = "com.example.application.example.EXTRA_NUMBER13";
    public static final String EXTRA_NUMBER14 = "com.example.application.example.EXTRA_NUMBER14";
    public static final String EXTRA_NUMBER15 = "com.example.application.example.EXTRA_NUMBER15";
    private Object Foul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.screenshot);

        final Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                button8.setText("Foul");
                button8.setBackgroundColor(Color.parseColor("#FF2E2E"));
            }
        });

        final Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                button9.setText("Foul");
                button9.setBackgroundColor(Color.parseColor("#FF2E2E"));
            }
        });

        final Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                button10.setText("Foul");
                button10.setBackgroundColor(Color.parseColor("#FF2E2E"));
            }
        });
        final Button button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                button11.setText("Foul");
                button11.setBackgroundColor(Color.parseColor("#FF2E2E"));
            }
        });
        final Button button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                button12.setText("Foul");
                button12.setBackgroundColor(Color.parseColor("#FF2E2E"));
            }
        });
        final Button button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                button13.setText("Foul");
                button13.setBackgroundColor(Color.parseColor("#FF2E2E"));
            }
        });
        final Button button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                button14.setText("Foul");
                button14.setBackgroundColor(Color.parseColor("#FF2E2E"));
            }
        });
        final Button button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                button15.setText("Foul");
                button15.setBackgroundColor(Color.parseColor("#FF2E2E"));
            }
        });
        final Button button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                button16.setText("Foul");
                button16.setBackgroundColor(Color.parseColor("#FF2E2E"));
            }
        });
        final Button button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                button17.setText("Foul");
                button17.setBackgroundColor(Color.parseColor("#FF2E2E"));
            }
        });
        final Button button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                button18.setText("Foul");
                button18.setBackgroundColor(Color.parseColor("#FF2E2E"));
            }
        });
        final Button button19 = (Button) findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                button19.setText("Foul");
                button19.setBackgroundColor(Color.parseColor("#FF2E2E"));
            }
        });
        final Button button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                button20.setText("Foul");
                button20.setBackgroundColor(Color.parseColor("#FF2E2E"));
            }
        });
        final Button button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                button21.setText("Foul");
                button21.setBackgroundColor(Color.parseColor("#FF2E2E"));
            }
        });
        final Button button22 = (Button) findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                button22.setText("Foul");
                button22.setBackgroundColor(Color.parseColor("#FF2E2E"));
            }
        });


        Intent i = getIntent();
        String text = i.getStringExtra(EXTRA_TEXT);
        String text2 = i.getStringExtra(EXTRA_TEXT2);
        String text3 = i.getStringExtra(EXTRA_TEXT3);
        String text4 = i.getStringExtra(EXTRA_TEXT4);
        String text5 = i.getStringExtra(EXTRA_TEXT5);


        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText(text);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(text2);

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(text3);

        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText(text4);

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText(text5);

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

    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    public void b2Click(View view) {

        ActivityCompat.requestPermissions(this, new String[]{WRITE_EXTERNAL_STORAGE, READ_EXTERNAL_STORAGE}, PackageManager.PERMISSION_GRANTED);
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());



            View view1 = getWindow().getDecorView().getRootView();
            view1.setDrawingCacheEnabled(true);
            Bitmap bitmap = Bitmap.createBitmap(view1.getDrawingCache());
            view1.setDrawingCacheEnabled(false);

            String filePath = Environment.getExternalStorageDirectory() + "/Screenshots/" + Calendar.getInstance().getTime().toString() + ".jpeg";
            File fileScreenshot = new File(filePath);
            FileOutputStream fileOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(fileScreenshot);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            Intent intent = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.fromFile(fileScreenshot);
            intent.setDataAndType(uri, "image/jpeg");
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            this.startActivity(intent);
        }
    }













