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

        //TODO: Actual functionality
    }

    // Changing Activities, Currently defaults to GraphingActivity
        private void launchActivity() {

            Intent intent = new Intent(this, GraphingActivity.class);
            startActivity(intent);
        }
}
