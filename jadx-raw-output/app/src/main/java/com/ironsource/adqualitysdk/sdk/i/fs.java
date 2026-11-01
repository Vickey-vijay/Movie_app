package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes7.dex */
public final class fs extends fr {

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f2081 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static byte[] f2082 = {-2, 8, -82, 3, 9, -5, -27, -5, -9};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2083 = -1076127021;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f2084 = null;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2085 = 7;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2086 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2087 = 1196812186;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ed f2088;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed f2089;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ed f2090;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private fr f2091;

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061 A[LOOP:0: B:3:0x0005->B:28:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0060 A[SYNTHETIC] */
    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ﾒ */
    public final dr mo2187(du duVar, cq cqVar) {
        dr drVarMo2187;
        int i10;
        m2196(this.f2089, duVar, cqVar);
        while (this.f2088.m2146(duVar, cqVar).m2091()) {
            int i11 = f2086 + 53;
            f2081 = i11 % 128;
            if (i11 % 2 == 0) {
                drVarMo2187 = this.f2091.mo2187(duVar, cqVar);
                int i12 = 77 / 0;
                if ((!drVarMo2187.m2094() ? '-' : (char) 30) == 30) {
                    break;
                }
                i10 = f2081 + 101;
                f2086 = i10 % 128;
                if (i10 % 2 == 0) {
                    drVarMo2187.m2093();
                    throw null;
                }
                if (drVarMo2187.m2093()) {
                    return drVarMo2187;
                }
                m2196(this.f2090, duVar, cqVar);
            } else {
                drVarMo2187 = this.f2091.mo2187(duVar, cqVar);
                if ((!drVarMo2187.m2094() ? '=' : 'T') != '=') {
                    break;
                }
                i10 = f2081 + 101;
                f2086 = i10 % 128;
                if (i10 % 2 == 0) {
                    drVarMo2187.m2093();
                    throw null;
                }
                if (drVarMo2187.m2093()) {
                    return drVarMo2187;
                }
                m2196(this.f2090, duVar, cqVar);
            }
        }
        return new dr(null);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2195(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f2085;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f2082;
                i14 = bArr != null ? (byte) (bArr[f2087 + i10] + i13) : (short) (f2084[f2087 + i10] + i13);
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f2087 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f2083);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f2082;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f2084;
                        int i16 = o.f2994;
                        o.f2994 = i16 - 1;
                        o.f2997 = (char) (o.f2996 + (((short) (sArr[i16] + s10)) ^ o.f2995));
                    }
                    sb2.append(o.f2997);
                    o.f2996 = o.f2997;
                    o.f2998++;
                }
            }
            string = sb2.toString();
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if (r5 == r6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if (r6 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.fs.class == r6.getClass()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        r6 = (com.ironsource.adqualitysdk.sdk.i.fs) r6;
        r0 = r5.f2089;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        if (r0.equals(r6.f2089) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        if (r6.f2089 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        r0 = r5.f2088;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        r4 = '9';
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        r4 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
    
        if (r4 == 15) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.fs.f2086 + 11;
        com.ironsource.adqualitysdk.sdk.i.fs.f2081 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r0.equals(r6.f2088) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
    
        if (r6.f2088 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0062, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
    
        r0 = r5.f2090;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0067, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        r4 = 25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006c, code lost:
    
        r4 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006d, code lost:
    
        if (r4 == '\b') goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        if (r0.equals(r6.f2090) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0077, code lost:
    
        r6 = com.ironsource.adqualitysdk.sdk.i.fs.f2086 + 101;
        com.ironsource.adqualitysdk.sdk.i.fs.f2081 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0084, code lost:
    
        if (r6.f2090 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0087, code lost:
    
        r0 = r5.f2091;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0089, code lost:
    
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
    
        if (r1 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.fs.f2081 + 49;
        com.ironsource.adqualitysdk.sdk.i.fs.f2086 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a0, code lost:
    
        return r0.equals(r6.f2091);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
    
        if (r6.f2091 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a5, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r5 == r6) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.fs.f2081
            int r0 = r0 + 101
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fs.f2086 = r1
            int r0 = r0 % 2
            r1 = 58
            if (r0 == 0) goto L10
            r0 = r1
            goto L12
        L10:
            r0 = 18
        L12:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L19
            if (r5 != r6) goto L1f
            goto L1e
        L19:
            r0 = 34
            int r0 = r0 / r3
            if (r5 != r6) goto L1f
        L1e:
            return r2
        L1f:
            if (r6 == 0) goto La6
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.fs> r0 = com.ironsource.adqualitysdk.sdk.i.fs.class
            java.lang.Class r1 = r6.getClass()
            if (r0 == r1) goto L2b
            goto La6
        L2b:
            com.ironsource.adqualitysdk.sdk.i.fs r6 = (com.ironsource.adqualitysdk.sdk.i.fs) r6
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r5.f2089
            if (r0 == 0) goto L3a
            com.ironsource.adqualitysdk.sdk.i.ed r1 = r6.f2089
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            goto L3e
        L3a:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r6.f2089
            if (r0 == 0) goto L3f
        L3e:
            return r3
        L3f:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r5.f2088
            r1 = 15
            if (r0 == 0) goto L48
            r4 = 57
            goto L49
        L48:
            r4 = r1
        L49:
            if (r4 == r1) goto L5e
            int r1 = com.ironsource.adqualitysdk.sdk.i.fs.f2086
            int r1 = r1 + 11
            int r4 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.fs.f2081 = r4
            int r1 = r1 % 2
            com.ironsource.adqualitysdk.sdk.i.ed r1 = r6.f2088
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
            goto L62
        L5e:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r6.f2088
            if (r0 == 0) goto L63
        L62:
            return r3
        L63:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r5.f2090
            r1 = 8
            if (r0 == 0) goto L6c
            r4 = 25
            goto L6d
        L6c:
            r4 = r1
        L6d:
            if (r4 == r1) goto L82
            com.ironsource.adqualitysdk.sdk.i.ed r1 = r6.f2090
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L87
            int r6 = com.ironsource.adqualitysdk.sdk.i.fs.f2086
            int r6 = r6 + 101
            int r0 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.fs.f2081 = r0
            int r6 = r6 % 2
            goto L86
        L82:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r6.f2090
            if (r0 == 0) goto L87
        L86:
            return r3
        L87:
            com.ironsource.adqualitysdk.sdk.i.fr r0 = r5.f2091
            if (r0 == 0) goto L8d
            r1 = r2
            goto L8e
        L8d:
            r1 = r3
        L8e:
            if (r1 == 0) goto La1
            int r1 = com.ironsource.adqualitysdk.sdk.i.fs.f2081
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.fs.f2086 = r2
            int r1 = r1 % 2
            com.ironsource.adqualitysdk.sdk.i.fr r6 = r6.f2091
            boolean r6 = r0.equals(r6)
            return r6
        La1:
            com.ironsource.adqualitysdk.sdk.i.fr r6 = r6.f2091
            if (r6 != 0) goto La6
            return r2
        La6:
            return r3
        La7:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fs.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        ed edVar = this.f2089;
        int iHashCode2 = 0;
        if ((edVar != null ? (char) 7 : (char) 3) != 7) {
            iHashCode = 0;
        } else {
            int i10 = f2081 + 5;
            f2086 = i10 % 128;
            int i11 = i10 % 2;
            iHashCode = edVar.hashCode();
        }
        int i12 = iHashCode * 31;
        ed edVar2 = this.f2088;
        int iHashCode3 = (i12 + (edVar2 != null ? edVar2.hashCode() : 0)) * 31;
        ed edVar3 = this.f2090;
        int iHashCode4 = (iHashCode3 + ((edVar3 != null ? (char) 4 : '`') != '`' ? edVar3.hashCode() : 0)) * 31;
        fr frVar = this.f2091;
        if (frVar != null) {
            int i13 = f2081 + 31;
            f2086 = i13 % 128;
            if ((i13 % 2 != 0 ? 'S' : '%') == 'S') {
                frVar.hashCode();
                throw null;
            }
            iHashCode2 = frVar.hashCode();
        }
        return iHashCode4 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2195((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1196812185, (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), 1076127123 - (ViewConfiguration.getTouchSlop() >> 8), (byte) TextUtils.indexOf("", "", 0), (-8) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
        ed edVar = this.f2089;
        if ((edVar != null ? (char) 3 : (char) 28) == 3) {
            sb2.append(edVar);
        }
        sb2.append(m2195(View.resolveSize(0, 0) - 1196812181, (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.alpha(0) + 1076127080, (byte) ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 9).intern());
        sb2.append(this.f2088);
        sb2.append(m2195((-1196812181) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) View.combineMeasuredStates(0, 0), 1076127080 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) ExpandableListView.getPackedPositionType(0L), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 7).intern());
        ed edVar2 = this.f2090;
        if (edVar2 != null) {
            int i10 = f2081 + 105;
            f2086 = i10 % 128;
            int i11 = i10 % 2;
            sb2.append(edVar2);
        }
        sb2.append(m2195(TextUtils.indexOf("", "", 0, 0) - 1196812179, (short) Color.blue(0), 1076127062 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) ExpandableListView.getPackedPositionGroup(0L), ImageFormat.getBitsPerPixel(0) - 7).intern());
        sb2.append(this.f2091);
        String string = sb2.toString();
        int i12 = f2086 + 17;
        f2081 = i12 % 128;
        int i13 = i12 % 2;
        return string;
    }

    public fs(ed edVar, ed edVar2, ed edVar3, fr frVar) {
        this.f2089 = edVar;
        this.f2088 = edVar2;
        this.f2090 = edVar3;
        this.f2091 = frVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static dr m2196(ed edVar, du duVar, cq cqVar) {
        if ((edVar != null ? '4' : 'A') != 'A') {
            int i10 = f2081 + 35;
            f2086 = i10 % 128;
            int i11 = i10 % 2;
            return edVar.m2146(duVar, cqVar);
        }
        dr drVar = new dr(null);
        int i12 = f2086 + 63;
        f2081 = i12 % 128;
        int i13 = i12 % 2;
        return drVar;
    }
}
