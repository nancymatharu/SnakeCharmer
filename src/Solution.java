/**
 * Author: Nancy
 * Email : nancy.matharuu@gmail.com
 * Mobile: 0468440448
 */
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws IOException{
        
        //reading snakein file and spliting by "," to retrieve goal square provided by audience
        Scanner s = new Scanner(new File("snakein.txt"));
        String data = s.nextLine();
        String[] token = data.split(",");
        int x_dest = Integer.parseInt(token[0]);
        int y_dest = Integer.parseInt(token[1]);
        
        //Below is the call with target data points read from input file
        //data points can be modified in snakein.txt file 
        String fileresult = resolve(x_dest,y_dest);
        
        //Writing the path returned from resolve() in snakeout.txt file
        //this will create the snakeout.txt file if there is none 
        //or overwrite if there is one already exist
        try (FileWriter fw = new FileWriter("snakeout.txt")) {
        fw.write(fileresult);
        fw.close();
        }
    }
   
    public static String resolve(int x_dest, int y_dest){
        //initializing the variables with snake start position
        String currentDirection = "NORTH";
        int x_orig = 0;
        int y_orig = 0;
        
        //using stringbuilder to concatenate the strings to make a finalPath without creating new objects.
        StringBuilder finalPath = new StringBuilder();
        
        //while loop will run till we reach our destination
        while(!(x_orig == x_dest && y_orig == y_dest))
        {
            if(currentDirection.equals("EAST") || currentDirection.equals("WEST")){
                //snake can move only to y-axis to maintain L or R move (options are only +y or -y)
                if( y_dest > y_orig){
                    //destination is greater than the origin, so move +y direction to reach destination
                    y_orig++;
                    if(currentDirection.equals("EAST")){
                        
                        finalPath.append("L");
                    }
                    else{
                        
                        finalPath.append("R");
                    }
                    currentDirection = "NORTH";
                }
                else{
                    //destination is less than the origin, so move -y direction to reach destination
                    y_orig--;
                    if(currentDirection.equals("EAST")){
                        
                        finalPath.append("R");
                    }
                    else{
                        
                        finalPath.append("L");
                    }
                    currentDirection = "SOUTH";
                }
            }
            else if(currentDirection.equals("NORTH") || currentDirection.equals("SOUTH")){
                //snake can move only to x-axis to maintain L or R move (options are only +x or -x)
                if( x_dest > x_orig){
                    //destination is greater than the origin, so move +x direction to reach destination
                    x_orig++;
                    if(currentDirection.equals("NORTH")){
                        
                        finalPath.append("R");
                    }
                    else{
                        
                        finalPath.append("L");
                    }
                    currentDirection = "EAST";
                }
                else{
                    //destination is greater than the origin, so move -x direction to reach destination
                    x_orig--;
                    if(currentDirection.equals("NORTH")){
                        finalPath.append("L");
                    }
                    else{
                        finalPath.append("R");
                    }
                    currentDirection = "WEST";
                }
            }
        }//end of while loop
        //return the finalPath to the main 
        return finalPath.toString();
        
    }//end of method resolve
}//end of class Solution
