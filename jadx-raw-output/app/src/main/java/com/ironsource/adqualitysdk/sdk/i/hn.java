package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes9.dex */
public enum hn {
    f2357(-1),
    f2361(0),
    f2360(1),
    f2358(2),
    f2359(3),
    f2355(4),
    f2353(5),
    f2356(6);


    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2350 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f2351 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int[] f2352;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private final int f2362;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2266() {
        f2352 = new int[]{-598830901, 1989314260, -1901562280, 467925058, -723660769, 296365004, -2092547361, -1483207319, 532367964, -1998172150, -134091479, -1794188114, -2132346635, 1022009424, -1087064520, -177743133, -2045544004, -2038714072};
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static hn m2267(int i10) {
        switch (i10) {
            case -1:
                return f2357;
            case 0:
                return f2361;
            case 1:
                return f2360;
            case 2:
                return f2358;
            case 3:
                hn hnVar = f2359;
                int i11 = f2350 + 91;
                f2351 = i11 % 128;
                int i12 = i11 % 2;
                return hnVar;
            case 4:
                hn hnVar2 = f2355;
                int i13 = f2350 + 37;
                f2351 = i13 % 128;
                if ((i13 % 2 == 0 ? ']' : '*') == '*') {
                    return hnVar2;
                }
                throw null;
            case 5:
                return f2353;
            case 6:
                return f2356;
            default:
                return null;
        }
    }

    public static hn valueOf(String str) {
        int i10 = f2350 + 27;
        f2351 = i10 % 128;
        if ((i10 % 2 == 0 ? 'D' : '+') != '+') {
            Enum.valueOf(hn.class, str);
            throw null;
        }
        hn hnVar = (hn) Enum.valueOf(hn.class, str);
        int i11 = f2350 + 19;
        f2351 = i11 % 128;
        if (i11 % 2 != 0) {
            return hnVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static hn[] valuesCustom() {
        int i10 = f2351 + 19;
        f2350 = i10 % 128;
        int i11 = i10 % 2;
        hn[] hnVarArr = (hn[]) values().clone();
        int i12 = f2350 + 75;
        f2351 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 26 : 'a') == 'a') {
            return hnVarArr;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2265(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2352.clone();
            e.f1913 = 0;
            while (true) {
                int i11 = e.f1913;
                if (i11 < iArr.length) {
                    int i12 = iArr[i11];
                    char c10 = (char) (i12 >> 16);
                    cArr[0] = c10;
                    char c11 = (char) i12;
                    cArr[1] = c11;
                    char c12 = (char) (iArr[i11 + 1] >> 16);
                    cArr[2] = c12;
                    char c13 = (char) iArr[i11 + 1];
                    cArr[3] = c13;
                    e.f1915 = (c10 << 16) + c11;
                    e.f1914 = (c12 << 16) + c13;
                    e.m2135(iArr2);
                    for (int i13 = 0; i13 < 16; i13++) {
                        int i14 = e.f1915 ^ iArr2[i13];
                        e.f1915 = i14;
                        e.f1914 = e.m2134(i14) ^ e.f1914;
                        int i15 = e.f1915;
                        e.f1915 = e.f1914;
                        e.f1914 = i15;
                    }
                    int i16 = e.f1915;
                    e.f1915 = e.f1914;
                    e.f1914 = i16;
                    e.f1914 = i16 ^ iArr2[16];
                    e.f1915 ^= iArr2[17];
                    int i17 = e.f1913;
                    int i18 = e.f1915;
                    cArr[0] = (char) (i18 >>> 16);
                    cArr[1] = (char) i18;
                    int i19 = e.f1914;
                    cArr[2] = (char) (i19 >>> 16);
                    cArr[3] = (char) i19;
                    e.m2135(iArr2);
                    int i20 = e.f1913;
                    cArr2[i20 << 1] = cArr[0];
                    cArr2[(i20 << 1) + 1] = cArr[1];
                    cArr2[(i20 << 1) + 2] = cArr[2];
                    cArr2[(i20 << 1) + 3] = cArr[3];
                    e.f1913 = i20 + 2;
                } else {
                    str = new String(cArr2, 0, i10);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m2268() {
        int i10 = f2350 + 97;
        f2351 = i10 % 128;
        if ((i10 % 2 == 0 ? '-' : '>') == '>') {
            return this.f2362;
        }
        throw null;
    }

    static {
        char c10;
        m2266();
        int i10 = f2351 + 33;
        f2350 = i10 % 128;
        if (i10 % 2 != 0) {
            c10 = '5';
        } else {
            c10 = '8';
        }
        if (c10 != '5') {
        } else {
            throw null;
        }
    }

    hn(int i10) {
        this.f2362 = i10;
    }
}
