package com.inhatc.finaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JoinActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnJoinBefore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        btnJoinBefore=(Button)findViewById(R.id.btnJoinBefore);
        btnJoinBefore.setOnClickListener(this);
    }

    public void onClick(View v){
        if(v==btnJoinBefore){
            finish();
        }
    }
}