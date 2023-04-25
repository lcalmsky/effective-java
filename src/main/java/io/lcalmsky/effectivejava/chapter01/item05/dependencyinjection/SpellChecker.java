package io.lcalmsky.effectivejava.chapter01.item05.dependencyinjection;

import java.util.List;

public class SpellChecker {

  // Dictionary가 인터페이스라면 재사용 및 갈아끼우기 가능
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
