package pattern.singleton;

public class Canada implements Country {
	
	private static volatile Canada canada = null;
	
	private Canada() {
		System.out.println(Canada.class.getName());
	}
	
	public static Canada getCanada() {
		if(canada == null) {
			synchronized(Canada.class) {
				if(canada == null) {
					canada = new Canada();
				}
			}
		}
		return canada;
	}
}
