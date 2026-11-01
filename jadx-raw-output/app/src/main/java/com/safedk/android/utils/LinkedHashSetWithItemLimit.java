package com.safedk.android.utils;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes8.dex */
public class LinkedHashSetWithItemLimit<T> extends LinkedHashSet<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44886a = "LinkedHashSetWithItemLimit";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f44887b;

    public LinkedHashSetWithItemLimit(long maxSize) {
        this.f44887b = maxSize;
        Logger.d(f44886a, "LinkedHashSetWithItemLimit created. maxSize = " + maxSize);
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T item) {
        Logger.d(f44886a, "LinkedHashSetWithItemLimit add started. item = " + item);
        if (size() >= this.f44887b) {
            a();
        }
        return super.add(item);
    }

    private void a() {
        if (size() > 0) {
            Object next = iterator().next();
            remove(next);
            Logger.d(f44886a, "LinkedHashSetWithItemLimit removeFirst . item = " + next);
        }
    }
}
