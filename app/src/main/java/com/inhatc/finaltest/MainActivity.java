package com.inhatc.finaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnLogin;
    private Button btnJoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnJoin = (Button)findViewById(R.id.btnJoin);

        btnLogin.setOnClickListener(this);
        btnJoin.setOnClickListener(this);
    }

    public void onClick(View v){
        if(v==btnJoin){ // join 화면
            Intent intent = new Intent(MainActivity.this, JoinActivity.class);
            startActivity(intent);
        }
        else if(v==btnLogin){ // login 화면

        }
    }

}