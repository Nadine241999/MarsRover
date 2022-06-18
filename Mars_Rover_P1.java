/**************************
//Simple Code
//Start date of implementation : 10:30 AM
// End date of implementation: 12:40 PM
***************************/
import java.io.*;
import java.util.*;
public class Main
{

  public static void main (String[]args)
  {
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
  directions = "North";
  y_axis = y_axis+1;
 }
else if(directions == "South" || directions == "south" || directions == "SOUTH"|| directions == "SoUth" || directions == "SOuth")
{
directions = "South";
y_axis = y_axis-1;
}
 else if(directions == "East" || directions == "EAST" || directions == "EAst"|| directions == "EaSt" || directions == "east" || directions == "EaSt")
{
directions = "East";
x_axis = x_axis+1;
}
else if(directions == "West" || directions == "WEST" || directions == "WEst" || directions == "WeST" || directions == "west" || directions == "weST")
{
directions = "West";
x_axis = x_axis-1;
}


 }
 
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 else if(Command.charAt(i) == 'B' || Command.charAt(i) == 'b')
 {


  if(directions == "North" || directions == "north" || directions == "NORTH" || directions == "NoRth" || directions =="NOrth")
 {
 directions = "South";
  y_axis = y_axis-1;
 }
 else if(directions == "South" || directions == "south" || directions == "SOUTH"|| directions == "SoUth" || directions == "SOuth")
{
directions = "North";
 y_axis = y_axis+1;
}
 else if(directions == "East" || directions == "EAST" || directions == "EAst"|| directions == "EaSt" || directions == "east" || directions == "EaSt")
{
directions = "West";
x_axis = x_axis-1;
}
else if(directions == "West" || directions == "WEST" || directions == "WEst" || directions == "WeST" || directions == "west" || directions == "weST")
{
directions = "East";
x_axis = x_axis+1;
}
 
 
 
 }
 else if(Command.charAt(i) == 'R' || Command.charAt(i) == 'r')
 {

 

 if(directions == "North" || directions == "north" || directions == "NORTH" || directions == "NoRth" || directions =="NOrth")
 {
 directions = "East";
  x_axis = x_axis+1;
 }
 else if(directions == "South" || directions == "south" || directions == "SOUTH"|| directions == "SoUth" || directions == "SOuth")
{
directions = "West";
x_axis = x_axis-1;
}
 else if(directions == "East" || directions == "EAST" || directions == "EAst"|| directions == "EaSt" || directions == "east" || directions == "EaSt")
{
directions = "South";
y_axis = y_axis-1;
}
else if(directions == "West" || directions == "WEST" || directions == "WEst" || directions == "WeST" || directions == "west" || directions == "weST")
{
directions = "North";
y_axis = y_axis+1;
}
 
 
 
 
 }//hna
 else if (Command.charAt(i) == 'L'|| Command.charAt(i) == 'l')
 {

 
 if(directions == "North" || directions == "north" || directions == "NORTH" || directions == "NoRth" || directions =="NOrth")
 {
  directions = "West";
  x_axis = x_axis-1;
 
 }
else if (directions == "South" || directions == "south" || directions == "SOUTH"|| directions == "SoUth" || directions =="SOuth")
{
directions = "East";
x_axis = x_axis+1;
}
else if(directions == "East" || directions == "EAST" || directions == "EAst"|| directions == "EaSt" || directions == "east" || directions == "EaSt")
{
directions = "North";
y_axis = y_axis +1;
}
else if(directions == "West" || directions == "WEST"|| directions == "WEst" || directions == "WeST" || directions == "west" || directions == "weST")
{
directions = "South";
y_axis = y_axis -1;
}
 }
 
 }
 System.out.print("Ans: " + "(" + x_axis +", "+ y_axis +")" +  directions);
 
}
}