package com.sds.app0229.use;

class TestObject {
	public static void main(String[] args) 	{
		//아래 3 변수 모두 자식인 TestObject 인스턴스 주소를 가리킴.
		// 상속관계에서 부모의 인스턴스 주소값을 가져올 방법은 없음.
		// = 부모의 인스턴스는 올라간 적이 없고, 자식 인스턴스 내에 부모의 재산이 들어간 상태라서.
		// 
		TestObject to = new TestObject(); //a,
		// 접근범위 : 자식인스턴스 모든영역 + 내 메모리 내 부모 영역
		Object obj = new TestObject(); //b, 상위 자료형인 object 로 캐스팅한것임 
		// 접근범위 : 자식 인스턴스 내의 부모, 예외로 자식이 오버라이드한 메서드가 있다면 obj.부모() 불러도 자식으로 나옴. 
		// 자식 메서드가 최신이므로 최신으로 가져옴
		TestObject re = (TestObject)obj;//c
		//접근범위 : 자식인스턴스 모든영역 + 내 메모리 내 부모 영역
	}
}
