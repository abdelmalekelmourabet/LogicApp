package com.example.logicaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mAnswer1;
    private EditText mAnswer2;
    private EditText mAnswer3;
    private EditText mAnswer4;
    private Button mSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mAnswer1 = findViewById(R.id.editText1);
        mAnswer2 = findViewById(R.id.editText2);
        mAnswer3 = findViewById(R.id.editText3);
        mAnswer4 = findViewById(R.id.editText4);
        mSubmit = findViewById(R.id.buttonSubmit);

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkInput();
            }
        });
    }

    private void checkInput() {
        String answer1 = mAnswer1.getText().toString();
        String answer2 = mAnswer2.getText().toString();
        String answer3 = mAnswer3.getText().toString();
        String answer4 = mAnswer4.getText().toString();

        if (answer1.equalsIgnoreCase("T") && answer2.equalsIgnoreCase("F") &&
                answer3.equalsIgnoreCase("F") && answer4.equalsIgnoreCase("F")) {
            correctAnswer();
        } else incorrectAnswer();

    }

    private void correctAnswer() {
        Toast.makeText(this, "Answer is correct", Toast.LENGTH_SHORT).show();
    }

    private void incorrectAnswer() {
        Toast.makeText(this, "Answer is not correct", Toast.LENGTH_SHORT).show();
    }
}
