package com.squareup.picasso;

/* JADX INFO: loaded from: classes8.dex */
public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);

    public final int index;

    public static boolean isOfflineOnly(int i10) {
        return (i10 & OFFLINE.index) != 0;
    }

    public static boolean shouldReadFromDiskCache(int i10) {
        return (i10 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToDiskCache(int i10) {
        return (i10 & NO_STORE.index) == 0;
    }

    NetworkPolicy(int i10) {
        this.index = i10;
    }
}
