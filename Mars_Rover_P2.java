/**************************
//simple code
//Functional Programming

***************************/
import java.io.*;
import java.util.*;
   class rover{
       int x_axis = 0;
    int y_axis = 0;
    String directions = "north";
    String Command = "F";
     List<List<Integer>> obstacles; 
     boolean stopped= false;

   public  boolean isValid(int x, int y){
    for(List<Integer> obstacle : obstacles ){
        if(obstacle.get(0)==x && obstacle.get(1)==y){
            stopped=true;
            return false;
        }
    }
    return true;
   }
   
   public void move(int movement)
   {
  
    if (directions.equals("north")  && isValid(x_axis,y_axis + movement)) 
    {
        y_axis +=  movement;
    } 
    else if (directions.equals("south") && isValid(x_axis,y_axis - movement)) 
    {
        y_axis -=  movement;
    } 
    else if ( directions.equals("east") && isValid(x_axis + movement,y_axis)) 
    {
        x_axis +=  movement;
    } 
    else if ( directions.equals("west") && isValid(x_axis - movement,y_axis)) 
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
      obj.obstacles = new ArrayList<>(); 

      Scanner sc = new Scanner(System.in);
    System.out.print("Enter X axis: ");
               obj.x_axis = sc.nextInt();
    System.out.print("Enter  y axis: ");
                        obj.y_axis = sc.nextInt();
      System.out.print("Enter direction: ");
    obj.directions = sc.next();
    System.out.print("Enter Command: ");
    obj.Command = sc.next();

    Integer x_obstacle;
    Integer y_obstacle;
    System.out.print("Enter obstacles: ");
    x_obstacle=sc.nextInt();
    y_obstacle=sc.nextInt();
    while(x_obstacle!= -1 || y_obstacle != -1 )
    {
        List<Integer> obstacle = new ArrayList<>();
        obstacle.add(x_obstacle);
        obstacle.add(y_obstacle);
        obj.obstacles.add(obstacle);
        x_obstacle=sc.nextInt();
        y_obstacle=sc.nextInt();
    }

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
       if(obj.stopped){
        System.out.print("Obstacle !. Stopped at : ");
           break;
       }
   }

    System.out.print("Ans: " + "(" + obj.x_axis + ", " + obj.y_axis + ")" + obj.directions);
  }
}
