package headfirst.designpatterns.collections.iterator;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
		addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		menuItems.add(new MenuItem(name, description, vegetarian, price));
	}

	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}

	@Override
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}

	public String toString() {
		return "Pancake House Menu";
	}

	// other menu methods here
}
