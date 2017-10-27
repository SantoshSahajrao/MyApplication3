package com.example.ravi.myapplication;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ActionBar actionBar;
    private Toolbar toolbar;
    private FrameLayout frameLayout;
    boolean doubleBackToExitPresedOnce=false;
    private DrawerLayout mDrawerlayout;
    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createTabLayout();


    }
    void createTabLayout()
    {

        coordinatorLayout=(CoordinatorLayout)findViewById(R.id.container);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBar=getSupportActionBar();



        MyPager adapter=new MyPager(getSupportFragmentManager());
        ViewPager vp=(ViewPager)findViewById(R.id.viewpager);
        vp.setAdapter(adapter);

        tabLayout=(TabLayout) findViewById(R.id.tl);
        tabLayout.setupWithViewPager(vp);


    }
}
