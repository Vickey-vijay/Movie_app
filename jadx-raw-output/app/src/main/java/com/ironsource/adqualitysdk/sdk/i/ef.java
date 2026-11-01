package com.ironsource.adqualitysdk.sdk.i;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ef extends ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1941 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1942;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1943 = {'-', '.'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ed f1944;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed f1945;

    public boolean equals(Object obj) {
        if (this == obj) {
            int i10 = f1941 + 115;
            f1942 = i10 % 128;
            return !(i10 % 2 != 0);
        }
        if (!(obj == null) && getClass() == obj.getClass()) {
            ef efVar = (ef) obj;
            ed edVar = this.f1944;
            if (edVar == null ? efVar.f1944 != null : !edVar.equals(efVar.f1944)) {
                return false;
            }
            ed edVar2 = this.f1945;
            if (edVar2 != null) {
                int i11 = f1941 + 5;
                f1942 = i11 % 128;
                int i12 = i11 % 2;
                boolean zEquals = edVar2.equals(efVar.f1945);
                if (i12 == 0) {
                    return zEquals;
                }
                int i13 = 67 / 0;
                return zEquals;
            }
            if (efVar.f1945 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2151(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2448) {
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            char[] cArr = new char[i11];
            System.arraycopy(f1943, i10, cArr, 0, i11);
            if (bArr != null) {
                char[] cArr2 = new char[i11];
                i.f2447 = 0;
                char c10 = 0;
                while (true) {
                    int i14 = i.f2447;
                    if (i14 >= i11) {
                        break;
                    }
                    if (bArr[i14] == 1) {
                        cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                    } else {
                        cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                    }
                    c10 = cArr2[i14];
                    i.f2447 = i14 + 1;
                }
                cArr = cArr2;
            }
            if (i13 > 0) {
                char[] cArr3 = new char[i11];
                System.arraycopy(cArr, 0, cArr3, 0, i11);
                int i15 = i11 - i13;
                System.arraycopy(cArr3, 0, cArr, i15, i13);
                System.arraycopy(cArr3, i13, cArr, 0, i15);
            }
            if (z10) {
                char[] cArr4 = new char[i11];
                i.f2447 = 0;
                while (true) {
                    int i16 = i.f2447;
                    if (i16 >= i11) {
                        break;
                    }
                    cArr4[i16] = cArr[(i11 - i16) - 1];
                    i.f2447 = i16 + 1;
                }
                cArr = cArr4;
            }
            if (i12 > 0) {
                i.f2447 = 0;
                while (true) {
                    int i17 = i.f2447;
                    if (i17 >= i11) {
                        break;
                    }
                    cArr[i17] = (char) (cArr[i17] - iArr[2]);
                    i.f2447 = i17 + 1;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    public int hashCode() {
        int i10 = f1942 + 51;
        f1941 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        ed edVar = this.f1944;
        int iHashCode = 0;
        int iHashCode2 = ((edVar != null ? '\n' : (char) 24) != 24 ? edVar.hashCode() : 0) * 31;
        ed edVar2 = this.f1945;
        if (edVar2 != null) {
            int i11 = f1942 + 89;
            f1941 = i11 % 128;
            int i12 = i11 % 2;
            iHashCode = edVar2.hashCode();
        } else {
            int i13 = f1942 + 107;
            f1941 = i13 % 128;
            int i14 = i13 % 2;
        }
        return iHashCode2 + iHashCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2153().toString());
        sb2.append(m2151(new int[]{0, 1, 0, 1}, "\u0001", false).intern());
        sb2.append(m2152().toString());
        sb2.append(m2151(new int[]{1, 1, 0, 1}, "\u0001", true).intern());
        String string = sb2.toString();
        int i10 = f1942 + 13;
        f1941 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final ed m2152() {
        int i10 = f1941 + 73;
        f1942 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 22 : 'I') == 'I') {
            return this.f1945;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ed m2153() {
        int i10 = f1941 + 119;
        f1942 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1944;
        }
        int i11 = 1 / 0;
        return this.f1944;
    }

    public ef(ed edVar, ed edVar2, dm dmVar) {
        super(dmVar);
        this.f1944 = edVar;
        this.f1945 = edVar2;
    }
}
