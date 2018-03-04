package com.example.yurina.android_calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.EditText;
import android.widget.TextView;

import static android.widget.EditText.*;

    public class SubActivity_AndCal extends AppCompatActivity {



        private Button onebtn, twobtn, threebtn, plusbtn, fourbtn, fivebtn, sixbtn, minusbtn, sevenbtn, eightbtn, ninebtn, multibtn, zerobtn, devidebtn, stopbtn, resultbtn;
        private TextView text;
        private TextView text2;
        private int operate = 0;
        private int sum = 0;
        private int sum2 = 0;
        //private String plus = "+";
        //private String minus = "-";
        //private String multi = "*";
        //private String divide = "/";



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sub__and_cal);

            onebtn = (Button) findViewById(R.id.onebtn);
            // onebtn.setOnClickListener((OnClickListener) this);
            twobtn = (Button) findViewById(R.id.twobtn);
            threebtn = (Button) findViewById(R.id.threebtn);
            plusbtn = (Button) findViewById(R.id.plusbtn);
            fourbtn = (Button) findViewById(R.id.fourbtn);
            fivebtn = (Button) findViewById(R.id.fivebtn);
            sixbtn = (Button) findViewById(R.id.sixbtn);
            minusbtn = (Button) findViewById(R.id.minusbtn);
            sevenbtn = (Button) findViewById(R.id.sevenbtn);
            eightbtn = (Button) findViewById(R.id.eightbtn);
            ninebtn = (Button) findViewById(R.id.ninebtn);
            multibtn = (Button) findViewById(R.id.multibtn);
            zerobtn = (Button) findViewById(R.id.zerobtn);
            devidebtn = (Button) findViewById(R.id.dividebtn);
            stopbtn = (Button) findViewById(R.id.stopbtn);
            resultbtn = (Button) findViewById(R.id.resultbtn);

            text = (TextView) findViewById(R.id.text);
            text2 = (TextView) findViewById(R.id.text2);

            View.OnClickListener clickListener = new View.OnClickListener() {
                @Override
                public void onClick(View btn) {


                    switch (btn.getId()) {


                        case R.id.onebtn:
                            text.append("1");
                            break;
                        case R.id.twobtn:
                            text.setText("2");
                            break;
                        case R.id.threebtn:
                            text.setText(text.getText().toString() + "3");
                            break;
                        case R.id.fourbtn:
                            text.append("4");
                            break;
                        case R.id.fivebtn:
                            text.append("5");
                            break;
                        case R.id.sixbtn:
                            text.append("6");
                            break;
                        case R.id.sevenbtn:
                            text.append("7");
                            break;
                        case R.id.eightbtn:
                            text.append("8");
                            break;
                        case R.id.ninebtn:
                            text.append("9");
                            break;

                        case R.id.zerobtn:
                            text.setText(text.getText().toString() + "0");
                            break;

                        case R.id.plusbtn:
                            operate = 1;

                            if (sum == 0) {
                                sum = Integer.parseInt(text.getText().toString());
                                text.setText("");
                                break;

                            } else
                                sum = sum;
                            text.setText("");
                            break;


                        case R.id.minusbtn:
                            operate = 2;

                            if (sum == 0) {
                                sum = Integer.parseInt(text.getText().toString());
                                text.setText("");

                                break;

                            } else
                                sum = sum;
                            text.setText("");
                            break;

                        case R.id.multibtn:

                            operate = 3;

                            if (sum == 0) {
                                sum = Integer.parseInt(text.getText().toString());
                                text.setText("");
                                break;

                            } else
                                sum = sum;
                            text.setText("");
                            break;

                        case R.id.dividebtn:

                            operate = 4;

                            if (sum == 0) {
                                sum = Integer.parseInt(text.getText().toString());
                                text.setText("");

                                break;

                            } else
                                sum = sum;
                            text.setText("");
                            break;

                        case R.id.resultbtn:

                            sum2 = Integer.parseInt(text.getText().toString());


                            if (operate == 1) {
                                sum = sum + sum2;
                            } else if (operate == 2) {
                                sum = sum - sum2;
                            } else if (operate == 3) {
                                sum = sum * sum2;
                            } else if (operate == 4) {
                                try {
                                    sum = sum / sum2;
                                }catch (Exception e){
                                    if(sum2 == 0){
                                        text2.setText("= 해가 없음");
                                        break;
                                    }
                                }

                            }

                            text2.setText("= " + sum);
                            break;

                        case R.id.stopbtn:
                            ClearAll();
                            break;

                        default:
                            break;


                    }
                }

                public void ClearAll() {
                    sum = 0;
                    text.setText("");
                    text2.setText("");
                }


            };

            onebtn.setOnClickListener(clickListener);
            twobtn.setOnClickListener(clickListener);
            threebtn.setOnClickListener(clickListener);
            fourbtn.setOnClickListener(clickListener);
            fivebtn.setOnClickListener(clickListener);
            sixbtn.setOnClickListener(clickListener);
            sevenbtn.setOnClickListener(clickListener);
            eightbtn.setOnClickListener(clickListener);
            ninebtn.setOnClickListener(clickListener);
            plusbtn.setOnClickListener(clickListener);
            zerobtn.setOnClickListener(clickListener);
            minusbtn.setOnClickListener(clickListener);
            multibtn.setOnClickListener(clickListener);
            devidebtn.setOnClickListener(clickListener);
            stopbtn.setOnClickListener(clickListener);
            resultbtn.setOnClickListener(clickListener);


        }
    }