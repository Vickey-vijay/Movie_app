package lk;

/* JADX INFO: compiled from: StringNumberConversions.kt */
/* JADX INFO: loaded from: classes10.dex */
public class w extends v {
    public static final Void q(String str) {
        ck.p.j(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static final Integer r(String str) {
        ck.p.j(str, "<this>");
        return s(str, 10);
    }

    public static final Integer s(String str, int i10) {
        boolean z10;
        int i11;
        ck.p.j(str, "<this>");
        a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int i13 = -2147483647;
        int i14 = 1;
        if (ck.p.l(cCharAt, 48) >= 0) {
            z10 = false;
            i14 = 0;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i13 = Integer.MIN_VALUE;
                z10 = true;
            }
        }
        int i15 = -59652323;
        while (i14 < length) {
            int iB = a.b(str.charAt(i14), i10);
            if (iB < 0) {
                return null;
            }
            if ((i12 < i15 && (i15 != -59652323 || i12 < (i15 = i13 / i10))) || (i11 = i12 * i10) < i13 + iB) {
                return null;
            }
            i12 = i11 - iB;
            i14++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    public static final Long t(String str) {
        ck.p.j(str, "<this>");
        return u(str, 10);
    }

    public static final Long u(String str, int i10) {
        ck.p.j(str, "<this>");
        a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        boolean z10 = true;
        if (ck.p.l(cCharAt, 48) >= 0) {
            z10 = false;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
                i11 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i11 = 1;
            }
        }
        long j11 = -256204778801521550L;
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i11 < length) {
            int iB = a.b(str.charAt(i11), i10);
            if (iB < 0) {
                return null;
            }
            if (j12 < j13) {
                if (j13 == j11) {
                    j13 = j10 / ((long) i10);
                    if (j12 < j13) {
                    }
                }
                return null;
            }
            long j14 = j12 * ((long) i10);
            long j15 = iB;
            if (j14 < j10 + j15) {
                return null;
            }
            j12 = j14 - j15;
            i11++;
            j11 = -256204778801521550L;
        }
        return z10 ? Long.valueOf(j12) : Long.valueOf(-j12);
    }
}
