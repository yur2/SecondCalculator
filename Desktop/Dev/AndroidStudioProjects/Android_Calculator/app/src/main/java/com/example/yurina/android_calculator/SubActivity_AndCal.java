package com.example.yurina.android_calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
//import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.EditText.*;

public class SubActivity_AndCal extends AppCompatActivity implements OnClickListener {


    private Button onebtn, twobtn, threebtn, plusbtn, fourbtn, fivebtn, sixbtn, minusbtn, sevenbtn, eightbtn, ninebtn, multibtn, zerobtn, devidebtn, stopbtn, resultbtn;
    private TextView text;
    private TextView text2;

    int distinction =0;

    boolean checkOperator = false;

    String temp = "";
    String temp2 = "";
    String num_right = "";
    String num_left = "";
    String result = "";
    String operator = "";
    String finalsum = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub__and_cal);


        init();
        setListener();


    }

    private void setListener() {

        onebtn.setOnClickListener(this);
        twobtn.setOnClickListener(this);
        threebtn.setOnClickListener(this);
        fourbtn.setOnClickListener(this);
        fivebtn.setOnClickListener(this);
        sixbtn.setOnClickListener(this);
        sevenbtn.setOnClickListener(this);
        eightbtn.setOnClickListener(this);
        ninebtn.setOnClickListener(this);
        plusbtn.setOnClickListener(this);
        zerobtn.setOnClickListener(this);
        minusbtn.setOnClickListener(this);
        multibtn.setOnClickListener(this);
        devidebtn.setOnClickListener(this);
        stopbtn.setOnClickListener(this);
        resultbtn.setOnClickListener(this);

    }

    private void init() {

        onebtn = (Button) findViewById(R.id.onebtn);
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
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.onebtn:
                number(1);
                break;
            case R.id.twobtn:
                number(2);
                break;
            case R.id.threebtn:
                number(3);
                break;
            case R.id.fourbtn:
                number(4);
                break;
            case R.id.fivebtn:
                number(5);
                break;
            case R.id.sixbtn:
                number(6);
                break;
            case R.id.sevenbtn:
                number(7);
                break;
            case R.id.eightbtn:
                number(8);
                break;
            case R.id.ninebtn:
                number(9);
                break;

            case R.id.zerobtn:
                number(0);
                break;

            case R.id.plusbtn:
                Operate1("+");
                break;


            case R.id.minusbtn:
                Operate1("-");
                break;

            case R.id.multibtn:
                Operate1("*");
                break;

            case R.id.dividebtn:
                Operate1("/");
                break;

            case R.id.resultbtn:

                result = result + " " + "=";
                text.setText(result);

                String save[] = result.split(" ");
                for (int i = 0; i > save.length; i++) {
                    if (save[i].equals(" ")) {
                        text2.setText(result);
                    }
//                        if (num_right.equals("")) {
//                            break;
//                        } else {
//                            operate2();
//                            break;
//                        }
//                    } else {
//                        break;
//                    }

                }
               // text2.setText(finalsum);

//                for (int i = 0; i > result.length(); i++) {

//                    if (" ".equals(result.charAt(i))) {
//                        if (num_right.equals("")) {
//
//                        } else {
//                            operate2();
//
//                        }
//
//                    } else {
//
//                    }
//
//
//                }

                //operate2();

                // text2.setText(finalsum);


                break;

            case R.id.stopbtn:
                ClearAll();
                break;

            default:
                break;
        }
    }

    public void number(int i) {

        if (checkOperator == false) {

            if (i == 0) {
                processNumber(i);

            } else if (i == 1) {
                processNumber(i);

            } else if (i == 2) {
                processNumber(i);

            } else if (i == 3) {
                processNumber(i);

            } else if (i == 4) {
                processNumber(i);

            } else if (i == 5) {
                processNumber(i);

            } else if (i == 6) {
                processNumber(i);

            } else if (i == 7) {
                processNumber(i);

            } else if (i == 8) {
                processNumber(i);

            } else if (i == 9) {
                processNumber(i);

            }
        } else

        {
            if (i == 0) {
                processNumber(i);

            } else if (i == 1) {
                processNumber(i);

            } else if (i == 2) {
                processNumber(i);

            } else if (i == 3) {
                processNumber(i);

            } else if (i == 4) {
                processNumber(i);

            } else if (i == 5) {
                processNumber(i);

            } else if (i == 6) {
                processNumber(i);

            } else if (i == 7) {
                processNumber(i);

            } else if (i == 8) {
                processNumber(i);

            } else if (i == 9) {
                processNumber(i);

            }


        }
    }

    private void processNumber(int i) {

        if (checkOperator == false) {
            temp = i + "";
            num_left = num_left + i + "";
            result = result + temp;
            text.setText(result);

        } else {
            temp2 = i + "";
            num_right = num_right + i + "";
            result = result + temp2;
            text.setText(result);

        }

    }


    public void Operate2() {

        if (distinction== 0) {


            if (operator.equals("+")) {
                finalsum = Integer.parseInt(num_left) + Integer.parseInt(num_right) + "";


            } else if (operator.equals("-")) {
                finalsum = Integer.parseInt(num_left) - Integer.parseInt(num_right) + "";


            } else if (operator.equals("*")) {
                finalsum = Integer.parseInt(num_left) * Integer.parseInt(num_right) + "";

            } else if (operator.equals("/")) {
                finalsum = Integer.parseInt(num_left) / Integer.parseInt(num_right) + "";

            }
            distinction++;
            num_right = "";

        } else {
            if (operator.equals("+")) {
                finalsum = Integer.parseInt(finalsum) + Integer.parseInt(num_right) + "";


            } else if (operator.equals("-")) {
                finalsum = Integer.parseInt(finalsum) - Integer.parseInt(num_right) + "";


            } else if (operator.equals("*")) {
                finalsum = (Integer.parseInt(finalsum) * Integer.parseInt(num_right)) + "";


            } else if (operator.equals("/")) {
                finalsum = Integer.parseInt(finalsum) / Integer.parseInt(num_right) + "";


            }
            num_right = "";


        }


    }

    public void ClearAll() {

        temp = "";
        temp2 = "";
        operator = "";
        result = "";
        num_left = "";
        num_right = "";
        finalsum = "";


        distinction = 0;

        checkOperator = false;

        text.setText(result);
        text2.setText(finalsum);
    }

    public void Operate1(String ope1) {

        if (ope1.equals("+") || ope1.equals("-") || ope1.equals("*") || ope1.equals("/")) {
            checkOperator = true;
            operator = ope1;
            result = result + " " + operator + " ";
            text.setText(result);

        }

    }


}