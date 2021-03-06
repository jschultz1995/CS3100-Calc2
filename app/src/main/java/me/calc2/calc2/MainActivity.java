package me.calc2.calc2;

import android.app.Activity;
import android.graphics.Point;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;


public class MainActivity extends Activity {
    String str = "";
    String strParse = "";
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

        int width = getScreenWidth();
        LinearLayout layoutToChange = findLayout();
        setWidth(width, layoutToChange);
        layoutToChange = (LinearLayout) findViewById(R.id.secondaryLayout);
        setWidth(width, layoutToChange);
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
                str = txtOut.getText() + "0";
                strParse = strParse + "0";
                txtOut.setText(str);

            }
        });

        Button btnDigitOne = (findViewById(R.id.btnDigitOne));
        btnDigitOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "1";
                strParse = strParse + "1";
                txtOut.setText(str);

            }
        });

        Button btnDigitTwo = (findViewById(R.id.btnDigitTwo));
        btnDigitTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "2";
                strParse = strParse + "2";
                txtOut.setText(str);

            }
        });

        Button btnDigitThree = (findViewById(R.id.btnDigitThree));
        btnDigitThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "3";
                strParse = strParse + "3";
                txtOut.setText(str);

            }
        });

        Button btnDigitFour = (findViewById(R.id.btnDigitFour));
        btnDigitFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "4";
                strParse = strParse + "4";
                txtOut.setText(str);

            }
        });

        Button btnDigitFive = (findViewById(R.id.btnDigitFive));
        btnDigitFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "5";
                strParse = strParse + "5";
                txtOut.setText(str);

            }
        });

        Button btnDigitSix = (findViewById(R.id.btnDigitSix));
        btnDigitSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "6";
                strParse = strParse + "6";
                txtOut.setText(str);

            }
        });

        Button btnDigitSeven = (findViewById(R.id.btnDigitSeven));
        btnDigitSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "7";
                strParse = strParse + "7";
                txtOut.setText(str);

            }
        });

        Button btnDigitEight = (findViewById(R.id.btnDigitEight));
        btnDigitEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "8";
                strParse = strParse + "8";
                txtOut.setText(str);

            }
        });

        Button btnDigitNine = (findViewById(R.id.btnDigitNine));
        btnDigitNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "9";
                strParse = strParse + "9";
                txtOut.setText(str);

            }
        });

        Button btnDecimal = (findViewById(R.id.btnDecimal));
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + ".";
                strParse = strParse + ".";
                txtOut.setText(str);

            }
        });

        Button btnPlus = (findViewById(R.id.btnPlus));
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "+";
                strParse = strParse + "+";
                txtOut.setText(str);

            }
        });

        Button btnMinus = (findViewById(R.id.btnMinus));
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "-";
                strParse = strParse + "-";
                txtOut.setText(str);

            }
        });

        Button btnMultiply = (findViewById(R.id.btnMultiply));
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "X";
                strParse = strParse + "*";
                txtOut.setText(str);

            }
        });

        Button btnDivide = (findViewById(R.id.btnDivide));
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "÷";
                strParse = strParse + "/";
                txtOut.setText(str);

            }
        });

        Button buttonPi = (findViewById(R.id.buttonPi));
        buttonPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "π";
                strParse = strParse + "pi";
                txtOut.setText(str);

            }
        });

        Button buttonPower = (findViewById(R.id.buttonPower));
        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "^";
                strParse = strParse + "^";
                txtOut.setText(str);

            }
        });

        Button btnSqrt = (findViewById(R.id.btnSqrt));
        btnSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "√(";
                strParse = strParse + "sqrt(";
                txtOut.setText(str);

            }
        });

        Button btnOpenPar = (findViewById(R.id.btnOpenPar));
        btnOpenPar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "(";
                strParse = strParse + "(";
                txtOut.setText(str);

            }
        });

        Button btnClosePar = (findViewById(R.id.btnClosePar));
        btnClosePar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + ")";
                strParse = strParse + ")";
                txtOut.setText(str);

            }
        });

        Button btnSin = (findViewById(R.id.btnSin));
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "sin(";
                strParse = strParse + "sin(";
                txtOut.setText(str);

            }
        });

        Button btnCos = (findViewById(R.id.btnCos));
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "cos(";
                strParse = strParse + "cos(";
                txtOut.setText(str);

            }
        });

        Button btnTan = (findViewById(R.id.btnTan));
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtOut.getText() + "tan(";
                strParse = strParse + "tan(";
                txtOut.setText(str);

            }
        });

        Button btnClear = (findViewById(R.id.btnClear));
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "";
                strParse = "";
                txtOut.setText(str);

            }
        });
        
        //Button remove the previous button clicked
        Button btnDelete = (findViewById(R.id.btnDelete));
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get length of input
                int length = strParse.length()-1;
                //error output
                String delError = "NOTHING TO DELETE";
                //check if there is something to delete
                if(strParse.equals(""))
                    txtOut.setText(delError);
                else {
                    //delete pi if it is last button clicked
                    if (strParse.charAt(length) == 'i') {
                        strParse = strParse.substring(0, strParse.length() - 2);
                        str = str.substring(0, str.length() - 1);
                    }
                        //if ( is last character delete trig function, sqrt or just (
                    else if (strParse.charAt(length) == '(') {
                        //delete trig function
                        if (strParse.charAt(length - 1) == 'n' || strParse.charAt(length - 1) == 's') {
                            strParse = strParse.substring(0, strParse.length() - 4);
                            str = str.substring(0, str.length() - 4);
                            //delete sqrt
                        } else if (strParse.charAt(length - 1) == 't') {
                            strParse = strParse.substring(0, strParse.length() - 5);
                            str = str.substring(0, str.length() - 2);
                        }
                            //delete (
                        else {
                            strParse = strParse.substring(0, strParse.length() - 1);
                            str = str.substring(0, str.length() - 1);
                        }
                    }
                    else {
                        strParse = strParse.substring(0, strParse.length() - 1);
                        str = str.substring(0, str.length() - 1);
                    }



                    txtOut.setText(str);
                }
            }
        });

        //Buttons for previous answers:
        Button btnAns0 = (findViewById(R.id.btnAns0));
        btnAns0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Button button = (Button) findViewById(R.id.btnAns0);
            str = str + button.getText();
            strParse = strParse + button.getText();
            txtOut.setText(strParse);
            }
        });

        Button btnAns1 = (findViewById(R.id.btnAns1));
        btnAns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Button button = (Button) findViewById(R.id.btnAns1);
                str = str + button.getText();
                strParse = strParse + button.getText();
            txtOut.setText(strParse);
            }
        });

        Button btnAns2 = (findViewById(R.id.btnAns2));
        btnAns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Button button = (Button) findViewById(R.id.btnAns2);
                str = str + button.getText();
                strParse = strParse + button.getText();
            txtOut.setText(strParse);
            }
        });

        Button btnAns3 = (findViewById(R.id.btnAns3));
        btnAns3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Button button = (Button) findViewById(R.id.btnAns3);
                str = str + button.getText();
                strParse = strParse + button.getText();
            txtOut.setText(strParse);
            }
        });

        Button btnAns4 = (findViewById(R.id.btnAns4));
        btnAns4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Button button = (Button) findViewById(R.id.btnAns4);
                str = str + button.getText();
                strParse = strParse + button.getText();
            txtOut.setText(strParse);
            }
        });

        Button btnAns5 = (findViewById(R.id.btnAns5));
        btnAns5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Button button = (Button) findViewById(R.id.btnAns5);
                str = str + button.getText();
                strParse = strParse + button.getText();
            txtOut.setText(strParse);
            }
        });

        //Buttons for previous Expressions:
        Button btnExp0 = (findViewById(R.id.btnExp0));
        btnExp0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) findViewById(R.id.btnExp0);
                str = str + button.getText();
                strParse = strParse + button.getText();
                txtOut.setText(strParse);
            }
        });

        Button btnExp1 = (findViewById(R.id.btnExp1));
        btnExp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) findViewById(R.id.btnExp1);
                str = str + button.getText();
                strParse = strParse + button.getText();
                txtOut.setText(strParse);
            }
        });

        Button btnExp2 = (findViewById(R.id.btnExp2));
        btnExp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) findViewById(R.id.btnExp2);
                str = str + button.getText();
                strParse = strParse + button.getText();
                txtOut.setText(strParse);
            }
        });

        Button btnExp3 = (findViewById(R.id.btnExp3));
        btnExp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) findViewById(R.id.btnExp3);
                str = str + button.getText();
                strParse = strParse + button.getText();
                txtOut.setText(strParse);
            }
        });

        Button btnExp4 = (findViewById(R.id.btnExp4));
        btnExp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) findViewById(R.id.btnExp4);
                str = str + button.getText();
                strParse = strParse + button.getText();
                txtOut.setText(strParse);
            }
        });

        Button btnExp5 = (findViewById(R.id.btnExp5));
        btnExp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) findViewById(R.id.btnExp5);
                str = str + button.getText();
                strParse = strParse + button.getText();
                txtOut.setText(strParse);
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
                  //newExp.setText(txtOut.getText());
                    newExp.setText(strParse);
                }
                //Error warning for syntax error and divide by zero
                String userError = "USER ERROR";
                //continuing with calculation:
                Expression e = new Expression(strParse);
                double val = e.calculate();
                String s = Double.toString(val);
                if(s.equals("NaN")){
                    txtOut.setText(userError);
                }
                else{
                    txtOut.setText(s);
                    str = s;
                    strParse = s;
                }
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

    public int getScreenWidth() {
        int screenWidth;
        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        return screenWidth = size.x;
    }

    public LinearLayout findLayout() {
        LinearLayout layout;
        return layout = (LinearLayout) findViewById(R.id.primaryLayout);
    }

    public void setWidth( int screenWidth, LinearLayout layoutToSet) {
        Point size = new Point();
        int statusBarHeight = getStatusBarHeight();
        int textViewHeight = findViewById(R.id.textView).getMeasuredHeight();
        getWindowManager().getDefaultDisplay().getSize(size);
        ViewGroup.LayoutParams params = layoutToSet.getLayoutParams();
        if(size.x < size.y)
        {
            params.width = screenWidth;
        }
        else
        {
            params.width = (int) (.5 * screenWidth);
        }
        params.height = (size.y - statusBarHeight - textViewHeight);
    }

    public int getStatusBarHeight() {
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }
    //Function for changing activities
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

