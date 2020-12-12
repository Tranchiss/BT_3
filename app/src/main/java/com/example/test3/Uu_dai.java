package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class Uu_dai extends AppCompatActivity {

    private TabLayout nTabLayout;
    private ViewPager nViewPager;
    ImageView im;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uu_dai);

        im = (ImageView) findViewById(R.id.back2);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Uu_dai.this, MainActivity.class);
                startActivity(intent);
            }
        });

        nTabLayout =findViewById(R.id.tab_layout1);
        nViewPager = findViewById(R.id.view_pager1);


        ViewpagerAdapter1 viewpagerAdapter1 = new ViewpagerAdapter1(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        nViewPager.setAdapter(viewpagerAdapter1);

        nTabLayout.setupWithViewPager(nViewPager);

    }
}