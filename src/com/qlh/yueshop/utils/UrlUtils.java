package com.qlh.yueshop.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import android.text.TextUtils;
import android.util.Log;

import com.qlh.yueshop.config.UrlConfig;

public class UrlUtils {

	 public static final String[] EXTRA_URLS = new String[5];
	 
	  public static final String[] REJECT_URLS = new String[0];

	  static
	  {
	    //String[] arrayOfString = new String[5];
	    EXTRA_URLS[0] = UrlConfig.ZMALL_LOGIN_HOST;
	    EXTRA_URLS[1] = UrlConfig.SOUYUE_LOGIN;
	    EXTRA_URLS[2] = UrlConfig.SOUYUE_REGISTERED;
	    EXTRA_URLS[3] = UrlConfig.SOUYUE_REGISTERED_COMMIT;
	    EXTRA_URLS[4] = UrlConfig.SOUYUE_ZSB;
	  }

	  /*public static StringBuilder builderUserParams(Context paramContext, String paramString, String[] paramArrayOfString)
	  {
	    UserInfo localUserInfo = AppControler.getContext().getUser();
	    StringBuilder localStringBuilder1 = new StringBuilder();
	    String str1;
	    label43: int i;
	    label82: String str2;
	    label107: StringBuilder localStringBuilder4;
	    if (paramString.contains("?"))
	    {
	      localStringBuilder1.append("&userid=");
	      if (localUserInfo == null)
	        break label275;
	      str1 = localUserInfo.getUserId();
	      StringBuilder localStringBuilder2 = localStringBuilder1.append(str1).append("&version=").append(VersionUtils.getVersionName(paramContext)).append("&anonymous=");
	      if (!AppControler.getContext().isLogin(paramContext))
	        break label282;
	      i = 1;
	      StringBuilder localStringBuilder3 = localStringBuilder2.append(i).append("&wifi=");
	      if (!Connectivity.isConnectedWifi(paramContext))
	        break label288;
	      str2 = "1";
	      localStringBuilder4 = localStringBuilder3.append(str2).append("&imei=").append(VersionUtils.getDeviceId(paramContext)).append("&appname=");
	      if (paramArrayOfString.length <= 0)
	        break label295;
	    }
	    label275: label282: label288: label295: for (String str3 = paramArrayOfString[0]; ; str3 = paramContext.getResources().getString(2131099695))
	    {
	      localStringBuilder4.append(str3).append("&v=").append(VersionUtils.getVersionCode(paramContext)).append("&type=").append("Android").append("&lat=").append("").append("&long=").append("").append("&province=").append("").append("&city=").append("").append("&srcSys=sc");
	      if (localUserInfo != null)
	        localStringBuilder1.append("&token=").append(localUserInfo.getToken()).append("&username=").append(localUserInfo.getUserName()).append("&sid=").append(localUserInfo.getToken());
	      return localStringBuilder1;
	      localStringBuilder1.append("?userid=");
	      break;
	      str1 = "";
	      break label43;
	      i = 0;
	      break label82;
	      str2 = "0";
	      break label107;
	    }
	  }*/

	  public static String encode(Object paramObject)
	  {
	    if (paramObject != null)
	      try
	      {
	        if (paramObject.toString().trim() != "")
	        {
	          String str = URLEncoder.encode(paramObject.toString(), "UTF-8");
	          return str;
	        }
	      }
	      catch (UnsupportedEncodingException localUnsupportedEncodingException)
	      {
	        localUnsupportedEncodingException.printStackTrace();
	        return paramObject.toString();
	      }
	    return "";
	  }

	  public static String encodeStr(String paramString)
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
	      Lg.e(localException);
	    }
	    return paramString;
	  }

	 /* public static String encodeURI(String paramString)
	  {
	    if (paramString == null)
	      return "";
	    StringBuffer localStringBuffer = new StringBuffer();
	    int i = 0;
	    if (i < paramString.length())
	    {
	      char c = paramString.charAt(i);
	      if (isAscii(c))
	        switch (c)
	        {
	        default:
	          localStringBuffer.append(c);
	        case '"':
	        case '%':
	        case '<':
	        case '>':
	        case '[':
	        case ']':
	        case '^':
	        case '`':
	        case '{':
	        case '|':
	        case '}':
	        case ' ':
	        }
	      while (true)
	      {
	        i++;
	        break;
	        localStringBuffer.append("%22");
	        continue;
	        localStringBuffer.append("%25");
	        continue;
	        localStringBuffer.append("%3C");
	        continue;
	        localStringBuffer.append("%3E");
	        continue;
	        localStringBuffer.append("%5B");
	        continue;
	        localStringBuffer.append("%5D");
	        continue;
	        localStringBuffer.append("%5E");
	        continue;
	        localStringBuffer.append("%60");
	        continue;
	        localStringBuffer.append("%7B");
	        continue;
	        localStringBuffer.append("%7C");
	        continue;
	        localStringBuffer.append("%7D");
	        continue;
	        localStringBuffer.append("%20");
	        continue;
	        try
	        {
	          localStringBuffer.append(URLEncoder.encode(Character.toString(c), "UTF-8"));
	        }
	        catch (Exception localException)
	        {
	          localStringBuffer.append(c);
	        }
	      }
	    }
	    return localStringBuffer.toString();
	  }*/

	  public static String encrypt(String paramString)
	  {
	    return ZSSecret.encrypt(paramString);
	  }

	/*  public static String encryptGet(Map<String, Object> paramMap, boolean paramBoolean)
	  {
	    JSONObject localJSONObject = new JSONObject();
	    Map.Entry localEntry;
	    StringBuilder localStringBuilder;
	    try
	    {
	      Iterator localIterator2 = paramMap.entrySet().iterator();
	      while (localIterator2.hasNext())
	      {
	        localEntry = (Map.Entry)localIterator2.next();
	        if ((!((String)localEntry.getKey()).equals("vc")) && (!((String)localEntry.getKey()).equals("isEncryption")))
	        {
	          if (localEntry.getValue() != null)
	            break label255;
	          localJSONObject.put((String)localEntry.getKey(), "");
	        }
	      }
	    }
	    catch (JSONException localJSONException1)
	    {
	      localJSONException1.printStackTrace();
	      localStringBuilder = new StringBuilder();
	      if (!paramBoolean)
	        break label283;
	    }
	    String str3 = encode(ZSSecret.encrypt(localJSONObject.toString()));
	    if (str3 == "")
	      Log.v("加密出错", "加密出错串：" + localJSONObject.toString());
	    Object localObject2 = paramMap.get("vc");
	    if (localJSONObject != null)
	    {
	      localStringBuilder.append("vc=");
	      localStringBuilder.append(localObject2.toString());
	      localStringBuilder.append("&");
	    }
	    localStringBuilder.append("sy_c=" + str3);
	    while (true)
	    {
	      return localStringBuilder.toString();
	      label255: localJSONObject.put((String)localEntry.getKey(), localEntry.getValue().toString());
	      break;
	      label283: Object localObject1 = paramMap.get("vc");
	      if (localJSONObject != null)
	      {
	        localStringBuilder.append("vc=");
	        localStringBuilder.append(localObject1.toString());
	        localStringBuilder.append("&");
	      }
	      Iterator localIterator1 = localJSONObject.keys();
	      while (localIterator1.hasNext())
	        try
	        {
	          String str1 = (String)localIterator1.next();
	          String str2 = localJSONObject.getString(str1);
	          localStringBuilder.append(str1);
	          localStringBuilder.append("=");
	          localStringBuilder.append(str2);
	          localStringBuilder.append("&");
	        }
	        catch (JSONException localJSONException2)
	        {
	          localJSONException2.printStackTrace();
	        }
	      localStringBuilder.deleteCharAt(-1 + localStringBuilder.length());
	    }
	  }*/

	  public static String encryptPost(String paramString, Map<String, String> paramMap)
	    throws Exception
	  {
	    return encryptPost(paramString, paramMap, "");
	  }

	  public static String encryptPost(String paramString1, Map<String, String> paramMap, String paramString2)
	    throws Exception
	  {
	    if (!isEncryt(paramString1))
	      return null;
	    String[] arrayOfString1 = paramString1.split("\\?");
	    if (arrayOfString1.length > 2)
	      throw new Exception("非法url！");
	    int i = arrayOfString1.length;
	    String str1 = null;
	    if (i > 2)
	      str1 = arrayOfString1[1];
	    JSONObject localJSONObject = new JSONObject();
	    if (str1 != null)
	    {
	      String[] arrayOfString2 = str1.split("&");
	      for (int j = 0; j < arrayOfString2.length; j++)
	      {
	        String[] arrayOfString3 = arrayOfString2[j].split("=");
	        if (!arrayOfString3[1].equals("vc"))
	          localJSONObject.put(arrayOfString3[1], arrayOfString3[2]);
	      }
	    }
	    Iterator localIterator = paramMap.entrySet().iterator();
	    label256: label275: 
	    while (localIterator.hasNext())
	    {
	      Map.Entry localEntry = (Map.Entry)localIterator.next();
	      String str2 = "";
	      if (!TextUtils.isEmpty(((String)localEntry.getValue()).toString()))
	        if (!"login".equals(paramString2))
	          break label256;
	      for (str2 = ((String)localEntry.getValue()).toString(); ; str2 = ((String)localEntry.getValue()).toString().trim())
	      {
	        if (((String)localEntry.getKey()).equals("vc"))
	          break label275;
	        localJSONObject.put((String)localEntry.getKey(), str2);
	        break;
	      }
	    }
	    if (localJSONObject.isNull("imei"));
	    return ZSSecret.encrypt(localJSONObject.toString());
	  }

	 /* public static String encryptWebUrl(String paramString)
	  {
	    int i = 0;
	    JSONObject localJSONObject = new JSONObject();
	    String[] arrayOfString1 = paramString.substring(1 + paramString.indexOf('?'), paramString.length()).split("&");
	    StringBuilder localStringBuilder = new StringBuilder(paramString.substring(0, 1 + paramString.indexOf('?')));
	    while (true)
	    {
	      String[] arrayOfString2;
	      try
	      {
	        int j = arrayOfString1.length;
	        if (i < j)
	        {
	          arrayOfString2 = arrayOfString1[i].split("=");
	          if ((arrayOfString2[0].equals("isEncryption")) || (arrayOfString2[0].equals("")))
	            break label205;
	          if (arrayOfString2[0].equals("sy_c"))
	            return paramString;
	          if (arrayOfString2.length <= 1)
	            break label194;
	          localJSONObject.put(arrayOfString2[0], arrayOfString2[1]);
	        }
	      }
	      catch (JSONException localJSONException)
	      {
	        localJSONException.printStackTrace();
	        String str = encode(ZSSecret.encrypt(localJSONObject.toString()));
	        localStringBuilder.append("sy_c=" + str);
	        return localStringBuilder.toString();
	      }
	      label194: localJSONObject.put(arrayOfString2[0], "");
	      label205: i++;
	    }
	  }*/

	  public static String get2MD5(String paramString)
	  {
	    if (TextUtils.isEmpty(paramString))
	      return "";
	    return get2MD5(paramString.getBytes());
	  }

	  public static String get2MD5(byte[] paramArrayOfByte)
	  {
	    char[] arrayOfChar1 = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
	    try
	    {
	      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
	      localMessageDigest.update(paramArrayOfByte);
	      byte[] arrayOfByte = localMessageDigest.digest();
	      char[] arrayOfChar2 = new char[32];
	      int i = 0;
	      int j = 0;
	      while (i < 16)
	      {
	        int k = arrayOfByte[i];
	        int m = j + 1;
	        arrayOfChar2[j] = arrayOfChar1[(0xF & k >>> 4)];
	        j = m + 1;
	        arrayOfChar2[m] = arrayOfChar1[(k & 0xF)];
	        i++;
	      }
	      String str = new String(arrayOfChar2);
	      return str;
	    }
	    catch (Exception localException)
	    {
	      localException.printStackTrace();
	    }
	    return null;
	  }

	  public static String getNoParamsUrl(String paramString)
	  {
	    return paramString.split("\\?")[0];
	  }

	  public static boolean isAscii(char paramChar)
	  {
	    return paramChar <= '~';
	  }

	  public static boolean isEncryt(String paramString)
	  {
	    if (isExtraEncrypt(paramString))
	      return true;
	    for (int i = 0; i < REJECT_URLS.length; i++)
	      if (!paramString.contains(REJECT_URLS[i]));
	    return false;
	  }

	  public static boolean isExtraEncrypt(String paramString)
	  {
	    boolean bool = false;
	    for (int i = 0; i < EXTRA_URLS.length; i++)
	    {
	      String str = EXTRA_URLS[i];
	      String[] arrayOfString = str.split("\\?");
	      if (arrayOfString.length > 1)
	        str = arrayOfString[0];
	      if (paramString.contains(str))
	        bool = true;
	    }
	    return bool;
	  }
}
