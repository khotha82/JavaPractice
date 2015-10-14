package com.example.effjava.inheritance;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by krishna_hotha on 7/7/15 2015.
 */
public class HashSetExample<E> extends HashSet<E> {


    private int addCount = 0;

    public HashSetExample() {

    }
    public HashSetExample(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override public boolean add(E e) {
        addCount++;
        return super.add(e);
    }
    @Override public boolean addAll(Collection<? extends E> c) { addCount += c.size();
        return super.addAll(c);
    }
    public int getAddCount() {
        return addCount;
    }
}
