package com.inhatc.finaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class JoinActivity extends AppCompatActivity implements View.OnClickListener {
    // 버튼 정의
    private Button btnJoinBefore;
    private Button btnCheck;
    private Button btnResister;

    // TextInputEditText 정의
    private TextInputEditText joinID;
    private TextInputEditText joinPW;
    private TextInputEditText joinCheckPW;
    private TextInputEditText joinName;
    private TextInputEditText joinEmail;

    // TextInputLayout
    private TextInputLayout inputEmail;

    // 변수 선언
    private String id;
    private String PW;
    private String checkPW;
    private String name;
    private String email;
    
    // 검사 여부 알려주는 곳
    private TextView txtCheckID;
    private TextView txtCheckPW;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        // 버튼 연결
        btnJoinBefore=(Button)findViewById(R.id.btnJoinBefore);
        btnResister=(Button)findViewById(R.id.btnResister);
        btnCheck=(Button)findViewById(R.id.btnCheck);

        // txt 각각 연결
        joinID=(TextInputEditText)findViewById(R.id.loginID);
        joinPW=(TextInputEditText)findViewById(R.id.joinPW);
        joinCheckPW=(TextInputEditText)findViewById(R.id.joinCheckPW);
        joinName=(TextInputEditText)findViewById(R.id.joinName);
        joinEmail=(TextInputEditText)findViewById(R.id.joinEmail);
        
        // TextInputLayout 연결
        inputEmail=(TextInputLayout)findViewById(R.id.textInputLayout42);
        
        // TextView 연결
        txtCheckID=(TextView)findViewById(R.id.txtCheckID);
        txtCheckPW=(TextView)findViewById(R.id.txtCheckPW);

        // 핸들러 작동
        btnCheck.setOnClickListener(this);
        btnResister.setOnClickListener(this);
        btnJoinBefore.setOnClickListener(this);

        

        // 글씨가 입력 될 때마다 실행
        joinEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().contains("@")) { // 이메일 형식 검사
                    inputEmail.setError("@을 포함한 이메일 형식 작성");
                } else {
                    inputEmail.setError(null);
                }

            }
        });
    }

    public void onClick(View v){
        // 변수 선언
        id=joinID.getText().toString();
        PW=joinPW.getText().toString();
        checkPW=joinCheckPW.getText().toString();
        name=joinName.getText().toString();
        email=joinEmail.getText().toString();

        if(v==btnJoinBefore){ // 이전 버튼을 눌렀을 때
            finish();
            // 원래 MainActivity 즉, 로그인 화면으로 가기
        }else if(v==btnCheck){ // 아이디 중복 확인했을 때
            txtCheckID.setText(id+PW+checkPW+name+email);
        }else if(v==btnResister){ // 회원가입 버튼을 눌렀을 때
            txtCheckID.setText(id+PW+checkPW+name+email);
        }
    }
}