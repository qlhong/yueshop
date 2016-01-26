package com.qlh.yueshop.utils;

import android.app.Application;
import android.util.Log;

public class Lg {

	 protected static BaseConfig config = new BaseConfig();
	  protected static Print print = new Print();

	  public static int d(Object paramObject, Object[] paramArrayOfObject)
	  {
	    if (config.minimumLogLevel > 3)
	      return 0;
	    String str1 = Strings.toString(paramObject);
	    if (paramArrayOfObject.length > 0);
	    for (String str2 = String.format(str1, paramArrayOfObject); ; str2 = str1)
	      return print.println(3, str2);
	  }

	  public static int d(Throwable paramThrowable)
	  {
	    if (config.minimumLogLevel <= 3)
	      return print.println(3, Log.getStackTraceString(paramThrowable));
	    return 0;
	  }

	  public static int d(Throwable paramThrowable, Object paramObject, Object[] paramArrayOfObject)
	  {
	    if (config.minimumLogLevel > 3)
	      return 0;
	    String str1 = Strings.toString(paramObject);
	    StringBuilder localStringBuilder = new StringBuilder();
	    if (paramArrayOfObject.length > 0)
	      str1 = String.format(str1, paramArrayOfObject);
	    String str2 = str1 + '\n' + Log.getStackTraceString(paramThrowable);
	    return print.println(3, str2);
	  }

	  public static int e(Object paramObject, Object[] paramArrayOfObject)
	  {
	    if (config.minimumLogLevel > 6)
	      return 0;
	    String str1 = Strings.toString(paramObject);
	    if (paramArrayOfObject.length > 0);
	    for (String str2 = String.format(str1, paramArrayOfObject); ; str2 = str1)
	      return print.println(6, str2);
	  }

	  public static int e(Throwable paramThrowable)
	  {
	    if (config.minimumLogLevel <= 6)
	      return print.println(6, Log.getStackTraceString(paramThrowable));
	    return 0;
	  }

	  public static int e(Throwable paramThrowable, Object paramObject, Object[] paramArrayOfObject)
	  {
	    if (config.minimumLogLevel > 6)
	      return 0;
	    String str1 = Strings.toString(paramObject);
	    StringBuilder localStringBuilder = new StringBuilder();
	    if (paramArrayOfObject.length > 0)
	      str1 = String.format(str1, paramArrayOfObject);
	    String str2 = str1 + '\n' + Log.getStackTraceString(paramThrowable);
	    return print.println(6, str2);
	  }

	  public static Config getConfig()
	  {
	    return config;
	  }

	  public static int i(Object paramObject, Object[] paramArrayOfObject)
	  {
	    if (config.minimumLogLevel > 4)
	      return 0;
	    String str1 = Strings.toString(paramObject);
	    if (paramArrayOfObject.length > 0);
	    for (String str2 = String.format(str1, paramArrayOfObject); ; str2 = str1)
	      return print.println(4, str2);
	  }

	  public static int i(Throwable paramThrowable)
	  {
	    if (config.minimumLogLevel <= 4)
	      return print.println(4, Log.getStackTraceString(paramThrowable));
	    return 0;
	  }

	  public static int i(Throwable paramThrowable, Object paramObject, Object[] paramArrayOfObject)
	  {
	    if (config.minimumLogLevel > 4)
	      return 0;
	    String str1 = Strings.toString(paramObject);
	    StringBuilder localStringBuilder = new StringBuilder();
	    if (paramArrayOfObject.length > 0)
	      str1 = String.format(str1, paramArrayOfObject);
	    String str2 = str1 + '\n' + Log.getStackTraceString(paramThrowable);
	    return print.println(4, str2);
	  }

	  public static boolean isDebugEnabled()
	  {
	    return config.minimumLogLevel <= 3;
	  }

	  public static boolean isVerboseEnabled()
	  {
	    return config.minimumLogLevel <= 2;
	  }

	  public static String logLevelToString(int paramInt)
	  {
	    switch (paramInt)
	    {
	    default:
	      return "UNKNOWN";
	    case 2:
	      return "VERBOSE";
	    case 3:
	      return "DEBUG";
	    case 4:
	      return "INFO";
	    case 5:
	      return "WARN";
	    case 6:
	      return "ERROR";
	    case 7:
	    }
	    return "ASSERT";
	  }

	  public static int v(Object paramObject, Object[] paramArrayOfObject)
	  {
	    if (config.minimumLogLevel > 2)
	      return 0;
	    String str1 = Strings.toString(paramObject);
	    if (paramArrayOfObject.length > 0);
	    for (String str2 = String.format(str1, paramArrayOfObject); ; str2 = str1)
	      return print.println(2, str2);
	  }

	  public static int v(Throwable paramThrowable)
	  {
	    if (config.minimumLogLevel <= 2)
	      return print.println(2, Log.getStackTraceString(paramThrowable));
	    return 0;
	  }

	  public static int v(Throwable paramThrowable, Object paramObject, Object[] paramArrayOfObject)
	  {
	    if (config.minimumLogLevel > 2)
	      return 0;
	    String str1 = Strings.toString(paramObject);
	    StringBuilder localStringBuilder = new StringBuilder();
	    if (paramArrayOfObject.length > 0)
	      str1 = String.format(str1, paramArrayOfObject);
	    String str2 = str1 + '\n' + Log.getStackTraceString(paramThrowable);
	    return print.println(2, str2);
	  }

	  public static int w(Object paramObject, Object[] paramArrayOfObject)
	  {
	    if (config.minimumLogLevel > 5)
	      return 0;
	    String str1 = Strings.toString(paramObject);
	    if (paramArrayOfObject.length > 0);
	    for (String str2 = String.format(str1, paramArrayOfObject); ; str2 = str1)
	      return print.println(5, str2);
	  }

	  public static int w(Throwable paramThrowable)
	  {
	    if (config.minimumLogLevel <= 5)
	      return print.println(5, Log.getStackTraceString(paramThrowable));
	    return 0;
	  }

	  public static int w(Throwable paramThrowable, Object paramObject, Object[] paramArrayOfObject)
	  {
	    if (config.minimumLogLevel > 5)
	      return 0;
	    String str1 = Strings.toString(paramObject);
	    StringBuilder localStringBuilder = new StringBuilder();
	    if (paramArrayOfObject.length > 0)
	      str1 = String.format(str1, paramArrayOfObject);
	    String str2 = str1 + '\n' + Log.getStackTraceString(paramThrowable);
	    return print.println(5, str2);
	  }

	  public static class BaseConfig
	    implements Lg.Config
	  {
	    protected int minimumLogLevel;
	    protected String packageName;
	    protected String scope;

	    protected BaseConfig()
	    {
	      this.minimumLogLevel = 2;
	      this.packageName = "";
	      this.scope = "";
	      this.minimumLogLevel = 4;
	    }

	    public BaseConfig(Application paramApplication)
	    {
	      //this.minimumLogLevel = i;
	      this.packageName = "";
	      this.scope = "";
	      try
	      {
	        this.packageName = paramApplication.getPackageName();
	        if ((0x2 & paramApplication.getPackageManager().getApplicationInfo(this.packageName, 0).flags) != 0);
	        while (true)
	        {
	         // this.minimumLogLevel = i;
	          this.scope = this.packageName.toUpperCase();
	          Object[] arrayOfObject = new Object[1];
	          arrayOfObject[0] = Lg.logLevelToString(this.minimumLogLevel);
	          Lg.d("Configuring Logging, minimum log level is %s", arrayOfObject);
	          return;
	          //i = 4;
	        }
	      }
	      catch (Exception localException)
	      {
	        try
	        {
	          Log.e(this.packageName, "Error configuring logger", localException);
	          return;
	        }
	        catch (RuntimeException localRuntimeException)
	        {
	        }
	      }
	    }

	    public int getLoggingLevel()
	    {
	      return this.minimumLogLevel;
	    }

	    public void setLoggingLevel(int paramInt)
	    {
	      this.minimumLogLevel = paramInt;
	    }
	  }

	  public static abstract interface Config
	  {
	    public abstract int getLoggingLevel();

	    public abstract void setLoggingLevel(int paramInt);
	  }

	  public static class Print
	  {
	    protected static String getScope(int paramInt)
	    {
	      if (Lg.config.minimumLogLevel <= 3)
	      {
	        StackTraceElement localStackTraceElement = Thread.currentThread().getStackTrace()[paramInt];
	        return Lg.config.scope + "/" + localStackTraceElement.getFileName() + ":" + localStackTraceElement.getLineNumber();
	      }
	      return Lg.config.scope;
	    }

	    public int println(int paramInt, String paramString)
	    {
	      return Log.println(paramInt, getScope(5), processMessage(paramString));
	    }

	    protected String processMessage(String paramString)
	    {
	      if (Lg.config.minimumLogLevel <= 3)
	      {
	        Object[] arrayOfObject = new Object[2];
	        arrayOfObject[0] = Thread.currentThread().getName();
	        arrayOfObject[1] = paramString;
	        paramString = String.format("%s %s", arrayOfObject);
	      }
	      return paramString;
	    }
	  }
}
