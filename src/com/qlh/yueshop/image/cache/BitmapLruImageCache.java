package com.qlh.yueshop.image.cache;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import android.util.Log;

import com.android.volley.toolbox.ImageLoader.ImageCache;


public class BitmapLruImageCache extends LruCache<String, Bitmap>
	implements ImageCache
{
	private final String TAG = getClass().getSimpleName();

	  public BitmapLruImageCache(int paramInt)
	  {
	    super(paramInt);
	  }

	  public Bitmap getBitmap(String paramString)
	  {
	    Log.v(this.TAG, "Retrieved item from Mem Cache");
	    return (Bitmap)get(paramString);
	  }

	  public void putBitmap(String paramString, Bitmap paramBitmap)
	  {
	    Log.v(this.TAG, "Added item to Mem Cache");
	    put(paramString, paramBitmap);
	  }

	  protected int sizeOf(String paramString, Bitmap paramBitmap)
	  {
	    return paramBitmap.getRowBytes() * paramBitmap.getHeight();
	  }

}
