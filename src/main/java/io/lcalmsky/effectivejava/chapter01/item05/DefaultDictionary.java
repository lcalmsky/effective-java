package io.lcalmsky.effectivejava.chapter01.item05;

import io.lcalmsky.effectivejava.chapter01.item05.dependencyinjection.Dictionary;
import java.util.List;

public class DefaultDictionary implements Dictionary {

  public boolean contains(String word) {
    return false;
  }

  public List<String> closeWordsTo(String typo) {
    return null;
  }
}
