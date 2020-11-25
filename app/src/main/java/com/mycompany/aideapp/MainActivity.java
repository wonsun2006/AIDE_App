package com.mycompany.aideapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.support.v4.view.ViewPager;
import android.support.v4.view.PagerAdapter;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		final ViewPager viewPager = findViewById(R.id.viewpager); 
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
