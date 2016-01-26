package com.qlh.yueshop.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PreferenceUtils {

	public static final String USERINFO = "userinfo";

	public static void clearPreference(Context paramContext,
			SharedPreferences paramSharedPreferences) {
		SharedPreferences.Editor localEditor = paramSharedPreferences.edit();
		localEditor.clear();
		localEditor.commit();
	}

	public static boolean getPrefBoolean(Context paramContext,
			String paramString, boolean paramBoolean) {
		return PreferenceManager.getDefaultSharedPreferences(paramContext)
				.getBoolean(paramString, paramBoolean);
	}

	public static float getPrefFloat(Context paramContext, String paramString,
			float paramFloat) {
		return PreferenceManager.getDefaultSharedPreferences(paramContext)
				.getFloat(paramString, paramFloat);
	}

	public static int getPrefInt(Context paramContext, String paramString,
			int paramInt) {
		return PreferenceManager.getDefaultSharedPreferences(paramContext)
				.getInt(paramString, paramInt);
	}

	public static long getPrefLong(Context paramContext, String paramString,
			long paramLong) {
		return PreferenceManager.getDefaultSharedPreferences(paramContext)
				.getLong(paramString, paramLong);
	}

	public static String getPrefString(Context paramContext,
			String paramString1, String paramString2) {
		return PreferenceManager.getDefaultSharedPreferences(paramContext)
				.getString(paramString1, paramString2);
	}

	public static boolean hasKey(Context paramContext, String paramString) {
		return PreferenceManager.getDefaultSharedPreferences(paramContext)
				.contains(paramString);
	}

	public static void setPrefBoolean(Context paramContext, String paramString,
			boolean paramBoolean) {
		PreferenceManager.getDefaultSharedPreferences(paramContext).edit()
				.putBoolean(paramString, paramBoolean).commit();
	}

	public static void setPrefFloat(Context paramContext, String paramString,
			float paramFloat) {
		PreferenceManager.getDefaultSharedPreferences(paramContext).edit()
				.putFloat(paramString, paramFloat).commit();
	}

	public static void setPrefInt(Context paramContext, String paramString,
			int paramInt) {
		PreferenceManager.getDefaultSharedPreferences(paramContext).edit()
				.putInt(paramString, paramInt).commit();
	}

	public static void setPrefString(Context paramContext, String paramString1,
			String paramString2) {
		PreferenceManager.getDefaultSharedPreferences(paramContext).edit()
				.putString(paramString1, paramString2).commit();
	}

	public static void setSettingLong(Context paramContext, String paramString,
			long paramLong) {
		PreferenceManager.getDefaultSharedPreferences(paramContext).edit()
				.putLong(paramString, paramLong).commit();
	}
}
