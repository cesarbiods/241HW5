/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw05;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
 
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
 
import org.xml.sax.SAXException;
 
//import com.csc241hw05.xml.holidays;
 
/**
 *
 * @author Cesar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter the input file name:");
        Scanner kb = new Scanner(System.in);
        File xml = new File(kb.nextLine());
        
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
    try {
        SAXParser saxParser = saxParserFactory.newSAXParser();
        MyHandler handler = new MyHandler();
        saxParser.parse(xml, handler);
      
        //print employee information
        for(Holiday h: handler.getHolidayList())
            System.out.println(h);
    } catch (ParserConfigurationException | SAXException | IOException e) {
        e.printStackTrace();
    }
    }
 
        
    }
    

