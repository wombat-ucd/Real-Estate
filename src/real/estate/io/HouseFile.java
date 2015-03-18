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

/**
 *
 * @author Chathu
 */
public class HouseFile {

private static BufferedReader inFile;
private static PrintWriter outFile;
private static boolean inFileOpen = false;
private static boolean outFileOpen = false;
private static String inString ="";
    
public static void reset() throws IOException{
    if(inFileOpen){
        inFile.close();
    }
    if(outFileOpen){
        outFile.close();
    }
    inFile = new BufferedReader(new FileReader("house_details.dat"));
    inFileOpen = true;
    inString = inFile.readLine();
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

public static void main(String []args) throws IOException{
    HouseFile hs=new HouseFile();
    hs.reset();
    hs.resetForWrite();
    }
}
