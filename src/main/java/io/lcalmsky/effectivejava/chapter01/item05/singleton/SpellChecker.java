package io.lcalmsky.effectivejava.chapter01.item05.singleton;

import io.lcalmsky.effectivejava.chapter01.item05.Dictionary;
import java.util.List;

public class SpellChecker {

  // 직접 정의하면 테스트가 어려워짐
  // 유연성이 떨어짐
  // 재사용성이 떨어짐
  private final Dictionary dictionary = new Dictionary();

  public static final SpellChecker INSTANCE = new SpellChecker();

  private SpellChecker() {

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
