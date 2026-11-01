package com.squareup.picasso;

/* JADX INFO: loaded from: classes10.dex */
public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);

    public final int index;

    public static boolean shouldReadFromMemoryCache(int i10) {
        return (i10 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToMemoryCache(int i10) {
        return (i10 & NO_STORE.index) == 0;
    }

    MemoryPolicy(int i10) {
        this.index = i10;
    }
}
