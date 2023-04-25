package io.lcalmsky.effectivejava.chapter01.item05.factorymethod;

import io.lcalmsky.effectivejava.chapter01.item05.DefaultDictionary;
import io.lcalmsky.effectivejava.chapter01.item05.dependencyinjection.Dictionary;

public class DefaultDictionaryFactory implements DictionaryFactory{

  @Override
  public Dictionary getDictionary() {
    return new DefaultDictionary();
  }
}
