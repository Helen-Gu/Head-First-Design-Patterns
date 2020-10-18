package headfirst.designpatterns.collections.iterator;

import java.util.*;

public class Cafe {

	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		// with no iterators
		System.out.println("\nMENU\n----\nBREAKFAST");
		ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = breakfastItems.get(i);
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription() + " ");
		}

		System.out.println("\nLUNCH");
		MenuItem[] lunchItems = dinerMenu.getMenuItems();

		for (int i = 0; i < lunchItems.length; i++) {
			MenuItem menuItem = lunchItems[i];
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription() + " ");
		}

		// with iterators
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();

		System.out.println("\nMENU (with iterators)\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
	}

	private static void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription() + " ");

		}
	}
}
