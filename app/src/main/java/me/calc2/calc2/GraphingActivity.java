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

public class GraphingActivity extends Activity {

    String str = "";
    private TextView txtOut;
    RadioButton rdbStandard;
    RadioButton rdbBinary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphing);
        txtOut = findViewById(R.id.textView);

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

        //TODO: Actual functionality
    }

    // Changing Activities, Currently defaults to BinaryActivity
    private void launchActivity() {

        Intent intent = new Intent(this, BinaryActivity.class);
        startActivity(intent);
    }
}
