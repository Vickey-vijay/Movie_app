package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class dk extends cz implements cl {

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f1753 = 1;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1754 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1756 = 1310500565;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static short[] f1758 = null;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1759 = 103;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1760 = 1435268900;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private hn f1761;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private hn f1763;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static byte[] f1757 = {40, 93, 62, 83, 37, 82, 94, 41, 63, -128, 48, 97, 2, 53, 28, 47, 57, 1, 51, -29, 84, 10, 57, -128, -126, 48, 122, 122, 24, -128, 30, -121, 126, 58, 106, 125, 28, 41, 106, -127, 52, 92, 26, -119, -67, 74, -93, 80, -62, 79, 67, -66, -92, 85, -64, -63, -97, 4, -88, -89, 8, 3, -62, -85, -16, -72, 25, 22, 118, -109, 89, 113, -124, -106, 91, -128, 125, -113, -115, 63, -123, -123, 103, -113, 105, -106, -119, 69, -91, 101, -120, 84, 3, -9, 80, 86, -15, -4, 87, 2, 84, 3, -9, 80, 86, 25, 73, 4, -123, 120, -124, -119, -93, 106, 125, -92, 119, -127, -119, 123, -85, 92, -110, 117, -15, -32, -28, -19, 3, -50, -23, 4, -33, -27, -19, -37, 11, -68, -10, -27, 97, 78, 82, 93, 115, 60, 89, 114, 61, 105, 94, 88, 112, 65, 100, 81, 69, -72, -60, 73, 99, -86, -67, 100, -87, 77, 72, -66, 86, -91, 82, -63, -43, 4, 0, ExifInterface.MARKER_EOI, -33, -6, -3, -32, -6, 2, -49, -35, 40, -46, 5, -90, 121, -123, -86, -92, -117, 126, -91, -117, -125, -76, -98, 93, -77, -126, -22, 55, 67, -18, -28, 77, 66, -29, 55, 58, -41, -26, 37, 62, 15, 23, -11, 58, -67, -64, 11, -57, 34, -77, -65, 38, 32, -50, -51, 47, -73, 17, -64, -79, 13, -19, 45, -66, -48, -47, -122, -76, -44, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int[] f1755 = {72526405, 498935741, 1850971941, 1462439246, -2132092223, 1708160554, -395663865, 1925863166, 681729306, 1944994731, 1568739955, -1563559347, -1507877317, 2004252735, 1293346952, -1201631360, 458925985, 1781078698};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final List<String> f1766 = new ArrayList();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final List<String> f1765 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final List<String> f1764 = new ArrayList();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final List<String> f1767 = new ArrayList();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final List<String> f1768 = new ArrayList();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private JSONObject f1762 = IronSourceVideoBridge.jsonObjectInit();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private void m1973(String str) {
        int i10 = f1753 + 19;
        f1754 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f1762.put(ih.f2511, str);
            int i12 = f1753 + 101;
            f1754 = i12 % 128;
            if ((i12 % 2 != 0 ? '\r' : 'X') != '\r') {
            } else {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private hn m1974() {
        int i10 = f1753;
        int i11 = i10 + 117;
        f1754 = i11 % 128;
        int i12 = i11 % 2;
        hn hnVar = this.f1761;
        int i13 = i10 + 15;
        f1754 = i13 % 128;
        int i14 = i13 % 2;
        return hnVar;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m1976() {
        String strOptString;
        int i10 = f1753 + 47;
        f1754 = i10 % 128;
        if ((i10 % 2 != 0 ? '`' : '#') != '`') {
            strOptString = this.f1762.optString(ih.f2524);
        } else {
            strOptString = this.f1762.optString(ih.f2524);
            int i11 = 42 / 0;
        }
        int i12 = f1754 + 73;
        f1753 = i12 % 128;
        int i13 = i12 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m1978() {
        int i10 = f1754 + 109;
        f1753 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = this.f1762.optString(ih.f2520);
        int i12 = f1754 + 69;
        f1753 = i12 % 128;
        int i13 = i12 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private hn m1980() {
        int i10 = f1754 + 1;
        int i11 = i10 % 128;
        f1753 = i11;
        if (!(i10 % 2 != 0)) {
            throw null;
        }
        hn hnVar = this.f1763;
        int i12 = i11 + 81;
        f1754 = i12 % 128;
        int i13 = i12 % 2;
        return hnVar;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m1982() {
        int i10 = f1754 + 57;
        f1753 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = this.f1762.optString(ih.f2516);
        int i12 = f1753 + 73;
        f1754 = i12 % 128;
        int i13 = i12 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<String> m1985() {
        int i10 = f1753 + 45;
        f1754 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return this.f1767;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<String> m1989() {
        int i10 = f1753;
        int i11 = i10 + 77;
        f1754 = i11 % 128;
        if ((i11 % 2 != 0 ? '\\' : 'Z') == '\\') {
            throw null;
        }
        List<String> list = this.f1764;
        int i12 = i10 + 15;
        f1754 = i12 % 128;
        int i13 = i12 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> m1995() {
        int i10 = f1753 + 33;
        int i11 = i10 % 128;
        f1754 = i11;
        int i12 = i10 % 2;
        List<String> list = this.f1768;
        int i13 = i11 + 33;
        f1753 = i13 % 128;
        int i14 = i13 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<String> m2000() {
        int i10 = f1753 + 117;
        f1754 = i10 % 128;
        if ((i10 % 2 != 0 ? '\r' : '7') != '\r') {
            return this.f1766;
        }
        int i11 = 84 / 0;
        return this.f1766;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<String> m2003() {
        int i10 = f1754;
        int i11 = i10 + 87;
        f1753 = i11 % 128;
        int i12 = i11 % 2;
        List<String> list = this.f1765;
        int i13 = i10 + 27;
        f1753 = i13 % 128;
        if (i13 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private String m1968() {
        int i10 = f1753 + 91;
        f1754 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            this.f1762.optString(ih.f2511);
            throw null;
        }
        String strOptString = this.f1762.optString(ih.f2511);
        int i11 = f1754 + 23;
        f1753 = i11 % 128;
        int i12 = i11 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private String m1969() {
        int i10 = f1753 + 87;
        f1754 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = this.f1762.optString(ih.f2523);
        int i12 = f1754 + 47;
        f1753 = i12 % 128;
        int i13 = i12 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private JSONObject m1970() {
        int i10 = f1753 + 53;
        f1754 = i10 % 128;
        if ((i10 % 2 != 0 ? 'V' : '#') != 'V') {
            return this.f1762;
        }
        int i11 = 38 / 0;
        return this.f1762;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private String m1971() {
        int i10 = f1753 + 53;
        f1754 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = this.f1762.optString(ih.f2515);
        int i12 = f1754 + 33;
        f1753 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return strOptString;
        }
        int i13 = 10 / 0;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m1975(String str) {
        int i10 = f1753 + 113;
        f1754 = i10 % 128;
        try {
            if ((i10 % 2 != 0 ? (char) 14 : 'E') == 14) {
                this.f1762.put(ih.f2515, str);
                throw null;
            }
            this.f1762.put(ih.f2515, str);
            int i11 = f1754 + 7;
            f1753 = i11 % 128;
            int i12 = i11 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m1977(String str) {
        int i10 = f1753 + 27;
        f1754 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f1762.put(ih.f2516, str);
            int i12 = f1754 + 17;
            f1753 = i12 % 128;
            if ((i12 % 2 == 0 ? '0' : '\f') == '\f') {
            } else {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m1979(String str) {
        int i10 = f1753 + 89;
        f1754 = i10 % 128;
        try {
            if (!(i10 % 2 != 0)) {
                this.f1762.put(ih.f2520, str);
            } else {
                this.f1762.put(ih.f2520, str);
                int i11 = 5 / 0;
            }
            int i12 = f1753 + 33;
            f1754 = i12 % 128;
            int i13 = i12 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m1981(String str) {
        int i10 = f1754 + 57;
        f1753 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f1762.put(ih.f2524, str);
            int i12 = f1754 + 125;
            f1753 = i12 % 128;
            if ((i12 % 2 == 0 ? (char) 22 : 'L') != 22) {
                return;
            }
            int i13 = 80 / 0;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m1983(String str) {
        int i10 = f1754 + 59;
        f1753 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f1762.put(ih.f2523, str);
            int i12 = f1753 + 15;
            f1754 = i12 % 128;
            if (i12 % 2 == 0) {
            } else {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1988(List<String> list) {
        int i10 = f1754 + 29;
        f1753 = i10 % 128;
        if (i10 % 2 != 0) {
            m1993(list, this.f1765);
        } else {
            m1993(list, this.f1765);
            int i11 = 78 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1991(String str) {
        int i10 = f1753 + 9;
        f1754 = i10 % 128;
        int i11 = i10 % 2;
        m1987(str, this.f1764);
        int i12 = f1753 + 101;
        f1754 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 5 : ']') != 5) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1997(String str) {
        int i10 = f1754 + 47;
        f1753 = i10 % 128;
        int i11 = i10 % 2;
        m1987(str, this.f1768);
        int i12 = f1754 + 45;
        f1753 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m2001(String str) {
        int i10 = f1754 + 67;
        f1753 = i10 % 128;
        if ((i10 % 2 == 0 ? 'O' : '^') != '^') {
            m1987(str, this.f1765);
            throw null;
        }
        m1987(str, this.f1765);
        int i11 = f1753 + 3;
        f1754 = i11 % 128;
        if ((i11 % 2 != 0 ? 'H' : (char) 24) != 'H') {
            return;
        }
        int i12 = 5 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2004(String str) {
        int i10 = f1754 + 61;
        f1753 = i10 % 128;
        int i11 = i10 % 2;
        m1987(str, this.f1766);
        int i12 = f1754 + 113;
        f1753 = i12 % 128;
        if ((i12 % 2 == 0 ? '3' : '7') != '3') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1986(String str) {
        int i10 = f1753 + 55;
        f1754 = i10 % 128;
        int i11 = i10 % 2;
        m1987(str, this.f1767);
        int i12 = f1753 + 9;
        f1754 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1992(List<String> list) {
        int i10 = f1753 + 121;
        f1754 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 29 : 'B') != 29) {
            m1993(list, this.f1767);
        } else {
            m1993(list, this.f1767);
            int i11 = 25 / 0;
        }
        int i12 = f1753 + 89;
        f1754 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1998(List<String> list) {
        int i10 = f1754 + 27;
        f1753 = i10 % 128;
        if ((i10 % 2 == 0 ? '6' : 'D') != '6') {
            m1993(list, this.f1768);
        } else {
            m1993(list, this.f1768);
            int i11 = 43 / 0;
        }
        int i12 = f1753 + 125;
        f1754 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m2002(List<String> list) {
        int i10 = f1754 + 39;
        f1753 = i10 % 128;
        int i11 = i10 % 2;
        m1993(list, this.f1764);
        int i12 = f1753 + 61;
        f1754 = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        int i13 = 81 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2005(List<String> list) {
        int i10 = f1754 + 69;
        f1753 = i10 % 128;
        int i11 = i10 % 2;
        m1993(list, this.f1766);
        int i12 = f1753 + 103;
        f1754 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 16 : '>') == '>') {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private Object m1972() {
        boolean z10 = false;
        if (!(this.f1766.size() <= 0)) {
            z10 = true;
        } else {
            int i10 = f1754 + 11;
            f1753 = i10 % 128;
            int i11 = i10 % 2;
            if (this.f1765.size() <= 0) {
                int i12 = f1753 + 109;
                f1754 = i12 % 128;
                int i13 = i12 % 2;
                if (!(this.f1768.size() > 0)) {
                    int i14 = f1753 + 119;
                    f1754 = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    z10 = true;
                }
            } else {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1987(String str, List<String> list) {
        if ((list != null ? (char) 30 : '?') != '?') {
            if (!(!TextUtils.isEmpty(str))) {
                return;
            }
            if (!(list.contains(str))) {
                int i10 = f1754 + 117;
                f1753 = i10 % 128;
                int i11 = i10 % 2;
                list.add(str);
                int i12 = f1753 + 49;
                f1754 = i12 % 128;
                int i13 = i12 % 2;
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1990(hn hnVar) {
        if (!(hnVar == null)) {
            this.f1761 = hnVar;
            int i10 = f1753 + 13;
            f1754 = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = f1753 + 53;
        f1754 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1996(hn hnVar) {
        int i10 = f1753 + 9;
        int i11 = i10 % 128;
        f1754 = i11;
        int i12 = i10 % 2;
        if (hnVar == null) {
            return;
        }
        int i13 = i11 + 67;
        f1753 = i13 % 128;
        int i14 = i13 % 2;
        this.f1763 = hnVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1999(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1755.clone();
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

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private JSONObject m1967() {
        boolean z10;
        boolean z11;
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            hn hnVar = this.f1761;
            if (hnVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i10 = f1753 + 33;
                f1754 = i10 % 128;
                int i11 = i10 % 2;
                jSONObjectJsonObjectInit.put(ih.f2528, hnVar.m2268());
            }
            hn hnVar2 = this.f1763;
            if (hnVar2 != null) {
                int i12 = f1754 + 89;
                f1753 = i12 % 128;
                int i13 = i12 % 2;
                jSONObjectJsonObjectInit.put(ih.f2522, hnVar2.m2268());
            }
            if (this.f1766.size() > 0) {
                jSONObjectJsonObjectInit.put(ih.f2520, new JSONArray((Collection) this.f1766));
                int i14 = f1754 + 87;
                f1753 = i14 % 128;
                int i15 = i14 % 2;
            }
            if (this.f1765.size() > 0) {
                jSONObjectJsonObjectInit.put(ih.f2516, new JSONArray((Collection) this.f1765));
            }
            if (this.f1764.size() > 0) {
                jSONObjectJsonObjectInit.put(ih.f2515, new JSONArray((Collection) this.f1764));
                int i16 = f1753 + 19;
                f1754 = i16 % 128;
                int i17 = i16 % 2;
            }
            if (this.f1767.size() > 0) {
                jSONObjectJsonObjectInit.put(ih.f2523, new JSONArray((Collection) this.f1767));
            }
            if (this.f1768.size() > 0) {
                jSONObjectJsonObjectInit.put(ih.f2524, new JSONArray((Collection) this.f1768));
            }
            if (this.f1762.length() > 0) {
                int i18 = f1753 + 41;
                f1754 = i18 % 128;
                if (i18 % 2 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    jSONObjectJsonObjectInit.putOpt(ih.f2521, this.f1762.toString());
                } else {
                    jSONObjectJsonObjectInit.putOpt(ih.f2521, this.f1762.toString());
                    int i19 = 30 / 0;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1994(JSONObject jSONObject) {
        int i10 = f1754 + 57;
        f1753 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        this.f1762 = jz.m2794(jSONObject);
        if (z10) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1993(List<String> list, List<String> list2) {
        if ((list != null ? (char) 22 : '<') == '<') {
            return;
        }
        int i10 = f1754 + 105;
        f1753 = i10 % 128;
        int i11 = i10 % 2;
        Iterator<String> it = list.iterator();
        while (true) {
            if (!(it.hasNext())) {
                return;
            }
            int i12 = f1753 + 65;
            f1754 = i12 % 128;
            int i13 = i12 % 2;
            m1987(it.next(), list2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0128  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo812(String str, List<Object> list, ch chVar) {
        boolean z10;
        boolean z11;
        int i10 = f1754 + 45;
        f1753 = i10 % 128;
        if (i10 % 2 == 0) {
            str.hashCode();
            throw null;
        }
        byte b10 = 8;
        switch (str.hashCode()) {
            case -1836320845:
                b10 = !str.equals(m1999(new int[]{-1199955862, 1665796584, -800765037, 467666026, 1760024477, 1669471029}, 12 - (ViewConfiguration.getEdgeSlop() >> 16)).intern()) ? (byte) -1 : (byte) 7;
                break;
            case -1833890347:
                b10 = !str.equals(m1999(new int[]{1627642633, -766880718, -1396347217, -875008559, -223056821, 557878031}, 11 - Gravity.getAbsoluteGravity(0, 0)).intern()) ? (byte) -1 : (byte) 9;
                break;
            case -1803337567:
                b10 = !str.equals(m1984((-1435268698) - Color.alpha(0), (short) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 105), Drawable.resolveOpacity(0, 0) - 1310500450, (byte) (81 - (ViewConfiguration.getLongPressTimeout() >> 16)), (-84) - KeyEvent.normalizeMetaState(0)).intern()) ? (byte) -1 : (byte) 27;
                break;
            case -1712168770:
                b10 = (str.equals(m1999(new int[]{1627642633, -766880718, 269053700, -1575955648, -2013132287, -1227428115}, TextUtils.indexOf("", "", 0, 0) + 11).intern()) ? (char) 6 : '*') == '*' ? (byte) -1 : (byte) 14;
                break;
            case -1409157227:
                b10 = !str.equals(m1984((ViewConfiguration.getPressedStateDuration() >> 16) - 1435268900, (short) ((-66) - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1310500462, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) - 31), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 91).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -1362450249:
                b10 = !str.equals(m1999(new int[]{-132134310, 2076327793, 821358382, -1586332438, 2071203230, -1998993296, -1242011475, 351498058}, 15 - View.getDefaultSize(0, 0)).intern()) ? (byte) -1 : (byte) 33;
                break;
            case -1273813711:
                b10 = !str.equals(m1984((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1435268761, (short) (38 - TextUtils.indexOf("", "", 0)), (-1310500449) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) ((-124) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-86) - TextUtils.getOffsetBefore("", 0)).intern()) ? (byte) -1 : (byte) 23;
                break;
            case -1249364341:
                b10 = !str.equals(m1999(new int[]{-964166878, -655071619, -1105723839, -578874637}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6).intern()) ? (byte) -1 : (byte) 31;
                break;
            case -1245993915:
                b10 = !str.equals(m1984(((byte) KeyEvent.getModifierMetaStateMask()) - 1435268775, (short) ((-107) - Color.green(0)), Gravity.getAbsoluteGravity(0, 0) - 1310500462, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 124), (Process.myTid() >> 22) - 86).intern()) ? (byte) -1 : (byte) 22;
                break;
            case -1190960472:
                b10 = (str.equals(m1984((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + (-1435268681), (short) (ExpandableListView.getPackedPositionGroup(0L) + (-113)), (-1310500462) - ExpandableListView.getPackedPositionType(0L), (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + (-77)), (-81) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern()) ? 'J' : (char) 19) == 'J' ? (byte) 29 : (byte) -1;
                break;
            case -1099149698:
                b10 = !str.equals(m1984((-1435268877) - View.MeasureSpec.makeMeasureSpec(0, 0), (short) (KeyEvent.getDeadChar(0, 0) + 53), KeyEvent.keyCodeFromString("") - 1310500462, (byte) (64 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), View.MeasureSpec.getSize(0) - 81).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -1091371232:
                if (!str.equals(m1984((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1435268856, (short) (125 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1310500468, (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 61), (Process.myTid() >> 22) - 90).intern())) {
                    b10 = -1;
                }
                break;
            case -1016025794:
                b10 = !str.equals(m1999(new int[]{1627642633, -766880718, -1396347217, -875008559, -2059605302, 2031954964}, (ViewConfiguration.getPressedStateDuration() >> 16) + 12).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -924327250:
                b10 = (str.equals(m1999(new int[]{-873379211, 1921296910, -315179222, 1534064542, 524488284, -575527758, -1182513729, -764577917}, 14 - View.MeasureSpec.getMode(0)).intern()) ? (char) 23 : '!') == '!' ? (byte) -1 : (byte) 12;
                break;
            case -905814529:
                if (str.equals(m1999(new int[]{852086821, 1119805024, -1105723839, -578874637}, 5 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    z11 = true;
                    z10 = true;
                } else {
                    z10 = false;
                    z11 = true;
                }
                b10 = z10 == z11 ? (byte) 32 : (byte) -1;
                break;
            case -890333697:
                if (!str.equals(m1999(new int[]{-164680244, 608842177, 821358382, -1586332438, -1006538095, 769731358, -773590697, -158632438}, 14 - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f1754 + 37;
                    f1753 = i11 % 128;
                    if ((i11 % 2 == 0 ? '\r' : 'J') == '\r') {
                        b10 = 2;
                    } else {
                        b10 = 5;
                    }
                }
                break;
            case -887729623:
                b10 = (str.equals(m1984((-1435268888) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) ((-28) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + (-1310500462), (byte) ((ViewConfiguration.getTouchSlop() >> 8) + (-30)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + (-91)).intern()) ? (char) 26 : '!') == 26 ? (byte) 1 : (byte) -1;
                break;
            case -869156349:
                b10 = !str.equals(m1984((ViewConfiguration.getTapTimeout() >> 16) - 1435268660, (short) (ExpandableListView.getPackedPositionGroup(0L) + 97), Drawable.resolveOpacity(0, 0) - 1310500449, (byte) ((-50) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (-97) - ((Process.getThreadPriority(0) + 20) >> 6)).intern()) ? (byte) -1 : (byte) 34;
                break;
            case -747967915:
                b10 = !str.equals(m1984((-1435268832) - TextUtils.indexOf("", ""), (short) ((-120) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Color.rgb(0, 0, 0) - 1293723252, (byte) ('7' - AndroidCharacter.getMirror('0')), (-93) - (ViewConfiguration.getScrollBarSize() >> 8)).intern()) ? (byte) -1 : (byte) 13;
                break;
            case -333660891:
                b10 = (str.equals(m1984((ViewConfiguration.getTapTimeout() >> 16) + (-1435268744), (short) ((-4) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + (-1310500462), (byte) (65 - TextUtils.lastIndexOf("", '0', 0, 0)), (-86) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()) ? '\\' : '2') == '\\' ? (byte) 24 : (byte) -1;
                break;
            case -259609707:
                b10 = !str.equals(m1999(new int[]{-409939825, -1792533820, -315179222, 1534064542, 524488284, -575527758, -327088118, 373480316, 1424955633, 1192411908}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18).intern()) ? (byte) -1 : (byte) 28;
                break;
            case -140869031:
                if (!str.equals(m1999(new int[]{1468079536, 527254633, -800765037, 467666026, 1760024477, 1669471029, -201232800, -1402455252, -677203471, -1612824910}, 19 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f1753 + 111;
                    f1754 = i12 % 128;
                    int i13 = i12 % 2;
                    b10 = 20;
                }
                break;
            case 20418827:
                b10 = !str.equals(m1984((-1435268823) - TextUtils.getTrimmedLength(""), (short) ((-119) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1310500450, (byte) ((ViewConfiguration.getTouchSlop() >> 8) - 30), (-89) - MotionEvent.axisFromString("")).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 108267695:
                if (!str.equals(m1984((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1435268727, (short) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 107), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1310500450, (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 104), (-87) - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i14 = f1754 + 121;
                    f1753 = i14 % 128;
                    int i15 = i14 % 2;
                    b10 = 25;
                }
                break;
            case 177098421:
                b10 = !str.equals(m1999(new int[]{1761882538, 129673512, 128682355, -1005862064, -223056821, 557878031}, Color.alpha(0) + 11).intern()) ? (byte) -1 : (byte) 15;
                break;
            case 213978610:
                if (!str.equals(m1999(new int[]{-1153832661, 904893468, -315179222, 1534064542, -1359141531, -1090705527, -1389534746, 722237396, -1189123850, 2143397914, 515147528, -1130156474}, ((Process.getThreadPriority(0) + 20) >> 6) + 22).intern())) {
                    b10 = -1;
                } else {
                    int i16 = f1754 + 5;
                    f1753 = i16 % 128;
                    b10 = i16 % 2 != 0 ? (byte) 18 : (byte) 125;
                }
                break;
            case 779164621:
                b10 = !str.equals(m1984((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 1435268809, (short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 38), TextUtils.indexOf("", "", 0, 0) - 1310500450, (byte) (TextUtils.getTrimmedLength("") + 44), 65499 - AndroidCharacter.getMirror('0')).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 801466981:
                b10 = (str.equals(m1984(Color.argb(0, 0, 0, 0) + (-1435268844), (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 35), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + (-1310500469), (byte) ((Process.myTid() >> 22) + 59), (KeyEvent.getMaxKeyCode() >> 16) + (-90)).intern()) ? '\r' : 'W') == 'W' ? (byte) -1 : (byte) 11;
                break;
            case 1195083870:
                if (!str.equals(m1999(new int[]{1761882538, 129673512, 128682355, -1005862064, -2059605302, 2031954964}, View.MeasureSpec.makeMeasureSpec(0, 0) + 12).intern())) {
                    b10 = -1;
                } else {
                    int i17 = f1753 + 87;
                    f1754 = i17 % 128;
                    int i18 = i17 % 2;
                    b10 = 16;
                }
                break;
            case 1323380041:
                if (!str.equals(m1999(new int[]{-239453369, -1215823024, 128682355, -1005862064, -2059605302, 2031954964}, 12 - KeyEvent.keyCodeFromString("")).intern())) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 1340011123:
                b10 = !str.equals(m1999(new int[]{1786614892, -1351621077, 269053700, -1575955648, -2013132287, -1227428115}, 11 - View.MeasureSpec.getMode(0)).intern()) ? (byte) -1 : (byte) 3;
                break;
            case 1345250484:
                if (!str.equals(m1999(new int[]{-1626176195, -1783008857, 821358382, -1586332438, 952303545, -586849499, -800765037, 467666026, -479947119, 1701606488, 1408838437, 2082919660}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 21).intern())) {
                    b10 = -1;
                } else {
                    int i19 = f1754 + 63;
                    f1753 = i19 % 128;
                    int i20 = i19 % 2;
                    b10 = 30;
                }
                break;
            case 1939710523:
                if (!str.equals(m1984(TextUtils.indexOf("", "") - 1435268713, (short) ((-16777238) - Color.rgb(0, 0, 0)), View.MeasureSpec.getSize(0) - 1310500462, (byte) ((-110) - Drawable.resolveOpacity(0, 0)), (-87) - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i21 = f1754 + 115;
                    f1753 = i21 % 128;
                    int i22 = i21 % 2;
                    b10 = 26;
                }
                break;
            case 2108820561:
                b10 = !str.equals(m1984((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1435268793, (short) ((-5) - (KeyEvent.getMaxKeyCode() >> 16)), (-1310500451) - TextUtils.lastIndexOf("", '0', 0, 0), (byte) ((-126) - TextUtils.getOffsetBefore("", 0)), (-86) - KeyEvent.normalizeMetaState(0)).intern()) ? (byte) -1 : (byte) 21;
                break;
            case 2109208793:
                b10 = !str.equals(m1999(new int[]{-409939825, -1792533820, -315179222, 1534064542, 524488284, -575527758, -1182513729, -764577917}, 14 - (Process.myTid() >> 22)).intern()) ? (byte) -1 : (byte) 4;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return m2000();
            case 1:
                return m2003();
            case 2:
                return m1995();
            case 3:
                return m1985();
            case 4:
                return m1989();
            case 5:
                return Integer.valueOf(m1974().m2268());
            case 6:
                return Integer.valueOf(m1980().m2268());
            case 7:
                m2004((String) cz.m1851(list, 0, String.class));
                break;
            case 8:
                m2005((List<String>) cz.m1851(list, 0, List.class));
                break;
            case 9:
                m2001((String) cz.m1851(list, 0, String.class));
                break;
            case 10:
                m1988((List<String>) cz.m1851(list, 0, List.class));
                int i23 = f1753 + 87;
                f1754 = i23 % 128;
                int i24 = i23 % 2;
                break;
            case 11:
                m1991((String) cz.m1851(list, 0, String.class));
                break;
            case 12:
                m2002((List<String>) cz.m1851(list, 0, List.class));
                break;
            case 13:
                m1986((String) cz.m1851(list, 0, String.class));
                break;
            case 14:
                m1992((List<String>) cz.m1851(list, 0, List.class));
                break;
            case 15:
                m1997((String) cz.m1851(list, 0, String.class));
                break;
            case 16:
                m1998((List<String>) cz.m1851(list, 0, List.class));
                break;
            case 17:
                m1990(hn.m2267(((Integer) cz.m1851(list, 0, Integer.class)).intValue()));
                break;
            case 18:
                m1996(hn.m2267(((Integer) cz.m1851(list, 0, Integer.class)).intValue()));
                break;
            case 19:
                m1979((String) cz.m1851(list, 0, String.class));
                break;
            case 20:
                return m1978();
            case 21:
                m1977((String) cz.m1851(list, 0, String.class));
                break;
            case 22:
                return m1982();
            case 23:
                m1981((String) cz.m1851(list, 0, String.class));
                break;
            case 24:
                return m1976();
            case 25:
                m1983((String) cz.m1851(list, 0, String.class));
                break;
            case 26:
                return m1969();
            case 27:
                m1975((String) cz.m1851(list, 0, String.class));
                break;
            case 28:
                return m1971();
            case 29:
                return m1970();
            case 30:
                m1994((JSONObject) cz.m1851(list, 0, JSONObject.class));
                break;
            case 31:
                return m1968();
            case 32:
                m1973((String) cz.m1851(list, 0, String.class));
                break;
            case 33:
                return m1972();
            case 34:
                return m1967();
        }
        int i25 = f1754 + 55;
        f1753 = i25 % 128;
        int i26 = i25 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1984(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f1759;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f1757;
                if (bArr != null) {
                    i14 = (byte) (bArr[f1760 + i10] + i13);
                } else {
                    i14 = (short) (f1758[f1760 + i10] + i13);
                }
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f1760 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f1756);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f1757;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f1758;
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
}
