package java.com.jsantos.creationalpatterns.singletonpattern.dbsingleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		singletonEagerlyLoadedDemo();
		singletonLazilyLoadedDemo();
		singletonThreadSafeDemo();
	}

	private static void singletonEagerlyLoadedDemo() {
		System.out.println("demo of the eagerly loaded singleton");
		DbSingletonEagerlyLoaded instance = DbSingletonEagerlyLoaded.getInstance();

		// this is added to prove that this cannot work since we made DbSingleton constructor private
//		DbSingleton anotherInstance = new DbSingleton();

		System.out.println(instance);
		DbSingletonEagerlyLoaded anotherInstance = DbSingletonEagerlyLoaded.getInstance();

		// this should print out the same object address
		System.out.println(anotherInstance);
		System.out.println();
	}

	/**
	 * This is should yield the same results as singletonEagerlyLoadedDemo, but using the {@link DbSingletonLazyLoaded} class
	 */
	private static void singletonLazilyLoadedDemo() {
		System.out.println("demo of the lazy loaded singleton");
		DbSingletonLazyLoaded instance = DbSingletonLazyLoaded.getInstance();

		System.out.println(instance);
		DbSingletonLazyLoaded anotherInstance = DbSingletonLazyLoaded.getInstance();

		// this should print out the same object address
		System.out.println(anotherInstance);
		System.out.println();
	}

	/**
	 * This is should yield the same results as singletonEagerlyLoadedDemo, but using the {@link DbSingletonThreadSafe} class
	 */
	private static void singletonThreadSafeDemo() {
		System.out.println("demo of the lazy loaded thread safe singleton");
		DbSingletonThreadSafe instance = DbSingletonThreadSafe.getInstance();

		System.out.println(instance);
		DbSingletonThreadSafe anotherInstance = DbSingletonThreadSafe.getInstance();

		// this should print out the same object address
		System.out.println(anotherInstance);
		System.out.println();
	}
}
