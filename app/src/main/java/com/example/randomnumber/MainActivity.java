package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View view){

        TextView randomNumberFinal = findViewById(R.id.randomNumber);
        Random r = new Random();
        int i1 = r.nextInt(100 -0)+0;

        randomNumberFinal.setText(String.valueOf(i1));

    }

}
