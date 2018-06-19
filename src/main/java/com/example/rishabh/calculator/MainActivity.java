package com.example.rishabh.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
static String input1="0";
static int in1=0;
static String input2= "0";
static int in2=0;
static String result = "0";
static int count =0;
TextView countertext;
TextView countertext2;
TextView countertext3;
static int temp =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countertext = findViewById(R.id.scree1);
        countertext2 = findViewById(R.id.screen2);
        countertext3 = findViewById(R.id.screen3);
    }

    public void calc(View view) {
       switch(view.getId())
        {
            case R.id.bt7:
            {
                if (count==0)
                countertext.setText(countertext.getText().toString()+"7");
                else
                    countertext2.setText(countertext2.getText().toString()+"7");
                break;
            }

            case R.id.bt8:
            {
                if (count==0)
                    countertext.setText(countertext.getText().toString()+"8");
                else
                    countertext2.setText(countertext2.getText().toString()+"8");
                break;
            }

            case R.id.bt9:
            {
                if (count==0)
                    countertext.setText(countertext.getText().toString()+"9");
                else
                    countertext2.setText(countertext2.getText().toString()+"9");
                break;
            }

            case R.id.bt4:
            {
                if (count==0)
                    countertext.setText(countertext.getText().toString()+"4");
                else
                    countertext2.setText(countertext2.getText().toString()+"4");
                break;
            }

            case R.id.bt5:
            {
                if (count==0)
                    countertext.setText(countertext.getText().toString()+"5");
                else
                    countertext2.setText(countertext2.getText().toString()+"5");
                break;
            }

            case R.id.bt6:
            {
                if (count==0)
                    countertext.setText(countertext.getText().toString()+"6");
                else
                    countertext2.setText(countertext2.getText().toString()+"6");
                break;
            }

            case R.id.bt1:
            {
                if (count==0)
                    countertext.setText(countertext.getText().toString()+"1");
                else
                    countertext2.setText(countertext2.getText().toString()+"1");
                break;
            }

            case R.id.bt2:
            {
                if (count==0)
                    countertext.setText(countertext.getText().toString()+"2");
                else
                    countertext2.setText(countertext2.getText().toString()+"2");
                break;
            }

            case R.id.bt3:
            {
                if (count==0)
                    countertext.setText(countertext.getText().toString()+"3");
                else
                    countertext2.setText(countertext2.getText().toString()+"3");
                break;
            }

            case R.id.bt0 :
            {
                if (count==0)
                    countertext.setText(countertext.getText().toString()+"0");
                else
                    countertext2.setText(countertext2.getText().toString()+"0");
                break;
            }


        }
    }

    public void oper(View view) {
        switch(view.getId())
        {
            case R.id.btadd:
            {
                input1 = countertext.getText().toString();
                in1= Integer.parseInt(input1);
                count=1;

                temp =1;
                //calc(View view);
               // input2 = countertext2.getText().toString();
                //in2 = Integer.parseInt(input2);
               // result = Integer.toString((in1+in2));
               break;

            }
            case R.id.btmul:
            {
                input1 = countertext.getText().toString();
                in1= Integer.parseInt(input1);

                count=1;
                temp =2;
               // input2 = countertext2.getText().toString();
              //  in2 = Integer.parseInt(input2);
              //  result = Integer.toString((in1*in2));
                break;

            }
            case R.id.btdiv:
            {
                input1 = countertext.getText().toString();
                in1= Integer.parseInt(input1);

                count=1;
                temp=3;
                //input2 = countertext2.getText().toString();
                //in2 = Integer.parseInt(input2);
                //result = Integer.toString((in1/in2));
                break;

            }
            case R.id.btmin:
            {
                input1 = countertext.getText().toString();
                in1= Integer.parseInt(input1);
               temp=4;
                count=1;
               // input2 = countertext2.getText().toString();
               // in2 = Integer.parseInt(input2);
               // result = Integer.toString((in1-in2));
                break;

            }
            case R.id.btac:
            {
                countertext.setText("0");
                count = 0;
                countertext2.setText("0");
                countertext3.setText("0");
                break;
            }
            case R.id.btres:
            {
                if(count==0)
                    countertext.setText("0");
                else
                    countertext2.setText("0");
                countertext3.setText("0");
                break;

            }
            case R.id.btdel:
            {
                if(count==0)
                {
                    input1 = countertext.getText().toString();
                    in1= Integer.parseInt(input1);
                    in1 =  in1/10;
                    input1 = Integer.toString(in1);
                    countertext.setText(input1);
                }
                if(count==1)
                {
                    input2 = countertext2.getText().toString();
                    in2= Integer.parseInt(input2);
                    in2 =  in2/10;
                    input2 = Integer.toString(in2);
                    countertext2.setText(input2);
                }
            }
            case R.id.btsqr:
            {
                if(count ==0)
                {
                    input1 = countertext.getText().toString();
                    in1= Integer.parseInt(input1);
                    result = Integer.toString(in1*in1);
                    countertext3.setText(result);
                }
                if(count ==1)
                {
                    input2 = countertext2.getText().toString();
                    in2= Integer.parseInt(input2);
                    result = Integer.toString(in2*in2);
                    countertext3.setText(result);
                    count =0;
                }

            }

        }
    }

    public void ans(View view) {
        switch(temp)
        {
            case 1:
            {
                input2 = countertext2.getText().toString();
                in2 = Integer.parseInt(input2);
                result = Integer.toString((in1+in2));
               countertext3.setText(result);
                break;
            }
            case 2:
            {
                input2 = countertext2.getText().toString();
                in2 = Integer.parseInt(input2);
                result = Integer.toString((in1*in2));
                countertext3.setText(result);

                break;

            }
            case 3:
            {
                input2 = countertext2.getText().toString();
                in2 = Integer.parseInt(input2);
                result = Integer.toString((in1/in2));
                countertext3.setText(result);

                break;

            }
            case 4:
            {
                input2 = countertext2.getText().toString();
                in2 = Integer.parseInt(input2);
                result = Integer.toString((in1-in2));
                countertext3.setText(result);

                break;
            }
        }
       count=0;
    }
}
