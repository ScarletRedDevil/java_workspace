class ArrayTest1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		/*자바는 일반적 프로그래밍 언어와 마찬가지로
		배열 선언시 그 크기를 명시해야함 
		즉, 자동으로 늘어나는 js 와 다르게 고정적이다. 
		자바에서의 배열은 일반적 변수선언과 마찬가지로 반드시 자료형 명시 필요*/
		int[] arr = new int[4];
		System.out.println("배열크기"+arr.length);

		System.out.println(arr);
		//자바의 모든 자료형으로 배열 생성 가능 - 자바에서 자료형은 기본자료형(문,숫,논)+객체자료형

		boolean[] arr2 = new boolean[3];
		char[] arr3 = new char[5];

		String[] arr4 = new String[3];
		arr4[0] = "apple";
		arr4[1] = "apple";
		arr4[2] = "apple";

		for (int i=1;i<=3 ;i++ ){
			System.out.println(arr4[i]);
		}
		
	}
}
