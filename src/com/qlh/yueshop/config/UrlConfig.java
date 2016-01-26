package com.qlh.yueshop.config;

public class UrlConfig {
	public static final String API_AFTER_ORDER;
	public static final String API_BACKGOODS_REQUEST;
	public static final String API_BACKGOODS_WULIU;
	public static final String API_BACK_GOODS;
	public static final String API_BACK_MONEY;
	public static final String API_COMMENT;
	public static final String API_COMMENT_LIST;
	public static final String API_DEL_ORDER;
	public static final String API_GOODS_LIST;
	public static final String API_GOODS_RECOLLECTION;
	public static final String API_HELP_CENTER;
	public static final String API_HOST;
	public static final String API_LIMIT_TIME_BUY_LIST;
	public static final String API_LOGO;
	public static final String API_MALL_INFO;
	public static final String API_MORE_COMMENT;
	public static final String API_MYFAVORITE_GOODS;
	public static final String API_MYFAVORITE_SHOPS;
	public static final String API_MY_NUM;
	public static final String API_NOTICES;
	public static final String API_POST_COMMENT;
	public static final String API_POST_SUGGEST;
	public static final String API_QUERY_BACKGOODS;
	public static final String API_REC_ORDER;
	public static final String API_SEARCH_GOODS;
	public static final String API_SEARCH_SECOND_FILTER;
	public static final String API_SEARCH_WORD_LIST;
	public static final String API_SHENHE_RESULT;
	public static final String API_SHOPS;
	public static final String API_STORE;
	public static final String API_STORE_COLLECTION;
	public static final String API_STORE_COMMODITY_LIST;
	public static final String API_STORE_RECOLLECTION;
	public static final String API_WAIT_GOODS;
	public static final String API_WAIT_PAY;
	public static final String H5_ABOUT;
	public static final String H5_ADDRESS_MANAGER;
	public static final String H5_ADDRESS_edit;
	public static final String H5_COMMODITY_DETAIL;
	public static final String H5_COMMODITY_DETALL2;
	public static final String H5_HELP_DETALL;
	public static String H5_HOME_URL;
	public static final String H5_HOST;
	public static final String H5_LIMITTIMEBUYING_COMMIT;
	public static final String H5_LIMIT_TIME_BUY;
	public static final String H5_NOTICES_DETAIL;
	public static final String H5_ORDER_COMMIT;
	public static final String H5_ORDER_DETALL;
	public static final String H5_SHOP_CART;
	public static final String H5_SUBMIT_ORDERS;
	public static final String H5_SUBMIT_ORDERS_SUCCESS;
	public static final String H5_WULIU_QUERY;
	public static String HOST;
	public static String MALL_ID;
	public static final String SHOP_SHELF;
	public static final String SOUYUE_FIND_PASSWORD;
	public static String SOUYUE_HOST;
	public static final String SOUYUE_LOGIN;
	public static final String SOUYUE_LOGIN_SEND_MSG;
	public static final String SOUYUE_REGISTERED;
	public static final String SOUYUE_REGISTERED_COMMIT;
	public static final String SOUYUE_SECURITY_CENTER = "https://security.zhongsou.com/SecurityCenter/index";
	public static final String SOUYUE_SECURITY_FIND_PSW = "https://security.zhongsou.com/GeneralRegister/FindPwd";
	public static final String SOUYUE_SHORT_URL = "http://api2.souyue.mobi/d3api2/shortURL.groovy";
	public static final String SOUYUE_ZSB;
	public static final String ZMALL_GET_TOKEN;
	public static final String ZMALL_LOGIN;
	public static String ZMALL_LOGIN_HOST;
	public static final int ZMALL_ONLINE = 2;
	public static final int ZMALL_PRE_ONLINE = 1;
	public static int ZMALL_SERVICE = 2;
	// public static final int ZMALL_TEST;
	public static String ZSB_HOST;

	static {
		MALL_ID = "yuemall";
		API_HOST = HOST + "ptmall/" + MALL_ID + "/api/";
		H5_HOST = HOST + "/ptmall/" + MALL_ID + "/page/";
		H5_SHOP_CART = H5_HOST + "/user/cart";
		H5_COMMODITY_DETAIL = H5_HOST + "goods/%1$s";
		H5_WULIU_QUERY = H5_HOST + "/user/order/%1$s/express";
		H5_ADDRESS_MANAGER = HOST + "ptmall/page/user/address/list?from=%1$s";
		H5_ADDRESS_edit = HOST + "ptmall/page/user/address/%1$s/edit";
		H5_LIMIT_TIME_BUY = H5_HOST + "/goods/scarebuy/%1$d";
		H5_COMMODITY_DETALL2 = H5_HOST + "/goods/%1$s/detail/%2$d";
		H5_ORDER_COMMIT = H5_HOST + "user/order/showpay?ids=%1$s";
		H5_LIMITTIMEBUYING_COMMIT = H5_HOST
				+ "user/scarebuy/check?skuId=%1$s&num=%2$d";
		H5_ORDER_DETALL = H5_HOST + "user/order/%1$s/detail";
		H5_HELP_DETALL = H5_HOST + "/help/%1$d/detail";
		H5_SUBMIT_ORDERS = H5_HOST + "/user/check?cartIds=%1$s";
		H5_SUBMIT_ORDERS_SUCCESS = H5_HOST + "user/order/success";
		H5_ABOUT = H5_HOST + "/mall/detail";
		H5_NOTICES_DETAIL = H5_HOST + "notice/%1$s/detail";
		API_LOGO = H5_HOST + "mall/logo";
		API_GOODS_LIST = H5_HOST + "user/check/goodslist?cartIds=%1$S";
		SOUYUE_LOGIN = SOUYUE_HOST + "d3api2/user/login.groovy";
		SOUYUE_REGISTERED = SOUYUE_HOST
				+ "d3api2/user/sendMobileVerify.groovy?mobile=%1$s&eventType=%2$s";
		SOUYUE_REGISTERED_COMMIT = SOUYUE_HOST
				+ "d3api2/user/register3.1.groovy?account=%1$s&nick=%2$s&type=%3$s&validate=%4$s&imei=%5$s";
		SOUYUE_ZSB = ZSB_HOST + "index.php?vc=1&s=userscore/get/";
		SOUYUE_LOGIN_SEND_MSG = SOUYUE_HOST
				+ "d3api2/user/sendMobileVerify.groovy?eventType=6&mobile=%1$s";
		SOUYUE_FIND_PASSWORD = SOUYUE_HOST
				+ "d3api2/user/updatePwd.groovy?vc=1&mobile=%1$s&verifyNum=%2$s&pwd=%3$s&eventType=2";
		ZMALL_LOGIN = ZMALL_LOGIN_HOST + "/api/login/login";
		ZMALL_GET_TOKEN = API_HOST + "/logCheck/getToken?code=%1$s";
		SHOP_SHELF = API_HOST + "shelf/";
		API_SEARCH_WORD_LIST = API_HOST + "search/hotWords";
		API_STORE = API_HOST + "shop/%1$d?username=%2$s";
		API_STORE_COMMODITY_LIST = API_HOST
				+ "/shop/%1$d/goods?psize=10&orderBy=%2$d&pno=%3$d";
		API_SHOPS = API_HOST + "shops?pno=%1$d";
		API_MYFAVORITE_SHOPS = API_HOST + "user/favorite/shops?pno=%1$d";
		API_MYFAVORITE_GOODS = API_HOST + "user/favorite/goods?pno=%1$d";
		API_BACK_MONEY = API_HOST + "user/orders/return?psize=10&pno=%1$d";
		API_BACK_GOODS = API_HOST
				+ "user/toBeReturnedOrderItems?psize=10&pno=%1$d&orderId=%2$s";
		API_WAIT_PAY = API_HOST + "user/orders/unfinished?status=1";
		API_WAIT_GOODS = API_HOST + "user/orders/unfinished?status=3";
		API_REC_ORDER = API_HOST + "user/orders?timeScope=0&psize=10&pno=%1$d";
		API_AFTER_ORDER = API_HOST
				+ "user/orders?timeScope=1&psize=10&pno=%1$d";
		API_STORE_COLLECTION = API_HOST + "user/favorite/shops/add/%1$s";
		API_STORE_RECOLLECTION = API_HOST + "user/favorite/shops/delete/%1$s";
		API_GOODS_RECOLLECTION = API_HOST + "user/favorite/goods/delete/%1$s";
		API_DEL_ORDER = API_HOST + "user/orders/delete/%1$s";
		API_COMMENT = API_HOST
				+ "user/toBeCommentedOrderItems?pno=%1$d&psize=10";
		API_SEARCH_GOODS = API_HOST
				+ "search?pno=%1$d&psize=10&keyWord=%2$s&orderBy=%3$d";
		API_SEARCH_SECOND_FILTER = API_HOST
				+ "search/filter?shelfId=%1$d&keyWord=%2$s&category=%3$s";
		API_NOTICES = API_HOST + "notices?pno=%1$d";
		API_COMMENT_LIST = API_HOST
				+ "/goods/%1$s/comments?type=%2$d&psize=10&pno=%3$d";
		API_LIMIT_TIME_BUY_LIST = API_HOST
				+ "scareBuy/goods?status=%1$d&psize=10&pno=%2$d";
		API_QUERY_BACKGOODS = API_HOST + "user/orders/%1$s/returnProgress";
		API_HELP_CENTER = API_HOST + "helps";
		API_POST_SUGGEST = API_HOST + "suggest";
		API_POST_COMMENT = API_HOST + "/user/items/%1$s/comment";
		API_SHENHE_RESULT = API_HOST + "user/orders/%1$s/refuse";
		API_BACKGOODS_REQUEST = API_HOST + "user/orders/%1$s/return/%2$s";
		API_BACKGOODS_WULIU = API_HOST + "user/orders/%1$s/ship";
		API_MY_NUM = API_HOST + "user/orders/count";
		API_MORE_COMMENT = API_HOST + "goods/%1$s/comments/%2$s?psize=10";
		API_MALL_INFO = API_HOST + "mall/info";
		HOST = "http://202.108.33.210/";
		SOUYUE_HOST = "http://103.29.134.224/";
		ZMALL_LOGIN_HOST = "http://apitest.zhongsou.com";
		H5_HOME_URL = HOST + "/ptmall/" + MALL_ID;
		ZSB_HOST = "http://103.29.134.124:8081/";
		HOST = "http://mall.zhongsou.com/";
		SOUYUE_HOST = "http://api2.souyue.mobi/";
		ZMALL_LOGIN_HOST = "http://api.zhongsou.com";
		H5_HOME_URL = HOST + "/ptmall/" + MALL_ID;
		ZSB_HOST = "http://api.jifen.zhongsou.com/";
	}
}
