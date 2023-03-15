package com.eronen.viikko8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editNumber1;
    private EditText editNumber2;
    private TextView textOutput;

    private int number1;
    private int number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNumber1 = findViewById(R.id.editNumber);
        editNumber2 = findViewById(R.id.editNumber2);
        textOutput = findViewById(R.id.textViewOutput);

    }

    public void plusNumbers(View view) {
        number1 = Integer.parseInt(editNumber1.getText().toString());
        number2 = Integer.parseInt(editNumber2.getText().toString());

        StringBuilder sb = new StringBuilder(Integer.toString(number1+number2));
        textOutput.setText(sb.toString());

    }

    public void minusNumbers(View view) {
        number1 = Integer.parseInt(editNumber1.getText().toString());
        number2 = Integer.parseInt(editNumber2.getText().toString());

        StringBuilder sb = new StringBuilder(Integer.toString(number1-number2));
        textOutput.setText(sb.toString());

    }

    public void multiplyNumbers(View view) {
        number1 = Integer.parseInt(editNumber1.getText().toString());
        number2 = Integer.parseInt(editNumber2.getText().toString());

        StringBuilder sb = new StringBuilder(Integer.toString(number1*number2));
        textOutput.setText(sb.toString());

    }

    public void divideNumbers(View view) {
        number1 = Integer.parseInt(editNumber1.getText().toString());
        number2 = Integer.parseInt(editNumber2.getText().toString());

        StringBuilder sb = new StringBuilder(Integer.toString(number1/number2));
        textOutput.setText(sb.toString());

    }

}