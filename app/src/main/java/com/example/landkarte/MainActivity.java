package com.example.landkarte;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{  //クリックリスナーを実装

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);  //リスナーをボタンに登録

    }

    //ボタンが押された時の処理
    public void onClick(View view){
        //ここに遷移するための処理を追加する
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}