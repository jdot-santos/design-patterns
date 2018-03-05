package java.com.jsantos.creationalpatterns.singletonpattern.dbsingleton;

/**
 * This class shows how to create a singleton that is thread safe. The main difference between this class and {@link DbSingletonLazyLoaded} is the implementation in getInstance()
 */
public class DbSingletonThreadSafe {
	/**
	 * Note that this null initially. This will be initialized in getInstance() below
	 */
	private static DbSingletonThreadSafe instance = null;

	/**
	 * This is needed to enforce that other people cannot create instances of this.
	 */
	private DbSingletonThreadSafe() {}

	/**
	 * This is will lazily return an instance of the {@link DbSingletonThreadSafe} in a thread safe manner
	 * @return
	 */
	public static DbSingletonThreadSafe getInstance() {
		// this if statement makes this singleton lazy loaded
		if (instance == null) {

			// there's other ways of making this thread safe.
			synchronized (DbSingletonThreadSafe.class) {
				// another check needed because the outer check isn't thread safe. We still need the outer check to avoid going into synchronized which slows down your app if called often
				if (instance == null) {
					instance = new DbSingletonThreadSafe();
				}
			}
		}
		return instance;
	}
}
