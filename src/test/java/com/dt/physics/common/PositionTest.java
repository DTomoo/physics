package com.dt.physics.common;

import org.junit.Assert;
import org.junit.Test;

public class PositionTest {

  @Test
  public void testConstructorEquality() {
    // GIVEN
    Position pos1 = new Position(3, 4);
    Position pos2 = new Position(pos1);
    Position pos3 = new Position(3, 4);
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
    int x = pos.getX();
    // THEN
    Assert.assertEquals(3, x);
  }

  @Test
  public void testGetY() {
    // GIVEN
    Position pos = new Position(3, 4);
    // WHEN
    int y = pos.getY();
    // THEN
    Assert.assertEquals(4, y);
  }

  @Test
  public void testAddPosition() {
    // GIVEN
    Position pos = new Position(3, 4);
    // WHEN
    Position actual = pos.add(new Position(2, 2));
    // THEN
    Assert.assertEquals(3.0d, pos.getX(), 0.001);
    Assert.assertEquals(4.0d, pos.getY(), 0.001);
    Assert.assertEquals(5.0d, actual.getX(), 0.001);
    Assert.assertEquals(6.0d, actual.getY(), 0.001);
  }

  @Test
  public void testAddVector() {
    // GIVEN
    Position pos = new Position(3, 4);
    // WHEN
    Position actual = pos.add(new Vector(2, 2));
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
    Position actual = pos.subtract(new Position(2, 2));
    // THEN
    Assert.assertEquals(3, pos.getX());
    Assert.assertEquals(4, pos.getY());
    Assert.assertEquals(1, actual.getX());
    Assert.assertEquals(2, actual.getY());
  }

  @Test
  public void testVectorTo() {
    // GIVEN
    Position pos = new Position(3, 4);
    // WHEN
    Vector actual = pos.getVectorTo(new Position(2, 2));
    // THEN
    Assert.assertEquals(-1, actual.getX(), 0.00001d);
    Assert.assertEquals(-2, actual.getY(), 0.00001d);
  }

  @Test
  public void testToString() {
    // GIVEN
    Position pos = new Position(3, 4);
    // WHEN
    String str = pos.toString();
    // THEN
    Assert.assertEquals("[x=3,y=4]", str);
  }
}
