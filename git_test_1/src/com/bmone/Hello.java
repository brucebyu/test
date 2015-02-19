package com.bmone;

public class Hello {
	private String name;
	
	public Hello(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public static void main(String[] args){
		System.out.println("HI ...."); 
		
		Hello hello = new Hello("Test");
		
		System.out.println("hello name is: "+ hello.getName());
		
		System.out.println("First modification to GitHub");
		
		System.out.println("Test conflicts.");
		
		System.out.println("Test pull from server.");
	}
}
