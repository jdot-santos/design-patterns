package java.com.jsantos.creationalpatterns.prototypepattern.registrydemo;

public class RegistryDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();

		// remember that under the covers, createItem() is executing the clone() method.
		Movie movie = (Movie) registry.createItem("Movie");
		// override default price
		movie.setPrice(5.99);

		System.out.println(movie);
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		System.out.println(movie.getPrice());

		// get another movie type of item from the registry
		Movie anotherMovie = (Movie) registry.createItem("Movie");

		// override default title
		anotherMovie.setTitle("Anchorman 2");

		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getUrl());
		System.out.println(anotherMovie.getPrice());
	}

}
