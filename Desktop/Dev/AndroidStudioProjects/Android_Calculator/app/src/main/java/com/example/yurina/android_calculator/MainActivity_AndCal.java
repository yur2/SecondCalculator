package com.example.yurina.android_calculator;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import static com.example.yurina.android_calculator.R.*;



    public class MainActivity_AndCal extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(layout.activity_main__and_cal);

            Button calculbtn = (Button) findViewById(id.calculbtn);

            calculbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(MainActivity_AndCal.this,  SubActivity_AndCal.class);
                    startActivity(intent);
                }
            });


        }
    }
