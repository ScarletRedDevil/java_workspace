// 

package animal;
//패키지에 담긴 클래스를 외부에서 사용하게 하려면 반드시 해당 클래스를 public 으로 열어야함
public class  Dog{
	private String name="dogname";
	private int age=9;
	//변수를 public으로 놓아도 되지만, 중요한 정보일수도 있으므로 
	// 변수를 public 으로 놓는 경우가 잘 없음
	// 따라서 변수를 private로 외부접근 막고 오직 허용된 메서드로만
	// 변수를 제어할 수 있도록 작성하는 클래스정의기법 -> 캡슐화(은닉화) 

	public String getName(){
		return name;
	}

	public void setName(String name){//setter wiriting
		this.name=name;
		}
}
