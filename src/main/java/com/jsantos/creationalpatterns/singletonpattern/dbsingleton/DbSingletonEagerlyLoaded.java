package java.com.jsantos.creationalpatterns.singletonpattern.dbsingleton;

/**
 * This class shows the bare minimum of how to implement the singleton pattern. Please note a couple things:
 * 		* This is an eagerly loaded singleton
 * 		* This implementation is NOT thread safe
 */
public class DbSingletonEagerlyLoaded {

	/**
	 * This gets created when the JVM starts up, which makes it eagerly loaded.
	 */
	private static DbSingletonEagerlyLoaded instance = new DbSingletonEagerlyLoaded();

	/**
	 * This is needed to enforce that other people cannot create instances of this.
	 */
	private DbSingletonEagerlyLoaded() {}

	/**
	 * This is how we will get our instance of the {@link DbSingletonEagerlyLoaded}
	 * @return
	 */
	public static DbSingletonEagerlyLoaded getInstance() {
		return instance;
	}
}
