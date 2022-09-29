package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        // 遷移の設定
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        // editTextのIDをRclassから呼び出す
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName3);
        // editText内のstringを取得
        String message = editText.getText().toString();
        // key(EXTRA_MESSAGE)を利用して、value(message)を設定する
        intent.putExtra(EXTRA_MESSAGE, message);
        // 遷移開始
        startActivity(intent);
    }

}