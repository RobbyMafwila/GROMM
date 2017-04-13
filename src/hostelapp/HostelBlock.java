/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelapp;

/**
 *
 * @author Robert
 */
public class HostelBlock {
   private String name;
   private int numberOfRooms;
   private boolean newHostel, girlsBlock;
   
   public HostelBlock(String Name, Boolean NewHostel, Boolean GirlsBlock){
       name = Name;
       newHostel = NewHostel;
       girlsBlock = GirlsBlock;
       
       if (newHostel == false)
           numberOfRooms = 239;  //number of rooms/block @ new hostel
       else 
           numberOfRooms = 59; //number of rooms/block @ new hostel
       
   }// End constructor
   
   //setName() 
   public void setName(String Name){
       name = Name;
   }
   public String getName(){
       return name;
   }
   
   public void setNumberOfRooms(boolean newHostel){
       if (newHostel == false)
           numberOfRooms = 239;  //number of rooms/block @ new hostel
       else 
           numberOfRooms = 59; //number of rooms/block @ new hostel
   }
   public int getNumberOfRooms(){
       return numberOfRooms;   //get number of rooms in the specific block
   }
   
   public boolean getNewHostel(){
       return newHostel;        //is new hostel or not
   }
   
   //set gender for the hostel
   public void setGirlBlock(boolean gb){
       girlsBlock = gb;
   }
   
   //get gender of the block
   public boolean getGirlsBolck(){
       return girlsBlock;
   }
   
   
}
