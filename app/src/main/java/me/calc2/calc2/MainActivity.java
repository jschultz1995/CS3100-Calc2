package me.calc2.calc2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;


public class MainActivity extends Activity {
    String str = "";
    private TextView txtOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOut = findViewById(R.id.textView);


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

        Button btnEquals = (findViewById(R.id.btnEquals));
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Expression e = new Expression(str);
                double val = e.calculate();
                String s = Double.toString(val);
                txtOut.setText(s);
                str = s;
            }
        });

    }
}
