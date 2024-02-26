package pattern.singleton;

public class India implements Country{

	private static volatile India india = null;
	
	private India() {
		System.out.println(Country.class.getName());
	}
	
	public static India getIndia() {
		if(india == null) {
			synchronized(India.class) {
				if(india == null) {
					india = new India();
				}
			}
		}
		return india;
	}
}
