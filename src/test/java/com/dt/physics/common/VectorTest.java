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
}
