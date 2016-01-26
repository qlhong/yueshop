package com.qlh.yueshop.application;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.CookieManager;

import com.android.volley.toolbox.ImageLoader;
import com.google.gson.Gson;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.qlh.yueshop.bean.UserInfo;
import com.qlh.yueshop.exception.DefaultExceptionHandler;
import com.qlh.yueshop.manager.ImageCacheManager;
import com.qlh.yueshop.manager.RequestManager;
import com.qlh.yueshop.utils.Lg;
import com.qlh.yueshop.utils.MakeCookie;
import com.qlh.yueshop.utils.PreferenceUtils;

public class AppControler extends Application {

	private static Bitmap.CompressFormat DISK_IMAGECACHE_COMPRESS_FORMAT = Bitmap.CompressFormat.PNG;
	  private static int DISK_IMAGECACHE_QUALITY = 0;
	  private static int DISK_IMAGECACHE_SIZE = 0;
	  private static final String TAG = "APPCONTROLER";
	  private static AppControler sContext;
	  private UserInfo user;

	  private void createImageCache()
	  {
	    ImageCacheManager.getInstance().init(this, getPackageCodePath(), DISK_IMAGECACHE_SIZE, DISK_IMAGECACHE_COMPRESS_FORMAT, DISK_IMAGECACHE_QUALITY, ImageCacheManager.CacheType.DISK);
	  }

	  public static AppControler getContext()
	  {
	    return sContext;
	  }

	  private UserInfo getUserInfo(Context paramContext)
	  {
	    String str = PreferenceUtils.getPrefString(paramContext, "userinfo", null);
	    try
	    {
	      UserInfo localUserInfo = (UserInfo)new Gson().fromJson(str, UserInfo.class);
	      return localUserInfo;
	    }
	    catch (Exception localException)
	    {
	      Lg.e("sp", new Object[] { "无法获取用户信息" });
	      localException.printStackTrace();
	    }
	    return null;
	  }

	  private void init()
	  {
	    RequestManager.init(this);
	    createImageCache();
	    initImageLoader(getApplicationContext());
	    //UmengUpdateAgent.setUpdateCheckConfig(false);
	    Thread.setDefaultUncaughtExceptionHandler(new DefaultExceptionHandler(getApplicationContext()));
	  }

	  public static void initImageLoader(Context paramContext)
	  {
	    //ImageLoaderConfiguration localImageLoaderConfiguration = new ImageLoaderConfiguration.Builder(paramContext).threadPriority(3).denyCacheImageMultipleSizesInMemory().diskCacheFileNameGenerator(new Md5FileNameGenerator()).diskCacheSize(52428800).tasksProcessingOrder(QueueProcessingType.LIFO).writeDebugLogs().build();
	   // ImageLoader.getInstance().init(localImageLoaderConfiguration);
	  }

	  public UserInfo getUser()
	  {
	    if (this.user == null)
	      return getUserInfo(this);
	    return this.user;
	  }

	  public boolean isLogin(Context paramContext)
	  {
	    return (getUserInfo(paramContext) != null) && (!"".equals(getUserInfo(paramContext)));
	  }

	  public void login(UserInfo paramUserInfo)
	  {
	    PreferenceUtils.setPrefString(this, "userinfo", new Gson().toJson(paramUserInfo));
	    MakeCookie.synCookies(this, "https://security.zhongsou.com/SecurityCenter/index");
	  }

	  public void loginOut()
	  {
	    PreferenceUtils.setPrefString(this, "userinfo", "");
	    CookieManager.getInstance().removeAllCookie();
	  }

	  public void onCreate()
	  {
	    super.onCreate();
	    sContext = this;
	    init();
	  }

	  public void setUser(UserInfo paramUserInfo)
	  {
	    this.user = paramUserInfo;
	  }
}
