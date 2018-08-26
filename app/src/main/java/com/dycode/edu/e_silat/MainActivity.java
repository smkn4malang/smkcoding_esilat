package com.dycode.edu.e_silat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final int RC_INPUT= 120;
    @BindView(R.id.fu)
    Button btnFu;
    @BindView(R.id.log)
    Button btnLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.fu)
    public void onViewClicked(){
        Intent intent = new Intent(this,homeActivity.class);
        startActivityForResult(intent,RC_INPUT);
    }


    @OnClick(R.id.log)
    public void onViewClicked2() {
        Intent intent = new Intent(this,loginActivity.class);
        startActivityForResult(intent,RC_INPUT);
    }

}
