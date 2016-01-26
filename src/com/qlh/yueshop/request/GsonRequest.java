package com.qlh.yueshop.request;

import java.util.HashMap;
import java.util.Map;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.google.gson.Gson;
import com.qlh.yueshop.utils.Lg;
import com.qlh.yueshop.utils.UrlUtils;
import com.qlh.yueshop.utils.ZSSecret;

public class GsonRequest<T> extends Request<T> {

	private final Class<T> mClazz;
	private final Gson mGson = new Gson();
	private final Map<String, String> mHeaders;
	private final Response.Listener<T> mListener;

	private GsonRequest(int paramInt, String paramString, Class<T> paramClass,
			Map<String, String> paramMap, Response.Listener<T> paramListener,
			Response.ErrorListener paramErrorListener) {
		super(paramInt, paramString, paramErrorListener);
		this.mClazz = paramClass;
		this.mHeaders = paramMap;
		this.mListener = paramListener;
	}

	private GsonRequest(Builder paramBuilder) {
		this(paramBuilder.method, paramBuilder.url, paramBuilder.clazz,
				paramBuilder.headers, paramBuilder.listener,
				paramBuilder.errorListener);
	}

	private GsonRequest(String paramString, Class<T> paramClass,
			Response.Listener<T> paramListener,
			Response.ErrorListener paramErrorListener) {
		this(0, paramString, paramClass, null, paramListener,
				paramErrorListener);
	}

	@Override
	protected void deliverResponse(T arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	protected Response<T> parseNetworkResponse(NetworkResponse arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * private GsonRequest(Builder paramBuilder) { this(paramBuilder.method,
	 * paramBuilder.url, paramBuilder.clazz, paramBuilder.headers,
	 * paramBuilder.listener, paramBuilder.errorListener); }
	 */

	/*
	 * @Override protected void deliverResponse(T arg0) {
	 * 
	 * }
	 * 
	 * @Override protected Response<T> parseNetworkResponse(NetworkResponse
	 * arg0) { return null; }
	 */

	/*
	 * private GsonRequest(Builder paramBuilder) { this(paramBuilder.method,
	 * paramBuilder.url, paramBuilder.clazz, paramBuilder.headers,
	 * paramBuilder.listener, paramBuilder.errorListener); }
	 */

	/*
	 * private GsonRequest(String paramString, Class<T> paramClass,
	 * Response.Listener<T> paramListener, Response.ErrorListener
	 * paramErrorListener) { this(0, paramString, paramClass, null,
	 * paramListener, paramErrorListener); }
	 * 
	 * private void mergeHead(Head paramHead, JsonObject paramJsonObject) { if
	 * (paramHead.getCode() != 0) { paramHead.setStatus(paramHead.getCode());
	 * paramHead.setMessage(paramHead.getDesc()); } do { return; if
	 * (paramHead.getStat() != 0) { paramHead.setStatus(paramHead.getStat());
	 * paramHead.setMessage(paramHead.getMsg()); return; } } while
	 * ((paramHead.getStatus() == 200) ||
	 * (!TextUtils.isEmpty(paramHead.getMessage())));
	 * paramHead.setMessage(paramJsonObject.get("body").getAsString()); }
	 * 
	 * protected void deliverResponse(T paramT) {
	 * this.mListener.onResponse(paramT); }
	 * 
	 * public Map<String, String> getHeaders() throws AuthFailureError { HashMap
	 * localHashMap = new HashMap(); UserInfo localUserInfo =
	 * AppControler.getContext().getUser(); if (localUserInfo == null) ; for
	 * (String str = "";; str = localUserInfo.getToken()) {
	 * localHashMap.put("token", str); return localHashMap; } }
	 * 
	 * protected Map<String, String> getParams() throws AuthFailureError {
	 * return this.mHeaders; }
	 * 
	 * protected VolleyError parseNetworkError(VolleyError paramVolleyError) {
	 * Lg.e(paramVolleyError); return super.parseNetworkError(paramVolleyError);
	 * }
	 * 
	 * protected Response<T> parseNetworkResponse( NetworkResponse
	 * paramNetworkResponse) { try { String str = new
	 * String(paramNetworkResponse.data,
	 * HttpHeaderParser.parseCharset(paramNetworkResponse.headers));
	 * Lg.d("Gson json data ======>>%s", new Object[] { str }); JsonObject
	 * localJsonObject = new JsonParser().parse(str) .getAsJsonObject(); Head
	 * localHead = (Head) this.mGson.fromJson(
	 * localJsonObject.getAsJsonObject("head"), new TypeToken() { }.getType());
	 * mergeHead(localHead, localJsonObject); switch (localHead.getStatus()) {
	 * default: return Response.error(new CommmonException(localHead)); case
	 * 200: } Response localResponse = Response.success(
	 * this.mGson.fromJson(str, this.mClazz),
	 * HttpHeaderParser.parseCacheHeaders(paramNetworkResponse)); return
	 * localResponse; } catch (UnsupportedEncodingException
	 * localUnsupportedEncodingException) { return Response.error(new
	 * ParseError( localUnsupportedEncodingException)); } catch
	 * (JsonSyntaxException localJsonSyntaxException) {
	 * Lg.e(localJsonSyntaxException); return Response.error(new
	 * ParseError(localJsonSyntaxException)); } }
	 * 
	 * public static class Builder<T> { private Class<T> clazz; private
	 * Response.ErrorListener errorListener; private Map<String, String>
	 * headers; private Response.Listener<T> listener; private int method;
	 * private String url;
	 * 
	 * public Builder(int paramInt, String paramString, Class<T> paramClass,
	 * Map<String, String> paramMap, Response.Listener<T> paramListener,
	 * Response.ErrorListener paramErrorListener) { this.method = paramInt;
	 * this.url = paramString; this.headers = paramMap; this.clazz = paramClass;
	 * this.listener = paramListener; this.errorListener = paramErrorListener; }
	 * 
	 * public Builder(String paramString, Class<T> paramClass,
	 * Response.Listener<T> paramListener, Response.ErrorListener
	 * paramErrorListener) { this(0, paramString, paramClass, null,
	 * paramListener, paramErrorListener); }
	 * 
	 * private void encryt() { if (UrlUtils.isEncryt(this.url)) ; switch
	 * (this.method) { default: case 0: String[] arrayOfString1; do { return;
	 * arrayOfString1 = this.url.split("\\?"); } while (arrayOfString1.length <=
	 * 1); this.headers = new HashMap(); String[] arrayOfString2 =
	 * arrayOfString1[1].split("\\&"); for (int i = 0; i <
	 * arrayOfString2.length; i++) { String[] arrayOfString3 =
	 * arrayOfString2[i].split("="); if (arrayOfString3.length > 1)
	 * this.headers.put(arrayOfString3[0], arrayOfString3[1]); } String str2 =
	 * getEncryptString(); this.url = (arrayOfString1[0] + "?sy_c=" + str2);
	 * return; case 1: } String str1 = getEncryptString(); this.headers = new
	 * HashMap(); this.headers.put("sy_c", str1); }
	 * 
	 * private String getEncryptString() { String str1 = new
	 * Gson().toJson(this.headers); String str2 = ZSSecret.encrypt(str1);
	 * Object[] arrayOfObject = new Object[3]; if (this.method == 0) ; for
	 * (String str3 = "GET";; str3 = "POST") { arrayOfObject[0] = str3;
	 * arrayOfObject[1] = ("加密前:" + this.url + "sy_c=" + str1); arrayOfObject[2]
	 * = ("加密后:" + this.url + "sy_c=" + str2); Lg.d("加密==%s=======>>\n%s\n%s",
	 * arrayOfObject); return str2; } }
	 * 
	 * public GsonRequest<T> build() { encryt(); return new GsonRequest(this,
	 * null); } }
	 */
	  public static class Builder<T>
	  {
	    private Class<T> clazz;
	    private Response.ErrorListener errorListener;
	    private Map<String, String> headers;
	    private Response.Listener<T> listener;
	    private int method;
	    private String url;

	    public Builder(int paramInt, String paramString, Class<T> paramClass, Map<String, String> paramMap, Response.Listener<T> paramListener, Response.ErrorListener paramErrorListener)
	    {
	      this.method = paramInt;
	      this.url = paramString;
	      this.headers = paramMap;
	      this.clazz = paramClass;
	      this.listener = paramListener;
	      this.errorListener = paramErrorListener;
	    }

	    public Builder(String paramString, Class<T> paramClass, Response.Listener<T> paramListener, Response.ErrorListener paramErrorListener)
	    {
	      this(0, paramString, paramClass, null, paramListener, paramErrorListener);
	    }

	    private void encryt()
	    {
	      if (UrlUtils.isEncryt(this.url));
	      switch (this.method)
	      {
	      default:
	      case 0:
	        String[] arrayOfString1;
	        do
	        {
	         // return;
	          arrayOfString1 = this.url.split("\\?");
	        }
	        while (arrayOfString1.length <= 1);
	        this.headers = new HashMap();
	        String[] arrayOfString2 = arrayOfString1[1].split("\\&");
	        for (int i = 0; i < arrayOfString2.length; i++)
	        {
	          String[] arrayOfString3 = arrayOfString2[i].split("=");
	          if (arrayOfString3.length > 1)
	            this.headers.put(arrayOfString3[0], arrayOfString3[1]);
	        }
	        String str2 = getEncryptString();
	        this.url = (arrayOfString1[0] + "?sy_c=" + str2);
	        return;
	      case 1:
	      }
	      String str1 = getEncryptString();
	      this.headers = new HashMap();
	      this.headers.put("sy_c", str1);
	    }

	    private String getEncryptString()
	    {
	      String str1 = new Gson().toJson(this.headers);
	      String str2 = ZSSecret.encrypt(str1);
	      Object[] arrayOfObject = new Object[3];
	      if (this.method == 0);
	      for (String str3 = "GET"; ; str3 = "POST")
	      {
	        arrayOfObject[0] = str3;
	        arrayOfObject[1] = ("加密前:" + this.url + "sy_c=" + str1);
	        arrayOfObject[2] = ("加密后:" + this.url + "sy_c=" + str2);
	        Lg.d("加密==%s=======>>\n%s\n%s", arrayOfObject);
	        return str2;
	      }
	    }

	    @SuppressWarnings("unchecked")
		public GsonRequest<T> build()
	    {
	      encryt();
	      return new GsonRequest(this);
	    }
	  }

}
