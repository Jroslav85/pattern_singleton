package pattern.singleton;

public class China implements Country{
	private static volatile China china = null;
	
	private China() {
		System.out.println(Country.class.getName());
	}
	
	public static China getChina() {
		if(china == null) {
			synchronized(China.class) {
				if(china == null) {
					china = new China();
				}
			}
		}
		return china;
	}
}
