package com.dycode.edu.e_silat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class loginActivity extends AppCompatActivity {

    private static final int RC_INPUT= 120;
    @BindView(R.id.signIn)
    Button btnsignIn;
    @BindView(R.id.signUp)
    Button btnsignUp;
    @BindView(R.id.forget)
    Button btnFgt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }
    //@OnClick(R.id.signIn)
    //public void onViewClicked() {
    //    Intent intent = new Intent(this,loginActivity.class);
    //    startActivityForResult(intent,RC_INPUT);
    //}

    @OnClick(R.id.signUp)
    public void onViewClicked() {
        Intent intent = new Intent(this,signup.class);
        startActivityForResult(intent,RC_INPUT);
    }

    @OnClick(R.id.forget)
    public void Clicked() {
        Intent intent = new Intent(this,forgetActivity.class);
        startActivityForResult(intent,RC_INPUT);
    }
}
