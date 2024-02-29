class  DataConvert
{
	public static void main(String[] args) 
	{
		short s1 = 3;
		short s2 = 4;

		int result =(s1+s2); // int 아래는 연산 전에 int로 자동변환하므로
		//result를 int로 받던가 연산을 short로 강제 cast 해줘야함
	}
}
`