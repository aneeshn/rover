package com.roverAgents.agents;

import com.roverAgents.utils.Cardinality;
import com.roverAgents.utils.ConstrainedCoordinates;

public class MarsRover extends AbstractMovableObject<ConstrainedCoordinates,Cardinality> {


    public MarsRover(int upperRightX, int upperRightY, int x, int y, Cardinality orientation){
        super.setCoordinates(new ConstrainedCoordinates(upperRightX,upperRightY, x, y));
        super.setOrientation(orientation);
    }

    public MarsRover() {
        super.setCoordinates(defaultCoordinates());
        super.setOrientation(defaultOrientation());
    }

    private Cardinality defaultOrientation(){
        return Cardinality.N;
    }

    private ConstrainedCoordinates defaultCoordinates(){
        ConstrainedCoordinates constrainedCoordinates = new ConstrainedCoordinates();
        constrainedCoordinates.setUpperBoundOnX(defaultCardinalBounds);
        constrainedCoordinates.setUpperBoundOnY(defaultCardinalBounds);
        constrainedCoordinates.setX(defaultCardinalCoordinates);
        constrainedCoordinates.setY(defaultCardinalBounds);
        return  constrainedCoordinates;
    }

    @Override
    public ConstrainedCoordinates getCoordinates() {
        return super.getCoordinates();
    }

    @Override
    public void setCoordinates(ConstrainedCoordinates coordinates) {
        super.setCoordinates(coordinates);
    }

    @Override
    public Cardinality getOrientation() {
        return super.getOrientation();
    }

    @Override
    public void setOrientation(Cardinality orientation) {
        super.setOrientation(orientation);
    }

    @Override
    public void rotateLeft() {
        switch (this.getOrientation()){
            case N:
                this.setOrientation(Cardinality.W);
                break;
            case S:
                this.setOrientation(Cardinality.E);
                break;
            case E:
                this.setOrientation(Cardinality.N);
                break;
            case W:
                this.setOrientation(Cardinality.S);
                break;
        }
    }

    @Override
    public void rotateRight() {
        switch (this.getOrientation()){
            case N:
                this.setOrientation(Cardinality.E);
                break;
            case S:
                this.setOrientation(Cardinality.W);
                break;
            case E:
                this.setOrientation(Cardinality.S);
                break;
            case W:
                this.setOrientation(Cardinality.N);
                break;
        }
    }

    @Override
    public void move() {
        switch (this.getOrientation()){
            case N:
                this.getCoordinates().setY(this.getCoordinates().getY()+movementUnit);
                break;
            case S:
                this.getCoordinates().setY(this.getCoordinates().getY()-movementUnit);
                break;
            case E:
                this.getCoordinates().setX(this.getCoordinates().getX()+movementUnit);
                break;
            case W:
                this.getCoordinates().setX(this.getCoordinates().getX()-movementUnit);
                break;
        }
    }

    @Override
    public String toString() {
        return this.getCoordinates().getX() + " " +this.getCoordinates().getY()+" "+this.getOrientation();
    }
}
