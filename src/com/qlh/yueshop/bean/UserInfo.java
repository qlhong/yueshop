package com.qlh.yueshop.bean;

public class UserInfo extends StatusMessage<UserInfo> {

	 private String account;
	  private String bgUrl;
	  private String centerUserId;
	  private String email;
	  private String image;
	  private String name;
	  private String sex;
	  private String token;
	  private String userId;
	  private String userName;

	  public String getAccount()
	  {
	    return this.account;
	  }

	  public String getBgUrl()
	  {
	    return this.bgUrl;
	  }

	  public String getCenterUserId()
	  {
	    return this.centerUserId;
	  }

	  public String getEmail()
	  {
	    return this.email;
	  }

	  public String getImage()
	  {
	    return this.image;
	  }

	  public String getName()
	  {
	    return this.name;
	  }

	  public String getSex()
	  {
	    return this.sex;
	  }

	  public String getToken()
	  {
	    return this.token;
	  }

	  public String getUserId()
	  {
	    return this.userId;
	  }

	  public String getUserName()
	  {
	    return this.userName;
	  }

	  public void setAccount(String paramString)
	  {
	    this.account = paramString;
	  }

	  public void setBgUrl(String paramString)
	  {
	    this.bgUrl = paramString;
	  }

	  public void setCenterUserId(String paramString)
	  {
	    this.centerUserId = paramString;
	  }

	  public void setEmail(String paramString)
	  {
	    this.email = paramString;
	  }

	  public void setImage(String paramString)
	  {
	    this.image = paramString;
	  }

	  public void setName(String paramString)
	  {
	    this.name = paramString;
	  }

	  public void setSex(String paramString)
	  {
	    this.sex = paramString;
	  }

	  public void setToken(String paramString)
	  {
	    this.token = paramString;
	  }

	  public void setUserId(String paramString)
	  {
	    this.userId = paramString;
	  }

	  public void setUserName(String paramString)
	  {
	    this.userName = paramString;
	  }

	  public String toString()
	  {
	    return "UserInfo [userId=" + this.userId + ", name=" + this.name + ", email=" + this.email + ", image=" + this.image + ", token=" + this.token + ", userName=" + this.userName + ", bgUrl=" + this.bgUrl + ", centerUserId=" + this.centerUserId + ", sex=" + this.sex + "]";
	  }
}
