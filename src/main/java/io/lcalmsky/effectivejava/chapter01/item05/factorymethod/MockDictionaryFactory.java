package io.lcalmsky.effectivejava.chapter01.item05.factorymethod;

import io.lcalmsky.effectivejava.chapter01.item05.MockDictionary;
import io.lcalmsky.effectivejava.chapter01.item05.dependencyinjection.Dictionary;

public class MockDictionaryFactory implements DictionaryFactory {

  @Override
  public Dictionary getDictionary() {
    return new MockDictionary();
  }
}
