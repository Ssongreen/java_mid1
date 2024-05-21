package java_mid1.lang.object.equals.test;

public class RectangleMain {
	public static void main(String[] args) {
		
        RectangleV1 rect1 = new RectangleV1(100, 20);
        RectangleV1 rect2 = new RectangleV1(100, 20);
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect1 == rect2);
        System.out.println(rect1.equals(rect2));
    }
}
