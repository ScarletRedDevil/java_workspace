class Duck extends Bird{
	//보편적 특성은 부모 클래스에서 이미 정의했으므로, Duck만의 고유 특성을 표현하는게 효율적임
	public Duck(){
		//상속관계에서 super() 디폴트 생성자를 자동호출할때
		//부모가 매개변수 있는 생성자만 가지고있으면
		//컴파일러에 의한 자동호출에 의지하지 말고
		//개발자가 직접 나서야함
		super("yellow");
		System.out.println("오리");
	}
	public void quack(){
		System.out.println("꽥");
	}
}