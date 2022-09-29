package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        // intentを取得する
        Intent intent = getIntent();
        // 設定したキーで呼び出す
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        // テキストのIDをRclassから呼び出す
        TextView textView = findViewById(R.id.textView3);
        // MainActivityで定義したmessageを呼び出す
        textView.setText(message);

    }
}