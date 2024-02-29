package com.sds.app0229.use;

import com.sds.app0229.bird.Duck;
import com.sds.app0229.bird.Bird;

class UseDuck{
	public static void main(String[] args) {
		//기본자료형 간 형변환
		//숫자 ~ 문자간 형변환 가능
		Duck d = new Duck();

		Bird bird = new Duck();

	    System.out.println(bird.age);

	}
	
}
