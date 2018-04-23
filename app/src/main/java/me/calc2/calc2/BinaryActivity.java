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

public class BinaryActivity extends Activity {

    String str = "";
    private TextView txtOut;
    RadioButton rdbStandard;
    RadioButton rdbGraphing;

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

        //TODO: Clean up the F****** GUI
        
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

        Button btnEquals = (findViewById(R.id.btnEquals));
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //starting up previous expression saving:
//                String name = "btnExp" + expressionNumber;
//                int id = getResources().getIdentifier(name,"id", getPackageName());
//                if(id != 0)
//                {
//                    TextView newExp = (TextView) findViewById(id);
//                    newExp.setText(txtOut.getText());
//                }
                //continuing with calculation:
                Expression e = new Expression(str);
                int val = (int)e.calculate();

                String s = Integer.toBinaryString(val);
                txtOut.setText(s);
                str = s;
                //adding answer to the appropriate button:
//                name = "btnAns" + expressionNumber;
//                id = getResources().getIdentifier(name,"id", getPackageName());
//                if(id != 0)
//                {
//                    Button button = (Button) findViewById(id);
//                    button.setText(s);
//               }
                //updating the expression value:
//                ++expressionNumber;
//                if(expressionNumber == 6)
//                {
//                    expressionNumber = 0;
//                }
            }
        });
    }

    // Changing Activities, Currently defaults to GraphingActivity
        private void launchActivity() {

            Intent intent = new Intent(this, GraphingActivity.class);
            startActivity(intent);
        }
}
