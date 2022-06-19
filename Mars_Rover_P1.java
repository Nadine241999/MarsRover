/**************************
//Simple Code
//Start date of implementation : 10:30 AM
// End date of implementation: 12:40 PM
***************************/
import java.io.*;
import java.util.*;
   class rover{
       int x_axis = 0;
    int y_axis = 0;
    String directions = "north";
    String Command = "F";
     

   
   
   public void move(int movement)
   {
  
    if (directions.equals("north") ) 
    {
        y_axis +=  movement;
    } 
    else if (directions.equals("south") ) 
    {
        y_axis -=  movement;
    } 
    else if ( directions.equals("east") ) 
    {
        x_axis +=  movement;
    } 
    else if ( directions.equals("west") ) 
    {
        x_axis -=  movement;
    }

   }
   public void rotateLeft()
   {
    if (directions.equals("north")) 
    {
        directions = "west";
    } 
    else if (directions.equals("south")) 
    {
        directions = "east";
    } 
    else if ( directions.equals("east")) 
    {
        directions = "north";
    } 
    else if ( directions.equals("west")) 
    {
        directions = "south";
    }
    }
    public  void rotateRight()
   {
    if (directions.equals("north")) 
    {
        directions = "east";
    } 
    else if (directions.equals("west")) 
    {
        directions = "north";
    } 
    else if ( directions.equals("east")) 
    {
        directions = "south";
    } 
    else if ( directions.equals("south")) 
    {
        directions = "west";
    }
    }
   
}

public class Main {

 
  public static void main(String[] args) {
      rover obj= new rover();
     

      Scanner sc = new Scanner(System.in);
    System.out.print("Enter X axis: ");
               obj.x_axis = sc.nextInt();
    System.out.print("Enter  y axis: ");
                        obj.y_axis = sc.nextInt();
      System.out.print("Enter direction: ");
    obj.directions = sc.next();
    System.out.print("Enter Command: ");
    obj.Command = sc.next();

    

    obj.directions = obj.directions.toLowerCase();
    obj.Command = obj.Command.toLowerCase();
 
   for(int i=0 ;i<obj.Command.length();i++)
   {
       
       char ch=obj.Command.charAt(i);

       switch (ch) {
           case 'f':
               obj.move(1);
               break;
               case 'b':
               obj.move(-1);
               break;
               case 'l':
               obj.rotateLeft();
               break;
               case 'r':
               obj.rotateRight();
               break;
           default:
               break;
       }
       
   }

    System.out.print("Ans: " + "(" + obj.x_axis + ", " + obj.y_axis + ")" + obj.directions);
  }
}
