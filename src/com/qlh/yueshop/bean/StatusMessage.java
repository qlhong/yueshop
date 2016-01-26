package com.qlh.yueshop.bean;

import java.io.Serializable;

public class StatusMessage<T> implements Serializable {

	private T body;
	private Head head;

	public T getBody() {
		return this.body;
	}

	public Head getHead() {
		return this.head;
	}

	public void setBody(T paramT) {
		this.body = paramT;
	}

	public void setHead(Head paramHead) {
		this.head = paramHead;
	}
}
