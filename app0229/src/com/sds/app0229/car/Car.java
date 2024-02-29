package com.sds.app0229.car;

public class Car{
	public Wheel[] wheel;
	public Handle handle;
	public Door[] door;
	int price = 50; // 이건 has a 관계에 소속되지 않음. is a , has a 는 모두 '객체'간 관계를 말하므로.

	//has a 관게로 즉 객체를 보유한 클래스의 인스턴스를 올릴 때는 초기화 작업이 일반자료형에 비해
	// 처리해야할 작업이 많음.따라서 적극적으로 생성자를 활용하자. 
	public Car(){
		wheel = new Wheel[4];
		wheel[0] = new Wheel();
		wheel[1] = new Wheel();
		wheel[2] = new Wheel();
		wheel[3] = new Wheel();

		handle = new Handle();

		door = new Door[2];
		door[0] = new Door();
		door[1] = new Door();
	}
}