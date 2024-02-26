package pattern.singleton;

public class Argentina implements Country{
	
	private static volatile Argentina argentina = null;
	
	private Argentina() {
		System.out.println(Argentina.class.getName());
	}
	
	public static Argentina getArgentina() {
		if(argentina == null) {
			synchronized(Argentina.class) {
				if(argentina == null) {
					argentina = new Argentina();
				}
			}
		}
		return argentina;
	}
}
