package hostelapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert
 */
public class Student {
    private String stundentNum, firstName, lastName, gender;
    private int period;
    private Boolean status;
    
    //constructor
    public Student(String sNum, String fName, String lName, String Gender, int Period, Boolean Status){
        this.stundentNum =  sNum;
        this.firstName = fName;
        this.lastName = lName;
        this.gender = Gender;
        this.period = Period;
        this.status = Status;
    } // End constructor
    
    //set student number
    public void setStudentNum(String sNum){
        this.stundentNum = sNum;
    }
    //get student number
    public String getStudentNum(){
        return this.stundentNum;
    } // end StudentNum get method
    
    //set first name
    public void setFirstName (String fName) {
        this.firstName =fName;
    }
    //get first name
    public String getFirstName (){
        return this.firstName;
    }
    
    //set last name
    public void setlastName (String lName){
        this.lastName = lName;
    }
    //get last name 
    public String getlastName (){
        return this.lastName;
    }
    
    //set gender
    public void setgender (String Gender){
        this.gender =Gender;
    }
    //get gender
    public String getgender (){
        return this.gender;
    }
    
    //set period term in hostel e.g 1,2,3,4
    public void setperiod (int Period){
        this.period = Period;
    }
    //get period in hostel
    public int getperiod (){
        return this.period;
    }
    
    //set status
    public void setstatus (Boolean Status){
        this.status =Status;
    }
    //get status
    public Boolean getstatus (){
        return this.status;
    }
    
    //for displaying student details
    @Override
    public String toString(){
        return "\nStudent Number: "+this.getStudentNum() +"\nLast Name: " + this.getlastName() + "\nFirst Name: " +this.getFirstName() + "\nGender: "+ this.gender + "\nPeriod: "+ this.getperiod() + "\nStatus: "+ this.getstatus();
    }
}
