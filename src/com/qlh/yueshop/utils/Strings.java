package com.qlh.yueshop.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Strings {

	 private static final int DEFAULT_BUFFER_SIZE = 4096;

	  public static String capitalize(String paramString)
	  {
	    String str = toString(paramString);
	    if (str.length() >= 2)
	      str = str.substring(0, 1).toUpperCase() + str.substring(1);
	    while (str.length() < 1)
	      return str;
	    return str.toUpperCase();
	  }

	/*  public static String[] chunk(String paramString, int paramInt)
	  {
	    if ((isEmpty(paramString)) || (paramInt == 0))
	    {
	      arrayOfString = new String[0];
	      return arrayOfString;
	    }
	    int i = paramString.length();
	    int j = 1 + (i - 1) / paramInt;
	    String[] arrayOfString = new String[j];
	    int k = 0;
	    label41: int m;
	    if (k < j)
	    {
	      m = k * paramInt;
	      if (paramInt + k * paramInt >= i)
	        break label90;
	    }
	    label90: for (int n = paramInt + k * paramInt; ; n = i)
	    {
	      arrayOfString[k] = paramString.substring(m, n);
	      k++;
	      break label41;
	      break;
	    }
	  }*/

	  public static int copy(Reader paramReader, Writer paramWriter)
	  {
	    long l = copyLarge(paramReader, paramWriter);
	    if (l > 2147483647L)
	      return -1;
	    return (int)l;
	  }

	  public static long copyLarge(Reader paramReader, Writer paramWriter)
	    throws RuntimeException
	  {
	    long l;
	    try
	    {
	      char[] arrayOfChar = new char[4096];
	      int i;
	      for (l = 0L; ; l += i)
	      {
	        i = paramReader.read(arrayOfChar);
	        if (-1 == i)
	          break;
	        paramWriter.write(arrayOfChar, 0, i);
	      }
	    }
	    catch (IOException localIOException)
	    {
	      throw new RuntimeException(localIOException);
	    }
	    return l;
	  }

	  public static boolean equals(Object paramObject1, Object paramObject2)
	  {
	    return toString(paramObject1).equals(toString(paramObject2));
	  }

	  public static boolean equalsIgnoreCase(Object paramObject1, Object paramObject2)
	  {
	    return toString(paramObject1).toLowerCase().equals(toString(paramObject2).toLowerCase());
	  }

	  public static boolean isEmpty(Object paramObject)
	  {
	    return toString(paramObject).trim().length() == 0;
	  }

	  public static <T> String join(String paramString, Collection<T> paramCollection)
	  {
	    if ((paramCollection == null) || (paramCollection.isEmpty()))
	      return "";
	    Iterator localIterator = paramCollection.iterator();
	    StringBuilder localStringBuilder = new StringBuilder(toString(localIterator.next()));
	    while (localIterator.hasNext())
	    {
	      Object localObject = localIterator.next();
	      if (notEmpty(localObject))
	        localStringBuilder.append(paramString).append(toString(localObject));
	    }
	    return localStringBuilder.toString();
	  }

	  public static <T> String join(String paramString, T[] paramArrayOfT)
	  {
	    return join(paramString, Arrays.asList(paramArrayOfT));
	  }

	  public static <T> String joinAnd(String paramString1, String paramString2, Collection<T> paramCollection)
	  {
	    if ((paramCollection == null) || (paramCollection.isEmpty()))
	      return "";
	    Iterator localIterator = paramCollection.iterator();
	    StringBuilder localStringBuilder = new StringBuilder(toString(localIterator.next()));
	    int i = 1;
	    while (localIterator.hasNext())
	    {
	      Object localObject = localIterator.next();
	      if (notEmpty(localObject))
	      {
	        i++;
	        if (i == paramCollection.size());
	        for (String str = paramString2; ; str = paramString1)
	        {
	          localStringBuilder.append(str).append(toString(localObject));
	          break;
	        }
	      }
	    }
	    return localStringBuilder.toString();
	  }

	  public static <T> String joinAnd(String paramString1, String paramString2, T[] paramArrayOfT)
	  {
	    return joinAnd(paramString1, paramString2, Arrays.asList(paramArrayOfT));
	  }

	 /* public static String md5(String paramString)
	  {
	    while (true)
	    {
	      StringBuilder localStringBuilder;
	      int j;
	      try
	      {
	        byte[] arrayOfByte = MessageDigest.getInstance("MD5").digest(paramString.getBytes("UTF-8"));
	        localStringBuilder = new StringBuilder();
	        int i = arrayOfByte.length;
	        j = 0;
	        if (j < i)
	        {
	          String str1 = Integer.toHexString(arrayOfByte[j]);
	          if (str1.length() == 1)
	          {
	            localStringBuilder.append('0');
	            localStringBuilder.append(str1.charAt(-1 + str1.length()));
	          }
	          else
	          {
	            localStringBuilder.append(str1.substring(-2 + str1.length()));
	          }
	        }
	      }
	      catch (Exception localException)
	      {
	        throw new RuntimeException(localException);
	      }
	      String str2 = localStringBuilder.toString();
	      return str2;
	      j++;
	    }
	  }*/

	  public static String namedFormat(String paramString, Map<String, String> paramMap)
	  {
	    Iterator localIterator = paramMap.keySet().iterator();
	    while (localIterator.hasNext())
	    {
	      String str = (String)localIterator.next();
	      paramString = paramString.replace('$' + str, (CharSequence)paramMap.get(str));
	    }
	    return paramString;
	  }

	  public static String namedFormat(String paramString, Object[] paramArrayOfObject)
	  {
	    if (paramArrayOfObject.length % 2 != 0)
	      throw new InvalidParameterException("You must include one value for each parameter");
	    HashMap localHashMap = new HashMap(paramArrayOfObject.length / 2);
	    for (int i = 0; i < paramArrayOfObject.length; i += 2)
	      localHashMap.put(toString(paramArrayOfObject[i]), toString(paramArrayOfObject[(i + 1)]));
	    return namedFormat(paramString, localHashMap);
	  }

	  public static boolean notEmpty(Object paramObject)
	  {
	    return toString(paramObject).trim().length() != 0;
	  }

	  public static String toString(InputStream paramInputStream)
	  {
	    StringWriter localStringWriter = new StringWriter();
	    copy(new InputStreamReader(paramInputStream), localStringWriter);
	    return localStringWriter.toString();
	  }

	  public static String toString(Reader paramReader)
	  {
	    StringWriter localStringWriter = new StringWriter();
	    copy(paramReader, localStringWriter);
	    return localStringWriter.toString();
	  }

	  public static String toString(Object paramObject)
	  {
	    return toString(paramObject, "");
	  }

	  public static String toString(Object paramObject, String paramString)
	  {
	    if (paramObject == null)
	      return paramString;
	    if ((paramObject instanceof InputStream))
	      return toString((InputStream)paramObject);
	    if ((paramObject instanceof Reader))
	      return toString((Reader)paramObject);
	    if ((paramObject instanceof Object[]))
	      return join(", ", (Object[])paramObject);
	    if ((paramObject instanceof Collection))
	      return join(", ", (Collection)paramObject);
	    return paramObject.toString();
	  }
}
