package io.lcalmsky.effectivejava.chapter01.item08.outerclass;

import java.lang.reflect.Field;

public class LambdaExample {

    private int value = 10;

    private final Runnable instanceLambda = () -> {
        System.out.println(value);
    };

    public static void main(String[] args) {
        LambdaExample example = new LambdaExample();
        Field[] fields = example.instanceLambda.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field.getType() = " + field.getType()); // capturing 하지 않으면 생기지 않음
            System.out.println("field.getName() = " + field.getName()); // lambda instance가 outerclass에 참조를 가지게 됨
        }
    }
}
