package java_mid1.lang.object.poly;

public class ObjectPolyExample1 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Car car = new Car();
		
		action(dog);
		action(car);
	}
	
	private static void action(Object object) {
		/*
//		object.sound();
//		object.move();
 * 	컴파일 오류, 자식이기에 안된다.
 * 
		 * */
		// object 다운 캐스팅
		if(object instanceof Dog dog) {
			dog.sound();
		} else if (object instanceof Car car) {
			car.move();
		}
	}
}
