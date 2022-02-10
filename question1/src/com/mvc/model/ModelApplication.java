package com.mvc.model;

import java.io.Serializable;

public class ModelApplication implements Serializable {
	private static final long serialVersionUID = 1L;
	private int count;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public void incrementCount(){
		count = count + 1;
	}
}
