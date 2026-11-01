package lk;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: UStrings.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 {
    public static final byte a(String str) {
        ck.p.j(str, "<this>");
        mj.i iVarB = b(str);
        if (iVarB != null) {
            return iVarB.f();
        }
        w.q(str);
        throw new KotlinNothingValueException();
    }

    public static final mj.i b(String str) {
        ck.p.j(str, "<this>");
        return c(str, 10);
    }

    public static final mj.i c(String str, int i10) {
        ck.p.j(str, "<this>");
        mj.k kVarF = f(str, i10);
        if (kVarF == null) {
            return null;
        }
        int iF = kVarF.f();
        if (Integer.compare(iF ^ Integer.MIN_VALUE, mj.k.b(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return mj.i.a(mj.i.b((byte) iF));
    }

    public static final int d(String str) {
        ck.p.j(str, "<this>");
        mj.k kVarE = e(str);
        if (kVarE != null) {
            return kVarE.f();
        }
        w.q(str);
        throw new KotlinNothingValueException();
    }

    public static final mj.k e(String str) {
        ck.p.j(str, "<this>");
        return f(str, 10);
    }

    public static final mj.k f(String str, int i10) {
        ck.p.j(str, "<this>");
        a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        int i12 = 1;
        if (ck.p.l(cCharAt, 48) >= 0) {
            i12 = 0;
        } else if (length == 1 || cCharAt != '+') {
            return null;
        }
        int iB = mj.k.b(i10);
        int iA = 119304647;
        while (i12 < length) {
            int iB2 = a.b(str.charAt(i12), i10);
            if (iB2 < 0) {
                return null;
            }
            if (Integer.compare(i11 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                if (iA == 119304647) {
                    iA = g0.a(-1, iB);
                    if (Integer.compare(i11 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iB3 = mj.k.b(i11 * iB);
            int iB4 = mj.k.b(mj.k.b(iB2) + iB3);
            if (Integer.compare(iB4 ^ Integer.MIN_VALUE, iB3 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i12++;
            i11 = iB4;
        }
        return mj.k.a(i11);
    }

    public static final long g(String str) {
        ck.p.j(str, "<this>");
        mj.m mVarH = h(str);
        if (mVarH != null) {
            return mVarH.f();
        }
        w.q(str);
        throw new KotlinNothingValueException();
    }

    public static final mj.m h(String str) {
        ck.p.j(str, "<this>");
        return i(str, 10);
    }

    public static final mj.m i(String str, int i10) {
        ck.p.j(str, "<this>");
        a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        long j10 = -1;
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (ck.p.l(cCharAt, 48) < 0) {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i11 = 1;
        }
        long jB = mj.m.b(i10);
        long j11 = 0;
        long jA = 512409557603043100L;
        while (i11 < length) {
            int iB = a.b(str.charAt(i11), i10);
            if (iB < 0) {
                return null;
            }
            if (Long.compare(j11 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                if (jA == 512409557603043100L) {
                    jA = f0.a(j10, jB);
                    if (Long.compare(j11 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jB2 = mj.m.b(j11 * jB);
            long jB3 = mj.m.b(mj.m.b(((long) mj.k.b(iB)) & 4294967295L) + jB2);
            if (Long.compare(jB3 ^ Long.MIN_VALUE, jB2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            j11 = jB3;
            j10 = -1;
        }
        return mj.m.a(j11);
    }

    public static final short j(String str) {
        ck.p.j(str, "<this>");
        mj.p pVarK = k(str);
        if (pVarK != null) {
            return pVarK.f();
        }
        w.q(str);
        throw new KotlinNothingValueException();
    }

    public static final mj.p k(String str) {
        ck.p.j(str, "<this>");
        return l(str, 10);
    }

    public static final mj.p l(String str, int i10) {
        ck.p.j(str, "<this>");
        mj.k kVarF = f(str, i10);
        if (kVarF == null) {
            return null;
        }
        int iF = kVarF.f();
        if (Integer.compare(iF ^ Integer.MIN_VALUE, mj.k.b(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return mj.p.a(mj.p.b((short) iF));
    }
}
