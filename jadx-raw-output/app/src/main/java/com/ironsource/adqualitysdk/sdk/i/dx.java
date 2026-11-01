package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class dx extends ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1887 = 108;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1888 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1889 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ed[] f1890;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2116(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f706) {
            char[] cArr2 = new char[i10];
            b.f704 = 0;
            while (true) {
                int i13 = b.f704;
                if (i13 >= i10) {
                    break;
                }
                b.f705 = cArr[i13];
                cArr2[b.f704] = (char) (b.f705 + i12);
                int i14 = b.f704;
                cArr2[i14] = (char) (cArr2[i14] - f1887);
                b.f704 = i14 + 1;
            }
            if (i11 > 0) {
                b.f707 = i11;
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                int i15 = b.f707;
                System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                int i16 = b.f707;
                System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
            }
            if (z10) {
                char[] cArr4 = new char[i10];
                b.f704 = 0;
                while (true) {
                    int i17 = b.f704;
                    if (i17 >= i10) {
                        break;
                    }
                    cArr4[i17] = cArr2[(i10 - i17) - 1];
                    b.f704 = i17 + 1;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        int i10 = f1889;
        int i11 = i10 + 45;
        f1888 = i11 % 128;
        int i12 = i11 % 2;
        if ((this == obj ? (char) 14 : 'D') != 14) {
            if ((obj != null) && dx.class == obj.getClass()) {
                return Arrays.equals(this.f1890, ((dx) obj).f1890);
            }
            return false;
        }
        int i13 = i10 + 119;
        f1888 = i13 % 128;
        if (i13 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public final int hashCode() {
        int i10 = f1889 + 71;
        f1888 = i10 % 128;
        if ((i10 % 2 != 0 ? 'c' : (char) 0) == 'c') {
            Arrays.hashCode(this.f1890);
            throw null;
        }
        int iHashCode = Arrays.hashCode(this.f1890);
        int i11 = f1889 + 71;
        f1888 = i11 % 128;
        int i12 = i11 % 2;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2116("\u0000", 1 - KeyEvent.keyCodeFromString(""), false, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 200).intern());
        sb2.append(ed.m2144(this.f1890));
        sb2.append(m2116("\u0000", 1 - Color.alpha(0), true, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, MotionEvent.axisFromString("") + 202).intern());
        String string = sb2.toString();
        int i10 = f1888 + 35;
        f1889 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2113(du duVar, cq cqVar) {
        ArrayList arrayList = new ArrayList();
        ed[] edVarArr = this.f1890;
        int length = edVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = f1889 + 97;
            f1888 = i11 % 128;
            if ((i11 % 2 != 0 ? (char) 21 : '7') != '7') {
                arrayList.add(edVarArr[i10].m2146(duVar, cqVar).m2089());
                i10 += 82;
            } else {
                arrayList.add(edVarArr[i10].m2146(duVar, cqVar).m2089());
                i10++;
            }
        }
        dr drVar = new dr(arrayList);
        int i12 = f1888 + 101;
        f1889 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return drVar;
    }

    public dx(List<ed> list, dm dmVar) {
        super(dmVar);
        ed[] edVarArr = new ed[list.size()];
        this.f1890 = edVarArr;
        list.toArray(edVarArr);
    }
}
