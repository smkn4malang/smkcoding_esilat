package com.dycode.edu.e_silat;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class homeActivity extends AppCompatActivity {
    /*@BindView(R.id.frame_container)
    FrameLayout frameContainer;
    @BindView(R.id.btn_latihan)
    Button btnlatihan;
    @BindView(R.id.btn_seni)
    Button Btnseni;
    @BindView(R.id.btn_sejarah)
    Button Btsejarah;
    @BindView(R.id.btn_tanding)*/
    //Button Btntanding;
    //@BindView(R.id.btn_setting)
    //Button Btnsetting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);


        FragmentManager fm = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.frame_container, new latihan());
        fragmentTransaction.add(R.id.frame_container, new seni());
        fragmentTransaction.add(R.id.frame_container, new sejarah());
        fragmentTransaction.add(R.id.frame_container, new tanding());
       // fragmentTransaction.add(R.id.head, new setting());
        fragmentTransaction.commit();
    }

    /*@OnClick(R.id.btn_latihan)
    public void onBtnFragment1Clicked() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, new latihan());
        fragmentTransaction.commit();
    }

    @OnClick(R.id.btn_seni)
    public void onBtnFragment2Clicked() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, new seni());
        fragmentTransaction.commit();
    }

    @OnClick(R.id.btn_sejarah)
    public void onBtnFragment3Clicked() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, new sejarah());
        fragmentTransaction.commit();
    }

    @OnClick(R.id.btn_tanding)
    public void onBtnFragment4Clicked() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, new tanding());
        fragmentTransaction.commit();
    }

    @OnClick(R.id.btn_setting)
    public void onBtnFragment5Clicked() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.head, new setting());
        fragmentTransaction.commit();
    }*/
}
