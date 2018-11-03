package com.roverAgents.agents;

import com.roverAgents.utils.Actions;

import java.util.List;

public class RoverController {

    public void executeActions(Controls rover, List<Actions> actions){

        for (Actions action: actions) {
            switch (action){
                case L:
                    rover.rotateLeft();
                    break;
                case R:
                    rover.rotateRight();
                    break;
                case M:
                    rover.move();
                    break;
            }

        }
    }
    
}
