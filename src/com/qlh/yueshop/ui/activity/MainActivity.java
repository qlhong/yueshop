package com.qlh.yueshop.ui.activity;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

import com.qlh.yueshop.R;
import com.qlh.yueshop.ui.fragment.Fragment1;
import com.qlh.yueshop.ui.fragment.Fragment2;
import com.qlh.yueshop.ui.fragment.Fragment3;
import com.qlh.yueshop.ui.fragment.Fragment4;
import com.qlh.yueshop.ui.fragment.Fragment5;

public class MainActivity extends FragmentActivity
{
	private FragmentManager fm;
	 //定义FragmentTabHost对象  
    private FragmentTabHost mTabHost; 
    //定义一个布局  
    private LayoutInflater layoutInflater; 
    
    //定义数组来存放Fragment界面  
    private Class fragmentArray[] = {Fragment1.class,Fragment2.class,Fragment3.class,Fragment4.class,Fragment5.class};  
      
    //定义数组来存放按钮图片  
    private int mImageViewArray[] = {R.drawable.tab_home_btn,R.drawable.tab_shelves_btn,R.drawable.tab_shearch_btn,  
                                     R.drawable.tab_shopping_btn,R.drawable.tab_my_btn};  
      
    //Tab选项卡的文字  
    private String mTextviewArray[] = {"首页", "货架", "搜索", "购物车", "我的"};  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}
	
	private void initView(){
		layoutInflater = LayoutInflater.from(this);
		   //实例化TabHost对象，得到TabHost  
        mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);  
        mTabHost.setup(this, getSupportFragmentManager(), R.id.main_content);
        //得到fragment的个数  
        int count = fragmentArray.length;
        for(int i = 0; i < count; i++){    
            //为每一个Tab按钮设置图标、文字和内容  
            TabSpec tabSpec = mTabHost.newTabSpec(mTextviewArray[i]).setIndicator(getTabItemView(i));  
            //将Tab按钮添加进Tab选项卡中  
            mTabHost.addTab(tabSpec, fragmentArray[i], null);  
            //设置Tab按钮的背景  
            //mTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.selector_tab_background);  
        }  
	}
	
	/** 
     * 给Tab按钮设置图标和文字 
     */  
    private View getTabItemView(int index){  
        View view = layoutInflater.inflate(R.layout.tab_item_view, null);  
      
        ImageView imageView = (ImageView) view.findViewById(R.id.imageview);  
        imageView.setImageResource(mImageViewArray[index]);  
          
        TextView textView = (TextView) view.findViewById(R.id.textview);          
        textView.setText(mTextviewArray[index]);  
      
        return view;  
    }  
	
}
