/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.estate.io;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import real.estate.dao.impl.SortedList;

/**
 *
 * @author Chathu
 */
public class HouseFile {

    private static Path jsonFileLocation = Paths.get("housesData.json");
    private static Charset charSet = Charset.forName("UTF-8");
    private static Gson gson = new Gson();

    public static SortedList readJSONFileToList() throws FileNotFoundException, IOException{
        SortedList propertyList = null;
        
        try (BufferedReader br = Files.newBufferedReader(jsonFileLocation, charSet)) {
            propertyList = gson.fromJson(br, SortedList.class);
        } 
            return propertyList;
        

    }

    public static void writeJSONToFile(SortedList propertyList) throws IOException {
        String jsonString = gson.toJson(propertyList);
        try (BufferedWriter writer = Files.newBufferedWriter(jsonFileLocation, charSet)) {
            writer.write(jsonString);
        }
    }

}
