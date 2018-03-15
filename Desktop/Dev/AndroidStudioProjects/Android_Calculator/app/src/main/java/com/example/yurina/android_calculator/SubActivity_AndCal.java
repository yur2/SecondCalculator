package com.example.yurina.android_calculator;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import static android.widget.EditText.*;

public class SubActivity_AndCal extends AppCompatActivity implements OnClickListener {


    private Button onebtn, twobtn, threebtn, plusbtn, fourbtn, fivebtn, sixbtn, minusbtn, sevenbtn, eightbtn, ninebtn, multibtn, zerobtn, devidebtn, stopbtn, resultbtn;
    private TextView input;
    private TextView output;
    private String save = "";
    private String showvalue = "";
    private String sum = "";
    private int sum2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub__and_cal);

        Init();
        ListenerInit();
    }

    private void Init() {


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

        input = (TextView) findViewById(R.id.input);
        output = (TextView) findViewById(R.id.output);

    }


    private void ListenerInit() {

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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.onebtn:
                Number(1);
                break;

            case R.id.twobtn:
                int num =2;
                showvalue = showvalue + num;
                input.setText(showvalue);
                save = save + num + "";
                break;
            case R.id.threebtn:
                showvalue = showvalue + "3";
                input.setText(showvalue);
                save = save + 3 + "";
                break;
            case R.id.fourbtn:
                showvalue = showvalue + "4";
                input.setText(showvalue);
                save = save + 4 + "";
                break;
            case R.id.fivebtn:
                showvalue = showvalue + "5";
                input.setText(showvalue);
                save = save + 5 + "";
                break;

            case R.id.sixbtn:
                showvalue = showvalue + "6";
                input.setText(showvalue);
                save = save + 6 + "";
                break;

            case R.id.sevenbtn:
                showvalue = showvalue + "7";
                input.setText(showvalue);
                save = save + 7 + "";
                break;

            case R.id.eightbtn:
                showvalue = showvalue + "8";
                input.setText(showvalue);
                save = save + 8 + "";
                break;

            case R.id.ninebtn:
                showvalue = showvalue + "9";
                input.setText(showvalue);
                save = save + 9 + "";
                break;

            case R.id.zerobtn:
                showvalue = showvalue + "0";
                input.setText(showvalue);
                save = save + 0 + "";
                break;

            case R.id.plusbtn:

                showvalue = showvalue + "+";
                input.setText(showvalue);
                save = save + "+" + "";
                break;

            case R.id.minusbtn:

                showvalue = showvalue + "-";
                input.setText(showvalue);
                save = save + "-" + "";
                break;

            case R.id.multibtn:

                showvalue = showvalue + "*";
                input.setText(showvalue);
                save = save + "*" + "";
                break;

            case R.id.dividebtn:

                showvalue = showvalue + "/";
                input.setText(showvalue);
                save = save + "/" + "";
                break;

            case R.id.resultbtn:
                showvalue = showvalue + "=";
                input.setText(showvalue);
                save = save + "=" + "";
                Operate();
                output.setText(sum2+"");
                //break;

            case R.id.stopbtn:
                Clearall();
                break;

        }
    }

    public void Clearall(){
        showvalue ="";
        save ="";
        sum2 =0;

        input.setText("");
        output.setText("");


    }

    public void Number(int num) {
        if(num==1){
            showvalue = showvalue + num+"";
            input.setText(showvalue);
            save = save + num + "";
        }

    }

    public void Operate() {

        ArrayList<String> operate = new ArrayList();

        String finalsave[] = save.split("");
        for (int i = 0; i < finalsave.length; i++) {
            if ("+".equals(finalsave[i]) || "-".equals(finalsave[i]) || "*".equals(finalsave[i]) || "/".equals(finalsave[i])) {
                operate.add(finalsave[i]);

                if ("+".equals(finalsave[i])) {
                    if (i == 2) {
                        sum2 = Integer.parseInt(finalsave[i - 1]) + Integer.parseInt(finalsave[i + 1]);
                        break;
                       // output.setText(sum2);
                    } else {
                        sum2 = sum2 + Integer.parseInt(finalsave[i + 1]);
                        break;
                    }

                } else if ("-".equals(finalsave[i])) {
                    if (i == 2) {
                        sum2 = Integer.parseInt(finalsave[i - 1]) - Integer.parseInt(finalsave[i + 1]);
                        break;
                    } else {
                        sum2 = sum2 - Integer.parseInt(finalsave[i + 1]);
                        break;
                    }
                } else if ("+".equals(finalsave[i])) {
                    if (i == 2) {
                        sum2 = Integer.parseInt(finalsave[i - 1]) * Integer.parseInt(finalsave[i + 1]);
                        break;
                    } else {
                        sum2 = sum2 * Integer.parseInt(finalsave[i + 1]);
                        break;
                    }

                } else if ("/".equals(finalsave[i])) {
                    if (i == 2) {
                        sum2 = Integer.parseInt(finalsave[i - 1]) / Integer.parseInt(finalsave[i + 1]);
                        break;
                    } else {
                        sum2 = sum2 / Integer.parseInt(finalsave[i + 1]);
                        break;
                    }

                }


            }
            else{

            }


        }

    }

}
