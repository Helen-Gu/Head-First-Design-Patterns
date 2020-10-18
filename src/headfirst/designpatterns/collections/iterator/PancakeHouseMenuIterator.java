package headfirst.designpatterns.collections.iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
	ArrayList<MenuItem> items;
	int position = 0;

	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	public MenuItem next() {
		MenuItem menuItem = items.get(position);
		position = position + 1;
		return menuItem;
	}

	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}
