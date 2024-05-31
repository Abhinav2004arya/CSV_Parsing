/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csv_parsing;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ABHINAV ARYA
 */
public class CSV_Parsing {
    
    public static void main(String[] args) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader("e:/StockDataBANKBARODA.csv"));
            String[] lines;
            
            while ((lines = csvReader.readNext())!= null)
            {
                System.out.println("Date: " + lines[1] + ", Opening Price: " + lines[2] + ", Highest Price: " + lines[3] 
                            + ", Lowest Price: " + lines[4] + ", Closing Price: " + lines[5] + ", Total Volume: " + lines[6] );
                
            CSVWriter csvWritter = new CSVWriter(new FileWriter("e:/resut.csv"));
            String[] header = {"Date,Opening Price,Closing price"};
            csvWritter.writeNext(header);
            csvWritter.writeAll(csvReader);
                
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CSV_Parsing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CSV_Parsing.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (CsvValidationException ex) {
            Logger.getLogger(CSV_Parsing.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
