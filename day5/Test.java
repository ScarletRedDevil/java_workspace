class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//현재 디렉토리에 String.class 파일이 존재하지 않더라도
		//java.lang이란 디렉토리에 존재하는 String.calss는 자동으로 현재 개발중인 클래스로 인식됨
		//String.class를 가지고 있는 상황
		String str="       korea  ,f";
		char c = str.charAt(6);
		System.out.println(c);

		String[] result = str.split(",");
		System.out.println("분리결과 배열길이 " +result.length);
		System.out.println("0번째 " +result[0].trim());
		System.out.println("1번째 " +result[1].trim());
		//같은 디렉토리에 Dog형을 가지므로 에러 없음
//		Dog d = new Dog("happy",6);
	}
}
