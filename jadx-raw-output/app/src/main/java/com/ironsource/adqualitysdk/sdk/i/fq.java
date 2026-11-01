package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes7.dex */
public final class fq extends fr {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2074 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2075;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2076 = {30806, 10691, 56107, 36057, ')', ' ', '\n', 22610, 2497, 64368, 44188};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2077 = -8183880007451782758L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private fr f2078;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private fr f2079;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed f2080;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        if (r1.equals(r6.f2078) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
    
        if (r1.equals(r6.f2078) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        if (r6.f2078 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        r6 = com.ironsource.adqualitysdk.sdk.i.fq.f2075 + 41;
        com.ironsource.adqualitysdk.sdk.i.fq.f2074 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0076, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0077, code lost:
    
        r1 = r5.f2079;
        r6 = r6.f2079;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007b, code lost:
    
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0081, code lost:
    
        return r1.equals(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0082, code lost:
    
        if (r6 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0084, code lost:
    
        r6 = com.ironsource.adqualitysdk.sdk.i.fq.f2075 + 19;
        com.ironsource.adqualitysdk.sdk.i.fq.f2074 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 26
            if (r6 == 0) goto La
            r2 = r1
            goto Lc
        La:
            r2 = 30
        Lc:
            r3 = 0
            if (r2 == r1) goto L10
            goto L22
        L10:
            int r1 = com.ironsource.adqualitysdk.sdk.i.fq.f2075
            int r1 = r1 + 81
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.fq.f2074 = r2
            int r1 = r1 % 2
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.fq> r1 = com.ironsource.adqualitysdk.sdk.i.fq.class
            java.lang.Class r2 = r6.getClass()
            if (r1 == r2) goto L23
        L22:
            return r3
        L23:
            com.ironsource.adqualitysdk.sdk.i.fq r6 = (com.ironsource.adqualitysdk.sdk.i.fq) r6
            com.ironsource.adqualitysdk.sdk.i.ed r1 = r5.f2080
            if (r1 == 0) goto L2b
            r2 = r0
            goto L2c
        L2b:
            r2 = r3
        L2c:
            if (r2 == 0) goto L37
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r6.f2080
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3c
            goto L3b
        L37:
            com.ironsource.adqualitysdk.sdk.i.ed r1 = r6.f2080
            if (r1 == 0) goto L3c
        L3b:
            return r3
        L3c:
            com.ironsource.adqualitysdk.sdk.i.fr r1 = r5.f2078
            if (r1 == 0) goto L68
            int r2 = com.ironsource.adqualitysdk.sdk.i.fq.f2074
            int r2 = r2 + 31
            int r4 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.fq.f2075 = r4
            int r2 = r2 % 2
            if (r2 == 0) goto L4e
            r2 = r0
            goto L4f
        L4e:
            r2 = r3
        L4f:
            if (r2 == r0) goto L5a
            com.ironsource.adqualitysdk.sdk.i.fr r2 = r6.f2078
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L77
            goto L6c
        L5a:
            com.ironsource.adqualitysdk.sdk.i.fr r2 = r6.f2078
            boolean r1 = r1.equals(r2)
            r2 = 48
            int r2 = r2 / r3
            if (r1 != 0) goto L77
            goto L6c
        L66:
            r6 = move-exception
            throw r6
        L68:
            com.ironsource.adqualitysdk.sdk.i.fr r1 = r6.f2078
            if (r1 == 0) goto L77
        L6c:
            int r6 = com.ironsource.adqualitysdk.sdk.i.fq.f2075
            int r6 = r6 + 41
            int r0 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.fq.f2074 = r0
            int r6 = r6 % 2
            return r3
        L77:
            com.ironsource.adqualitysdk.sdk.i.fr r1 = r5.f2079
            com.ironsource.adqualitysdk.sdk.i.fr r6 = r6.f2079
            if (r1 == 0) goto L82
            boolean r6 = r1.equals(r6)
            return r6
        L82:
            if (r6 != 0) goto L8f
            int r6 = com.ironsource.adqualitysdk.sdk.i.fq.f2075
            int r6 = r6 + 19
            int r1 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.fq.f2074 = r1
            int r6 = r6 % 2
            return r0
        L8f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fq.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2194(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2076[i10 + i12]) ^ (((long) i12) * f2077)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        ed edVar = this.f2080;
        int iHashCode2 = (edVar != null ? edVar.hashCode() : 0) * 31;
        fr frVar = this.f2078;
        int iHashCode3 = (iHashCode2 + ((frVar != null ? (char) 30 : (char) 29) != 29 ? frVar.hashCode() : 0)) * 31;
        fr frVar2 = this.f2079;
        if (frVar2 != null) {
            int i10 = f2074 + 27;
            f2075 = i10 % 128;
            int i11 = i10 % 2;
            iHashCode = frVar2.hashCode();
            int i12 = f2074 + 59;
            f2075 = i12 % 128;
            int i13 = i12 % 2;
        } else {
            iHashCode = 0;
        }
        int i14 = iHashCode3 + iHashCode;
        int i15 = f2075 + 9;
        f2074 = i15 % 128;
        if (i15 % 2 != 0) {
            return i14;
        }
        throw null;
    }

    public final String toString() {
        int size;
        char packedPositionType;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2194(ViewConfiguration.getFadingEdgeLength() >> 16, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 30783), TextUtils.lastIndexOf("", '0', 0, 0) + 5).intern());
        sb2.append(this.f2080);
        sb2.append(m2194(4 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1).intern());
        if (this.f2078 instanceof fk) {
            int i10 = f2075 + 43;
            f2074 = i10 % 128;
            if (i10 % 2 == 0) {
                size = 5 % View.MeasureSpec.getSize(0);
                packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                iIndexOf = 1 / TextUtils.indexOf("", "");
            } else {
                size = View.MeasureSpec.getSize(0) + 5;
                packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                iIndexOf = TextUtils.indexOf("", "") + 1;
            }
            sb2.append(m2194(size, packedPositionType, iIndexOf).intern());
        } else {
            sb2.append(m2194((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
            int i11 = f2075 + 69;
            f2074 = i11 % 128;
            int i12 = i11 % 2;
        }
        sb2.append(this.f2078);
        fr frVar = this.f2079;
        if (!(frVar == null)) {
            if (frVar instanceof fk) {
                sb2.append(m2194(5 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((-1) - Process.getGidForName("")), -((byte) KeyEvent.getModifierMetaStateMask())).intern());
            } else {
                sb2.append(m2194((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.indexOf("", "", 0) + 1).intern());
            }
            sb2.append(m2194(View.getDefaultSize(0, 0) + 7, (char) (TextUtils.indexOf("", "") + 22583), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3).intern());
            if (this.f2079 instanceof fk) {
                int i13 = f2075 + 67;
                f2074 = i13 % 128;
                int i14 = i13 % 2;
                sb2.append(m2194(5 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) KeyEvent.getDeadChar(0, 0), -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
            } else {
                sb2.append(m2194(ExpandableListView.getPackedPositionChild(0L) + 7, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 1 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
            }
            sb2.append(this.f2079);
            int i15 = f2074 + 21;
            f2075 = i15 % 128;
            int i16 = i15 % 2;
        }
        return sb2.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ﾒ */
    public final dr mo2187(du duVar, cq cqVar) {
        if ((this.f2080.m2146(duVar, cqVar).m2091() ? 'V' : '\b') == 'V') {
            dr drVarMo2187 = this.f2078.mo2187(duVar, cqVar);
            int i10 = f2075 + 39;
            f2074 = i10 % 128;
            int i11 = i10 % 2;
            return drVarMo2187;
        }
        fr frVar = this.f2079;
        if ((frVar != null ? (char) 21 : '>') != 21) {
            return new dr(Boolean.FALSE);
        }
        int i12 = f2075 + 21;
        f2074 = i12 % 128;
        int i13 = i12 % 2;
        return frVar.mo2187(duVar, cqVar);
    }

    public fq(ed edVar, fr frVar, fr frVar2) {
        this.f2080 = edVar;
        this.f2078 = frVar;
        this.f2079 = frVar2;
    }
}
