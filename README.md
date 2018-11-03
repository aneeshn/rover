Rover

Position represented by a combination of x and y co-ordinates.

Orientation represented by cardinal variables: NSEW

Control Sequence example: L, R, M

L, R moves the rover 90 degrees to the direction changing the orientation.

M means move forward one unit in the direction of the heading.

Input Sequence for the Map:

1. upper-right co-ordinates
2. lower- left co-ordinates always 0,0

Input Sequence for the Rovers:

1. input rover's position ( x:int y:int o:char)
2. instructions on how to explore the grid (L, R, M; etc)

Output of rovers:

1. Final Co-ordinated and Orientation

