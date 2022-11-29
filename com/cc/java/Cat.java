package com.cc.java;

public class Cat {
	private String name;
	public Cat(String name) {
		this.name = name;
		System.out.println( App.t( 1 ) + App.c( "#g" ) +  getAttributes() ); 
	}
	public String getAttributes() {
		return "Hi, I'm " + name + " and I live @: " + this;
	}
}
