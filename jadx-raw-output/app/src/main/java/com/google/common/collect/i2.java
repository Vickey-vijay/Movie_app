package com.google.common.collect;

import java.lang.Comparable;
import java.util.Set;

/* JADX INFO: compiled from: RangeSet.java */
/* JADX INFO: loaded from: classes10.dex */
public interface i2<C extends Comparable> {
    Set<Range<C>> asRanges();

    i2<C> complement();

    boolean encloses(Range<C> range);

    boolean isEmpty();

    void removeAll(i2<C> i2Var);

    i2<C> subRangeSet(Range<C> range);
}
