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
    public int position;     
    

    
    public List(int maxItems) {
        numberOfItems = 0;
        list = new Listable[maxItems];
    }

    public boolean isFull() 
    {
        return (list.length == numberOfItems);
    }

    public int lengthIs() 
    {
        return numberOfItems;
    }
    
    public abstract boolean isThere(Listable item);

   // Returns a copy of the list element with the same key as item
    public abstract Listable retrieve(Listable item);

    // Adds a copy of item to this list 
    public abstract void insert(Listable item);

   
    public abstract void delete(Listable item);

    
    public void reset() 
    {
        position = 0;
    }
    
    
    public Listable getNextItem() 
    {
        Listable next = list[position];
        if (position == numberOfItems - 1) {
            position = 0;
        } else {
            position++;
        }
        return next.copy();
    }

}
