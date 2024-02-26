package pattern.singleton;

public class USA implements Country{
 
	private static volatile USA usa = null;
	
	private USA() {
		System.out.println(USA.class.getName());
	}
	
	public static USA getUSA() {
		if(usa == null) {
			synchronized(USA.class) {
				if(usa == null) {
					usa = new USA();
				}
			}
		}
		return usa;
	}
}
