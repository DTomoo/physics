package com.dt.physics.service;

import com.dt.physics.common.Position;
import com.dt.physics.common.Vector;

public class PositionCalculatorServiceImpl implements PositionCalculatorService {

  public Vector getVector(Position pos1, Position pos2) {
    paramValidation(pos1);
    paramValidation(pos2);
    return new Vector(pos2.getX() - pos1.getX(), pos2.getY() - pos1.getY());
  }

  private void paramValidation(Position pos) {
    if (pos == null) {
      throw new IllegalArgumentException();
    }
  }
}
