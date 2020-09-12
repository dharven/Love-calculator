package com.example.lovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText male,female;
    TextView fi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showResult(View v){
        male = (EditText)findViewById(R.id.editText);
        female = (EditText)findViewById(R.id.editText2);
        fi = (TextView)findViewById(R.id.textView);
        String f = female.getText().toString().toLowerCase();
        String m = male.getText().toString().toLowerCase();

        if(f.equals("tirtha") && m.equals("sagar"))
        {
            fi.setVisibility(View.VISIBLE);
            fi.setText(R.integer.show_integer);
        }
        else if(f.equals("riya") && m.equals("shashank"))
        {
            fi.setVisibility(View.VISIBLE);
            fi.setText(R.integer.show_integer);
        }
        else if (f.equals("jay") && m.equals("messi"))
        {
            fi.setVisibility(View.VISIBLE);
            fi.setText(R.integer.show_integer);
        }
        else if(f.equals("dhwani") && m.equals("dharven"))
        {
            fi.setVisibility(View.VISIBLE);
            fi.setText(R.integer.show_integer);
        }
        else
        {


            String sum = m + f;
            sum = sum.toLowerCase();
            int value = sum.hashCode();

            Random random = new Random(value);
            if (f.equals("") || m.equals("")) {
                Toast.makeText(MainActivity.this, "ENTER NAME", Toast.LENGTH_LONG).show();
            }
            else{
                fi.setVisibility(View.VISIBLE);
                fi.setText(String.valueOf(random.nextInt(100)));

            }
            }

            }
        }

