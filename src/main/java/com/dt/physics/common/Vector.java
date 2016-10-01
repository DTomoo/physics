package com.dt.physics.common;

import com.dt.physics.common.features.Calculatable;

public class Vector extends Pair<Double>implements Calculatable<Vector> {

  public Vector(double x, double y) {
    super(x, y);
  }

  public Vector(Pair<Double> v) {
    super(v);
  }

  public Vector add(Vector other) {
    return new Vector(this.getX() + other.getX(), this.getY() + other.getY());
  }

  public Vector subtract(Vector other) {
    return new Vector(this.getX() - other.getX(), this.getY() - other.getY());
  }

  public double getScalar() {
    return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
  }

  public Vector getNormalizedVectorToScalar(double behaviorWeight) {
    double factor = behaviorWeight / getScalar();
    return new Vector(this.getX() * factor, this.getY() * factor);
  }
}
