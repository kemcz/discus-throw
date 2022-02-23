package com.example.discusthrow;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button button4,button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Signup();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Gamerules();
            }
        });
    }

    public void Signup(){
        Intent intent = new Intent(this,Signup.class);
        startActivity(intent);

    }

    public void Gamerules(){
        Intent intent = new Intent(this,Gamerules.class);
        startActivity(intent);
    }


    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Menu.this);

        builder.setTitle("Exit?")
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Menu.super.onBackPressed();
                    }
                })
                .setNegativeButton("Cancel", null);
        AlertDialog alert = builder.create();
        alert.show();

        {

        }
    }
}