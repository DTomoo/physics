package com.dt.physics.common;

import com.dt.physics.common.features.Calculatable;

public class Position extends Pair<Integer>implements Calculatable<Position> {

  public Position(int x, int y) {
    super(x, y);
  }

  public Position(Position pos) {
    super(pos);
  }

  public Position add(Position other) {
    return new Position(this.getX() + other.getX(), this.getY() + other.getY());
  }

  public Position subtract(Position other) {
    return new Position(this.getX() - other.getX(), this.getY() - other.getY());
  }
}
