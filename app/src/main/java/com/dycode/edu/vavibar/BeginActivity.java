package com.dycode.edu.vavibar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BeginActivity extends AppCompatActivity {

    private static final int RC_INPUT= 120;
    @BindView(R.id.fu)
    Button btnFu;
    @BindView(R.id.log)
    Button btnLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.fu)
    public void onViewClicked1() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivityForResult(intent,RC_INPUT);
    }

    @OnClick(R.id.log)
    public void onViewClicked2() {
        Intent intent = new Intent(this,loginActivity.class);
        startActivityForResult(intent,RC_INPUT);
    }

}
