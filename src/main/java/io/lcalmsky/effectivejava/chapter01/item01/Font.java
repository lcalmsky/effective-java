package io.lcalmsky.effectivejava.chapter01.item01;

public class Font {

  private final String fontFamily;
  private final int fontSize;

  public Font(String fontFamily, int fontSize) {
    this.fontFamily = fontFamily;
    this.fontSize = fontSize;
  }

  public String getFontFamily() {
    return fontFamily;
  }

  public int getFontSize() {
    return fontSize;
  }
}
