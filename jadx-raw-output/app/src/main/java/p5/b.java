package p5;

import m5.l;

/* JADX INFO: compiled from: Chars.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static char a(long j10) {
        char c10 = (char) j10;
        l.h(((long) c10) == j10, "Out of range: %s", j10);
        return c10;
    }

    public static boolean b(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    public static char c(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & 255));
    }
}
