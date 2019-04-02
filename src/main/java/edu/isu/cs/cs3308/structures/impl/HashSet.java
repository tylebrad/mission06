// Bradley Tyler
// Isaac Griffith
// CS 3308
// March - 27 - 2019
// My own implementation of a Set as a modified form of a HashMap, A hash set!

// Citations :
// Method descriptions from the provided Set interface.
// http://robertovormittag.net/how-to-implement-a-simple-hashset-in-java/
// http://javatutorialhq.com/java/util/hashset-class-tutorial/
// https://codepumpkin.com/hashset-internal-implementation/
package edu.isu.cs.cs3308.structures.impl;
import edu.isu.cs.cs3308.structures.Set;

import java.util.Iterator;

public class HashSet<T> implements Set<T> {

    public static class Entry<T>{
        T key;
        Entry<T> next;
    }

    public Entry<T>[] buckets;

    public int size;

    public int size(){
        return size;
    }

    // HashSet Constructor
    // @param : desired capacity of array
    public HashSet(int capacity){
        buckets = new Entry[capacity];
        size = 0;
    }

    // Computes the index into the bucket array, returning the hash value of an item
    // @param : Hash Code
    // @return : Hash value of an item
    public int hashFunction(int hashCode){
        int index = hashCode;
        if(index < 0){
            index = -index;
        }
        return index % buckets.length;
    }

    // Add element e to the set, unless e already exists in the set or e is null.
    // @param : element to add to the set
    // @return : void
    @Override
    public void add(T e) {

    }

    // Remove element e from the set, unless e does not exist in the set, or e is null.
    // @param : element to remove from the set
    // @return : void
    @Override
    public void remove(T e) {

    }

    // Test whether e is a member of this set.
    // @param : item to check membership of
    // @return : true if e is a member of this set, false if not or e is null.
    @Override
    public boolean contains(T e) {
        return false;
    }

    // Method to generate an iterator to iterate across the contents of the set.
    // @return :
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    // Checks if the set is empty
    // @return : True if there are no items in the HashSet, false otherwise
    @Override
    public boolean isEmpty() {
        return false;
    }

    // Adds all items from Set s to this set, if those items are not already in this set.
    // @param : Set containing items to be added to this set
    // @return : void
    @Override
    public void addAll(Set<T> s) {

    }

    // Removes all items from this set, which are not items contained in the provided set.
    // @param : The set defining which items are to be kept in this set.
    // @return : void
    @Override
    public void retainAll(Set<T> s) {

    }

    // Removes all items found in the provided set from this set.
    // @param : Set defining the items to be removed from this set.
    // @return : void
    @Override
    public void removeAll(Set<T> s) {

    }
}
