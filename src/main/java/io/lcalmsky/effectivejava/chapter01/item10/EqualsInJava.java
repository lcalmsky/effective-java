package io.lcalmsky.effectivejava.chapter01.item10;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.sql.Timestamp;

public class EqualsInJava {
    public static void main(String[] args) throws MalformedURLException {
        // 대칭성 위배
        long time = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(time);
        Date date = new Date(time);
        System.out.println(date.equals(timestamp));
        System.out.println(timestamp.equals(date));

        // 일관성 위배 가능성 있음
        URL google1 = new URL("https", "about.google", "/products/");
        URL google2 = new URL("https", "about.google", "/products/");
        System.out.println(google1.equals(google2));
    }
}
