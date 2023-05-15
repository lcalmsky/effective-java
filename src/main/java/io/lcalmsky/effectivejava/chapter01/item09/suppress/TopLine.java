package io.lcalmsky.effectivejava.chapter01.item09.suppress;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TopLine {

    public static void main(String[] args) throws IOException {
        System.out.println(firstLineOfFile("build.gradle"));
    }

    // 예와가 둘 다 보임
    private static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader bufferedReader = new BadBufferedReader(new FileReader(path))) {
            return bufferedReader.readLine();
        }
    }
    // 마지막 예외만 보임
//    private static String firstLineOfFile(String path) throws IOException {
//        BufferedReader bufferedReader = new BadBufferedReader(new FileReader(path));
//        try {
//            return bufferedReader.readLine();
//        } finally {
//            bufferedReader.close();
//        }
//    }
}
