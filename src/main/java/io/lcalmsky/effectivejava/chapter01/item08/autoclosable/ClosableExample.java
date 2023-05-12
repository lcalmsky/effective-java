package io.lcalmsky.effectivejava.chapter01.item08.autoclosable;

import java.io.*;

public class ClosableExample implements Closeable { // IO 패키지 내부에 있는 인터페이스

    private BufferedReader reader;

    public ClosableExample(String path) {
        try {
            this.reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(path);
        }
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }
}
