package java_mid1.lang.object;

//부모가 없으면 묵시적으로 Object 클래스를 상속 받음

public class Parent extends Object{
	
	public void parentMethod() {
		System.out.println("Parent.method");
	}
}
