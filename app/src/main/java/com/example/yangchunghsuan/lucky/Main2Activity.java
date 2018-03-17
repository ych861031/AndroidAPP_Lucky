package com.example.yangchunghsuan.lucky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = findViewById(R.id.imageView);

        Intent intent = getIntent();
        int luckyNumber = intent.getIntExtra("n",1);
        Log.i("lucky number get",String.valueOf(luckyNumber));


        switch (luckyNumber){
            case 1:
                imageView.setImageResource(R.drawable.f1);
                break;
            case 2:
                imageView.setImageResource(R.drawable.f2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.f3);
                break;
            case 4:
                imageView.setImageResource(R.drawable.f4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.f5);
                break;
            default:
                imageView.setImageResource(R.drawable.f6);
                break;

        }
    }

    public void fn_like(View v){
        Intent i = new Intent();
        i.putExtra("Like",1);
        setResult(RESULT_OK,i);
        finish();
    }
    public void fn_dislike(View v){
        Intent i = new Intent();
        i.putExtra("Like",0);
        setResult(RESULT_OK,i);
        finish();
    }
}
