package com.roverAgents.agents;

import com.roverAgents.utils.Actions;
import com.roverAgents.utils.Cardinality;
import com.roverAgents.utils.ConstrainedCoordinates;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MarsRoverTest.class
})
public class RoverControllerTest {


    private final RoverController roverController = new RoverController();

    private AbstractMovableObject<ConstrainedCoordinates,Cardinality> initializeRover(int uX,int uY, int x, int y, Cardinality cardinality){

        return new MarsRover(uX,uY,x,y,cardinality);
    }

    @Test
    public void testingAnExampleFlowOne(){
        AbstractMovableObject<ConstrainedCoordinates,Cardinality> rover =
                initializeRover(5,5,1,2,Cardinality.N);
        List<Actions> actionsList = new ArrayList<>();
        actionsList.add(Actions.L);
        actionsList.add(Actions.M);
        actionsList.add(Actions.L);
        actionsList.add(Actions.M);
        actionsList.add(Actions.L);
        actionsList.add(Actions.M);
        actionsList.add(Actions.L);
        actionsList.add(Actions.M);
        actionsList.add(Actions.M);
        roverController.executeActions(rover,actionsList);
        assertEquals(1, rover.getCoordinates().getX());
        assertEquals(3, rover.getCoordinates().getY());
        assertEquals(Cardinality.N, rover.getOrientation());
    }

    @Test
    public void testingAnExampleFlowTwo(){
        AbstractMovableObject<ConstrainedCoordinates,Cardinality> rover =
                initializeRover(5,5,3,3,Cardinality.E);
        List<Actions> actionsList = new ArrayList<>();
        actionsList.add(Actions.M);
        actionsList.add(Actions.M);
        actionsList.add(Actions.R);
        actionsList.add(Actions.M);
        actionsList.add(Actions.M);
        actionsList.add(Actions.R);
        actionsList.add(Actions.M);
        actionsList.add(Actions.R);
        actionsList.add(Actions.R);
        actionsList.add(Actions.M);
        roverController.executeActions(rover,actionsList);
        assertEquals(5, rover.getCoordinates().getX());
        assertEquals(1, rover.getCoordinates().getY());
        assertEquals(Cardinality.E, rover.getOrientation());
    }

    @Test
    public void testRelayCoordinates(){
        AbstractMovableObject<ConstrainedCoordinates,Cardinality> abstractMovableObject =
                initializeRover(0,0,0,0,Cardinality.N);
        String expectedOutput="0 0 N";
        Assert.assertEquals(expectedOutput,roverController.relayLocation(abstractMovableObject));
    }


}