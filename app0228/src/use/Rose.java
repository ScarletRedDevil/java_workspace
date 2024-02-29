package flower; // 이 클래스는 bin 아래 flower로 존재

public class  Rose{
	String color = "red";
	// 클래스만 허용한다 (주의 - 상속관계의 자식이 다른 패키지에 있을 경우 접근불가)
	private String name = "장미";//현재 클래스내의 메서드만 접근가능

	public String getName(){
		retrun name;
	}
	public void setName(String naem){
		this.naem=naem;
	}
}
