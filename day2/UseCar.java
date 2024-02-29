class UseCar {
    public static void main(String[] args) {
        Car c = new Car();//거푸집으로부터 인스턴스 한개 생성해 c라는 변수로 보관
        int r = c.getRandom();

        System.out.println(r);
    }
}
