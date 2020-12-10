package com.mycompany.aideapp;

import android.support.v4.app.Fragment; 
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter; 
import java.util.ArrayList; 
import java.util.List; 

public class PagerAdapter extends FragmentStatePagerAdapter {
	List<Fragment> fragments=new ArrayList<>();
	public PagerAdapter(FragmentManager fm) { 
		super(fm); 
		fragments.add(new Fragment1()); 
		fragments.add(new Fragment2()); 
		fragments.add(new Fragment3()); 
	}
		
	@Override 
	public Fragment getItem(int i) { 
	return fragments.get(i); 
	} 
	
	@Override 
	public int getCount() { 
	return fragments.size();
	}
}
