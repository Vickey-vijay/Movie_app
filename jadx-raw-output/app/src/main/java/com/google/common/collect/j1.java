package com.google.common.collect;

/* JADX INFO: compiled from: CollectPreconditions.java */
/* JADX INFO: loaded from: classes11.dex */
public final class j1 {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static int b(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static long c(long j10, String str) {
        if (j10 >= 0) {
            return j10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + j10);
    }

    public static void d(int i10, String str) {
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " must be positive but was: " + i10);
    }

    public static void e(boolean z10) {
        m5.l.s(z10, "no calls to next() since the last call to remove()");
    }
}
