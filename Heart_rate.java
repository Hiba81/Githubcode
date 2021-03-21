import java.util.*;
public class Heart_rate{

    private String firstName;
    private String lastName;
    private int month; //month of date of birth
    private int day; //day of DOB
    private int year; //year of DOB

    //constructor
    public Heart_rate(String firstName,String lastName, int month, int day, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    //setter methods
    public void setFirstName(String value){
        firstName = value;
    }
    public void setLastName(String value){
        lastName = value;
    }
    public void setMonth(int value){
        month = value;
    }
    public void setDay(int value){
        day =value;
    }
    public void setYear(int value){
        year =value;
    }

    //getter methods
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }

    //returns age of the person in years
    public int getAge(){
        Calendar cd = Calendar.getInstance();
        return (cd.get(Calendar.YEAR)) - year;
    }

    //return maximum heart rate
    public int maximumHeartRate(){
        return 220 - getAge();
    }


}