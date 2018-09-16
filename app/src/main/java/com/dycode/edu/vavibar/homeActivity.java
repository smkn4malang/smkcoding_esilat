package com.dycode.edu.vavibar;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class homeActivity extends AppCompatActivity {
//    @BindView(R.id.pager)
//    ViewPager viewpager;
//    @BindView(R.id.navigation)
//    BottomNavigationView botview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        ButterKnife.bind(this);

    }
}

