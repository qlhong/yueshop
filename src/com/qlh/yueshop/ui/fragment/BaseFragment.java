package com.qlh.yueshop.ui.fragment;

import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.Optional;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.qlh.yueshop.manager.RequestManager;
import com.qlh.yueshop.request.GsonRequest;
import com.qlh.yueshop.ui.componet.ProgressBarHelper;
import com.qlh.yueshop.utils.ToastUtils;
import com.qlh.yueshop.utils.VolleyErrorHelper;

public abstract class BaseFragment extends Fragment {

	protected Context context;
	
	@InjectView(2131558634)
	@Optional
	protected ProgressBarHelper mPbHelper;

	protected abstract int getContentViewResId();

	public void onActivityCreated(Bundle paramBundle) {
		super.onActivityCreated(paramBundle);
	}

	public void onAttach(Activity paramActivity) {
		super.onAttach(paramActivity);
		this.context = paramActivity;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View localView = inflater.inflate(getContentViewResId(), container);
		ButterKnife.inject(this, localView);
		setHasOptionsMenu(true);
		return localView;
	}

	public void onDestroy() {
		super.onDestroy();
		RequestManager.cancelPendingRequests(this);
	}

	public void onPause() {
		super.onPause();
	}

	public void onResume() {
		super.onResume();
	}

	protected void executeRequest(int paramInt, String paramString,
			Class paramClass, Map<String, String> paramMap,
			Response.Listener paramListener,
			Response.ErrorListener paramErrorListener) {
		RequestManager.addToRequestQueue(new GsonRequest.Builder(paramInt,
				paramString, paramClass, paramMap, paramListener,
				paramErrorListener).build(), this);
	}

	protected void executeRequest(Request paramRequest) {
		RequestManager.addToRequestQueue(paramRequest, this);
	}

	protected void executeRequest(String paramString, Class paramClass,
			Response.Listener paramListener,
			Response.ErrorListener paramErrorListener) {
		executeRequest(0, paramString, paramClass, null, paramListener,
				paramErrorListener);
	}
	
	protected Response.ErrorListener errorListener()
	  {
	    return new Response.ErrorListener()
	    {
	      public void onErrorResponse(VolleyError paramAnonymousVolleyError)
	      {
	       /* if (BaseFragment.this.mPbHelper != null)
	          BaseFragment.this.mPbHelper.showNetError();
	        if (((paramAnonymousVolleyError instanceof CommmonException)) && (((CommmonException)paramAnonymousVolleyError).getHead().getStatus() == 600))
	          BaseFragment.this.refreshLoginStatus();*/
	        //ToastUtils.showShort(VolleyErrorHelper.getMessage(paramAnonymousVolleyError, BaseFragment.this.context));
	      }
	    };
	  }

}
