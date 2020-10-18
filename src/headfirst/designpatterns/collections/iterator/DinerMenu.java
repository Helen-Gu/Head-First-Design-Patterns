package headfirst.designpatterns.collections.iterator;

public class DinerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheet", true, 2.99);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheet", false, 2.99);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog", "A hot dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05);
		addItem("Steamed Veggies and Brown Rice", "Steamed Veggies and Brown Rice", true, 5.99);
		addItem("Pasta", "Pasta Carbonara", false, 7.99);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = new MenuItem(name, description, vegetarian, price);
			numberOfItems = numberOfItems + 1;
		}
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	@Override
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}

	public String toString() {
		return "Diner Menu";
	}
	// other menu methods here
}
