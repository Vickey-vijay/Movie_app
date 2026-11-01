package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ea extends ed {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1916 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1919;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1920;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed[] f1921;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1918 = {'l', 10168, 20425, 'S', 10117, 20450, 30634, '(', ')'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1917 = -4899378648914581545L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final ed[] m2138() {
        int i10 = f1919;
        int i11 = i10 + 101;
        f1916 = i11 % 128;
        int i12 = i11 % 2;
        ed[] edVarArr = this.f1921;
        int i13 = i10 + 35;
        f1916 = i13 % 128;
        int i14 = i13 % 2;
        return edVarArr;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public dr mo2113(du duVar, cq cqVar) {
        int i10 = f1916 + 75;
        f1919 = i10 % 128;
        int i11 = i10 % 2;
        List<Object> listM2137 = m2137(duVar, cqVar);
        if (!m2139().equals(m2136((Process.getThreadPriority(0) + 20) >> 6, (char) Gravity.getAbsoluteGravity(0, 0), 3 - View.resolveSize(0, 0)).intern())) {
            try {
                dr drVar = new dr(((ds) duVar.m2111(m2139())).m2097(duVar, cqVar, listM2137));
                int i12 = f1919 + 89;
                f1916 = i12 % 128;
                int i13 = i12 % 2;
                return drVar;
            } catch (Exception unused) {
                if (cqVar.m1688().m2337(m2139()) != null) {
                    return cqVar.m1688().m2337(m2139()).m2097(duVar, cqVar, listM2137).m2092(false);
                }
                db dbVarM1682 = cqVar.m1682();
                String strM2139 = m2139();
                cqVar.m1684();
                return new dr(dbVarM1682.mo1545(cqVar, strM2139, listM2137, duVar));
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2136(3 - TextUtils.indexOf("", "", 0), (char) (KeyEvent.getMaxKeyCode() >> 16), 4 - KeyEvent.getDeadChar(0, 0)).intern());
        sb2.append(cqVar.m1683());
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(listM2137.get(0));
        k.m2810(string, sb3.toString());
        dr drVar2 = new dr(null);
        int i14 = f1916 + 53;
        f1919 = i14 % 128;
        if (i14 % 2 == 0) {
            return drVar2;
        }
        int i15 = 93 / 0;
        return drVar2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2139() {
        int i10 = f1919 + 61;
        int i11 = i10 % 128;
        f1916 = i11;
        int i12 = i10 % 2;
        String str = this.f1920;
        int i13 = i11 + 117;
        f1919 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r4 == r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r5 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        r3 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        r3 = 'N';
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r3 == 26) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (getClass() == r5.getClass()) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        if (r1 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0031, code lost:
    
        r5 = (com.ironsource.adqualitysdk.sdk.i.ea) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if (r4.f1920.equals(r5.f1920) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        r0 = 28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        r0 = '<';
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r0 == 28) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        r5 = java.util.Arrays.equals(r4.f1921, r5.f1921);
        r0 = com.ironsource.adqualitysdk.sdk.i.ea.f1916 + 35;
        com.ironsource.adqualitysdk.sdk.i.ea.f1919 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if ((r0 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r4 == r5) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ea.f1916
            int r0 = r0 + 109
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f1919 = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            r0 = 51
            int r0 = r0 / r2
            if (r4 != r5) goto L19
            goto L18
        L14:
            r5 = move-exception
            throw r5
        L16:
            if (r4 != r5) goto L19
        L18:
            return r1
        L19:
            r0 = 26
            if (r5 == 0) goto L1f
            r3 = r0
            goto L21
        L1f:
            r3 = 78
        L21:
            if (r3 == r0) goto L24
            goto L5e
        L24:
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r0 == r3) goto L2f
            r1 = r2
        L2f:
            if (r1 == 0) goto L5e
            com.ironsource.adqualitysdk.sdk.i.ea r5 = (com.ironsource.adqualitysdk.sdk.i.ea) r5
            java.lang.String r0 = r4.f1920
            java.lang.String r1 = r5.f1920
            boolean r0 = r0.equals(r1)
            r1 = 28
            if (r0 != 0) goto L41
            r0 = r1
            goto L43
        L41:
            r0 = 60
        L43:
            if (r0 == r1) goto L5e
            com.ironsource.adqualitysdk.sdk.i.ed[] r0 = r4.f1921
            com.ironsource.adqualitysdk.sdk.i.ed[] r5 = r5.f1921
            boolean r5 = java.util.Arrays.equals(r0, r5)
            int r0 = com.ironsource.adqualitysdk.sdk.i.ea.f1916
            int r0 = r0 + 35
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f1919 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L5a
            return r5
        L5a:
            r5 = 0
            throw r5     // Catch: java.lang.Throwable -> L5c
        L5c:
            r5 = move-exception
            throw r5
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ea.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i10 = f1919 + 17;
        int i11 = i10 % 128;
        f1916 = i11;
        int i12 = i10 % 2;
        String str = this.f1920;
        int iHashCode = 0;
        if (str != null) {
            int i13 = i11 + 75;
            f1919 = i13 % 128;
            int i14 = i13 % 2;
            iHashCode = str.hashCode();
        }
        return (iHashCode * 31) + Arrays.hashCode(this.f1921);
    }

    public String toString() {
        int i10 = f1919 + 29;
        f1916 = i10 % 128;
        int i11 = i10 % 2;
        String strMo2140 = mo2140(this.f1921);
        int i12 = f1916 + 75;
        f1919 = i12 % 128;
        if (i12 % 2 == 0) {
            return strMo2140;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final List<Object> m2137(du duVar, cq cqVar) {
        ArrayList arrayList = new ArrayList();
        ed[] edVarArr = this.f1921;
        int length = edVarArr.length;
        int i10 = f1919 + 73;
        f1916 = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (true) {
            if (!(i12 < length)) {
                return arrayList;
            }
            int i13 = f1919 + 67;
            f1916 = i13 % 128;
            if (!(i13 % 2 != 0)) {
                arrayList.add(edVarArr[i12].m2146(duVar, cqVar).m2089());
                i12 += 50;
            } else {
                arrayList.add(edVarArr[i12].m2146(duVar, cqVar).m2089());
                i12++;
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public String mo2140(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1920);
        sb2.append(m2136((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), -TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
        sb2.append(ed.m2144(objArr));
        sb2.append(m2136((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7, (char) Color.green(0), 1 - (Process.myTid() >> 22)).intern());
        String string = sb2.toString();
        int i10 = f1919 + 25;
        f1916 = i10 % 128;
        if ((i10 % 2 == 0 ? 'U' : '*') == '*') {
            return string;
        }
        throw null;
    }

    public ea(String str, List<ed> list, dm dmVar) {
        super(dmVar);
        this.f1920 = dz.m2133(str);
        ed[] edVarArr = new ed[list.size()];
        this.f1921 = edVarArr;
        list.toArray(edVarArr);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2136(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1918[i10 + i12]) ^ (((long) i12) * f1917)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }
}
