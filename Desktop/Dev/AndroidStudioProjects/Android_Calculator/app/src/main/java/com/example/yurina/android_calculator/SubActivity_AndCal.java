package com.example.yurina.android_calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
//import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import static android.widget.EditText.*;

public class SubActivity_AndCal extends AppCompatActivity {


    private Button onebtn, twobtn, threebtn, plusbtn, fourbtn, fivebtn, sixbtn, minusbtn, sevenbtn, eightbtn, ninebtn, multibtn, zerobtn, devidebtn, stopbtn, resultbtn;
    private TextView text;
    private TextView text2;


    int a =0;
    int c = 0;
    String b = "";

    String temp = "";
    boolean checkOperator = false;
    String temp2 = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub__and_cal);


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

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View btn) {
                switch (btn.getId()) {


                    case R.id.onebtn:

                        number("1");
                        break;
                    case R.id.twobtn:

                        number("2");
                        break;
                    case R.id.threebtn:

                        number("#");
                        break;
                    case R.id.fourbtn:

                        number("4");
                        break;
                    case R.id.fivebtn:

                          number("5");
                        break;
                    case R.id.sixbtn:

                         number("6");
                        break;
                    case R.id.sevenbtn:

                          number("7");
                        break;
                    case R.id.eightbtn:

                         number("8");
                        break;
                    case R.id.ninebtn:

                        number("9");
                        break;

                    case R.id.zerobtn:

                        number("0");
                        break;

                    case R.id.plusbtn:
                        operate1("+");

                        break;


                    case R.id.minusbtn:
                        operate1("-");

                        break;

                    case R.id.multibtn:
                        operate1("*");

                        break;

                    case R.id.dividebtn:
                        operate1("/");

                        break;

                    case R.id.resultbtn:

                        array1();

                        break;

                    case R.id.stopbtn:
                        ClearAll();
                        break;

                    default:
                        break;


                }
            }

            public void ClearAll() {

                text.setText("");
                text2.setText("");

                checkOperator = false;
            }

            public void number(String num) {

                if (checkOperator == false) {
                    temp = num;
                    text.setText(text.getText().toString() + temp + " ");

                } else {


                    temp2 = num;
                    text.setText(text.getText().toString() + temp2 + " ");
//                    int a = Integer.parseInt(temp) + Integer.parseInt(temp2);
//                    text2.setText(a + " ");

                }


                Log.d("Number ============= ", temp);
            }

            public void operate1(String ope1) {

                b = ope1;


                text.setText(text.getText().toString() + b + " ");

                if (b.equals("+") || b.equals("-") || b.equals("*") || b.equals("/")) {
                    checkOperator = true;
                }
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

    public void array1() {
        int c = 0;
        int a = 0;

        switch (b) {


            case "+": {
                if( c == 0){


                a = Integer.parseInt(temp) + Integer.parseInt(temp2);
                text2.setText(a + " ");
                c = 1;
                break;
                }

                else if(c ==1){
                    a = a + Integer.parseInt(temp2);
                    break;
                }
            }
            case "-": {
                text2.setText(Integer.parseInt(temp) - Integer.parseInt(temp2) + "");
            }
            case "*": {
                text2.setText(Integer.parseInt(temp) * Integer.parseInt(temp2) + "");
            }
            case "/": {
                text2.setText(Integer.parseInt(temp) / Integer.parseInt(temp2) + "");
            }


        }


//                String split1[] = a.split(" ");
//                ArrayList<String> array = new ArrayList<>();
//
//                for (int i = 0; i > split1.length; i++) {
//                    array.add(split1[i]);
//                }
//
//                for (int i = 0; i > array.size(); i++) {
//
//
//                    if (array.get(i).equals("+")) {
//
//                        if (result == 0) {
//                            result = Integer.parseInt(array.get(i - 1)) + Integer.parseInt(array.get(i + 1));
//                            break;
//                        } else
//                            result = result + Integer.parseInt(array.get(i + 1));
//                        break;
//
//                    }
//
//
//                    if (array.get(i).equals("-")) {
//                        if (result == 0) {
//
//                            result = Integer.parseInt(array.get(i - 1)) - Integer.parseInt(array.get(i + 1));
//
//                            break;
//                        } else
//                            result = result - Integer.parseInt(array.get(i + 1));
//                        break;
//                    }
//
//
//                    if (array.get(i).equals("*")) {
//                        if (result == 0) {
//                            result = Integer.parseInt(array.get(i - 1)) * Integer.parseInt(array.get(i + 1));
//
//                            break;
//                        } else
//                            result = result * Integer.parseInt(array.get(i + 1));
//                        break;
//                    }
//
//                    if (array.get(i).equals("/")) {
//                        if (result == 0) {
//
//                            try {
//                                result = Integer.parseInt(array.get(i - 1)) / Integer.parseInt(array.get(i + 1));
//                            } catch (Exception e) {
//                                if (array.get(i + 1).equals(0)) {
//                                    text2.setText("= 해가 없음");
//                                    break;
//
//                                } else
//                                    result = result / Integer.parseInt(array.get(i + 1));
//                                break;
//                            }
//                        }
//
//
//                    }
//
//
//            }
//
//
//                text2.setText("="+text2.getText().
//
//            toString() +result);

    }
}