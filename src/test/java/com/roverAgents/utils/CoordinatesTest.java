package com.roverAgents.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinatesTest {

    @Test
    public void testSettingandRetrievingCorrectCoordinates(){
        Coordinates coordinates = new Coordinates();
        int x = 1;
        int y = 1;
        coordinates.setX(x);
        coordinates.setY(y);
        assertEquals(x,coordinates.getX());
        assertEquals(y,coordinates.getY());
    }

    @Test
    public void testForSettingNegativeNumbers(){
        int x = -1;
        int y = -1;
        Coordinates coordinates = new Coordinates();
        coordinates.setX(x);
        coordinates.setY(y);
        assertEquals(x,coordinates.getX());
        assertEquals(y,coordinates.getY());
    }
}