package java.com.jsantos.creationalpatterns.singletonpattern.everydayexamples;

public class RuntimeExamples {

	public static void main(String[] args) {

		// grab a runtime environment instance and run 'garbage collect' to verify it's the real runtime
		Runtime singleton = Runtime.getRuntime();
		singleton.gc();

		// print out object address
		System.out.println(singleton);

		// this should be the same instance I grabbed above
		Runtime anotherInstance = Runtime.getRuntime();

		// this should print the same addy
		System.out.println(anotherInstance);

		// further verification that these two are the same object
		if (singleton == anotherInstance) {
			System.out.println("The two singletons I created are the same!");
		}
	}
}
