package com.qlh.yueshop.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import android.content.Context;
import android.util.Log;

public class DefaultExceptionHandler implements Thread.UncaughtExceptionHandler {

	 private static final String TAG = "DefaultExceptionHandler";
	  private Context act;

	  public DefaultExceptionHandler(Context paramContext)
	  {
	    this.act = paramContext;
	  }

	  private String getErrorInfo(Throwable paramThrowable)
	  {
	    StringWriter localStringWriter = new StringWriter();
	    PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
	    paramThrowable.printStackTrace(localPrintWriter);
	    localPrintWriter.close();
	    return localStringWriter.toString();
	  }

	  private void handleException(Throwable paramThrowable)
	  {
	    Log.e("DefaultExceptionHandler", "zmall exception: ==========>" + getErrorInfo(paramThrowable));
	   // MobclickAgent.onKillProcess(this.act);
	   // Process.killProcess(Process.myPid());
	    System.exit(0);
	  }

	  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
	  {
	    handleException(paramThrowable);
	  }
}
