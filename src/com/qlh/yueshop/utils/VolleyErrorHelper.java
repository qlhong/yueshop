package com.qlh.yueshop.utils;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.qlh.yueshop.bean.StatusMessage;

public class VolleyErrorHelper {

	/*public static String getMessage(Throwable paramThrowable, Context paramContext)
	  {
	    Lg.e(paramThrowable);
	    if ((paramThrowable instanceof TimeoutError))
	      return paramContext.getResources().getString(2131099750);
	    if (isServerProblem(paramThrowable))
	      return handleServerError(paramThrowable, paramContext);
	    if (isNetworkProblem(paramThrowable))
	      return paramContext.getResources().getString(2131099739);
	    if ((paramThrowable instanceof CommmonException))
	      return paramThrowable.getMessage();
	    if ((paramThrowable instanceof ParseError))
	      paramContext.getResources().getString(2131099711);
	    return paramContext.getResources().getString(2131099707);
	  }

	  private static String handleServerError(Object paramObject, Context paramContext)
	  {
	    NetworkResponse localNetworkResponse = ((VolleyError)paramObject).networkResponse;
	    if (localNetworkResponse != null)
	    {
	      switch (localNetworkResponse.statusCode)
	      {
	      default:
	      case 401:
	      case 404:
	      case 422:
	      }
	      while (true)
	      {
	        return paramContext.getResources().getString(2131099708);
	        try
	        {
	          String str1 = new String(localNetworkResponse.data, HttpHeaderParser.parseCharset(localNetworkResponse.headers));
	          String str2 = ((StatusMessage)new Gson().fromJson(str1, StatusMessage.class)).getHead().getMessage();
	          return str2;
	        }
	        catch (Exception localException)
	        {
	          localException.printStackTrace();
	        }
	      }
	    }
	    return paramContext.getResources().getString(2131099707);
	  }

	  private static boolean isNetworkProblem(Object paramObject)
	  {
	    return ((paramObject instanceof NetworkError)) || ((paramObject instanceof NoConnectionError));
	  }

	  private static boolean isServerProblem(Object paramObject)
	  {
	    return ((paramObject instanceof ServerError)) || ((paramObject instanceof AuthFailureError));
	  }*/
}
