package headfirst.designpatterns.collections.iterator;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
