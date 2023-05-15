package io.lcalmsky.effectivejava.chapter01.item09.puzzler;

import java.io.*;

public class Copy {
    public static final int BUFFER_SIZE = 8 * 1024;

    public static void main(String[] args) throws IOException {
        String src = args[0];
        String dst = args[1];
        copy(src, dst);
    }

    private static void copy(String source, String destination) throws IOException {
        InputStream inputStream = new FileInputStream(source);
        OutputStream outputStream = new FileOutputStream(destination);
        try {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = inputStream.read(buf)) >= 0) {
                outputStream.write(buf, 0, n);
            }
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) { // IO Exception이 발생하지 않는다면 이후 동작이 수행되지 않음
                throw new RuntimeException(e);
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
