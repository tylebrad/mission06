package edu.isu.cs.cs3308.structures;

import java.util.Iterator;

/**
 * A Basic Set ADT
 *
 * @author Isaac Griffith
 */
public interface Set<T> {

  /**
	 * Add element e to the set, unless e already exists in the set or e is null.
	 *
	 * @param e Item to add to the set
	 */
	void add(T e);

  /**
	 * Remove element e from the set, unless e does not exist in the set, or e is null
	 *
	 * @param e Item to remove from the set
	 */
	void remove(T e);

  /**
	 * Test whether e is a member of this set.
	 *
	 * @param e item to check membership of
	 * @return true if e is a member of this set, false if not or e is null.
	 */
	boolean contains(T e);

  /**
	 * Method to generate an iterator to iterate across the contents of the set.
	 *
	 * @return Iterator for this set.
	 */
	Iterator<T> iterator();

  /**
	 * Check if the set is empty
	 *
	 * @return true if there are no items in the set, false otherwise
	 */
	boolean isEmpty();

  /**
	 * Adds all items from Set s to this set, if those items are not already in this set.
	 * This is equivalent to the set union operation.
	 *
	 * @param s Set containing the items to be added to this set.
	 */
	void addAll(Set<T> s);

  /**
	 * Removes all items from this set, which are not items contained in the provided set.
	 * This is equivalent to the set intersection operation.
	 *
	 * @param s The set defining which items are to be kept in this set.
	 */
	void retainAll(Set<T> s);

  /**
	 * Removes all items found in the provided set from this set.
	 * This is equivalent to the set difference operation.
	 *
	 * @param s Set defining the items to be removed from this set.
	 */
	void removeAll(Set<T> s);
}
