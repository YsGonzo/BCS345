/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetest;

/**
 *
 * @author jayso
 */
public class Date {
    private int month;
    private int day;
    private int year;

    // Constructors
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public Date() {
        this.month = 02;
        this.day = 05;
        this.year = 2023;
    }

    // Getters
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public int getYear() {
        return year;
    }
    
    // Setters
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    // Methods
    public void displayDate(int month,int day,int year) {
        System.out.printf(month + "/" + day + "/" + year + "\n");
    }
}
