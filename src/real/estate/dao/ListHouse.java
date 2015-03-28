/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.estate.dao;

/**
 *
 * @author User
 */
public class ListHouse implements Listable {

    private String lastName;
    private String firstName;
    private int lotNumber;
    private int price;
    private int squareFeet;
    private int numberOfBedRooms;

    public ListHouse(){
        
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public int lotNumber() {
        return lotNumber;
    }

    public int price() {
        return price;
    }

    public int squareFeet() {
        return squareFeet;
    }

    public int numberOfBedRooms() {
        return numberOfBedRooms;
    }
    
    public ListHouse(String lastName, String firstName, int lotNumber, int price, int squareFeet, int bedRooms) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.lotNumber = lotNumber;
        this.price = price;
        this.squareFeet = squareFeet;
        this.numberOfBedRooms = bedRooms;
    }

    @Override
    public Listable copy() {
        ListHouse house = new ListHouse(lastName, firstName, lotNumber, price, squareFeet, numberOfBedRooms);
        return house;
    }

    @Override
    public int compareTo(Listable otherHouse) {
        ListHouse thisHouse = (ListHouse) otherHouse;
        return (this.lotNumber - thisHouse.lotNumber);
    }

}
