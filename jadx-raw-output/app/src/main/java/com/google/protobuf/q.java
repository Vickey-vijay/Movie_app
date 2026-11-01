package com.google.protobuf;

import java.nio.Buffer;

/* JADX INFO: compiled from: Java8Compatibility.java */
/* JADX INFO: loaded from: classes2.dex */
public final class q {
    private q() {
    }

    public static void clear(Buffer buffer) {
        buffer.clear();
    }

    public static void flip(Buffer buffer) {
        buffer.flip();
    }

    public static void limit(Buffer buffer, int i10) {
        buffer.limit(i10);
    }

    public static void mark(Buffer buffer) {
        buffer.mark();
    }

    public static void position(Buffer buffer, int i10) {
        buffer.position(i10);
    }

    public static void reset(Buffer buffer) {
        buffer.reset();
    }
}
