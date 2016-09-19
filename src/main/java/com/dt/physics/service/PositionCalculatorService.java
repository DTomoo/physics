package com.dt.physics.service;

import com.dt.physics.common.Position;
import com.dt.physics.common.Vector;

public interface PositionCalculatorService {
  
  public Vector getVector(Position pos1, Position pos2);
}
