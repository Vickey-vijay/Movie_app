package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class eg extends ed {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f1946 = 9682;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1947 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1948 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1949 = 28183;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1950 = 60028;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1951 = 42206;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ed f1952;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed f1953;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r6.f1953 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r6 == 0) goto L61
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r6.getClass()
            if (r2 == r3) goto L12
            goto L61
        L12:
            com.ironsource.adqualitysdk.sdk.i.eg r6 = (com.ironsource.adqualitysdk.sdk.i.eg) r6
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r5.f1953
            r3 = 52
            if (r2 == 0) goto L1d
            r4 = 72
            goto L1e
        L1d:
            r4 = r3
        L1e:
            if (r4 == r3) goto L33
            com.ironsource.adqualitysdk.sdk.i.ed r3 = r6.f1953
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L38
            int r6 = com.ironsource.adqualitysdk.sdk.i.eg.f1947
            int r6 = r6 + 67
            int r0 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.eg.f1948 = r0
            int r6 = r6 % 2
            goto L37
        L33:
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r6.f1953
            if (r2 == 0) goto L38
        L37:
            return r1
        L38:
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r5.f1952
            r3 = 41
            if (r2 == 0) goto L41
            r4 = 91
            goto L42
        L41:
            r4 = r3
        L42:
            com.ironsource.adqualitysdk.sdk.i.ed r6 = r6.f1952
            if (r4 == r3) goto L55
            boolean r6 = r2.equals(r6)
            int r0 = com.ironsource.adqualitysdk.sdk.i.eg.f1948
            int r0 = r0 + 119
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.eg.f1947 = r1
            int r0 = r0 % 2
            return r6
        L55:
            r2 = 76
            if (r6 != 0) goto L5c
            r6 = 49
            goto L5d
        L5c:
            r6 = r2
        L5d:
            if (r6 == r2) goto L60
            return r0
        L60:
            return r1
        L61:
            int r6 = com.ironsource.adqualitysdk.sdk.i.eg.f1947
            int r6 = r6 + 5
            int r0 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.eg.f1948 = r0
            int r6 = r6 % 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.eg.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract String mo2155();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2154(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f2992) {
            char[] cArr2 = new char[cArr.length];
            n.f2991 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i11 = n.f2991;
                if (i11 < cArr.length) {
                    cArr3[0] = cArr[i11];
                    cArr3[1] = cArr[i11 + 1];
                    int i12 = 58224;
                    for (int i13 = 0; i13 < 16; i13++) {
                        char c10 = cArr3[1];
                        char c11 = cArr3[0];
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1951)) ^ ((c11 >>> 5) + f1946)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1950) ^ ((c12 + i12) ^ ((c12 << 4) + f1949))));
                        i12 -= 40503;
                    }
                    int i14 = n.f2991;
                    cArr2[i14] = cArr3[0];
                    cArr2[i14 + 1] = cArr3[1];
                    n.f2991 = i14 + 2;
                } else {
                    str2 = new String(cArr2, 0, i10);
                }
            }
        }
        return str2;
    }

    public int hashCode() {
        int iHashCode;
        ed edVar = this.f1953;
        int iHashCode2 = 0;
        if (!(edVar != null)) {
            iHashCode = 0;
        } else {
            int i10 = f1948 + 27;
            f1947 = i10 % 128;
            int i11 = i10 % 2;
            iHashCode = edVar.hashCode();
        }
        int i12 = iHashCode * 31;
        ed edVar2 = this.f1952;
        if (edVar2 != null) {
            iHashCode2 = edVar2.hashCode();
            int i13 = f1947 + 59;
            f1948 = i13 % 128;
            int i14 = i13 % 2;
        }
        return i12 + iHashCode2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1953);
        sb2.append(m2154("㴾\ue1e1", -TextUtils.lastIndexOf("", '0', 0)).intern());
        sb2.append(mo2155());
        sb2.append(m2154("㴾\ue1e1", -ExpandableListView.getPackedPositionChild(0L)).intern());
        sb2.append(this.f1952);
        String string = sb2.toString();
        int i10 = f1948 + 109;
        f1947 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final ed m2156() {
        int i10 = f1948 + 23;
        int i11 = i10 % 128;
        f1947 = i11;
        int i12 = i10 % 2;
        ed edVar = this.f1953;
        int i13 = i11 + 43;
        f1948 = i13 % 128;
        int i14 = i13 % 2;
        return edVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ed m2157() {
        int i10 = f1947 + 41;
        f1948 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 16 : 'U') != 16) {
            return this.f1952;
        }
        throw null;
    }

    public eg(ed edVar, ed edVar2, dm dmVar) {
        super(dmVar);
        this.f1953 = edVar;
        this.f1952 = edVar2;
    }
}
