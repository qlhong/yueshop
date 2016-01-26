package com.qlh.yueshop.bean;

public class Shelf {

	private int parent_id;
	private int shelf_id;
	private String shelf_img;
	private String shelf_name;

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public int getShelf_id() {
		return shelf_id;
	}

	public void setShelf_id(int shelf_id) {
		this.shelf_id = shelf_id;
	}

	public String getShelf_img() {
		return shelf_img;
	}

	public void setShelf_img(String shelf_img) {
		this.shelf_img = shelf_img;
	}

	public String getShelf_name() {
		return shelf_name;
	}

	public void setShelf_name(String shelf_name) {
		this.shelf_name = shelf_name;
	}
}
