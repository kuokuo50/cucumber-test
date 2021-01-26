package com.en;

public class Hello {
	private String name = null;
	 
	public Hello(String name) {
		this.name = name;
	}
	
	public String sayHi() {
		return "Hi~" + this.name;
	}
}
