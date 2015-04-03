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
public class ListHouse implements Listable {

    private String lastName;
    private String firstName;
    private int lotNumber;
    private double price;
    private int squareFeet;
    private int numberOfBedRooms;

    /**
     * Instantiate the new ListHouse object 
     */
    public ListHouse(){
        
    }

    /**
     * Return the firstName
     * @return
     */
    public String firstName() {
        return firstName;
    }

    /**
     * Return the lastName
     * @return
     */
    public String lastName() {
        return lastName;
    }

    /**
     * Return the lotNumber
     * @return lotNumber
     */
    public int lotNumber() {
        return lotNumber;
    }

    /**
     * Return the price
     * @return price
     */
    public double price() {
        return price;
    }

    /**
     * Return the squareFeet
     * @return squareFeet
     */
    public int squareFeet() {
        return squareFeet;
    }

    /**
     * Return the numberOfBedRooms
     * @return numberOfBedRooms
     */
    public int numberOfBedRooms() {
        return numberOfBedRooms;
    }
    
    /**
     * Parameterized constructor to instantiate new ListHouse object 
     * @param lastName
     * @param firstName
     * @param lotNumber
     * @param price
     * @param squareFeet
     * @param bedRooms
     */
    public ListHouse(String lastName, String firstName, int lotNumber, double price, int squareFeet, int bedRooms) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.lotNumber = lotNumber;
        this.price = price;
        this.squareFeet = squareFeet;
        this.numberOfBedRooms = bedRooms;
    }

    /**
     * Create a copy of the current object
     * @return
     */
    @Override
    public Listable copy() {
        ListHouse house = new ListHouse(lastName, firstName, lotNumber, price, squareFeet, numberOfBedRooms);
        return house;
    }

    /**
     * Houses are compared  based on their lot numbers
     * @param otherHouse
     * @return
     */
    @Override
    public int compareTo(Listable otherHouse) {
        ListHouse thisHouse = (ListHouse) otherHouse;
        return (this.lotNumber - thisHouse.lotNumber);
    }

}
