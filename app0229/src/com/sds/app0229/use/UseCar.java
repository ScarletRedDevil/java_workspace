package com.sds.app0229.use;

class UseCar{
	public static void main(String[] args) 
	{
		car car = new Car();
		System.out.println(car.handle.type);

		System.out.println(car.door[0].color);
		
		System.out.println(car.wheel[0].brand);
	}
}
