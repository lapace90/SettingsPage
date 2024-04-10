package com.example.settingspage;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;



import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Switch switch1, switch2;
    private RadioGroup radioGrp;
    private RadioButton radio1, radio2;
    private CheckBox checkBox1, checkBox2, checkBox3;
    private Button btnValid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = findViewById(R.id.switch1);
        switch2 = findViewById(R.id.switch2);

        switch1.setEnabled(true);
        switch1.setChecked(false);
        switch1.setClickable(true);

        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    switch1.setTextColor(Color.GREEN);

                } else {
                    switch1.setTextColor(Color.GRAY);
                }
            }
        });

        switch2.setEnabled(true);
        switch2.setChecked(false);
        switch2.setClickable(true);

        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    switch2.setTextColor(Color.GREEN);

                } else {
                    switch2.setTextColor(Color.GRAY);
                }

            }
        });

        radioGrp = findViewById(R.id.radioGrp);
        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);

        radioGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radio1) {
                    Toast.makeText(MainActivity.this, "Check_Radio1", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Check_Radio2", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);

        checkBox1.setEnabled(true);
        checkBox1.setChecked(false);
        checkBox2.setEnabled(true);
        checkBox2.setChecked(false);
        checkBox3.setEnabled(true);
        checkBox3.setChecked(false);

        btnValid = findViewById(R.id.btnValid);
        btnValid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBox1.setText("OK");
                checkBox1.setChecked(false);
            }
        });
    }
}