package p5;

import m5.l;

/* JADX INFO: compiled from: UnsignedBytes.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static int b(byte b10) {
        return b10 & 255;
    }

    public static byte a(long j10) {
        l.h((j10 >> 8) == 0, "out of range: %s", j10);
        return (byte) j10;
    }
}
