package me.calc2.calc2;

import android.content.Context;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.mariuszgromada.math.mxparser.*;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import java.lang.Math;

import static me.calc2.calc2.R.id.editEqn;


public class GraphingActivity extends Activity {
    boolean clearBtn = false;
    String str = "";
    private TextView txtOut;
    RadioButton rdbStandard;
    RadioButton rdbBinary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphing);
        txtOut = findViewById(R.id.editEqn);

        // Radio button layout changing
        rdbStandard = findViewById(R.id.rdbStandard);
        rdbStandard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        rdbBinary = findViewById(R.id.rdbBinary);
        rdbBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                launchActivity();


            }
        });


        //////////////////////////////////////////
        //Graphing Activity Button Functionality//
        //////////////////////////////////////////

        Button btn = (Button) findViewById(R.id.button);
        Button  btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(GraphingActivity.this, GraphingActivity.class));
//                clearBtn = true;
//                rdbStandard.performClick();
            }

        });
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String userError = "USER ERROR";
                Argument eArg = new Argument("x");
                Expression e = new Expression(txtOut.getText().toString(), eArg);
                double x,y;
                x = -20;

                GraphView graph=(GraphView) findViewById(R.id.graph);
                LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>();

//                if(clearBtn == true) {
//                    graph.removeAllSeries();
//
//                    clearBtn = false;
//                    Log.d("CLICK", "HERE WE ARE!");
//                }

                for(int i = 0; i < 400; i++) {
                    x = x + 0.1;
                    eArg.setArgumentValue(x);
                    y = e.calculate();
                    String s = Double.toString(y);
                    if(s.equals("NaN")){
                        txtOut.setText(userError);
                    }
                    else{
                        series.appendData(new DataPoint(x,y),true,400);
                    }

                }
                graph.addSeries(series);



            }
        });
    }

    // Changing Activities, Currently defaults to BinaryActivity
    private void launchActivity() {

        Intent intent = new Intent(this, BinaryActivity.class);
        startActivity(intent);
    }
}
