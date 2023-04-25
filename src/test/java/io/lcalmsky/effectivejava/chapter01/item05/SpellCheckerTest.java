package io.lcalmsky.effectivejava.chapter01.item05;

import io.lcalmsky.effectivejava.chapter01.item05.dependencyinjection.Dictionary;
import io.lcalmsky.effectivejava.chapter01.item05.dependencyinjection.SpellChecker;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpellCheckerTest {

  @Test
  void isValid() {
    // 의존 객체 주입
    SpellChecker spellChecker = new SpellChecker(new Dictionary() {
      @Override
      public boolean contains(String word) {
        return false;
      }

      @Override
      public List<String> closeWordsTo(String typo) {
        return null;
      }
    });
    Assertions.assertTrue(spellChecker.isValid("test"));
  }
}