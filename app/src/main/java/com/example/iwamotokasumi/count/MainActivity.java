package com.example.iwamotokasumi.count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //現在のカウントを表示させるためのテキストビュー
    TextView text;
    //現在の値を保存しておくための変数
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView)findViewById(R.id.textView);
        text.setText("0");
    }
    //プラスというボタンの命令
    public void plus(View v){
        number = number + 1;
        //テキストにnumberの値を表示
        text.setText(String.valueOf(number));
    }
    public void minus(View v){
        number  = number - 1;
        text.setText(String.valueOf(number));
    }
    public void kakeru(View v){
        number = number * 2;
        text.setText(String.valueOf(number));
    }
    public void waru(View v){
        number = number / 2;
        text.setText(String.valueOf(number));
    }
}
