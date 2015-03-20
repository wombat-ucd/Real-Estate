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
    private int bedRooms;

    public ListHouse(String lastName, String firstName, int lotNumber,
            int price, int squareFeet, int bedRooms) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.lotNumber = lotNumber;
        this.price = price;
        this.squareFeet = squareFeet;
        this.bedRooms = bedRooms;
    }


    public Listable copy() {
        ListHouse list1 = new ListHouse(lastName, firstName, lotNumber, price, squareFeet, bedRooms);
        return list1;
    }

    @Override
    public int compareTo(Listable other) {
        ListHouse other1 = (ListHouse) other;
        return (this.lotNumber - other1.lotNumber);
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

    public int bedRooms() {
        return bedRooms;
    }

}
