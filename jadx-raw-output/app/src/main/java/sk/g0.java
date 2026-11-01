package sk;

/* JADX INFO: compiled from: SystemProps.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g0 {
    public static final int a(String str, int i10, int i11, int i12) {
        return (int) e0.c(str, i10, i11, i12);
    }

    public static /* synthetic */ int e(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return e0.b(str, i10, i11, i12);
    }

    public static /* synthetic */ long f(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return e0.c(str, j10, j13, j12);
    }

    public static final long b(String str, long j10, long j11, long j12) {
        String strD = e0.d(str);
        if (strD == null) {
            return j10;
        }
        Long lT = lk.w.t(strD);
        if (lT != null) {
            long jLongValue = lT.longValue();
            boolean z10 = false;
            if (j11 <= jLongValue && jLongValue <= j12) {
                z10 = true;
            }
            if (z10) {
                return jLongValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strD + '\'').toString());
    }

    public static final String c(String str, String str2) {
        String strD = e0.d(str);
        if (strD != null) {
            return strD;
        }
        return str2;
    }

    public static final boolean d(String str, boolean z10) {
        String strD = e0.d(str);
        if (strD != null) {
            return Boolean.parseBoolean(strD);
        }
        return z10;
    }
}
