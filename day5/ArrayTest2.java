class ArrayTest2
{
	public static void main(String[] args) 
	{
		//js에서 선언과 동시에 값 할당할때는 let arr = ["값","값"...]
		//java에서는 아래와 같다
		String [] arr={"사과","딸기","오렌지"};

		for (int i=0;i<arr.length ;i++ ){
			System.out.println(arr[i]);
		}
	}
}
