package com.example.yangchunghsuan.lucky;

import android.accounts.AccountManagerCallback;
import android.content.Intent;
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

    public void fn_nextPage(View v){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("n",ranNum);
        startActivityForResult(intent,111);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(data == null){
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){
            case 111:
                int like = data.getIntExtra("Like",1);
                if(like==1){
                    textView.setText("Happy!");
                }else{
                    textView.setText("Try Again");
                }
                break;
        }
    }
}
