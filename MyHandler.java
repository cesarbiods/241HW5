/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw05;

import java.util.ArrayList;
import java.util.List;
 
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
 
//import com.journaldev.xml.Employee;
/**
 *
 * @author Cesar
 */
public class MyHandler extends DefaultHandler{
    private ArrayList<Holiday> holidayList;
    private Holiday currentHoliday;
    private String currentMonth;
 
 
    //getter method for employee list
    public ArrayList<Holiday> getHolidayList() {
        return holidayList;
    }
    
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
 
        if (qName.equalsIgnoreCase("Holiday")) {
            //create a new Holiday and put it in Map
            String day = attributes.getValue("day");
            //initialize Employee object and set id attribute
            currentHoliday = new Holiday(currentMonth, Integer.parseInt(day), attributes.getValue("name"));
            //emp.setId(Integer.parseInt(id));
         
        } else if (qName.equalsIgnoreCase("month")) {
            currentMonth = attributes.getValue("name");
        } else if (qName.equalsIgnoreCase("federal")) {
            if (attributes.getValue("value").equalsIgnoreCase("yes")){
                currentHoliday.setFederal(true);
            } else {
                currentHoliday.setFederal(false);
            }
        } else if (qName.equalsIgnoreCase("oswego")) {
            if (attributes.getValue("value").equalsIgnoreCase("yes")){
                currentHoliday.setOswego(true);
            } else {
                currentHoliday.setOswego(false);
            }
        }
    }
         public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("Holiday")) {
               //initialize list
            if (holidayList == null)
                holidayList = new ArrayList<Holiday>();
            //add holiday object to list
            holidayList.add(currentHoliday);
        }
    }
    
}
