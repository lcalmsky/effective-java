package io.lcalmsky.effectivejava.chapter01.item08.autoclosable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosableIsGood implements AutoCloseable {

    private BufferedReader reader;

    public AutoClosableIsGood(String path) {
        try {
            this.reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(path);
        }
    }

//    @Override
//    public void close() throws IOException { // 예외를 던져야 한다면 가장 구체적인 예외를 던지는 것을 권장
//        reader.close();
//    }

    @Override
    public void close() {
        try {
            reader.close();
        } catch (IOException e) {
            // throw new RuntimeException(e); // 다른 예외로 감싸서 던짐
            System.err.println("IO 에러 발생"); // logging만 함
        }
    }
}
