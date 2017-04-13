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
public class Room {
 private String studentNum, roomNum;
 private Boolean doubleRoom;  
 
 //constructor
 public Room(String StudentNum,String RoomNum,Boolean DoubleRoom){
     this.studentNum = StudentNum;
     this.roomNum = RoomNum;
     this.doubleRoom = DoubleRoom;
}
 //set student number
 public void setStudentNum(String StudentNum){
     this.studentNum = StudentNum;
 }
 //get student number
 public String getStudentNum(){
     return this.studentNum;
 }
 //set the room number for the student
 public void setRoomNum(String RoomNum){
     this.roomNum = RoomNum;
 }
 //get room number
 public String getRoomNum(){
     return this.roomNum;
 }
 //set is double room or not
 public void setDoubleRoom(Boolean DoubleRoom){
     this.doubleRoom = DoubleRoom;
 }
 //get is double room or not
 public Boolean getDoubleRoom(){
     return this.doubleRoom;
 }
}
