package com.qlh.yueshop.ui.fragment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TabHost;

public class MyFragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

	private OnTabClickListener onTabClickListener;
	
	
	private TabHost.OnTabChangeListener mOnTabChangeListener;
	public MyFragmentTabHost(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public void onTabChanged(String tabId) {
	}
	
	
	
	public static abstract interface OnTabClickListener{
		public abstract boolean checkLogin(String paramString);
	    public abstract void setCurrentTabByIndex(int paramInt);
	    public abstract void setCurrentTabByTag(String paramString);
	    public abstract void setTabViewBageTips(int paramInt1, int paramInt2);
	}

}
