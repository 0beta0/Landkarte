package com.example.landkarte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        findViewById(R.id.button).setOnClickListener(this);

    }

    //ボタンが押された時の処理
    public void onClick(View view){
        Intent intent = new Intent(this, BattleActivity.class);  //インテントの作成
        startActivity(intent);                                 //画面遷移
    }
}