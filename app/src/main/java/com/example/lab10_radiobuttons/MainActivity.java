package com.example.lab10_radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rGroup;
    RadioButton rbGold, rbPrime, rbGuest;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rGroup = findViewById(R.id.rGroup);
        rbGold = findViewById(R.id.RGold);
        rbPrime = findViewById(R.id.rPrime);
        rbGuest = findViewById(R.id.rGuest);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = rGroup.getCheckedRadioButtonId();
                switch (selectedId){
                    case R.id.RGold:
                        Toast.makeText(MainActivity.this,
                                rbGold.getText().toString()+" is selected",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rPrime:
                        Toast.makeText(MainActivity.this,
                                rbPrime.getText().toString()+" is selected",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rGuest:
                        Toast.makeText(MainActivity.this,
                                rbGuest.getText().toString()+" is selected",
                                Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this,
                                "Nothing selected", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}