package com.qlh.yueshop.manager;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class RequestManager {

	public static final String TAG = "VolleyPatterns";

	private static RequestQueue mRequestQueue;

	public static <T> void addToRequestQueue(Request<T> paramRequest) {
		addToRequestQueue(paramRequest, null);
	}

	public static <T> void addToRequestQueue(Request<T> paramRequest,
			Object paramObject) {
		if (paramObject == null) 
		{
			paramObject = TAG;
			paramRequest.setTag(paramRequest);
		}
		getRequestQueue().add(paramRequest);
	}

	public static RequestQueue getRequestQueue() {
		if (mRequestQueue != null) {
			return mRequestQueue;
		}
		throw new IllegalStateException("Not RequestQueue initialized");
	}

	public static void init(Context paramContext) {
		mRequestQueue = Volley.newRequestQueue(paramContext);
	}
	
	public static void cancelPendingRequests(Object paramObject){
		if(mRequestQueue!=null)
		{
			mRequestQueue.cancelAll(paramObject);
		}
	}
}
