package  com.example.discusthrow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import static com.example.discusthrow.Signup.EXTRA_TEXT;
import static com.example.discusthrow.Signup.EXTRA_TEXT2;
import static com.example.discusthrow.Signup.EXTRA_TEXT3;
import static com.example.discusthrow.Signup.EXTRA_TEXT4;
import static com.example.discusthrow.Signup.EXTRA_TEXT5;


public class Register extends AppCompatActivity {



    Button button4;
    private TextView textView1,textView2,textView3,textView4,textView5;
    Spinner spinner1, spinner2,spinner3,spinner4,spinner5;
    String t1,t2,t3,t4,t5;
    String name1[] = {"Select Course","ICT", "ABM", "BS Accountancy", "BS Entrepreneurship", "BS Information System"};
    String name2[] = {"Select Course","ICT", "ABM", "BS Accountancy", "BS Entrepreneurship", "BS Information System"};
    String name3[] = {"Select Course","ICT", "ABM", "BS Accountancy", "BS Entrepreneurship", "BS Information System"};
    String name4[] = {"Select Course","ICT", "ABM", "BS Accountancy", "BS Entrepreneurship", "BS Information System"};
    String name5[] = {"Select Course","ICT", "ABM", "BS Accountancy", "BS Entrepreneurship", "BS Information System"};
    ArrayAdapter<String> adapter1,adapter2,adapter3,adapter4,adapter5;
    String record0 = "";
    String record1 = "";
    String record2 = "";
    String record3 = "";
    String record4 = "";
    String record5 = "";
    String se1,se2,se3,se4,se5;
    String mystring = "Registered Successfully!";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
       getSupportActionBar().setTitle("Select Course");


    button4 = findViewById(R.id.button4);
    button4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        Listview();

            Toast.makeText(getApplicationContext(),mystring,Toast.LENGTH_LONG).show();

        }
    });

        spinner1 = (Spinner)findViewById(R.id.spinner1);
        adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, name1);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner)findViewById(R.id.spinner2);
        adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, name2);
        spinner2.setAdapter(adapter2);

        spinner3 = (Spinner) findViewById(R.id.spinner3);
        adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, name3);
        spinner3.setAdapter(adapter3);

        spinner4 = (Spinner) findViewById((R.id.spinner4));
        adapter4 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, name4);
        spinner4.setAdapter(adapter4);

        spinner5 = (Spinner) findViewById(R.id.spinner5);
        adapter5 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, name5);
        spinner5.setAdapter(adapter5);

        Intent intent = getIntent();
        String text = intent.getStringExtra(EXTRA_TEXT);
        String text2 = intent.getStringExtra(EXTRA_TEXT2);
        String text3 = intent.getStringExtra(EXTRA_TEXT3);
        String text4 = intent.getStringExtra(EXTRA_TEXT4);
        String text5 = intent.getStringExtra(EXTRA_TEXT5);

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


        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:
                        record1 = "Select Course";
                        break;
                    case 1:
                        record1 = "ICT";
                        break;
                    case 2:
                        record1 = "ABM";
                        break;
                    case 3:
                        record1 = "BS Accountancy";
                        break;
                    case 4:
                        record1 = "BS Entrepreneurship";
                        break;
                    case 5:
                        record1 = "BS Information System";
                        break;
                    case  6:
                        record1 = "Default";
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:
                        record2 = "Select Course";
                        break;
                    case 1:
                        record2 = "ICT";
                        break;
                    case 2:
                        record2 = "ABM";
                        break;
                    case 3:
                        record2 = "BS Accountancy";
                        break;
                    case 4:
                        record2 = "BS Entrepreneurship";
                        break;
                    case 5:
                        record2 = "BS Information System";
                        break;
                    case  6:
                        record2 = "Default";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:
                        record3 = "Select Course";
                        break;
                    case 1:
                        record3 = "ICT";
                        break;
                    case 2:
                        record3 = "ABM";
                        break;
                    case 3:
                        record3 = "BS Accountancy";
                        break;
                    case 4:
                        record3 = "BS Entrepreneurship";
                        break;
                    case 5:
                        record3 = "BS Information System";
                        break;
                    case  6:
                        record3 = "Default";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:
                        record4 = "Select Course";
                        break;
                    case 1:
                        record4 = "ICT";
                        break;
                    case 2:
                        record4 = "ABM";
                        break;
                    case 3:
                        record4 = "BS Accountancy";
                        break;
                    case 4:
                        record4 = "BS Entrepreneurship";
                        break;
                    case 5:
                        record4 = "BS Information System";
                        break;
                    case  6:
                        record4 = "Default";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:
                        record5 = "Select Course";
                        break;
                    case 1:
                        record5 = "ICT";
                        break;
                    case 2:
                        record5 = "ABM";
                        break;
                    case 3:
                        record5 = "BS Accountancy";
                        break;
                    case 4:
                        record5 = "BS Entrepreneurship";
                        break;
                    case 5:
                        record5 = "BS Information System";
                        break;
                    case  6:
                        record5 = "Default";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }


    public void Listview(){

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

        Intent i = new Intent(this, Listview.class);

        i.putExtra(EXTRA_TEXT,t1);
        i.putExtra(EXTRA_TEXT2,t2);
        i.putExtra(EXTRA_TEXT3,t3);
        i.putExtra(EXTRA_TEXT4,t4);
        i.putExtra(EXTRA_TEXT5,t5);

        se1 = record1;
        i.putExtra("Value1", se1);

        se2 = record2;
        i.putExtra("Value2", se2);

        se3 = record3;
        i.putExtra("Value3", se3);

        se4 = record4;
        i.putExtra("Value4", se4);

        se5 = record5;
        i.putExtra("Value5", se5);

        startActivity(i);
    }
}
