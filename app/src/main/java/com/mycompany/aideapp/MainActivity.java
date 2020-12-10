package com.mycompany.aideapp;



import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager; 
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity { 
	private ViewPager viewPager;
	private TabLayout tabLayout; 

	@Override 
	protected void onCreate(Bundle savedInstanceState) { 
	super.onCreate(savedInstanceState); 
	setContentView(R.layout.main); 
	tabLayout=(TabLayout)findViewById(R.id.tabLayout); 
	tabLayout.addTab(tabLayout.newTab().setText("1번")); 
	tabLayout.addTab(tabLayout.newTab().setText("2번")); 
	tabLayout.addTab(tabLayout.newTab().setText("3번")); 
	viewPager=(ViewPager)findViewById(R.id.viewPager); 
	viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager())); 
	viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout)); 
	tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
		
		@Override
		public void onTabSelected(TabLayout.Tab tab) { 
			viewPager.setCurrentItem(tab.getPosition()); 
		} 
		
		@Override 
		public void onTabUnselected(TabLayout.Tab tab) {
			
		} 
		
		@Override 
		public void onTabReselected(TabLayout.Tab tab) {
		
		}
		
		});
	
	}
}

/*

import android.app.*;
import android.os.*;
import android.view.*;
import android.support.v4.view.ViewPager;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		final ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager); 
		viewPager.setAdapter(new MyPagerAdapter());
		viewPager.setCurrentItem(0); 
		
    }
	
	private class MyPagerAdapter extends PagerAdapter {
		public int getCount() { 
		//Total pages
	    return 3; 
		} 
	
		public Object instantiateItem(View collection, int position) { 
	    	int[] resId = { 
				R.layout.page1, 
				R.layout.page2, 
				R.layout.page3
			}; 
			
			View view = getLayoutInflater().inflate(resId[position], null);
			((ViewPager)collection).addView(view, 0); 
			return view; 
		} 
	
		@Override 
		public void destroyItem(View arg0, int arg1, Object arg2) { 
		    ((ViewPager) arg0).removeView((View) arg2);
		} 
	
		@Override 
		public boolean isViewFromObject(View arg0, Object arg1) { 
	   		return arg0 == ((View) arg1); 
		} 
	
		@Override 
		public Parcelable saveState() { 
			return null; 
		}
	
	}
	
}
*/

