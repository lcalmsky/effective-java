package io.lcalmsky.effectivejava.chapter01.item05.staticutils;

import io.lcalmsky.effectivejava.chapter01.item05.DefaultDictionary;
import java.util.List;

// static 클래스의 문제점
public class SpellChecker {

  // 자원을 직접 명시함(생성함)
  // 자신이 가진 리소스에 따라 동작이 달라지는 경우에는 직접 명시하지 말아라
  private static final DefaultDictionary DEFAULT_DICTIONARY = new DefaultDictionary();

  private SpellChecker() {
  }

  public static boolean isValid(String word) {
    // SpellChecker 코드
    return DEFAULT_DICTIONARY.contains(word);
  }

  public static List<String> suggestions(String typo) {
    // SpellChecker 코드
    return DEFAULT_DICTIONARY.closeWordsTo(typo);
  }
}
