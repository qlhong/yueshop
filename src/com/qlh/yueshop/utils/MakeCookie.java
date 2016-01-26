package com.qlh.yueshop.utils;

import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Decoder.BASE64Encoder;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;

import com.qlh.yueshop.application.AppControler;
import com.qlh.yueshop.bean.UserInfo;
import com.qlh.yueshop.config.UrlConfig;

public class MakeCookie {

	public static String enCodeRUL(String paramString)
	  {
	    if (!TextUtils.isEmpty(paramString));
	    try
	    {
	      String str = URLEncoder.encode(paramString, "UTF-8");
	      paramString = str;
	      return paramString;
	    }
	    catch (Exception localException)
	    {
	    }
	    return paramString;
	  }

	  public static String encode(String paramString)
	  {
	    return new String(new BASE64Encoder().encodeBuffer((paramString + "$^&*%$*%^&").getBytes()));
	  }

	  private static String expires()
	  {
	    Date localDate = new Date();
	    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("E,dd MMM yyyy HH:mm:ss ", Locale.ENGLISH);
	    String str1 = localSimpleDateFormat.format(localDate);
	    Calendar localCalendar = Calendar.getInstance();
	    try
	    {
	      localCalendar.setTime(localSimpleDateFormat.parse(str1));
	      localCalendar.add(6, 1);
	      String str2 = localSimpleDateFormat.format(localCalendar.getTime());
	      return str2 + "GMT";
	    }
	    catch (ParseException localParseException)
	    {
	      while (true)
	        localParseException.printStackTrace();
	    }
	  }

	  private static boolean isLogin(Context paramContext)
	  {
	    return AppControler.getContext().getUser() != null;
	  }

	  public static void synCookies(Context paramContext, String paramString)
	  {
	    try
	    {
	      Matcher localMatcher = Pattern.compile("^\\w+://([\\w\\d]+\\.)*([\\w\\d]+\\.[\\w\\d]+)(:\\d+)?/").matcher(paramString);
	      if (localMatcher.find())
	      {
	        String str1 = localMatcher.group(2);
	        if ((!TextUtils.isEmpty(str1)) && (str1.contains("zhongsou")))
	        {
	          UserInfo localUserInfo = AppControler.getContext().getUser();
	          CookieSyncManager localCookieSyncManager = CookieSyncManager.createInstance(paramContext);
	          CookieManager localCookieManager = CookieManager.getInstance();
	          localCookieManager.setAcceptCookie(true);
	          localCookieManager.setCookie(paramString, "path=/; ");
	          localCookieManager.setCookie(paramString, "expires=" + expires());
	          localCookieManager.setCookie(paramString, "username=" + enCodeRUL(localUserInfo.getUserName()));
	          localCookieManager.setCookie(paramString, "nick_name=" + enCodeRUL(localUserInfo.getName()));
	          localCookieManager.setCookie(paramString, "userphoto=" + enCodeRUL(localUserInfo.getImage()));
	          localCookieManager.setCookie(paramString, "userid=" + localUserInfo.getUserId());
	          localCookieManager.setCookie(paramString, "widgetsyuid=" + localUserInfo.getUserId());
	          localCookieManager.setCookie(paramString, "authkey=" + encode(localUserInfo.getUserName()));
	          localCookieManager.setCookie(paramString, "version=4.1");
	          localCookieManager.setCookie(paramString, "token=" + AppControler.getContext().getUser().getToken());
	          localCookieManager.setCookie(paramString, "anonymous=1");
	          if (Connectivity.isConnectedWifi(paramContext));
	          for (String str2 = "1"; ; str2 = "0")
	          {
	            localCookieManager.setCookie(paramString, "wifi=" + str2);
	            localCookieManager.setCookie(paramString, "hasPic=1");
	            localCookieManager.setCookie(paramString, "lon=0");
	            localCookieManager.setCookie(paramString, "lat=0");
	            localCookieSyncManager.sync();
	            synZCookies(paramContext, paramString);
	            return;
	          }
	        }
	      }
	    }
	    catch (Exception localException)
	    {
	      Lg.e(localException);
	    }
	  }

	  public static void synZCookies(Context paramContext, String paramString)
	  {
	    String str1 = UrlConfig.HOST;
	    try
	    {
	      UserInfo localUserInfo = AppControler.getContext().getUser();
	      CookieSyncManager localCookieSyncManager = CookieSyncManager.createInstance(paramContext);
	      CookieManager localCookieManager = CookieManager.getInstance();
	      localCookieManager.setAcceptCookie(true);
	      localCookieManager.setCookie(str1, "path=/; ");
	      localCookieManager.setCookie(str1, "expires=" + expires());
	      localCookieManager.setCookie(str1, "username=" + enCodeRUL(localUserInfo.getUserName()));
	      localCookieManager.setCookie(str1, "nick_name=" + enCodeRUL(localUserInfo.getName()));
	      localCookieManager.setCookie(str1, "userphoto=" + enCodeRUL(localUserInfo.getImage()));
	      localCookieManager.setCookie(str1, "userid=" + localUserInfo.getUserId());
	      localCookieManager.setCookie(str1, "widgetsyuid=" + localUserInfo.getUserId());
	      localCookieManager.setCookie(str1, "authkey=" + encode(localUserInfo.getUserName()));
	      localCookieManager.setCookie(str1, "version=4.1");
	      localCookieManager.setCookie(str1, "token=" + AppControler.getContext().getUser().getToken());
	      localCookieManager.setCookie(str1, "anonymous=1");
	      if (Connectivity.isConnectedWifi(paramContext));
	      for (String str2 = "1"; ; str2 = "0")
	      {
	        localCookieManager.setCookie(str1, "wifi=" + str2);
	        localCookieManager.setCookie(str1, "hasPic=1");
	        localCookieManager.setCookie(str1, "lon=0");
	        localCookieManager.setCookie(str1, "lat=0");
	        localCookieSyncManager.sync();
	        return;
	      }
	    }
	    catch (Exception localException)
	    {
	      Lg.e(localException);
	    }
	  }
}
