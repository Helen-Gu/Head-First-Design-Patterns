package headfirst.designpatterns.collections.iterator;

import java.util.Iterator;

public class Cafe {

	public static void main(String args[]) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();
		// // with no iterators
		// System.out.println("\nMENU\n----\nBREAKFAST");
		// ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
		// for (int i = 0; i < breakfastItems.size(); i++) {
		// MenuItem menuItem = breakfastItems.get(i);
		// System.out.print(menuItem.getName() + " ");
		// System.out.print(menuItem.getPrice() + " -- ");
		// System.out.println(menuItem.getDescription());
		// }

		// System.out.println("\nLUNCH");
		// MenuItem[] lunchItems = dinerMenu.getMenuItems();

		// for (int i = 0; i < lunchItems.length; i++) {
		// MenuItem menuItem = lunchItems[i];
		// System.out.print(menuItem.getName() + " ");
		// System.out.print(menuItem.getPrice() + " -- ");
		// System.out.println(menuItem.getDescription());
		// }

		// with iterators
		// Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		// Iterator dinerIterator = dinerMenu.createIterator();

		// System.out.println("\nMENU (with iterators)\n----\nBREAKFAST");
		// printMenu(pancakeIterator);
		// System.out.println("\nLUNCH");
		// printMenu(dinerIterator);

		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
		waitress.printMenu();
	}

	private static void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print(menuItem.getName() + " ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
