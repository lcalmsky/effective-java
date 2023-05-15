package io.lcalmsky.effectivejava.chapter01.item09.tryfinally;

import java.io.*;

public class Copy {

    public static final int BUFFER_SIZE = 8 * 1024;

    public static void main(String[] args) throws IOException {
        String src = args[0];
        String dst = args[1];
        copy(src, dst);
    }

    // 자원이 둘 이상이면 try-finally 방식은 너무 지저분함
    private static void copy(String source, String destination) throws IOException {
        InputStream inputStream = new FileInputStream(source);
        try {
            OutputStream outputStream = new FileOutputStream(destination);
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = inputStream.read(buf)) >= 0) {
                    outputStream.write(buf, 0, n);
                }
            } finally {
                outputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }
}
