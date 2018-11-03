package com.roverAgents.agents;

public abstract class AbstractMovableObject<C,O> implements StateRepresentation<C,O> , Controls{

    private C coordinates;
    private O orientation;
    protected int movementUnit =1;
    protected  int defaultCardinalCoordinates, defaultCardinalBounds =0;

    @Override
    public C getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(C coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public O getOrientation() {
        return orientation;
    }

    public void setOrientation(O orientation) {
        this.orientation = orientation;
    }


}
