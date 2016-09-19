package com.dt.physics.common;

public class Vector extends Pair {

  public Vector(double x, double y) {
    super(x, y);
  }

  public Vector(Pair p) {
    super(p);
  }

  public double getScalar() {
    return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
  }

  public Vector getNormalizedVectorToScalar(double behaviorWeight) {
    double factor = behaviorWeight / getScalar();
    return new Vector(this.getX() * factor, this.getY() * factor);
  }
}
