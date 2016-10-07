package com.dt.physics.common;

import com.dt.physics.common.features.Calculatable;

public class Position extends Pair<Integer>implements Calculatable<Position> {

  public Position(int x, int y) {
    super(Integer.valueOf(x), Integer.valueOf(y));
  }

  public Position(Position pos) {
    super(pos);
  }

  public int getX() {
    return getP1().intValue();
  }

  public int getY() {
    return getP2().intValue();
  }

  public Position add(Position other) {
    return new Position(this.getX() + other.getX(), this.getY() + other.getY());
  }

  public Position subtract(Position other) {
    return new Position(this.getX() - other.getX(), this.getY() - other.getY());
  }

  public Vector getVectorTo(Position other) {
    return new Vector(other.getX() - this.getX(), other.getY() - this.getY());
  }

  public Position add(Vector vector) {
    return new Position((int) (this.getX() + vector.getX()), (int) (this.getY() + vector.getY()));
  }

  @Override
  public String toString() {
    return "[x=" + this.getX() + ",y=" + this.getY() + "]";
  }
}
