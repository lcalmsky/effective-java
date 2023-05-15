package io.lcalmsky.effectivejava.chapter01.item09.suppress;

import java.io.*;

public class BadBufferedReader extends BufferedReader {
    public BadBufferedReader(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {
        throw new CharConversionException();
    }

    @Override
    public void close() throws StreamCorruptedException {
        throw new StreamCorruptedException();
    }
}
