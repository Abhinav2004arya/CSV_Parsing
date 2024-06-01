/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csv_parsing;

// Add the apache common lang library and OpenCsv library
//import necessary packages

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;



/**
 *
 * @author ABHINAV ARYA
 */

//This is the class for parsing CSV files

public class CSV_Parsing {
    
    public static void main(String[] args) {
        try {
            
//            We will make use of OpenCsv's Reader and Writer methods to read the CSV file and write them in new CSV file
            
            CSVReader csvReader = new CSVReader(new FileReader("e:/StockDataBANKBARODA.csv"));
            CSVWriter csvWritter = new CSVWriter(new FileWriter("e:/rut.csv"));
            String[] lines;
           
            
            
            while ((lines = csvReader.readNext())!= null)
            {
                System.out.println("Date: " + lines[1] + ", Opening Price: " + lines[2] + ", Highest Price: " + lines[3] 
                            + ", Lowest Price: " + lines[4] + ", Closing Price: " + lines[5] + ", Total Volume: " + lines[6] );
                
                
                String[] WantedColumns = {lines[0],lines[1],lines[2],lines[5]};
                csvWritter.writeNext(WantedColumns);
  
            }
            csvWritter.close();
            System.out.println("Data Entered Succesfully!!!");
            
            
           
            
        } 
        catch (Exception e) {
            System.out.println("This Exception Occured: " + e);
        }
        
    }
    
}
