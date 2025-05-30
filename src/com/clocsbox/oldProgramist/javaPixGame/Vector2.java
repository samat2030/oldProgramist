package com.clocsbox.oldProgramist.javaPixGame;

public class Vector2 {
  public int x;
  public int y;
  public int w;
  public int h;

  public Vector2(int x, int y) {
    this.x = x;
    this.y = y;
    this.w = x;
    this.h = y;
  }

  // Быстрое сравнение
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Vector2)) return false;
    Vector2 v = (Vector2) obj;
    return this.x == v.x && this.y == v.y;
  }

  // Удобное отображение
  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}