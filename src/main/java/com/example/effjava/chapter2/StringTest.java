package com.example.effjava.chapter2;

/**
 * Created by krishna_hotha on 6/25/15 2015.
 */
public class StringTest {

    String s;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StringTest)) return false;

        StringTest that = (StringTest) o;

        return !(s != null ? !s.equals(that.s) : that.s != null);

    }

    @Override
    public int hashCode() {
        return s != null ? s.hashCode() : 0;
    }
}
