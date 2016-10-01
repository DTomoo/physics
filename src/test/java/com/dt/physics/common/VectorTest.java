package com.dt.physics.common;

import org.junit.Assert;
import org.junit.Test;

public class VectorTest {

  @Test
  public void testConstructorEquality() {
    // GIVEN
    Vector v1 = new Vector(3, 4);
    // WHEN
    Vector v2 = new Vector(v1);
    // THEN
    Assert.assertEquals(v1, v2);
    Assert.assertNotSame(v1, v2);
  }

  @Test
  public void testGetScalar() {
    // GIVEN
    Vector v1 = new Vector(3, 4);
    // WHEN
    double actual = v1.getScalar();
    // THEN
    Assert.assertEquals(5, actual, 0.00001d);
  }

  @Test
  public void testNormalize() {
    // GIVEN
    Vector v1 = new Vector(3, 4);
    // WHEN
    Vector actual = v1.getNormalizedVectorToScalar(10);
    // THEN
    Assert.assertEquals(new Vector(6, 8), actual);
  }

  @Test
  public void testAdd() {
    // GIVEN
    Vector pos = new Vector(3, 4);
    // WHEN
    Vector actual = pos.add(new Vector(2, 2));
    // THEN
    Assert.assertEquals(3.0d, pos.getX(), 0.001);
    Assert.assertEquals(4.0d, pos.getY(), 0.001);
    Assert.assertEquals(5.0d, actual.getX(), 0.001);
    Assert.assertEquals(6.0d, actual.getY(), 0.001);
  }

  @Test
  public void testSubtract() {
    // GIVEN
    Vector pos = new Vector(3, 4);
    // WHEN
    Vector actual = pos.subtract(new Vector(2, 2));
    // THEN
    Assert.assertEquals(3.0d, pos.getX(), 0.00001d);
    Assert.assertEquals(4.0d, pos.getY(), 0.00001d);
    Assert.assertEquals(1.0d, actual.getX(), 0.00001d);
    Assert.assertEquals(2.0d, actual.getY(), 0.00001d);
  }
}
