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
private static boolean inFileOpen = false;
private static boolean outFileOpen = false;
private static String stringIn ="";
    
public static void reset() throws IOException{
    if(inFileOpen){
        inFile.close();
    }
    if(outFileOpen){
        outFile.close();
    }
    inFile = new BufferedReader(new FileReader("house_details.dat"));
    inFileOpen = true;
    stringIn = inFile.readLine();
}
public static void resetForWrite() throws IOException{
    if(inFileOpen){
        inFile.close();
    }
    if(outFileOpen){
        outFile.close();
    }
    outFile = new PrintWriter(new FileWriter("house_details.dat"));
    outFileOpen = true;
}
public static boolean isMoreHousesExist(){
    return stringIn != null;
   
    }
public static void putDataToFile(){
    
}
public static ListHouse getNextHouse() throws IOException{
    String lastName;
    String firstName;
    int lotNo;
    int price;
    int squareFeet;
    int noOfBedRooms;
    
    lastName=stringIn;
    firstName=inFile.readLine();
    lotNo=Integer.parseInt(inFile.readLine());
    price=Integer.parseInt(inFile.readLine());
    squareFeet=Integer.parseInt(inFile.readLine());
    noOfBedRooms=Integer.parseInt(inFile.readLine());
    
    stringIn=inFile.readLine();
    
    ListHouse hs1=new ListHouse(lastName,firstName,lotNo,price,squareFeet,noOfBedRooms);
    System.out.println("correct");
    return hs1;
}
public static void closeFile() throws IOException{
    if(inFileOpen)
        inFile.close();
    if(outFileOpen)
        outFile.close();
}

public static void main(String []args) throws IOException{
    HouseFile hs=new HouseFile();
    hs.reset();
    hs.resetForWrite();
    hs.isMoreHousesExist();
   // hs.getNextHouse();
    }

}
