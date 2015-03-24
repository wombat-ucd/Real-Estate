/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package real.estate.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import real.estate.dao.ListHouse;

/**
 *
 * @author Chathu
 */
public class HouseFile {

private static BufferedReader inFile;
private static PrintWriter outFile;
private static boolean isInFileOpen = false;
private static boolean isOutFileOpen = false;
private static String stringInput ="";
    
public static void reset() throws IOException{
    if(isInFileOpen){
        inFile.close();
    }
    if(isOutFileOpen){
        outFile.close();
    }
    inFile = new BufferedReader(new FileReader("house_details.dat"));
    isInFileOpen = true;
    stringInput = inFile.readLine();
}
public static void resetForWrite() throws IOException{
    if(isInFileOpen){
        inFile.close();
    }
    if(isOutFileOpen){
        outFile.close();
    }
    outFile = new PrintWriter(new FileWriter("house_details.dat"));
    isOutFileOpen = true;
}
public static boolean isMoreHousesExist(){
    return stringInput != null;
   
    }
public static void putDataToFile(ListHouse houseItem){
    outFile.println(houseItem.firstName());
    outFile.println(houseItem.lastName());
    outFile.println(houseItem.lotNumber());
    outFile.println(houseItem.price());
    outFile.println(houseItem.squareFeet());
    outFile.println(houseItem.bedRooms());
    
}
public static ListHouse getNextHouseItem() throws IOException{
    String lastName;
    String firstName;
    int lotNo;
    int price;
    int squareFeet;
    int noOfBedRooms;
    
    lastName=stringInput;
    firstName=inFile.readLine();
    lotNo=Integer.parseInt(inFile.readLine());
    price=Integer.parseInt(inFile.readLine());
    squareFeet=Integer.parseInt(inFile.readLine());
    noOfBedRooms=Integer.parseInt(inFile.readLine());
    
    stringInput=inFile.readLine();
    
    ListHouse hs1=new ListHouse(lastName,firstName,lotNo,price,squareFeet,noOfBedRooms);
    System.out.println("correct");
    return hs1;
}
public static void closeFile() throws IOException{
    if(isInFileOpen)
        inFile.close();
    if(isOutFileOpen)
        outFile.close();
}

public static void main(String []args) throws IOException{
    HouseFile hs=new HouseFile();
    hs.reset();
    hs.resetForWrite();
    hs.isMoreHousesExist();
   // hs.getNextHouseItem();
    
    }

}
