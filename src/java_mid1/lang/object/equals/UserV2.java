package java_mid1.lang.object.equals;

public class UserV2 {
	private String id;

	public UserV2(String id) {
		this.id = id;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		UserV2 user = (UserV2) obj;
//		boolean result = id == user.id;
//		return result;
//		
//	}
	
	//정확한 equals 구현
			
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj ) return true;
//		
//		if(obj == null || getClass() != obj.getClass()) return false;
//		UserV2 userV2 = (UserV2) obj;
//		
//		return Object.equals(id, userV2.id);
//	}
//	
//	@Override
//	public int hashCode() {
//		return Object.hash(id);
//	}
	
	
}
