package com.roverAgents.agents;

public abstract class AbstractMovableObject<C,O> implements StateRepresentation<C,O> , Controls{

    private C coordinates;
    private O orientation;
    protected int movementUnit =1;
    protected  int defaultCardinalCoordinates, defaultCardinalBounds =0;

    public AbstractMovableObject() {
    }

    public AbstractMovableObject(C coordinates, O orientation) {
        this.coordinates = coordinates;
        this.orientation = orientation;
    }

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

    @Override
    public void rotateLeft() {

    }

    @Override
    public void rotateRight() {

    }

    @Override
    public void move() {

    }
}
