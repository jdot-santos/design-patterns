package java.com.jsantos.creationalpatterns.prototypepattern.registrydemo;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the meat of the prototype, meaning that this where you get to see how the prototype pattern works.
 *
 * This is a very basic implementation of a registry, made to just show how the prototype pattern can be implemented.
 */
public class Registry {

	private Map<String, Item> items = new HashMap<>();

	public Registry() {
		loadItems();
	}

	/**
	 * Returns an Item depending on the type. This is essentially creating a new item based off of a basic item in the registry.
	 *
	 * Remember that this doesn't use the 'new' keyword, which means that it's a lighter weight object instantiation and a lot faster with the added benefit of getting a unique instance every time.
	 *
	 * We have to cast the Item being returned because Item (which implements Cloneable) forces it to return an object, and since the Cloneable interface was created with Java 1.0, it means that the implementing class doesn't know about generics.
	 *
	 * It's recommended to implement your own interface and create your own clone functionality that way.
	 * @param type the item type. This can be enhanced by making type an enum
	 * @return
	 */
	public Item createItem (String type) {
		Item item = null;
		try {
			item = (Item)(items.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return item;
	}

	/**
	 * Init method that instantiates basic data into the registry. This can be seen as adding default data into the registry.
	 */
	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("Dave Chappelle: Equanimity");
		movie.setPrice(24.99);
		movie.setRuntime("1hr 3m");
		items.put("Movie", movie); // recommended to use an enum instead of a string as a key

		Book book = new Book();
		book.setNumberOfPages(736);
		book.setPrice(19.99);
		book.setTitle("Tools of Titans");
		items.put("Book", book);
	}
}
