//*******************************************************************************************
// BoxDriver.java
//
// Ivan Chung 
//
// Box Driver will create two boxes, one with five people and one with numbers between 
// one to five. The drawItem() method will determine which seat each person will occupy.
//*******************************************************************************************
import java.util.Scanner;

public class BoxDriver {

   public static void main(String[] args)  {
     // Box with people names
     Box<String> person = new Box<>();
     person.add("Roope");
     person.add("Miro");
     person.add("Esa");
     person.add("Anton");
     person.add("Jamie");
       
     // Box with seat numbers 
     Box<Integer> number = new Box<>();
     number.add(1);
     number.add(2);
     number.add(3);
     number.add(4);
     number.add(5);
       
     // printing assigned seats for each person at the table
     System.out.println("Seating assigned at table...");
     System.out.println("Seat #1 " + person.drawItem() + ", Seat number: " + number.drawItem());
     System.out.println("Seat #2 " + person.drawItem() + ", Seat number: " + number.drawItem());
     System.out.println("Seat #3 " + person.drawItem() + ", Seat number: " + number.drawItem());
     System.out.println("Seat #4 " + person.drawItem() + ", Seat number: " + number.drawItem());
     System.out.println("Seat #5 " + person.drawItem() + ", Seat number: " + number.drawItem());
     System.out.println();
   }
}