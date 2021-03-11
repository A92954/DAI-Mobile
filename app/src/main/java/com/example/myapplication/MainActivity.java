package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().hasExtra("com.example.myapplication.SOMETHING")){
            TextView tv = (TextView) findViewById(R.id.textView2);
            String text = getIntent().getExtras().getString("com.example.myapplication.SOMETHING");
            tv.setText(text);
        }


        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstText = (EditText) findViewById(R.id.FirstText);
                EditText secondText = (EditText) findViewById(R.id.SecondText);
                TextView result = (TextView) findViewById(R.id.result);

                if(firstText.length() > 0 && secondText.length() > 0){
                    int num1 = Integer.parseInt(firstText.getText().toString());
                    int num2 = Integer.parseInt(secondText.getText().toString());
                    int res = num1 + num2;
                    result.setText(res + "");
                }else{
                    result.setText("Insira um numero!");
                }
            }
        });

        Button addBtn2 = (Button) findViewById(R.id.addBtn2);
        addBtn2.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstText = (EditText) findViewById(R.id.FirstText);
                EditText secondText = (EditText) findViewById(R.id.SecondText);
                TextView result = (TextView) findViewById(R.id.result);

                if(firstText.length() > 0 && secondText.length() > 0){
                    int num1 = Integer.parseInt(firstText.getText().toString());
                    int num2 = Integer.parseInt(secondText.getText().toString());
                    int res = num1 * num2;
                    result.setText(res + "");
                }else{
                    result.setText("Insira um numero!");
                }
            }
        });

        Button addBtn3 = (Button) findViewById(R.id.addBtn3);
        addBtn3.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstText = (EditText) findViewById(R.id.FirstText);
                EditText secondText = (EditText) findViewById(R.id.SecondText);
                TextView result = (TextView) findViewById(R.id.result);

                if(firstText.length() > 0 && secondText.length() > 0){
                int num1 = Integer.parseInt(firstText.getText().toString());
                int num2 = Integer.parseInt(secondText.getText().toString());
                int res = num1 - num2;
                    result.setText(res + "");
                }else{
                    result.setText("Insira um numero!");
                }
            }
        });

    }
}