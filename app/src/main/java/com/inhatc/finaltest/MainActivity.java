package com.inhatc.finaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // 버튼 정의
    private Button btnLogin;
    private Button btnJoin;

    // txt 정의
    private TextInputEditText loginID;
    private TextInputEditText loginPW;

    private String id;
    private String pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 버튼 연결
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnJoin = (Button)findViewById(R.id.btnJoin);

        // 텍스트 연결
        loginID=(TextInputEditText)findViewById(R.id.loginID);
        loginPW=(TextInputEditText)findViewById(R.id.logonPW);

        // 글씨 뽑아내기
        id=loginID.getText().toString();
        pw=loginPW.getText().toString();

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