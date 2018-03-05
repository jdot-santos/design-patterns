package java.com.jsantos.creationalpatterns.singletonpattern.dbsingleton;

/**
 * This is an example of a lazily loaded singleton
 */
public class DbSingletonLazyLoaded {
	/**
	 * Note that this null initially. This will be initialized in getInstance() below
	 */
	private static DbSingletonLazyLoaded instance = null;

	/**
	 * This is needed to enforce that other people cannot create instances of this.
	 */
	private DbSingletonLazyLoaded() {}

	/**
	 * This is will lazily return an instance of the {@link DbSingletonLazyLoaded}
	 * @return
	 */
	public static DbSingletonLazyLoaded getInstance() {
		// this if statement makes this singleton lazy loaded
		if (instance == null) {
			instance = new DbSingletonLazyLoaded();
		}
		return instance;
	}
}
