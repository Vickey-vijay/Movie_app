package mj;

/* JADX INFO: compiled from: UnsignedJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s {
    public static final int a(int i10, int i11) {
        return ck.p.l(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    public static final int b(long j10, long j11) {
        return ck.p.m(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    public static final String c(long j10, int i10) {
        if (j10 >= 0) {
            String string = Long.toString(j10, lk.a.a(i10));
            ck.p.i(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j12, lk.a.a(i10));
        ck.p.i(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j13, lk.a.a(i10));
        ck.p.i(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
