package com.roverAgents.agents;

import com.roverAgents.utils.Actions;
import com.roverAgents.utils.Cardinality;
import com.roverAgents.utils.ConstrainedCoordinates;

import java.util.List;

public class RoverController implements Controller{

    @Override
    public void executeActions(AbstractMovableObject<ConstrainedCoordinates, Cardinality> abstractMovableObject, List<Actions> actionsList) {
        for (Actions action: actionsList) {
            switch (action){
                case L:
                    abstractMovableObject.rotateLeft();
                    break;
                case R:
                    abstractMovableObject.rotateRight();
                    break;
                case M:
                    abstractMovableObject.move();
                    break;
            }

        }
    }

    @Override
    public String relayLocation(AbstractMovableObject<ConstrainedCoordinates, Cardinality> abstractMovableObject) {
        return abstractMovableObject.toString();
    }
}
