/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw05;

/**
 *
 * @author Cesar
 */
public class Holiday {

    private String month;
    private int day;
    private String name;
    private boolean federal;
    private boolean oswego;

    // constructor 
    public Holiday(String m, int d, String n) {
        month = m;
        day = d;
        name = n;
        federal = false;
        oswego = false;
    }
    
    public void setDay(int d) {
        this.day = d;
    }

    public void setFederal(boolean f) {
        federal = f;
    }

    public void setOswego(boolean o) {
        oswego = o;
    }

    public String toString() {
        return month + " " + day + ": " + name + "; Federal:" + federal + " Oswego:" + oswego;
    }
}
