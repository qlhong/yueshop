package com.qlh.yueshop.manager;

import android.content.Context;
import android.graphics.Bitmap;

import com.android.volley.toolbox.ImageLoader;
import com.qlh.yueshop.application.AppControler;
import com.qlh.yueshop.image.cache.BitmapLruImageCache;
import com.qlh.yueshop.image.cache.DiskLruImageCache;
import com.qlh.yueshop.utils.Connectivity;
import com.qlh.yueshop.utils.MD5Util;
import com.qlh.yueshop.utils.PreferenceUtils;

public class ImageCacheManager {

	 private static ImageCacheManager mInstance;
	  private ImageLoader.ImageCache mImageCache;
	  private ImageLoader mImageLoader;

	  private String createKey(String paramString)
	  {
	    return MD5Util.MD5(paramString);
	  }

	  public static ImageCacheManager getInstance()
	  {
	    if (mInstance == null)
	      mInstance = new ImageCacheManager();
	    return mInstance;
	  }

	  public Bitmap getBitmap(String paramString)
	  {
	    try
	    {
	      Bitmap localBitmap = this.mImageCache.getBitmap(createKey(paramString));
	      return localBitmap;
	    }
	    catch (NullPointerException localNullPointerException)
	    {
	    }
	    throw new IllegalStateException("Disk Cache Not initialized");
	  }

	  public void getImage(String paramString, ImageLoader.ImageListener paramImageListener)
	  {
	    if (((Connectivity.isConnectedWifi(AppControler.getContext())) || (PreferenceUtils.getPrefBoolean(AppControler.getContext(), "isWifi", true))) && (paramString != null))
	    {
	      this.mImageLoader.get(paramString, paramImageListener);
	      return;
	    }
	    this.mImageLoader.get("", paramImageListener);
	  }

	  public ImageLoader getImageLoader()
	  {
	    return this.mImageLoader;
	  }

	  public void init(Context paramContext, String paramString, int paramInt1, Bitmap.CompressFormat paramCompressFormat, int paramInt2, CacheType paramCacheType)
	  {
	   /* switch (CacheType[paramCacheType.ordinal()])
	    {
	    default:
	    case 1:
	    case 2:
	    }*/
	    while (true)
	    {
	      for (this.mImageCache = new BitmapLruImageCache(paramInt1); ; this.mImageCache = new DiskLruImageCache(paramContext, paramString, paramInt1, paramCompressFormat, paramInt2))
	      {
	        this.mImageLoader = new ImageLoader(RequestManager.getRequestQueue(), this.mImageCache);
	        return;
	      }
	     // this.mImageCache = new BitmapLruImageCache(paramInt1);
	    }
	  }

	  public void putBitmap(String paramString, Bitmap paramBitmap)
	  {
	    try
	    {
	      this.mImageCache.putBitmap(createKey(paramString), paramBitmap);
	      return;
	    }
	    catch (NullPointerException localNullPointerException)
	    {
	    }
	    throw new IllegalStateException("Disk Cache Not initialized");
	  }

	  public static enum CacheType
	  {DISK,MEMORY
	   /* static
	    {
	      CacheType[] arrayOfCacheType = new CacheType[2];
	      arrayOfCacheType[0] = DISK;
	      arrayOfCacheType[1] = MEMORY;
	    }*/
	  }
}
