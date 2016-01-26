package com.qlh.yueshop.bean;

import java.util.List;

public class ShelfList extends StatusMessage<List<Shelf>> {

	private List<Shelf> shelfList;

	public List<Shelf> getShelfList() {
		return this.shelfList;
	}

	public void setShelfList(List<Shelf> paramList) {
		this.shelfList = paramList;
	}
}
