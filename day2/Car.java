class Car {
	/* 데이터는 변수, 변경은 함수로 구현 */
	String color = "yellow"; // String은 문자열 객체이기 때문에 대문자로 시작
	int price = 200;

	public void setColor() { // 리턴없이 동작만함
		color = "red";
	}

	public int setPrice(){
		price = 500;
		return price;
	}

	// return된 값의 자료형을 void 자리에 작성해야함
	public int getRandom() {
		return 5;

	}

}