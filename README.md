# Program to find the shortest path for snake to reach goal square 

## Program Overview
  Charming the snake to move in a grid to a place selected by an audience member.
  Initially your snake starts off in a square in the middle of this grid facing north, and you will ask the audience for a goal square for your snake to reach. 
  Goal of the program is to find the shortest path to charm the snake to the goal square. If there are multiple shortest paths, it only finds one of them.

## Limitations
  **snake can move only in two ways:**
  *	An L move: make it turn left and then move forward by one square.
  *	An R move: make it turn right and then move forward by one square.

## Given Conditions
  * Your snake will always start off at the square (0,0). 
  * The snake is initially facing north.

## Input
  The input file _"snakein.txt"_ consists of one line with two integers x and y representing the (x,y) coordinates of the goal square.
  Goal can be changed by modifiying the input text file.
  
## Output
  Program writes the final shortest path in _"snakeout.txt"_ file. It creates the file if it doesn't exist and overwrite the existing one if there is one.
  Your output file consists of a single line of Ls and Rs, representing a sequence of moves that will charm the snake from the starting point to the goal square.
 
