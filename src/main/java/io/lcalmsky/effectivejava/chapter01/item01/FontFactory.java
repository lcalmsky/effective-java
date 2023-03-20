package io.lcalmsky.effectivejava.chapter01.item01;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {

  private final Map<String, Font> cache = new HashMap<>();

  public Font getFont(String font) {
    assert font != null;
    String[] split = font.split(":");
    assert split.length == 2;
    String fontFamily = split[0];
    int fontSize = Integer.parseInt(split[1]);
    return cache.putIfAbsent(font, new Font(fontFamily, fontSize));
  }
}
