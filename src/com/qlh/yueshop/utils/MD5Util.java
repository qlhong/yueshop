package com.qlh.yueshop.utils;

import java.security.MessageDigest;

public class MD5Util {

	public static final String MD5(String paramString) {
		char[] arrayOfChar1 = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98,
				99, 100, 101, 102 };
		try {
			byte[] arrayOfByte1 = paramString.getBytes();
			MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
			localMessageDigest.update(arrayOfByte1);
			byte[] arrayOfByte2 = localMessageDigest.digest();
			int i = arrayOfByte2.length;
			char[] arrayOfChar2 = new char[i * 2];
			int j = 0;
			int k = 0;
			while (j < i) {
				int m = arrayOfByte2[j];
				int n = k + 1;
				arrayOfChar2[k] = arrayOfChar1[(0xF & m >>> 4)];
				k = n + 1;
				arrayOfChar2[n] = arrayOfChar1[(m & 0xF)];
				j++;
			}
			String str = new String(arrayOfChar2);
			return str;
		} catch (Exception localException) {
			localException.printStackTrace();
		}
		return null;
	}

	public static void main(String[] paramArrayOfString) {
		System.out.println(MD5("2222222"));
		System.out.println(MD5("加密"));
	}
}
