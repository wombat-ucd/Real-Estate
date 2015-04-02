/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.estate.dao;

/**
 *
 * @author Chathu
 */
public abstract class List {

    /**
     * List to store Listable items
     */
    public Listable[] list;

    /**
     * Number of items in list
     */
    public int numberOfItems;

    /**
     * Position of list
     */
    public int position;

    /**
     * Construct a List instance with a listable array size of maxItem
     *
     * @param maxItems
     */
    public List(int maxItems) {
        numberOfItems = 0;
        list = new Listable[maxItems];
    }

    /**
     * Return whether this list is full
     *
     * @return
     */
    public boolean isFull() {
        return (list.length == numberOfItems);
    }

    /**
     * Return the number of elements on this list.
     *
     * @return
     */
    public int lengthIs() {
        return numberOfItems;
    }

    /**
     * Returns true if the item is on this list
     *
     * @param item
     * @return
     */
    public abstract boolean isThere(Listable item);

   // Returns a copy of the list element with the same key as item
    /**
     * Returns a copy of the list element with the same key as item
     *
     * @param item
     * @return
     */
    public abstract Listable retrieve(Listable item);

    // Adds a copy of item to this list
    /**
     * Adds the inserted value to this list
     * @param item
     */
    public abstract void insert(Listable item);

    /**
     * Deletes the element with the same key as item from this list 
     * @param item
     */
    public abstract void delete(Listable item);

    /**
     * Initializes current position for an iteration through this list
     */
    public void reset() {
        position = 0;
    }

    /**
     * Returns copy of the next element on this list
     * @return
     */
    public Listable getNextItem() {
        Listable next = list[position];
        if (position == numberOfItems - 1) {
            position = 0;
        } else {
            position++;
        }
        return next.copy();
    }

}
