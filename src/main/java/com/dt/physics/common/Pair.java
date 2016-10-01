package com.dt.physics.common;

public abstract class Pair<T> {

  private T p1;
  private T p2;

  public Pair(Pair<T> p) {
    this.p1 = p.p1;
    this.p2 = p.p2;
  }

  public Pair(T p1, T p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  public T getP1() {
    return p1;
  }

  public T getP2() {
    return p2;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((p1 == null) ? 0 : p1.hashCode());
    result = prime * result + ((p2 == null) ? 0 : p2.hashCode());
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
    Pair<T> other = (Pair<T>) obj;
    if (p1 == null) {
      if (other.p1 != null)
        return false;
    } else if (!p1.equals(other.p1))
      return false;
    if (p2 == null) {
      if (other.p2 != null)
        return false;
    } else if (!p2.equals(other.p2))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "[p1=" + p1 + ", p2=" + p2 + "]";
  }
}
