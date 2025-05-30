package com.clocsbox.oldProgramist.javaPixGame;

public class engine {
  private final Vector2 sizeWin;
  private final Vector2 sizeMain;
  private float i;
  public engine(Vector2 sizeWindow, Vector2 sizeMainWindow, float increasePixels) {
    this.sizeWin = sizeWindow;
    this.sizeMain = sizeMainWindow;
    this.i = increasePixels;
  }
}
