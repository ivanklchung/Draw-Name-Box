//******************************************************************************************
// Box.java
//
// Ivan Chung
//
// Creating a generic Box class that has a type parameter which simulates drawing an item 
// at random from a box.
// Included the methods add(), isEmpty(), drawItem(), and toString().
//******************************************************************************************

import java.util.ArrayList;
import java.util.Random;

public class Box<T>  {
  
   private ArrayList<T> box = new ArrayList();
   
   // allows user to add an object of the specified type to the box
   public void add(T value) {
       box.add(value);
   }
   
   // determines if the box is empty
   public boolean isEmpty() {
       return box.isEmpty();
   }
   
   // randomly selects an object from the box and returns it
   // eliminates it from the obx
   // if the box is empty, return null
   public T drawItem() {
       if(isEmpty())
           return null;
       else {
           return box.remove(new Random().nextInt(box.size()));
       }
   }
   
   // output the current contents of the box 
   public String toString() {
       return box.toString();
    }
}