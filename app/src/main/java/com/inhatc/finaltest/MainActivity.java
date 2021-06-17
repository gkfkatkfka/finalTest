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
            Intent joinIntent = new Intent(MainActivity.this, JoinActivity.class);
            startActivity(joinIntent);
        }
        else if(v==btnLogin){ // login 화면
            // 우선 그냥 다음 화면으로 넘어가는 걸로 해놓음
            Intent loginIntent=new Intent(MainActivity.this,TabActivity.class);
            loginIntent.putExtra("id","haram");
            startActivity(loginIntent);
        }
    }

}