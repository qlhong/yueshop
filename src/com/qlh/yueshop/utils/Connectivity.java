package com.qlh.yueshop.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Connectivity {

	public static NetworkInfo getNetworkInfo(Context paramContext) {
		return ((ConnectivityManager) paramContext
				.getSystemService("connectivity")).getActiveNetworkInfo();
	}

	public static boolean isConnected(Context paramContext) {
		NetworkInfo localNetworkInfo = getNetworkInfo(paramContext);
		return (localNetworkInfo != null) && (localNetworkInfo.isConnected());
	}

	public static boolean isConnectedFast(Context paramContext) {
		NetworkInfo localNetworkInfo = getNetworkInfo(paramContext);
		return (localNetworkInfo != null)
				&& (localNetworkInfo.isConnected())
				&& (isConnectionFast(localNetworkInfo.getType(),
						localNetworkInfo.getSubtype()));
	}

	public static boolean isConnectedMobile(Context paramContext) {
		NetworkInfo localNetworkInfo = getNetworkInfo(paramContext);
		return (localNetworkInfo != null) && (localNetworkInfo.isConnected())
				&& (localNetworkInfo.getType() == 0);
	}

	public static boolean isConnectedWifi(Context paramContext) {
		NetworkInfo localNetworkInfo = getNetworkInfo(paramContext);
		return (localNetworkInfo != null) && (localNetworkInfo.isConnected())
				&& (localNetworkInfo.getType() == 1);
	}

	public static boolean isConnectionFast(int paramInt1, int paramInt2) {
		if (paramInt1 == 1)
			return true;
		if (paramInt1 == 0) {
			switch (paramInt2) {
			case 3:
			case 5:
			case 6:
			case 8:
			case 9:
			case 10:
			case 12:
			case 13:
			case 14:
			case 15:
			default:
				return false;
			case 7:
				return false;
			case 4:
				return false;
			case 2:
				return false;
			case 1:
				return false;
			case 11:
			}
			return false;
		}
		return false;
	}
}
