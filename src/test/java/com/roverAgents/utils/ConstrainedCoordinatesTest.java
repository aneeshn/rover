package com.roverAgents.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.Random;

import static org.junit.Assert.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CoordinatesTest.class
})
public class ConstrainedCoordinatesTest {

    private int upperbound = 5;

    @Test
    public void testSettingCoordinates(){
        ConstrainedCoordinates constrainedCoordinates = new ConstrainedCoordinates();
        constrainedCoordinates.setUpperBoundOnY(upperbound);
        constrainedCoordinates.setUpperBoundOnX(upperbound);
        constrainedCoordinates.setX(2);
        constrainedCoordinates.setY(2);
        assertEquals(2,constrainedCoordinates.getX());
        assertEquals(2,constrainedCoordinates.getY());
    }

    @Test
    public void testingConstructor(){
        ConstrainedCoordinates constrainedCoordinates = new ConstrainedCoordinates(5,5,1,2);
        assertEquals(1,constrainedCoordinates.getX());
        assertEquals(2,constrainedCoordinates.getY());
    }

    @Test
    public void testSettingOutOfBoundsCoordinates(){
        ConstrainedCoordinates constrainedCoordinates = new ConstrainedCoordinates();
        constrainedCoordinates.setUpperBoundOnX(upperbound);
        constrainedCoordinates.setUpperBoundOnY(upperbound);
        int x = new Random().ints(6,101).findFirst().getAsInt();
        int y = new Random().ints(6,101).findFirst().getAsInt();
        constrainedCoordinates.setX(x);
        constrainedCoordinates.setY(y);
        assertNotEquals(x,constrainedCoordinates.getX());
        assertNotEquals(y,constrainedCoordinates.getY());
        assertEquals(upperbound,constrainedCoordinates.getY());
        assertEquals(upperbound,constrainedCoordinates.getX());
    }
}