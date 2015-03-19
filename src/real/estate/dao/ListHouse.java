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

    public int no_of_item;
    public int[] list;
    private static final int max_list = 5;
    public int size;
    public int position;

    private String lastName;
    private String firstName;
    private int lotNumber;
    private int price;
    private int squareFeet;
    private int bedRooms;

//    public ListHouse(int max_list) {
//        no_of_item = 1;
//        list = new int[max_list];
//    }
    public ListHouse(String lastName, String firstName, int lotNumber,
            int price, int squareFeet, int bedRooms) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.lotNumber = lotNumber;
        this.price = price;
        this.squareFeet = squareFeet;
        this.bedRooms = bedRooms;
    }

    public int getNo_of_item() {
        return no_of_item;
    }

    public void setNo_of_item(int no_of_item) {
        this.no_of_item = no_of_item;
    }

    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int length() {
        return no_of_item;
    }

    public int generateList(int max_list) {

        for (int i = 1; i <= max_list; i++) {

        }

        return no_of_item;

    }

    public void insert(int item) {
        if (max_list < 30) {
            list[no_of_item] = item;
        }
        no_of_item++;
        position++;

    }

    public void delete(int index) {
        if (index <= position) {
            for (int i = 0; i <= max_list; i++) {
                list[i] = list[i + 1];

            }
        }
        no_of_item--;
        position--;

    }

    public boolean isEmpty() {
        if (no_of_item == 5) {
            return true;
        } else {
            return false;
        }
    }

    public int find(int item) {
        boolean valueInList = true;
        for (int i = 0; i < no_of_item; i++) {

            if (list[i] == item) {

                System.out.print(i + " ");

            }
            if (valueInList != true) {
                System.out.println("The value not in the list");
            }

        }

        System.out.println();

        return position;
    }

    public void printList() {
        for (int i = 1; i <= max_list; i++) {
            System.out.println(list[i]);

        }

    }

    public Listable copy() {
        ListHouse list1 = new ListHouse(lastName, firstName, lotNumber, price, squareFeet, bedRooms);
        return list1;
    }

//     public Listable getNextItem() 
//    {
//       
//        if (position == no_of_item - 1) {
//            position = 0;
//        } else {
//            position++;
//        }
//        return copy();
//    }
//    public static void main(String[] args) {
//
//        ListHouse li = new ListHouse();
//        li.generateList(max_list);
//        li.insert(10);
//        li.insert(20);
//        li.insert(30);
//        li.insert(40);
//        li.insert(50);
//        li.printList();
//        System.out.println("----------");
//        li.delete(40);
//        li.printList();
//        System.out.println("----------");
//        li.find(10);
//    }
    @Override
    public int compareTo(Listable other) {
      ListHouse other1 = (ListHouse)other;
       return (this.lotNumber-other1.lotNumber); 
    }

  
}
