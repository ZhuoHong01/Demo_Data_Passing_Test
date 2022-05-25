package sg.edu.rp.c346.id21018193.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Step 2
        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value", 0.00);
        tvAnswer.setText("Double value received is: " + value);
    }
}