package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView workingsTV;
    TextView resultsTV;

    String workings = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextView();
    }

    private void initTextView()
    {
        workingsTV = (TextView)findViewById(R.id.workingTextView);
        resultsTV = (TextView)findViewById(R.id.resultTextView);
    }

    private void setWorkings(String givenValue)
    {
        workings = workings + givenValue;
        workingsTV.setText(workings);
    }

    public void clearOnClick(View view) {
    }

    public void divideOnClick(View view) {
    }

    public void sevenOnClick(View view) {
    }

    public void eightOnClick(View view) {
    }

    public void nineOnClick(View view) {
    }

    public void multiplyOnClick(View view) {
    }

    public void fourOnClick(View view) {
    }

    public void fiveOnClick(View view) {
    }

    public void sixOnClick(View view) {
    }

    public void minusOnClick(View view) {
    }

    public void oneOnClick(View view) {
    }

    public void twoOnClick(View view) {
    }

    public void threeOnClick(View view) {
    }

    public void plusOnClick(View view) {
    }

    public void decimalOnClick(View view) {
    }

    public void zeroOnClick(View view) {
    }

    public void equalOnClick(View view) {
    }
}