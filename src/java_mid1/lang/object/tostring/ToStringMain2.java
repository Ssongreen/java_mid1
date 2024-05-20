package java_mid1.lang.object.tostring;

public class ToStringMain2 {
	public static void main(String[] args) {
		Car car = new Car("model y");
		Dog dog1 = new Dog("멍멍 :", 6);
		Dog dog2 = new Dog("멍멍2 :", 7);

		System.out.println("1. 단순 toString 호출");
		System.out.println(car.toString());
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());

		System.out.println("2. println 내부에서 toString 호출");
		System.out.println(car);
		System.out.println(dog1);
		System.out.println(dog2);

		System.out.println("3. object 다형성 활용");
		
		Objectprinter.print(car);
		Objectprinter.print(dog1);
		Objectprinter.print(dog2);
		
		
		String i = Integer.toHexString(System.identityHashCode(car)); 
		System.out.println("i = :" + i);
		
		String v = Integer.toHexString(System.identityHashCode(dog2)); 
		System.out.println("v = :" + v);
		
		
	}
}
