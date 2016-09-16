package com.dt.physics.common;

import org.junit.Assert;
import org.junit.Test;

public class PositionTest {

  @Test
  public void testConstructorEquality() {
    // GIVEN
    Position pos1 = new Position(3, 4);
    Position pos2 = new Position(pos1);
    Position pos3 = new Position(3.0d, 4.0d);
    // WHEN
    boolean eq12 = pos1.equals(pos2);
    boolean eq13 = pos1.equals(pos3);
    boolean eq21 = pos2.equals(pos1);
    boolean eq23 = pos2.equals(pos3);
    boolean eq31 = pos3.equals(pos1);
    boolean eq32 = pos3.equals(pos2);
    // THEN
    Assert.assertTrue(eq12);
    Assert.assertTrue(eq13);
    Assert.assertTrue(eq21);
    Assert.assertTrue(eq23);
    Assert.assertTrue(eq31);
    Assert.assertTrue(eq32);
  }

  @Test
  public void testGetX() {
    // GIVEN
    Position pos = new Position(3, 4);
    // WHEN
    double x = pos.getX();
    // THEN
    Assert.assertEquals(3.0d, x, 0.001);
  }

  @Test
  public void testGetY() {
    // GIVEN
    Position pos = new Position(3, 4);
    // WHEN
    double y = pos.getY();
    // THEN
    Assert.assertEquals(4.0d, y, 0.001);
  }

  @Test
  public void testAdd() {
    // GIVEN
    Position pos = new Position(3, 4);
    // WHEN
    Pair actual = pos.add(new Vector(2, 2));
    // THEN
    Assert.assertEquals(3.0d, pos.getX(), 0.001);
    Assert.assertEquals(4.0d, pos.getY(), 0.001);
    Assert.assertEquals(5.0d, actual.getX(), 0.001);
    Assert.assertEquals(6.0d, actual.getY(), 0.001);
  }

  @Test
  public void testSubtract() {
    // GIVEN
    Position pos = new Position(3, 4);
    // WHEN
    Pair actual = pos.subtract(new Vector(2, 2));
    // THEN
    Assert.assertEquals(3.0d, pos.getX(), 0.001);
    Assert.assertEquals(4.0d, pos.getY(), 0.001);
    Assert.assertEquals(1.0d, actual.getX(), 0.001);
    Assert.assertEquals(2.0d, actual.getY(), 0.001);
  }
}
