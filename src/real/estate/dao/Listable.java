/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.estate.dao;

/**
 *
 * @author Wombat
 */
public interface Listable {

    // Compares this Listable object to "other". If they are equal, 0 is 
    //   returned 
    // If this is less than the argument, a negative value is returned 
    // If this is more than the argument, a positive value is returned
    /**
     * Houses are compared  based on their lot numbers
     * @param other
     * @return
     */
    public abstract int compareTo(Listable other);

    // Returns a new object with the same contents as this Listable object

    /**
     * Returns a copy of this ListHouse
     * @return
     */
        public abstract Listable copy();

}
