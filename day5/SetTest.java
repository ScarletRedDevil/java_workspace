//컬렉션 프레임워크에서 순서없는 객체들의 집합을 다루는 Set
// HashSet : 
//1) 순서없이 모여짐
//2) 중복불허(중복시 덮어씀)
//3) 객체만 담을 수 있음.(모든 collection frameworks의 특징) 
import java.util.HashSet;

class  SetTest{
	public static void main(String[] args) 	{
		HashSet set = new HashSet();
		set.add("BMW");
		set.add("Audi");
		set.add("Benz");

		Iterator it = set.iterator();
	}
}
