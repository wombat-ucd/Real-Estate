/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.estate.dao.impl;

import real.estate.dao.*;

/**
 *
 *
 */
public class SortedList extends List {

    // Instantiates and returns a reference to an empty list object 
    // with room for maxItems elements
    public SortedList(int maxItems) {
        super(maxItems);
    }

    // Instantiates and returns a reference to an empty list object 
    // with room for 100 elements 
    public SortedList() {
        super(100);
    }

    // Returns true if an element with the same key as item is on this list; 
    // otherwise, returns false 
    public boolean isThere(Listable item) {
        int compareResult;
        int midPoint;
        int first = 0;
        int last = num_of_items - 1;
        boolean moreToSearch = (first <= last);
        boolean found = false;

        while (moreToSearch && !found) {
            midPoint = (first + last) / 2;
            compareResult = item.compareTo(list[midPoint]);
            if (compareResult == 0) {
                found = true;
            } else if (compareResult < 0) // item is less than element at location
            {
                last = midPoint - 1;
                moreToSearch = (first <= last);
            } else // item is greater than element at location 
            {
                first = midPoint + 1;
                moreToSearch = (first <= last);
            }
            {

            }
        }
        return found;
    }

    // Returns a copy of the list element with the same key as item 
    public Listable retrieve(Listable item) {
        int compareResult;

        int first = 0;
        int last = num_of_items - 1;
        int midPoint = (first + last) / 2;
        boolean found = false;
        while (!found) {
            midPoint = (first + last) / 2;
            compareResult = item.compareTo(list[midPoint]);
            if (compareResult == 0) {
                found = true;
            } else if (compareResult < 0) // item is less than element at location 
            {
                last = midPoint - 1;
            } else // item is greater than element at location 
            {
                first = midPoint + 1;
            }

        }
        return list[midPoint].copy();
    }

    public void insert(Listable item) // Adds a copy of item to this list 
    {
        int location = 0;
        boolean moreToSearch = (location < num_of_items);
        while (moreToSearch) {
            if (item.compareTo(list[location]) < 0) // item is less 
            {
                moreToSearch = false;
            } else // item is more 
            {
                location++;
                moreToSearch = (location < num_of_items);
            }
        }
        {
            for (int index = num_of_items; index > location; index--) {
                list[index] = list[index - 1];
            }
        }
        list[location] = item.copy();
        num_of_items++;
    }
    
    // Deletes the element that matches item from this list 
    public void delete(Listable item) 
    {
        int location = 0;

        while (item.compareTo(list[location]) != 0) {
            location++;
        }
        for (int index = location + 1;
                index < num_of_items;
                index++) {
            list[index - 1] = list[index];
        }
        num_of_items--;
    }

    @Override
    public int compareTo(Listable other) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Listable copy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
