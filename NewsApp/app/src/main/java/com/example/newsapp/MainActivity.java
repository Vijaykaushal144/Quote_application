package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
TabLayout tablayout;
TabItem  mhome,mscience,mhealth,mtech,menjoy,msport;
PagerAdapter pageradapter;
Toolbar mtoolbar;
ViewPager viewpager;

//for  news api

    String api="afa6785eac6a413789a29810665b1b0b";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtoolbar= findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);

        mhome =findViewById(R.id.home);
        mscience=findViewById(R.id.science);
        mhealth=findViewById(R.id.health);
        mtech =findViewById(R.id.technology);
        menjoy=findViewById(R.id.entertainment);
        msport=findViewById(R.id.sport);
        viewpager =findViewById(R.id.fragmentcontainer);
        tablayout=findViewById(R.id.include);

        pageradapter= new PagerAdapter(getSupportFragmentManager(),6);
        viewpager.setAdapter(pageradapter);

        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5)
                {
                    pageradapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
         viewpager.addOnPageChangeListener( new TabLayout.TabLayoutOnPageChangeListener(tablayout));



    }
}