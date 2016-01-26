package com.qlh.yueshop.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;

public class VersionUtils {
	

	  public static String getDeviceId(Context paramContext)
	  {
	    return ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
	  }

	  private static PackageInfo getPackageInfo(Context paramContext)
	  {
	    try
	    {
	      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
	      return localPackageInfo;
	    }
	    catch (PackageManager.NameNotFoundException localNameNotFoundException)
	    {
	      localNameNotFoundException.printStackTrace();
	    }
	    return null;
	  }

	  public static int getVersionCode(Context paramContext)
	  {
	    return getPackageInfo(paramContext).versionCode;
	  }

	  public static String getVersionName(Context paramContext)
	  {
	    return getPackageInfo(paramContext).versionName;
	  }
}
