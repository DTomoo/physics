package com.dt.physics.common;

public class Pair {

  private double x;
  private double y;

  public Pair(Pair p) {
    this.x = p.x;
    this.y = p.y;
  }

  public Pair(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public Pair add(Pair p) {
    return new Pair(this.x + p.x, this.y + p.y);
  }

  public Pair subtract(Pair p) {
    return new Pair(this.x - p.x, this.y - p.y);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long temp;
    temp = Double.doubleToLongBits(x);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(y);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Pair other = (Pair) obj;
    if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
      return false;
    if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "[x=" + x + ", y=" + y + "]";
  }

 
}
