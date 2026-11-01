package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class fk extends fr {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2048 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2049 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2050 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2051 = 5358680608451962287L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2052;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private fr[] f2053;

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final dr mo2187(du duVar, cq cqVar) {
        dr drVar = new dr(null);
        du duVar2 = new du(duVar);
        fr[] frVarArr = this.f2053;
        int length = frVarArr.length;
        int i10 = 0;
        while (true) {
            if ((i10 < length ? ',' : 'T') != ',') {
                return drVar;
            }
            int i11 = f2052 + 11;
            f2048 = i11 % 128;
            int i12 = i11 % 2;
            drVar = frVarArr[i10].mo2187(duVar2, cqVar);
            if ((!drVar.m2093() ? 'F' : ']') != ']') {
                int i13 = f2052 + 17;
                f2048 = i13 % 128;
                if (i13 % 2 == 0) {
                    drVar.m2094();
                    throw null;
                }
                if (!drVar.m2094() && !drVar.m2086()) {
                    i10++;
                }
            }
            return drVar;
        }
    }

    public final boolean equals(Object obj) {
        int i10 = f2048 + 107;
        f2052 = i10 % 128;
        int i11 = i10 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (fk.class == obj.getClass()) {
                fk fkVar = (fk) obj;
                fr[] frVarArr = this.f2053;
                if (frVarArr == null) {
                    if (fkVar.f2053 == null) {
                        return true;
                    }
                    int i12 = f2052 + 71;
                    f2048 = i12 % 128;
                    if (i12 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
                int i13 = f2052 + 57;
                f2048 = i13 % 128;
                char c10 = i13 % 2 == 0 ? 'E' : '\r';
                fr[] frVarArr2 = fkVar.f2053;
                if (c10 != 'E') {
                    return frVarArr.equals(frVarArr2);
                }
                frVarArr.equals(frVarArr2);
                throw null;
            }
        }
        return false;
    }

    public final int hashCode() {
        fr[] frVarArr = this.f2053;
        if ((frVarArr != null ? 'H' : '7') == '7') {
            return 0;
        }
        int i10 = f2052 + 35;
        f2048 = i10 % 128;
        int i11 = i10 % 2;
        int iHashCode = frVarArr.hashCode();
        int i12 = f2048 + 55;
        f2052 = i12 % 128;
        int i13 = i12 % 2;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2186("壽䀮", (char) (20158 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "ꖯ㎍\udb9f䩝", Color.blue(0), "阷\ud871뾡罎").intern());
        fr[] frVarArr = this.f2053;
        int length = frVarArr.length;
        int i10 = 0;
        while (true) {
            if ((i10 < length ? '/' : 'B') != '/') {
                sb2.append(m2186("ꤏ", (char) (TextUtils.getOffsetAfter("", 0) + 37966), "ꖯ㎍\udb9f䩝", (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1644217965, "鎣Ｙ亝ޔ").intern());
                return sb2.toString();
            }
            int i11 = f2052 + 3;
            f2048 = i11 % 128;
            int i12 = i11 % 2;
            fr frVar = frVarArr[i10];
            sb2.append(m2186("质╪\uf8bf爌", (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 25278), "ꖯ㎍\udb9f䩝", ViewConfiguration.getEdgeSlop() >> 16, "嘁柕븀⥢").intern());
            sb2.append(frVar.toString());
            sb2.append(m2186("牕", (char) (5652 - (ViewConfiguration.getTouchSlop() >> 8)), "ꖯ㎍\udb9f䩝", 1492044179 - KeyEvent.getDeadChar(0, 0), "鍤\ueec9ᑘ砖").intern());
            i10++;
            int i13 = f2048 + 113;
            f2052 = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    public fk(List<fr> list) {
        fr[] frVarArr = new fr[list.size()];
        this.f2053 = frVarArr;
        list.toArray(frVarArr);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2186(String str, char c10, String str2, int i10, String str3) {
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
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f2051) ^ ((long) f2050)) ^ ((long) f2049));
                    j.f2675 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }
}
