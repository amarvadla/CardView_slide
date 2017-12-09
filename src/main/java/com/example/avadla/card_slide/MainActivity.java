package com.example.avadla.card_slide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ViewPager mViewPager;
    TabLayout tabLayout;
    String[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        array  = new String[]{"Get an extra bonus upto 500 fan coins", "Get an extra bonus upto 600 fan coins", "Get an extra bonus upto 700 fan coins", "Get an extra bonus upto 800 fan coins", "Get an extra bonus upto 900 fan coins"};

        findViews();
        setUpViewPager();
        setTabLayout();

    }


    public class SamplePagerAdapter extends FragmentPagerAdapter {

        public SamplePagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {

            switch (position){
                case 0:
                    return SampleFragment.newInstance(array[position]);
                case 1:
                    return SampleFragment.newInstance(array[position]);
                case 2:
                    return SampleFragment.newInstance(array[position]);
                case 3:
                    return SampleFragment.newInstance(array[position]);
                case 4:
                    return SampleFragment.newInstance(array[position]);
                default:
                    return null;
            }

        }

        @Override
        public int getCount() {
            return 5;
        }

    }

    void findViews(){
        mViewPager = (ViewPager) findViewById(R.id.pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_dots);
    }

    void setUpViewPager(){
        mViewPager.setAdapter(new SamplePagerAdapter(getSupportFragmentManager()));
        mViewPager.setClipToPadding(false);
        mViewPager.setPadding(60,0,60,0);
        mViewPager.setPageMargin(40);
    }

    void setTabLayout(){
        tabLayout.setupWithViewPager(mViewPager, true);
    }
}