package io.lcalmsky.effectivejava.chapter01.item01;

public class Settings {

  private static final Settings SETTINGS = new Settings();
  private boolean useAutoSteering;
  private boolean useAbs;
  private Difficulty difficulty;

  private Settings() {
  }

  public static Settings newInstance() {
    return SETTINGS;
  }
}
