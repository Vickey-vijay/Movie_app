package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes7.dex */
public final class fv extends fr {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2101 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2102 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2103 = -1968232721142834159L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2104;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2105;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private fr f2106;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed f2107;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        if (r2.equals(r5.f2107) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if ((r5.f2107 == null) != true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r2 = r4.f2106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.fv.f2102 + 49;
        com.ironsource.adqualitysdk.sdk.i.fv.f2101 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        return r2.equals(r5.f2106);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        if (r5.f2106 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto Le
            int r5 = com.ironsource.adqualitysdk.sdk.i.fv.f2102
            int r5 = r5 + 31
            int r1 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.fv.f2101 = r1
            int r5 = r5 % 2
            return r0
        Le:
            r1 = 0
            if (r5 == 0) goto L13
            r2 = r1
            goto L14
        L13:
            r2 = r0
        L14:
            if (r2 == r0) goto L56
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.fv> r2 = com.ironsource.adqualitysdk.sdk.i.fv.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L20
            r2 = r1
            goto L21
        L20:
            r2 = r0
        L21:
            if (r2 == 0) goto L56
            com.ironsource.adqualitysdk.sdk.i.fv r5 = (com.ironsource.adqualitysdk.sdk.i.fv) r5
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r4.f2107
            if (r2 == 0) goto L32
            com.ironsource.adqualitysdk.sdk.i.ed r3 = r5.f2107
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3c
            goto L3b
        L32:
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r5.f2107
            if (r2 == 0) goto L38
            r2 = r1
            goto L39
        L38:
            r2 = r0
        L39:
            if (r2 == r0) goto L3c
        L3b:
            return r1
        L3c:
            com.ironsource.adqualitysdk.sdk.i.fr r2 = r4.f2106
            if (r2 == 0) goto L51
            int r0 = com.ironsource.adqualitysdk.sdk.i.fv.f2102
            int r0 = r0 + 49
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fv.f2101 = r1
            int r0 = r0 % 2
            com.ironsource.adqualitysdk.sdk.i.fr r5 = r5.f2106
            boolean r5 = r2.equals(r5)
            return r5
        L51:
            com.ironsource.adqualitysdk.sdk.i.fr r5 = r5.f2106
            if (r5 != 0) goto L56
            return r0
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fv.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2203(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2673) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c10 ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i10));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            j.f2675 = 0;
            while (true) {
                int i11 = j.f2675;
                if (i11 < length) {
                    int i12 = (i11 + 2) % 4;
                    int i13 = (i11 + 3) % 4;
                    int i14 = cArr4[i11 % 4] * 32718;
                    char c11 = cArr5[i12];
                    char c12 = (char) ((i14 + c11) % 65535);
                    j.f2674 = c12;
                    cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                    cArr4[i13] = c12;
                    int i15 = j.f2675;
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f2103) ^ ((long) f2104)) ^ ((long) f2105));
                    j.f2675 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    public final int hashCode() {
        int iHashCode;
        ed edVar = this.f2107;
        int iHashCode2 = 0;
        if (!(edVar == null)) {
            int i10 = f2102 + 71;
            f2101 = i10 % 128;
            int i11 = i10 % 2;
            iHashCode = edVar.hashCode();
        } else {
            iHashCode = 0;
        }
        int i12 = iHashCode * 31;
        fr frVar = this.f2106;
        if (frVar != null) {
            int i13 = f2102 + 123;
            f2101 = i13 % 128;
            if ((i13 % 2 == 0 ? 'N' : (char) 21) == 'N') {
                frVar.hashCode();
                throw null;
            }
            iHashCode2 = frVar.hashCode();
            int i14 = f2102 + 13;
            f2101 = i14 % 128;
            int i15 = i14 % 2;
        }
        return i12 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2203("ႚ\ue66d訸뻎훳\ue4cc鬤", (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "ᰑ곻滄\ue4af", TextUtils.lastIndexOf("", '0', 0) + 1246428747, "䩘䫾䭊\uf4de").intern());
        sb2.append(this.f2107);
        sb2.append(m2203("럠ક", (char) (ExpandableListView.getPackedPositionChild(0L) + 49379), "ᰑ곻滄\ue4af", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, "짾絘\ue29fꛀ").intern());
        sb2.append(this.f2106);
        String string = sb2.toString();
        int i10 = f2102 + 81;
        f2101 = i10 % 128;
        if (i10 % 2 != 0) {
            return string;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ﾒ */
    public final dr mo2187(du duVar, cq cqVar) {
        while (this.f2107.m2146(duVar, cqVar).m2091()) {
            dr drVarMo2187 = this.f2106.mo2187(duVar, cqVar);
            if ((!drVarMo2187.m2094() ? (char) 19 : '>') == '>') {
                break;
            }
            if (drVarMo2187.m2093()) {
                int i10 = f2102 + 103;
                int i11 = i10 % 128;
                f2101 = i11;
                if (i10 % 2 == 0) {
                    int i12 = 20 / 0;
                }
                int i13 = i11 + 113;
                f2102 = i13 % 128;
                if ((i13 % 2 != 0 ? (char) 27 : '4') == '4') {
                    return drVarMo2187;
                }
                throw null;
            }
        }
        return new dr(null);
    }

    public fv(ed edVar, fr frVar) {
        this.f2107 = edVar;
        this.f2106 = frVar;
    }
}
