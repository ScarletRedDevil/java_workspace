class  Human{
	int eyenum=2;
	int legs=2;

	int age;

	public Human(){
	}
	public Human(int eyenum,int legs){
		this.eyenum=eyenum;
		this.legs=legs;
	}

	public void eat(){
		System.out.println("밥먹음");
	}
	public void think(){
		System.out.println("생각함");
	}
}
