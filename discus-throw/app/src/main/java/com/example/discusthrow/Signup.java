package com.example.discusthrow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.AdapterView;
import android.widget.Toast;

public class Signup extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    Button button3;
    EditText editText1, editText2, editText3, editText4, editText5;
    String st;

    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    public static final String EXTRA_TEXT2 = "com.example.application.example.EXTRA_TEXT2";
    public static final String EXTRA_TEXT3 = "com.example.application.example.EXTRA_TEXT3";
    public static final String EXTRA_TEXT4 = "com.example.application.example.EXTRA_TEXT4";
    public static final String EXTRA_TEXT5 = "com.example.application.example.EXTRA_TEXT5";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().setTitle("Enter Player");

        editText1 = (EditText) findViewById(R.id.editText1) ;
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3) ;
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);


        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int signi = 0;

                if (editText1.length() == 0) {
                    editText1.setError("Enter Player Name");
                } else if (editText2.length() == 0) {
                    editText2.setError("Enter Player Name");
                }
                if (editText2.length() == 0) {
                    editText2.setError("Enter Player Name");
                } else if (editText3.length() == 0) {
                    editText3.setError("Enter Player Name");
                }
                if (editText3.length() == 0) {
                    editText3.setError("Enter Player Name");
                } else if (editText4.length() == 0) {
                    editText4.setError("Enter Player Name");
                }
                if (editText4.length() == 0) {
                    editText4.setError("Enter Player Name");
                } else if (editText5.length() == 0) {
                    editText5.setError("Enter Player Name");
                }
                if (editText5.length() == 0) {
                    editText5.setError("Enter Player Name");
                } else if (editText1.length() == 0) {
                    editText1.setError("Enter Player Name");
                }
                else { Register();

                    Toast.makeText(getApplicationContext(),signi,Toast.LENGTH_LONG).show();

                }

            }
        });

    }

    public void Register(){
        editText1 = (EditText) findViewById(R.id.editText1);
        String text = editText1.getText().toString();

        editText2 = (EditText) findViewById(R.id.editText2);
        String text2 = editText2.getText().toString();

        editText3 = (EditText) findViewById(R.id.editText3);
        String text3 = editText3.getText().toString();

        editText4 = (EditText) findViewById(R.id.editText4);
        String text4 = editText4.getText().toString();

        editText5 = (EditText) findViewById(R.id.editText5);
        String text5 = editText5.getText().toString();


        Intent intent = new Intent(this, Register.class);
        intent.putExtra(EXTRA_TEXT,text);
        intent.putExtra(EXTRA_TEXT2,text2);
        intent.putExtra(EXTRA_TEXT3,text3);
        intent.putExtra(EXTRA_TEXT4,text4);
        intent.putExtra(EXTRA_TEXT5,text5);

        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
