package com.sds.app0229.bird;

public class Duck extends Bird{
	public String color = "white";

	public void quack(){
		System.out.println("오리꽥");
	}
	public void fly(){
		System.out.println("오리날음");
	}
	public static void main(String[] args){
		Bird bird = new Bird();
		bird.fly();
	}
}
