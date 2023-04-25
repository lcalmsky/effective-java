package io.lcalmsky.effectivejava.chapter01.item05.springioc;

import io.lcalmsky.effectivejava.chapter01.item05.dependencyinjection.Dictionary;
import java.util.List;

public class SpellChecker {

  private final Dictionary dictionary;

  public SpellChecker(Dictionary dictionary) {
    this.dictionary = dictionary;
  }

  public boolean isValid(String word) {
    // SpellChecker 코드
    return dictionary.contains(word);
  }

  public List<String> suggestions(String typo) {
    // SpellChecker 코드
    return dictionary.closeWordsTo(typo);
  }
}
