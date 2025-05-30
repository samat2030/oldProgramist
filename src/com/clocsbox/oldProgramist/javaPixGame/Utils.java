package com.clocsbox.oldProgramist.javaPixGame;
import java.awt.*;

public final class Utils {
  private Utils() {}

  public static Vector2 xy(int x, int y) {
    return new Vector2(x, y);
  }

  public static Vector2 wh(int w, int h) {
    return new Vector2(w, h);
  }

  public static Vector2 getScreenSize() {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    return new Vector2(screenSize.width, screenSize.height);
  }
}
