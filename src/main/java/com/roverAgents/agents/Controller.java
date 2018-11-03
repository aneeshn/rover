package com.roverAgents.agents;

import com.roverAgents.utils.Actions;
import com.roverAgents.utils.Cardinality;
import com.roverAgents.utils.ConstrainedCoordinates;

import java.util.List;

public interface Controller {
    void executeActions(AbstractMovableObject<ConstrainedCoordinates,Cardinality> abstractMovableObject, List<Actions> actionsList);
    String relayLocation(AbstractMovableObject<ConstrainedCoordinates,Cardinality> abstractMovableObject);
}
