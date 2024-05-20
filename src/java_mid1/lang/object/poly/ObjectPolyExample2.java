package java_mid1.lang.object.poly;

public class ObjectPolyExample2 {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Car car = new Car();
		
		Object object = new Object(); //인스턴스 만들 수 있음
		Object[] objects = {dog, car, object};
		size(objects);
		
	}
	
	public static void size(Object[] objects) {
		System.out.println("전달된 객체수 :" + objects.length);
	}
}
