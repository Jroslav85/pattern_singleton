package pattern.singleton;

public class Russia implements Country{

	private static volatile Russia russia = null;

	private Russia() {
		System.out.println(Russia.class.getName());
	}

	public static Russia getRussia() {
		if (russia == null) {
			synchronized (Russia.class) {
				if (russia == null) {
					russia = new Russia();
				}
			}
		}
		return russia;
	}
}
