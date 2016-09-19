package com.dt.physics.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.dt.physics.common.Position;
import com.dt.physics.common.Vector;

public class PositionCalculatorServiceImplTest {

  private PositionCalculatorServiceImpl positionCalculatorServiceImpl;

  @Before
  public void setUp() {
    positionCalculatorServiceImpl = new PositionCalculatorServiceImpl();
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetVectorWhenFirstParamIsNull() {
    // GIVEN
    Position pos1 = null;
    Position pos2 = new Position(7, 7);
    // WHEN
    positionCalculatorServiceImpl.getVector(pos1, pos2);
    // THEN
    Assert.fail();
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetVectorWhenSecondParamIsNull() {
    // GIVEN
    Position pos1 = new Position(7, 7);
    Position pos2 = null;
    // WHEN
    positionCalculatorServiceImpl.getVector(pos1, pos2);
    // THEN
    Assert.fail();
  }

  @Test
  public void testGetVector() {
    // GIVEN
    Position pos1 = new Position(3, 4);
    Position pos2 = new Position(7, 7);
    // WHEN
    Vector vector = positionCalculatorServiceImpl.getVector(pos1, pos2);
    // THEN
    Assert.assertEquals(4.0d, vector.getX(), 0.00001d);
    Assert.assertEquals(3.0d, vector.getY(), 0.00001d);
  }
}
