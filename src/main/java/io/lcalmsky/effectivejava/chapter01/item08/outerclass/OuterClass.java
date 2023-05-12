package io.lcalmsky.effectivejava.chapter01.item08.outerclass;

import java.lang.reflect.Field;

public class OuterClass {

    private void hi() {

    }

    class InnerClass {

        public void hello() {
            OuterClass.this.hi(); // outer class의 메서드를 호출하는 방법
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass);
        outerClass.printInnerClassFields();
    }

    private void printInnerClassFields() {
        Field[] fields = InnerClass.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field.getType() = " + field.getType());
            System.out.println("field.getName() = " + field.getName());
        }
    }
}
