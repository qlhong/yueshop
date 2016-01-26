package com.qlh.yueshop.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import butterknife.ButterKnife;

import com.qlh.yueshop.ui.componet.ProgressBarHelper.ProgressBarClickListener;
import com.qlh.yueshop.ui.lib.app.SwipeBackActivity;

public abstract class BaseActivity extends Activity{

	
	protected Context context;
	
	protected abstract int getLayoutResource();
	
	protected Toolbar toolbar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.context = this;
		setRequestedOrientation(Window.FEATURE_NO_TITLE);
		setContentView(getLayoutResource());
		ButterKnife.inject(this);
	}

	/*public static void launch(BaseActivity paramBaseActivity, View paramView,
			String paramString) {
		ActivityOptionsCompat localActivityOptionsCompat = ActivityOptionsCompat
				.makeSceneTransitionAnimation(paramBaseActivity, paramView,
						"DetailActivity:image");
		Intent localIntent = new Intent(paramBaseActivity, MainActivity.class);
		localIntent.putExtra("DetailActivity:image", paramString);
		ActivityCompat.startActivity(paramBaseActivity, localIntent,
				localActivityOptionsCompat.toBundle());
	}*/
	
	public void clickRefresh(){}
	public void refreshLoginStatus(){}
	
	public void openActivity(Class<?> pclass ){
		openActivity(pclass,null);
	}
	public void openActivity(Class<?> pclass,Bundle bundle){
		Intent intent = new Intent(context,pclass);
		if(bundle!=null){
			intent.putExtras(bundle);
		}
		startActivity(intent);
	}
}
 