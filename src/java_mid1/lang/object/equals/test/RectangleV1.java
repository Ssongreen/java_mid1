package java_mid1.lang.object.equals.test;

public class RectangleV1 {
	private int width;
	private int height;
	
	public RectangleV1(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj ) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		RectangleV1 rectangle = (RectangleV1) obj;
		
		return width == rectangle.width && height == rectangle.height;
	}
	
	@Override
	public String toString() {
		return "rectang ==> width :" + width +", height :"+ height;
	}
}
