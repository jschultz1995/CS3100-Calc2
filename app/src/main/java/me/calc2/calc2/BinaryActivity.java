package me.calc2.calc2;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;
import static java.lang.Math.toIntExact;

public class BinaryActivity extends Activity {

    String str = "";
    String prevStr = "";
    private TextView txtOut;
    RadioButton rdbStandard;
    RadioButton rdbGraphing;
    private int expressionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary);
        txtOut = findViewById(R.id.textView);

        // Radio button layout changing
        rdbStandard = findViewById(R.id.rdbStandard);
        rdbStandard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        rdbGraphing = findViewById(R.id.rdbGraphing);
        rdbGraphing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                launchActivity();
            }
        });

        ////////////////////////////////////////
        //Binary Activity Button Functionality//
        ////////////////////////////////////////

        // Number and operation button functionality
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

        Button btnDelete = (findViewById(R.id.btnDelete));
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!str.isEmpty())
                    str = str.substring(0,str.length()-1);
                txtOut.setText(str);
            }
        });

//        Button btnAnswer = (findViewById(R.id.btnAnswer));
//        btnAnswer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(!prevStr.isEmpty())
//                    str = prevStr;
//                txtOut.setText(str);
//            }
//        });

        Button btnClear = (findViewById(R.id.btnClear));
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "";
                txtOut.setText(str);
            }
        });

        // Converts str to a str in base 10, calculates, and converts back to base 2.
        Button btnEquals = (findViewById(R.id.btnEquals));
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str.matches("^[01+-/*]+$")) {
                    String newStr = "";
                    String newNum = "";
                    char b = '\0';
                    for(int i = 0; i<str.length();i++)
                    {
                        b = str.charAt(i);
                        if((b !='+') && (b != '-') && (b != '*') && (b != '/') && (i!=str.length()-1))
                        {
                            newNum = newNum + b;
                        }
                        else
                        {
                            if(i==str.length()-1)
                                newNum = newNum + b;
                            int valInt = Integer.parseInt(newNum, 2);
                            newStr = newStr + Integer.toString(valInt);
                            newNum = "";
                            if(i!=str.length()-1)
                                newStr = newStr + b;
                        }
                    }
                    txtOut.setText(newStr);
                    Expression e = new Expression(newStr);
                    double val = e.calculate();
                    int valInt = (int) val;
                    String s = Integer.toBinaryString(valInt);
                    txtOut.setText(s);
                    str = s;
                    prevStr = s;
                }
                else
                {
                    txtOut.setText("Use Standard Mode");
                    str = "";
                }
            }
        });

        // New Binary Button Functions
        Button btnOnesCompliment = (findViewById(R.id.btnOnesCompliment));
        btnOnesCompliment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (str.matches("^[01]+$"))
                {
                    String s = "";
                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == '0')
                            s = s + '1';
                        else
                            s = s + '0';
                    }
                    txtOut.setText(s);
                    str = s;
                }
                else
                {
                    txtOut.setText("Not Binary Input");
                    str = "";
                }
            }
        });

        Button btnTwosCompliment = (findViewById(R.id.btnTwosCompliment));
        btnTwosCompliment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (str.matches("^[01]+$"))
                {
                    String s = "";
                    for(int i = 0;i < str.length();i++){
                        if(str.charAt(i)=='0')
                            s = s + '1';
                        else
                            s = s + '0';
                    }
                    s = String.valueOf(Integer.toBinaryString(Integer.parseInt(s,2) + 1));
                    str = s;
                    txtOut.setText(s);
                }
                else
                {
                    txtOut.setText("Not Binary Input");
                    str = "";
                }
            }
        });

        Button btnRotateLeft = (findViewById(R.id.btnRotateLeft));
        btnRotateLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str.matches("^[0123456789]+$"))
                {
                    char charF = str.charAt(0);
                    str = str.substring(1, str.length());
                    str = str + charF;
                    txtOut.setText(str);
                }
                else
                {
                    txtOut.setText("Not Proper Input");
                    str = "";
                }
            }
        });

        Button btnRotateRight = (findViewById(R.id.btnRotateRight));
        btnRotateRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str.matches("^[0123456789]+$"))
                {
                    char charL = str.charAt(str.length() - 1);
                    str = str.substring(0, str.length() - 1);
                    str = charL + str;
                    txtOut.setText(str);
                }
                else
                {
                    txtOut.setText("Not Proper Input");
                    str = "";
                }
            }
        });

        Button btnShiftLeft = (findViewById(R.id.btnShiftLeft));
        btnShiftLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str.matches("^[0123456789]+$"))
                {
                    str = str + "0";
                    txtOut.setText(str);
                }
                else
                {
                    txtOut.setText("Not Proper Input");
                    str = "";
                }

            }
        });

        Button btnShiftRight = (findViewById(R.id.btnShiftRight));
        btnShiftRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str.matches("^[0123456789]+$"))
                {
                    str = str.substring(0, str.length() - 1);
                    txtOut.setText(str);
                }
                else
                {
                    txtOut.setText("Not Proper Input");
                    str = "";
                }
            }
        });

        Button btnConvertToBinary = (findViewById(R.id.btnConvertToBinary));
        btnConvertToBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str.matches("^[0123456789]+$"))
                {
                    Expression e = new Expression(str);
                    double val = e.calculate();
                    int valInt = (int) val;
                    String s = Integer.toBinaryString(valInt);
                    str = s;
                    txtOut.setText(s);
                }
                else
                {
                    txtOut.setText("Not Decimal Input");
                    str = "";
                }
            }
        });

        Button btnConvertToDecimal = (findViewById(R.id.btnConvertToDecimal));
        btnConvertToDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str.matches("^[01]+$"))
                {
                    int valInt = Integer.parseInt(str, 2);
                    String s = Integer.toString(valInt);
                    str = s;
                    txtOut.setText(s);
                }
                else
                {
                    txtOut.setText("Not Binary Input");
                    str = "";
                }
            }
        });
    }

    // Changing Activities, Currently defaults to GraphingActivity
        private void launchActivity() {

            Intent intent = new Intent(this, GraphingActivity.class);
            startActivity(intent);
        }
}
