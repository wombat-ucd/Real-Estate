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
public abstract class List implements Listable {

    protected Listable[] list;          // Array to hold this list’s elements 
    protected int numItems;             // Number of elements on this list 
    protected int currentPos;           // Current position for iteration

    // Instantiates and returns a reference to an empty list object 
    // with room for maxItems elements 
    public List(int maxItems) {
        numItems = 0;
        list = new Listable[maxItems];
    }

    public boolean isFull() // Returns whether this list is full 
    {
        return (list.length == numItems);
    }

    public int lengthIs() // Returns the number of elements on this list 
    {
        return numItems;
    }
    // Returns true if an element with the same key as item is on this list; 
    // otherwise, returns false
    public abstract boolean isThere(Listable item);

   // Returns a copy of the list element with the same key as item
    public abstract Listable retrieve(Listable item);

    // Adds a copy of item to this list 
    public abstract void insert(Listable item);

    // Deletes the element with the same key as item from this list 
    public abstract void delete(Listable item);

    // Initializes current position for an iteration through this list
    public void reset() 
    {
        currentPos = 0;
    }
    
    // Returns copy of the next element on this list 
    public Listable getNextItem() 
    {
        Listable next = list[currentPos];
        if (currentPos == numItems - 1) {
            currentPos = 0;
        } else {
            currentPos++;
        }
        return next.copy();
    }

}
