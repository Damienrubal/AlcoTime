package com.example.damin.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.damin.myapplication.Fragment.Fragment1;
import com.example.damin.myapplication.Fragment.Fragment2;
import com.example.damin.myapplication.Fragment.Fragment3;

/**
 * Created by damin on 25/01/2017.
 */

public class PersonalActivity extends AppCompatActivity {

    private Toolbar mytoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexionok);

        mytoolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mytoolbar);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));

        final TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);



       ImageView imageView = (ImageView) findViewById(R.id.imageButton);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalActivity.this, AlcoolActivity.class);
                startActivity(intent);
            }
        });

    }

    class PagerAdapter extends FragmentPagerAdapter {
        private final String tabTitles[] = new String[]{"Tab1", "Tab2", "Tab3"};
        private final static int PAGE_COUNT = 3;

        PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    Fragment1 fragment1 = new Fragment1();
                    return fragment1;
                case 1:
                    Fragment2 fragment2 = new Fragment2();
                    return fragment2;
                case 2:
                    Fragment3 fragment3 = new Fragment3();
                    return fragment3;
            }
            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitles[position];
        }
    }
}
