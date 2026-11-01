package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes5.dex */
public abstract class H9 {
    public static final B9 a(int i10, String str) {
        byte[] bytes;
        B9 b10 = new B9();
        b10.f55013a = i10;
        if (str == null || (bytes = str.getBytes(lk.c.f63591b)) == null) {
            bytes = b10.f55014b;
        }
        b10.f55014b = bytes;
        return b10;
    }
}
