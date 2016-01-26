package com.qlh.yueshop.ui.componet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class ProgressBarHelper extends LinearLayout {

	public Context context;
	private LayoutInflater inflater;
	
	
	/*public ProgressBarHelper(Context context) {
		super(context);
	}*/
	
	public ProgressBarHelper(Context paramContext,AttributeSet paramAttributeSet){
		super(paramContext, paramAttributeSet);
		this.context = paramContext;
		this.inflater = LayoutInflater.from(paramContext);
		
	}
	
	
	public static abstract interface ProgressBarClickListener
	  {
	    public abstract void clickRefresh();

	    public abstract void refreshLoginStatus();
	  }

}
