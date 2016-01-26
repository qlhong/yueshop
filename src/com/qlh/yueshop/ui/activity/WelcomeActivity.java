package com.qlh.yueshop.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import butterknife.ButterKnife;
import butterknife.InjectView;

import com.qlh.yueshop.R;
import com.qlh.yueshop.ui.componet.ProgressBarHelper.ProgressBarClickListener;
import com.qlh.yueshop.ui.lib.app.SwipeBackActivity;

public class WelcomeActivity extends Activity {
// SwipeBackActivity implements ProgressBarClickListener
	private Animation mFadeIn;
	protected Context context;
	
	@InjectView(R.id.iv_loadingpage)
	ImageView mIvLandingpage;
	
	/*@Override
	protected int getLayoutResource() {
		return R.layout.welcome;
	}*/
	
	private void init(){
		initAnim();
		this.mIvLandingpage.startAnimation(this.mFadeIn);
	}
	private void initAnim(){
		this.mFadeIn = AnimationUtils.loadAnimation(this,R.anim.wecome_animi);
	}
	private void setListener(){
		this.mFadeIn.setAnimationListener(new AnimationListener() {
			@Override
			public void onAnimationEnd(Animation animation) {
				 openActivity(MainActivity.class);
				 //MainActivity.launch(WelcomeActivity.this.context, new int[0]);
			     WelcomeActivity.this.overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
			     WelcomeActivity.this.finish();
			}
			@Override
			public void onAnimationStart(Animation animation) {
			}
			@Override
			public void onAnimationRepeat(Animation animation) {
			}
		});
	}
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		ButterKnife.inject(this);
		this.context = this;
		//getSwipeBackLayout().setEnableGesture(false);
		init();
		setListener();
	}
	
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
	

	public void clickRefresh(){}
	public void refreshLoginStatus(){}


}
