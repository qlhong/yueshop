package com.qlh.yueshop.exception;

import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.qlh.yueshop.bean.Head;

public class CommmonException extends VolleyError {

	private Head head;

	public CommmonException(NetworkResponse paramNetworkResponse) {
		super(paramNetworkResponse);
	}

	public CommmonException(Head paramHead) {
		super(paramHead.getMessage());
		this.head = paramHead;
	}

	public CommmonException(String paramString) {
		super(paramString);
	}

	public Head getHead() {
		return this.head;
	}
}
