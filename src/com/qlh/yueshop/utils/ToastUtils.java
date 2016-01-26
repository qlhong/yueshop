package com.qlh.yueshop.utils;

import android.content.Context;
import android.widget.Toast;

import com.qlh.yueshop.application.AppControler;

public class ToastUtils {

	private static void show(Context paramContext, int paramInt1, int paramInt2)
	  {
	    Toast.makeText(paramContext, paramInt1, paramInt2).show();
	  }

	  private static void show(Context paramContext, String paramString, int paramInt)
	  {
	    Toast.makeText(paramContext, paramString, paramInt).show();
	  }

	  public static void showLong(int paramInt)
	  {
	    Toast.makeText(AppControler.getContext(), paramInt, 1).show();
	  }

	  public static void showLong(String paramString)
	  {
	    Toast.makeText(AppControler.getContext(), paramString, 1).show();
	  }

	  public static void showShort(int paramInt)
	  {
	    Toast.makeText(AppControler.getContext(), paramInt, 0).show();
	  }

	  public static void showShort(String paramString)
	  {
	    Toast.makeText(AppControler.getContext(), paramString, 0).show();
	  }
}
