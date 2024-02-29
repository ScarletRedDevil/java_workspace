//현재 클래스와 다른 위치에 있는 외부클래스 사용하려면
// 해당외부클래스의 위치등록해야함.
import java.util.ArrayList; //java 패키지 아래 util 패키지 아래 위치함

class CollectionTest1 {
		//자바 배열의 특징 
		// 1. 한 종류의 데이터만 담을 수 있음 ex) int[] arr=new int [5];
		// 2. 크기고정, 따라서 동적변경불가
		// 3 . 모든 배열을 객체로봄. 따라서 배열변수명 출력시 주소값이 나옴. 
		// ex) char[] arr2 = new char[2];
		//	System.out.println(arr2); -> 배열의 힙에서의 주소값 출력됨(@~~~)
		// 때문에 크기고정된 배열은 프로그램에서의 한계이기 때문에(총알 생성시마다 배열에 담는 등을 못함)
		// java lib. 중 collection framework 라는 lib를 사용해보기. (class 모은 집합)
		// collection framework? -> 자바 객체를 모아 처리할대 유용한 기능을 지원하는 자바의 lib(패키지로 지원), java.util 패키지(디렉토리)에.

		// 컬렉션을 이루는 객체유형
		// 1) 순서있는유형(List)형
		// 2) 순서없는유형(Set)
		// 3) key-value 로 이루어진 유형
	public static void main(String[] args) {
		//conllection frameworks의 순서있는 객체집합을 제어할 수 있는 객체인
		// List의 자식인 ArrayList를 사용해보기 :
		// List 는 우리가 사용했던 비열과 거의 같지만, 
		//1) 크기가 동적으로 변경될 수 있고, 
		//2) 오직 객체만 담을 수 있음
		//3) 객체를 섞어서 담을 수 있음 
		ArrayList list = new ArrayList(); //인스턴스 생성
		list.add("apple"); // js.push()와 동일
		list.add("banana");
		list.add("grape");

		System.out.println("리스트의 사이즈는 " +list.size());
	}
}
