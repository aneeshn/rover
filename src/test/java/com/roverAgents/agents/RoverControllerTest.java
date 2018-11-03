//package com.roverAgents.agents;
//
//import com.roverAgents.agents.RoverControls;
//import com.roverAgents.utils.Actions;
//import com.roverAgents.utils.Cardinality;
//import com.roverAgents.utils.ConstrainedCoordinates;
//import jdk.nashorn.internal.ir.annotations.Ignore;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class RoverControllerTest {
//
//    @Ignore
//    private final RoverController roverController = new RoverController();
//
//    @Test
//    public void testingInputProvided(){
//        Rover rover = new Rover();
//        ConstrainedCoordinates constrainedCoordinates = new ConstrainedCoordinates();
//        constrainedCoordinates.setUpperBoundOnX(5);
//        constrainedCoordinates.setUpperBoundOnY(5);
//        constrainedCoordinates.setX(1);
//        constrainedCoordinates.setY(2);
//        rover.setConstrainedCoordinates(constrainedCoordinates);
//        rover.setOrientation(Cardinality.N);
//        List<Actions> actionsList = new ArrayList<>();
//        actionsList.add(Actions.L);
//        actionsList.add(Actions.M);
//        actionsList.add(Actions.L);
//        actionsList.add(Actions.M);
//        actionsList.add(Actions.L);
//        actionsList.add(Actions.M);
//        actionsList.add(Actions.L);
//        actionsList.add(Actions.M);
//        actionsList.add(Actions.M);
//        roverController.executeActions(rover,actionsList);
//        assertEquals(1, rover.getCoordinates().getX());
//        assertEquals(3, rover.getCoordinates().getY());
//        assertEquals(Cardinality.N, rover.getOrientation());
//    }
//
//    @Test
//    public void testingInput2Provided(){
//        Rover rover = new Rover();
//        ConstrainedCoordinates constrainedCoordinates = new ConstrainedCoordinates();
//        constrainedCoordinates.setUpperBoundOnX(5);
//        constrainedCoordinates.setUpperBoundOnY(5);
//        constrainedCoordinates.setX(3);
//        constrainedCoordinates.setY(3);
//        rover.setConstrainedCoordinates(constrainedCoordinates);
//        rover.setOrientation(Cardinality.E);
//        List<Actions> actionsList = new ArrayList<>();
//        actionsList.add(Actions.M);
//        actionsList.add(Actions.M);
//        actionsList.add(Actions.R);
//        actionsList.add(Actions.M);
//        actionsList.add(Actions.M);
//        actionsList.add(Actions.R);
//        actionsList.add(Actions.M);
//        actionsList.add(Actions.R);
//        actionsList.add(Actions.R);
//        actionsList.add(Actions.M);
//        roverController.executeActions(rover,actionsList);
//        assertEquals(5, rover.getCoordinates().getX());
//        assertEquals(1, rover.getCoordinates().getY());
//        assertEquals(Cardinality.E, rover.getOrientation());
//    }
//
//}