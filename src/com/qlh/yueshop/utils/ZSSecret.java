package com.qlh.yueshop.utils;

import org.json.JSONException;
import org.json.JSONObject;

public class ZSSecret {

	static
	  {
	    try
	    {
	      System.loadLibrary("encrypt");
	      //return;
	    }
	    catch (Exception localException)
	    {
	      localException.printStackTrace();
	    }
	  }

	  public static String encrypt(String paramString)
	  {
	    try
	    {
	      String str = ens(new JSONObject(paramString).toString());
	      return str;
	    }
	    catch (JSONException localJSONException)
	    {
	    }
	    return enjs(paramString);
	  }

	  public static native String enjs(String paramString);

	  public static native String ens(String paramString);
}
