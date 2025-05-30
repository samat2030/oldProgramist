package com.clocsbox.oldProgramist;

import com.clocsbox.oldProgramist.javaPixGame.Vector2;
import com.clocsbox.oldProgramist.javaPixGame.engine;
import static com.clocsbox.oldProgramist.javaPixGame.Utils.*;

public class Main {
  private static final Vector2 screensize = getScreenSize();

  public static void main(String[] args) {
    System.out.println("Hello, World!");
    float scale = (float) screensize.y / 240;

    engine px = new engine(
            wh(0, 0),
            wh(320, 240),
            scale
    );
  }
}