package com.roverAgents.agents;

import com.roverAgents.utils.Cardinality;
import com.roverAgents.utils.ConstrainedCoordinates;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;


public class MarsRoverTest {

    private int upperBoundForXValue = 5;
    private int upperBoundForYValue = 5;
    private int defaultXCoordinate = 0;
    private int defaultYCoordinate = 0;
    private Cardinality defaultOrientation =Cardinality.N;
    private int defaultMovementUnit = 1;

    @Test
    public void testSettersAndGettersWithRandomNumbers(){
        Random random = new Random();
        int x = random.ints(0,101).findFirst().getAsInt();
        int y = random.ints(0,101).findFirst().getAsInt();
        AbstractMovableObject<ConstrainedCoordinates, Cardinality> rover = initializeCoordinatesOfRover(x,y,
                upperBoundForXValue,upperBoundForYValue,defaultOrientation);
        rover.setOrientation(defaultOrientation);
        testForCoordinates(rover,x,y,defaultOrientation);
    }

    @Test
    public void testCoordinateAndCardinalityOfRover(){
        testForCoordinates(defaultRover(),defaultXCoordinate,defaultYCoordinate,defaultOrientation);
    }

    @Test
    public void testRotateRightStartingFacingNorth(){
        AbstractMovableObject<ConstrainedCoordinates,Cardinality> simpleRover = defaultRover();
        Controls rover = simpleRover;
        rover.rotateRight();
        testForCoordinates(simpleRover,defaultXCoordinate,defaultYCoordinate,Cardinality.E);
    }

    @Test
    public void testRotateRightStartingFacingWest(){
        Random random = new Random();
        int x = random.ints(0,101).findFirst().getAsInt();
        int y = random.ints(0,101).findFirst().getAsInt();
        Cardinality cardinality = Cardinality.W;
        AbstractMovableObject<ConstrainedCoordinates,Cardinality> simpleRover = initializeCoordinatesOfRover(x,y,
                upperBoundForXValue,upperBoundForYValue,cardinality);
        Controls rover = simpleRover;
        rover.rotateRight();
        testForCoordinates(simpleRover,x,y,Cardinality.N);
    }

    @Test
    public void testRotateRightStartingFacingSouth(){
        Random random = new Random();
        int x = random.ints(0,101).findFirst().getAsInt();
        int y = random.ints(0,101).findFirst().getAsInt();
        Cardinality cardinality = Cardinality.S;
        AbstractMovableObject<ConstrainedCoordinates,Cardinality> simpleRover = initializeCoordinatesOfRover(x,y,
                upperBoundForXValue,upperBoundForYValue,cardinality);
        Controls rover = simpleRover;
        rover.rotateRight();
        testForCoordinates(simpleRover,x,y,Cardinality.W);
    }

    @Test
    public void testRotateRightStartingFacingEast(){
        Random random = new Random();
        int x = random.ints(0,101).findFirst().getAsInt();
        int y = random.ints(0,101).findFirst().getAsInt();
        Cardinality cardinality = Cardinality.E;
        AbstractMovableObject<ConstrainedCoordinates,Cardinality> simpleRover = initializeCoordinatesOfRover(x,y,
                upperBoundForXValue,upperBoundForYValue,cardinality);
        Controls rover = simpleRover;
        rover.rotateRight();
        testForCoordinates(simpleRover,x,y,Cardinality.S);
    }

    @Test
    public void testRotateLeftStartingFacingNorth(){
        Random random = new Random();
        int x = random.ints(0,101).findFirst().getAsInt();
        int y = random.ints(0,101).findFirst().getAsInt();
        Cardinality cardinality = Cardinality.N;
        AbstractMovableObject<ConstrainedCoordinates,Cardinality> simpleRover = initializeCoordinatesOfRover(x,y,
                upperBoundForXValue,upperBoundForYValue,cardinality);
        Controls rover = simpleRover;
        rover.rotateLeft();
        testForCoordinates(simpleRover,x,y,Cardinality.W);

    }

    @Test
    public void testRotateLeftStartingFacingWest(){
        Random random = new Random();
        int x = random.ints(0,101).findFirst().getAsInt();
        int y = random.ints(0,101).findFirst().getAsInt();
        Cardinality cardinality = Cardinality.W;
        AbstractMovableObject<ConstrainedCoordinates,Cardinality> simpleRover = initializeCoordinatesOfRover(x,y,
                upperBoundForXValue,upperBoundForYValue,cardinality);
        Controls rover = simpleRover;
        rover.rotateLeft();
        testForCoordinates(simpleRover,x,y,Cardinality.S);
    }

    @Test
    public void testRotateLeftStartingFacingSouth(){
        Random random = new Random();
        int x = random.ints(0,101).findFirst().getAsInt();
        int y = random.ints(0,101).findFirst().getAsInt();
        Cardinality cardinality = Cardinality.S;
        AbstractMovableObject<ConstrainedCoordinates,Cardinality> simpleRover = initializeCoordinatesOfRover(x,y,
                upperBoundForXValue,upperBoundForYValue,cardinality);
        Controls rover = simpleRover;
        rover.rotateLeft();
        testForCoordinates(simpleRover,x,y,Cardinality.E);
    }

    @Test
    public void testRotateLeftStartingFacingEast(){
        Random random = new Random();
        int x = random.ints(0,101).findFirst().getAsInt();
        int y = random.ints(0,101).findFirst().getAsInt();
        Cardinality cardinality = Cardinality.E;
        AbstractMovableObject<ConstrainedCoordinates,Cardinality> simpleRover = initializeCoordinatesOfRover(x,y,
                upperBoundForXValue,upperBoundForYValue,cardinality);
        Controls rover = simpleRover;
        rover.rotateLeft();
        testForCoordinates(simpleRover,x,y,Cardinality.N);
    }

    @Test
    public void testMovingRoverFacingNorth(){
        AbstractMovableObject<ConstrainedCoordinates,Cardinality> abstractMovableObject =
                initializeCoordinatesOfRover(defaultXCoordinate,defaultYCoordinate,
                        upperBoundForXValue,upperBoundForYValue,Cardinality.N);
        Controls rover = abstractMovableObject;
        StateRepresentation<ConstrainedCoordinates,Cardinality> roverState = abstractMovableObject;
        assertEquals(defaultXCoordinate,abstractMovableObject.getCoordinates().getX());
        assertEquals(defaultYCoordinate,abstractMovableObject.getCoordinates().getY());
        rover.move();
        assertEquals(defaultYCoordinate+defaultMovementUnit, roverState.getCoordinates().getY());
        assertEquals(defaultXCoordinate,roverState.getCoordinates().getX());
    }

    @Test
    public void testMovingRoverFacingEast(){
        AbstractMovableObject<ConstrainedCoordinates,Cardinality> abstractMovableObject =
                initializeCoordinatesOfRover(defaultXCoordinate,defaultYCoordinate,
                        upperBoundForXValue,upperBoundForYValue,Cardinality.E);
        Controls rover = abstractMovableObject;
        StateRepresentation<ConstrainedCoordinates,Cardinality> roverState = abstractMovableObject;
        assertEquals(defaultXCoordinate,abstractMovableObject.getCoordinates().getX());
        assertEquals(defaultYCoordinate,abstractMovableObject.getCoordinates().getY());
        rover.move();
        assertEquals(defaultYCoordinate, roverState.getCoordinates().getY());
        assertEquals(defaultXCoordinate + defaultMovementUnit,roverState.getCoordinates().getX());
    }

    @Test
    public void testMovingRoverFacingSouth(){
        AbstractMovableObject<ConstrainedCoordinates,Cardinality> abstractMovableObject =
                initializeCoordinatesOfRover(defaultXCoordinate,defaultYCoordinate,
                        upperBoundForXValue,upperBoundForYValue,Cardinality.S);
        Controls rover = abstractMovableObject;
        StateRepresentation<ConstrainedCoordinates,Cardinality> roverState = abstractMovableObject;
        assertEquals(defaultXCoordinate,abstractMovableObject.getCoordinates().getX());
        assertEquals(defaultYCoordinate,abstractMovableObject.getCoordinates().getY());
        rover.move();
        assertEquals(defaultYCoordinate, roverState.getCoordinates().getY());
        assertEquals(defaultXCoordinate,roverState.getCoordinates().getX());
    }

    @Test
    public void testMovingRoverFacingWest(){
        AbstractMovableObject<ConstrainedCoordinates,Cardinality> abstractMovableObject =
                initializeCoordinatesOfRover(defaultXCoordinate,defaultYCoordinate,
                        upperBoundForXValue,upperBoundForYValue,Cardinality.W);
        Controls rover = abstractMovableObject;
        StateRepresentation<ConstrainedCoordinates,Cardinality> roverState = abstractMovableObject;
        assertEquals(defaultXCoordinate,abstractMovableObject.getCoordinates().getX());
        assertEquals(defaultYCoordinate,abstractMovableObject.getCoordinates().getY());
        rover.move();
        assertEquals(defaultYCoordinate, roverState.getCoordinates().getY());
        assertEquals(defaultXCoordinate,roverState.getCoordinates().getX());;
    }

//    private AbstractMovableObject<ConstrainedCoordinates,Cardinality> initializeRandomlyWithSpecifiedOriention(
//            Cardinality cardinality){
//        Random random = new Random();
//        int x = random.ints(0,101).findFirst().getAsInt();
//        int y = random.ints(0,101).findFirst().getAsInt();
//        return initializeCoordinatesOfRover(x,y,defaultXCoordinate,defaultYCoordinate,cardinality);
//    }

    private AbstractMovableObject<ConstrainedCoordinates, Cardinality> initializeCoordinatesOfRover(int startingXCoordinate,
                                                                                                    int startingYCoordinate,
                                                                                                    int upperRightXCoordinate,
                                                                                                    int upperRightYCoordinate,
                                                                                                    Cardinality cardinality){
        AbstractMovableObject<ConstrainedCoordinates, Cardinality> rover = new MarsRover();
        ConstrainedCoordinates constrainedCoordinates = new ConstrainedCoordinates();
        constrainedCoordinates.setUpperBoundOnX(upperRightXCoordinate);
        constrainedCoordinates.setUpperBoundOnY(upperRightYCoordinate);
        constrainedCoordinates.setX(startingXCoordinate);
        constrainedCoordinates.setY(startingYCoordinate);
        rover.setCoordinates(constrainedCoordinates);
        rover.setOrientation(cardinality);
        return rover;
    }

    private AbstractMovableObject<ConstrainedCoordinates,Cardinality> defaultRover(){
        return new MarsRover(); //Should invoke all the default parameters!
    }


    private void testForCoordinates(AbstractMovableObject<ConstrainedCoordinates,Cardinality> rover, int x, int y, Cardinality orientation){
        if(x > upperBoundForXValue){
            assertEquals(upperBoundForXValue, rover.getCoordinates().getX());
        }else{
            assertEquals(x, rover.getCoordinates().getX());
        }
        if(y > upperBoundForYValue){
            assertEquals(upperBoundForYValue, rover.getCoordinates().getY());
        }else{
            assertEquals(y, rover.getCoordinates().getY());
        }
        assertEquals(orientation,rover.getOrientation());
    }

}