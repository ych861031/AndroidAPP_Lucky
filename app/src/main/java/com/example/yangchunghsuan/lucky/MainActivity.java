package com.example.yangchunghsuan.lucky;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        go = findViewById(R.id.button_Go);
    }

    int ranNum;
    public void fn_lucky(View v){
        Random random = new Random();
        ranNum = random.nextInt(6)+1;
        Log.i("LuckyNumber",Integer.toString(ranNum));
        textView.setText(Integer.toString(ranNum));
        go.setEnabled(true);
    }



}
