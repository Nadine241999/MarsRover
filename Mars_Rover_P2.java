/**************************
//simple code
//start date : 18/6/2022 12:00 PM
//end date: 18/6/2022 12:51 PM

***************************/
import java.io.*;
import java.util.*;
public class Main
{

  public static void main (String[]args)
  {
  Integer[] obsacles_x = new Integer[]{1, 3, 0, 8};
  Integer[] obsacles_y = new Integer[]{7, 3, 6, 2};
  List<Integer> X_obstacles = new ArrayList<>(Arrays.asList(obsacles_x));
  List<Integer> Y_obstacles = new ArrayList<>(Arrays.asList(obsacles_y));
  
  int x_axis = 0;
  int y_axis = 0;
  String directions = "North";
  String Command = "F";
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter X axis: ");
 x_axis = sc.nextInt();
 System.out.print("Enter  y axis: "); 
 y_axis = sc.nextInt();
 //System.out.print("Enter direction: ");
 //directions = sc.next();
  System.out.print("Enter Command: ");
 Command = sc.next();
 for(int i = 0 ; i<Command.length();i++)
 {
 if(Command.charAt(i) == 'F' || Command.charAt(i) == 'f'){
  
      
 if(directions == "North" || directions == "north" || directions == "NORTH" || directions == "NoRth" || directions =="NOrth")
 {
  if(X_obstacles.contains(x_axis) && Y_obstacles.contains(y_axis+1) ){
      System.out.print("Obstacle !. Stopped at : ");
      break;
  }
  directions = "North";
  y_axis = y_axis+1;
 }
else if(directions == "South" || directions == "south" || directions == "SOUTH"|| directions == "SoUth" || directions == "SOuth")
{
  if(X_obstacles.contains(x_axis) && Y_obstacles.contains(y_axis-1) ){
      System.out.print("Obstacle !. Stopped at : ");
      break;
  }
directions = "South";
y_axis = y_axis-1;
}
 else if(directions == "East" || directions == "EAST" || directions == "EAst"|| directions == "EaSt" || directions == "east" || directions == "EaSt")
{
  if(X_obstacles.contains(x_axis+1) && Y_obstacles.contains(y_axis) ){
      System.out.print("Obstacle !. Stopped at : ");
      break;
  }
directions = "East";
x_axis = x_axis+1;
}
else if(directions == "West" || directions == "WEST" || directions == "WEst" || directions == "WeST" || directions == "west" || directions == "weST")
{
 if(X_obstacles.contains(x_axis-1) && Y_obstacles.contains(y_axis) ){
      System.out.print("Obstacle !. Stopped at : ");
      break;
  }   
directions = "West";
x_axis = x_axis-1;
}


 }
 
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 else if(Command.charAt(i) == 'B' || Command.charAt(i) == 'b')
 {


  if(directions == "North" || directions == "north" || directions == "NORTH" || directions == "NoRth" || directions =="NOrth")
 {
   if(X_obstacles.contains(x_axis) && Y_obstacles.contains(y_axis-1) ){
      System.out.print("Obstacle !. Stopped at : ");
      break;
  }
 directions = "South";
  y_axis = y_axis-1;
 }
 else if(directions == "South" || directions == "south" || directions == "SOUTH"|| directions == "SoUth" || directions == "SOuth")
{
  if(X_obstacles.contains(x_axis) && Y_obstacles.contains(y_axis+1) ){
      System.out.print("Obstacle !. Stopped at : ");
      break;
  }
directions = "North";
 y_axis = y_axis+1;
}
 else if(directions == "East" || directions == "EAST" || directions == "EAst"|| directions == "EaSt" || directions == "east" || directions == "EaSt")
{
  if(X_obstacles.contains(x_axis-1) && Y_obstacles.contains(y_axis) ){
      System.out.print("Obstacle !. Stopped at : ");
      break;
  }
directions = "West";
x_axis = x_axis-1;
}
else if(directions == "West" || directions == "WEST" || directions == "WEst" || directions == "WeST" || directions == "west" || directions == "weST")
{
  if(X_obstacles.contains(x_axis+1) && Y_obstacles.contains(y_axis) ){
      System.out.print("Obstacle !. Stopped at : ");
      break;
  }
directions = "East";
x_axis = x_axis+1;
}
 
 
 
 }
 else if(Command.charAt(i) == 'R' || Command.charAt(i) == 'r')
 {

 

 if(directions == "North" || directions == "north" || directions == "NORTH" || directions == "NoRth" || directions =="NOrth")
 {
   if(X_obstacles.contains(x_axis+1) && Y_obstacles.contains(y_axis) ){
      System.out.print("Obstacle !. Stopped at : ");
      break;
  }
 directions = "East";
  x_axis = x_axis+1;
 }
 else if(directions == "South" || directions == "south" || directions == "SOUTH"|| directions == "SoUth" || directions == "SOuth")
{
  if(X_obstacles.contains(x_axis-1) && Y_obstacles.contains(y_axis) ){
      System.out.print("Obstacle !. Stopped at : ");
      break;
  }
directions = "West";
x_axis = x_axis-1;
}
 else if(directions == "East" || directions == "EAST" || directions == "EAst"|| directions == "EaSt" || directions == "east" || directions == "EaSt")
{
  if(X_obstacles.contains(x_axis) && Y_obstacles.contains(y_axis-1) ){
      System.out.print("Obstacle !. Stopped at : ");
      break;
  }
directions = "South";
y_axis = y_axis-1;
}
else if(directions == "West" || directions == "WEST" || directions == "WEst" || directions == "WeST" || directions == "west" || directions == "weST")
{
if(X_obstacles.contains(x_axis) && Y_obstacles.contains(y_axis+1) ){
      System.out.print("Obstacle !. Stopped at : ");
      break;
  }
directions = "North";
y_axis = y_axis+1;
}
 
 
 
 
 }//hna
 else if (Command.charAt(i) == 'L'|| Command.charAt(i) == 'l')
 {

 
 if(directions == "North" || directions == "north" || directions == "NORTH" || directions == "NoRth" || directions =="NOrth")
 {
  if(X_obstacles.contains(x_axis-1) && Y_obstacles.contains(y_axis) ){
      System.out.print("Obstacle !. Stopped at : ");
      break;
  }
  directions = "West";
  x_axis = x_axis-1;
 
 }
else if (directions == "South" || directions == "south" || directions == "SOUTH"|| directions == "SoUth" || directions =="SOuth")
{
  if(X_obstacles.contains(x_axis+1) && Y_obstacles.contains(y_axis) ){
      System.out.print("Obstacle !. Stopped at : ");
      break;
  }
directions = "East";
x_axis = x_axis+1;
}
else if(directions == "East" || directions == "EAST" || directions == "EAst"|| directions == "EaSt" || directions == "east" || directions == "EaSt")
{
  if(X_obstacles.contains(x_axis) && Y_obstacles.contains(y_axis+1) ){
      System.out.print("Obstacle !. Stopped at : ");
      break;
  }
directions = "North";
y_axis = y_axis +1;
}
else if(directions == "West" || directions == "WEST"|| directions == "WEst" || directions == "WeST" || directions == "west" || directions == "weST")
{
  if(X_obstacles.contains(x_axis) && Y_obstacles.contains(y_axis-1) ){
      System.out.print("Obstacle !. Stopped at : ");
      break;
  }
directions = "South";
y_axis = y_axis -1;
}
 }
 
 }
 System.out.print("(" + x_axis +", "+ y_axis +")" +  directions);
 
}
}