package me.calc2.calc2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;


public class MainActivity extends Activity {
    String str = "";
    private TextView txtOut;
    //private variable for keeping track of what expression to save:
    private int expressionNumber = 0;
    RadioGroup radioGroup;
    RadioButton rdbStandard;
    RadioButton rdbBinary;
    RadioButton rdbGraphing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOut = findViewById(R.id.textView);

        //////////////////////////////
        //Radio Button Functionality//
        //////////////////////////////

        radioGroup = findViewById(R.id.radioGroupMain);
        rdbStandard = findViewById(R.id.rdbStandard);

        //Call Binary Activity
        rdbBinary = findViewById(R.id.rdbBinary);
        rdbBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchActivityBinary();
                rdbStandard.setChecked(true);
            }
        });

        //Call Graphing Activity
        rdbGraphing = findViewById(R.id.rdbGraphing);
        rdbGraphing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchActivityGraphing();
                rdbStandard.setChecked(true);
            }
        });


        //////////////////////////////////////
        //Main Activity Button Functionality//
        //////////////////////////////////////

        Button btnDigitZero = (findViewById(R.id.btnDigitZero));
        btnDigitZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "0";
                txtOut.setText(str);

            }
        });

        Button btnDigitOne = (findViewById(R.id.btnDigitOne));
        btnDigitOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "1";
                txtOut.setText(str);

            }
        });

        Button btnDigitTwo = (findViewById(R.id.btnDigitTwo));
        btnDigitTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "2";
                txtOut.setText(str);

            }
        });

        Button btnDigitThree = (findViewById(R.id.btnDigitThree));
        btnDigitThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "3";
                txtOut.setText(str);

            }
        });

        Button btnDigitFour = (findViewById(R.id.btnDigitFour));
        btnDigitFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "4";
                txtOut.setText(str);

            }
        });

        Button btnDigitFive = (findViewById(R.id.btnDigitFive));
        btnDigitFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "5";
                txtOut.setText(str);

            }
        });

        Button btnDigitSix = (findViewById(R.id.btnDigitSix));
        btnDigitSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "6";
                txtOut.setText(str);

            }
        });

        Button btnDigitSeven = (findViewById(R.id.btnDigitSeven));
        btnDigitSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "7";
                txtOut.setText(str);

            }
        });

        Button btnDigitEight = (findViewById(R.id.btnDigitEight));
        btnDigitEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "8";
                txtOut.setText(str);

            }
        });

        Button btnDigitNine = (findViewById(R.id.btnDigitNine));
        btnDigitNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "9";
                txtOut.setText(str);

            }
        });

        Button btnDecimal = (findViewById(R.id.btnDecimal));
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + ".";
                txtOut.setText(str);

            }
        });

        Button btnPlus = (findViewById(R.id.btnPlus));
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "+";
                txtOut.setText(str);

            }
        });

        Button btnMinus = (findViewById(R.id.btnMinus));
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "-";
                txtOut.setText(str);

            }
        });

        Button btnMultiply = (findViewById(R.id.btnMultiply));
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "*";
                txtOut.setText(str);

            }
        });

        Button btnDivide = (findViewById(R.id.btnDivide));
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "/";
                txtOut.setText(str);

            }
        });

        Button buttonPi = (findViewById(R.id.buttonPi));
        buttonPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "pi";
                txtOut.setText(str);

            }
        });

        Button buttonPower = (findViewById(R.id.buttonPower));
        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "^";
                txtOut.setText(str);

            }
        });

        Button btnSqrt = (findViewById(R.id.btnSqrt));
        btnSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "sqrt(";
                txtOut.setText(str);

            }
        });

        Button btnOpenPar = (findViewById(R.id.btnOpenPar));
        btnOpenPar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "(";
                txtOut.setText(str);

            }
        });

        Button btnClosePar = (findViewById(R.id.btnClosePar));
        btnClosePar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + ")";
                txtOut.setText(str);

            }
        });

        Button btnSin = (findViewById(R.id.btnSin));
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "sin(";
                txtOut.setText(str);

            }
        });

        Button btnCos = (findViewById(R.id.btnCos));
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "cos(";
                txtOut.setText(str);

            }
        });

        Button btnTan = (findViewById(R.id.btnTan));
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "tan(";
                txtOut.setText(str);

            }
        });

        Button btnClear = (findViewById(R.id.btnClear));
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "";
                txtOut.setText(str);

            }
        });

        //Buttons for previous answers:
        Button btnAns0 = (findViewById(R.id.btnAns0));
        btnAns0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Button button = (Button) findViewById(R.id.btnAns0);
            str = str + button.getText();
            txtOut.setText(str);
            }
        });

        Button btnAns1 = (findViewById(R.id.btnAns1));
        btnAns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Button button = (Button) findViewById(R.id.btnAns1);
            str = str + button.getText();
            txtOut.setText(str);
            }
        });

        Button btnAns2 = (findViewById(R.id.btnAns2));
        btnAns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Button button = (Button) findViewById(R.id.btnAns2);
            str = str + button.getText();
            txtOut.setText(str);
            }
        });

        Button btnAns3 = (findViewById(R.id.btnAns3));
        btnAns3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Button button = (Button) findViewById(R.id.btnAns3);
            str = str + button.getText();
            txtOut.setText(str);
            }
        });

        Button btnAns4 = (findViewById(R.id.btnAns4));
        btnAns4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Button button = (Button) findViewById(R.id.btnAns4);
            str = str + button.getText();
            txtOut.setText(str);
            }
        });

        Button btnAns5 = (findViewById(R.id.btnAns5));
        btnAns5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Button button = (Button) findViewById(R.id.btnAns5);
            str = str + button.getText();
            txtOut.setText(str);
            }
        });

        //Buttons for previous Expressions:
        Button btnExp0 = (findViewById(R.id.btnExp0));
        btnExp0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) findViewById(R.id.btnExp0);
                str = str + button.getText();
                txtOut.setText(str);
            }
        });

        Button btnExp1 = (findViewById(R.id.btnExp1));
        btnExp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) findViewById(R.id.btnExp1);
                str = str + button.getText();
                txtOut.setText(str);
            }
        });

        Button btnExp2 = (findViewById(R.id.btnExp2));
        btnExp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) findViewById(R.id.btnExp2);
                str = str + button.getText();
                txtOut.setText(str);
            }
        });

        Button btnExp3 = (findViewById(R.id.btnExp3));
        btnExp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) findViewById(R.id.btnExp3);
                str = str + button.getText();
                txtOut.setText(str);
            }
        });

        Button btnExp4 = (findViewById(R.id.btnExp4));
        btnExp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) findViewById(R.id.btnExp4);
                str = str + button.getText();
                txtOut.setText(str);
            }
        });

        Button btnExp5 = (findViewById(R.id.btnExp5));
        btnExp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) findViewById(R.id.btnExp5);
                str = str + button.getText();
                txtOut.setText(str);
            }
        });

        Button btnEquals = (findViewById(R.id.btnEquals));
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //starting up previous expression saving:
                String name = "btnExp" + expressionNumber;
                int id = getResources().getIdentifier(name,"id", getPackageName());
                if(id != 0)
                {
                  TextView newExp = (TextView) findViewById(id);
                  newExp.setText(txtOut.getText());
                }
                //continuing with calculation:
                Expression e = new Expression(str);
                double val = e.calculate();
                String s = Double.toString(val);
                txtOut.setText(s);
                str = s;
                //adding answer to the appropriate button:
                name = "btnAns" + expressionNumber;
                id = getResources().getIdentifier(name,"id", getPackageName());
                if(id != 0)
                {
                  Button button = (Button) findViewById(id);
                  button.setText(s);
                }
                //updating the expression value:
                ++expressionNumber;
                if(expressionNumber == 6)
                {
                  expressionNumber = 0;
                }
            }
        });


    }

    //Functions for changing activities
    private void launchActivityBinary() {

        Intent intent = new Intent(this, BinaryActivity.class);
        startActivity(intent);
        if(rdbGraphing.isChecked()){
            launchActivityGraphing();
        }
    }
    private void launchActivityGraphing() {

        Intent intent = new Intent(this, GraphingActivity.class);
        startActivity(intent);
        if(rdbBinary.isChecked()) {
            launchActivityBinary();
        }
    }

}

