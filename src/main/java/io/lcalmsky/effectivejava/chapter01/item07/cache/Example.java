package io.lcalmsky.effectivejava.chapter01.item07.cache;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Map<Object, String> hashMap = new HashMap<>();
        Object key = new Object();
        hashMap.put(key, "value");
        // key 참조 제거
        key = null;
        // garbage collector 강제 실행
        System.gc();
        // hashMap이 비어있는지 확인
        System.out.println("hashMap.size() = " + hashMap.size());
    }
}
