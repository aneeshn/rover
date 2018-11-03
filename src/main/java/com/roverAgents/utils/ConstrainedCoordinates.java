package com.roverAgents.utils;

public class ConstrainedCoordinates extends Coordinates {
    private int upperBoundOnX ;
    private int upperBoundOnY;
    private  int lowerBound =0;


    public void setUpperBoundOnX(int upperBoundOnX) {
        this.upperBoundOnX = upperBoundOnX;
    }

    public void setUpperBoundOnY(int upperBoundOnY) {
        this.upperBoundOnY = upperBoundOnY;
    }

    @Override
    public void setX(int x) {
        if(x<lowerBound){
            super.setX(lowerBound);
        }else if(x >= upperBoundOnX){
            super.setX(upperBoundOnX);
        }else{
            super.setX(x);
        }
    }

    @Override
    public void setY(int y) {
        if(y<lowerBound){
            super.setY(lowerBound);
        }else if(y >= upperBoundOnY){
            super.setY(upperBoundOnY);
        }else{
            super.setY(y);
        }
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }
}
