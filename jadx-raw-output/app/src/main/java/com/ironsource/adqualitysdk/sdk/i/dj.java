package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media.AudioAttributesCompat;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class dj extends cz implements cl {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1739 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1741 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f1749;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1750;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1752;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f1746 = {3780, 55073, 48418, 33580, 26889, 20239, 5396, 64381, 49527, 42858, 'b', 55703, 45954, 36236, 26557, 16828, 2020, 56858, 46081, 35330, 24624, 17971, 7204, 62044, 51287, 44545, 25051, 47163, 53808, 60423, 1557, 8194, 31237, 38003, 44652, 51307, 57936, 15476, 22085, 28834, 35499, 42157, 65210, 6293, 12970, 19595, 26365, 32995, 'g', 55699, 45976, 36259, 26556, 16796, 7073, 62924, 53205, 43464, 33769, 24055, 16835, 38967, 62012, 52239, 9743, ',', 23061, 46194, 36472, 59505, 49755, 7236, 30281, 20671, 43710, 33935, 56992, 33365, 23457, 12714, 3993, 58777, 50111, 39299, 30715, 19958, 11259, 451, 'g', 55699, 45976, 36256, 26538, 16801, 7077, 62942, 53203, 43463, 33775, 24038, 14285, 4360, 60177, 50436, 40724, 31000, 21293, 11567, 1885};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f1744 = 1655881082737973750L;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean f1740 = true;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static boolean f1742 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1745 = AudioAttributesCompat.FLAG_ALL_PUBLIC;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f1743 = {319, 388, 374, 389, 340, 384, 383, 372, 387, 351, 370, 382, 376, 350, 373, 378, 392, 380, 338, 355, 391, 390, 346, 343, 381, 353, 347};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1751 = "";

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private double f1748 = -1.0d;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private boolean f1747 = false;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m1955() {
        int i10 = f1741 + 121;
        f1739 = i10 % 128;
        if ((i10 % 2 != 0 ? '^' : 'M') != '^') {
            return this.f1751;
        }
        int i11 = 54 / 0;
        return this.f1751;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Double m1956() {
        int i10 = f1741 + 95;
        f1739 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 23 : (char) 17) != 23) {
            return Double.valueOf(this.f1748);
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1959(boolean z10) {
        int i10 = f1739;
        int i11 = i10 + 43;
        f1741 = i11 % 128;
        int i12 = i11 % 2;
        this.f1749 = z10;
        int i13 = i10 + 93;
        f1741 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 1 : '$') != 1) {
            return;
        }
        int i14 = 89 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1961(String str) {
        int i10 = f1739 + 61;
        int i11 = i10 % 128;
        f1741 = i11;
        int i12 = i10 % 2;
        this.f1751 = str;
        int i13 = i11 + 95;
        f1739 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m1962(String str) {
        int i10 = f1739 + 89;
        int i11 = i10 % 128;
        f1741 = i11;
        int i12 = i10 % 2;
        this.f1752 = str;
        int i13 = i11 + 111;
        f1739 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m1951() {
        String strIntern;
        int i10 = f1741 + 33;
        f1739 = i10 % 128;
        if (i10 % 2 != 0) {
            m1952();
            throw null;
        }
        if (m1952()) {
            strIntern = m1957(View.resolveSize(0, 0), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 3746), 10 - TextUtils.indexOf("", "", 0, 0)).intern();
            int i11 = f1741 + 117;
            f1739 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            strIntern = m1957(Process.getGidForName("") + 11, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 7 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m1957((ViewConfiguration.getFadingEdgeLength() >> 16) + 16, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1929), 10 - TextUtils.getCapsMode("", 0, 0)).intern());
        sb2.append(this.f1751);
        sb2.append(m1958(null, 127 - TextUtils.getOffsetBefore("", 0), null, "\u0081").intern());
        sb2.append(strIntern);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean m1952() {
        int i10 = f1739 + 53;
        f1741 = i10 % 128;
        if ((i10 % 2 == 0 ? '<' : 'c') == 'c') {
            return this.f1749;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m1953() {
        int i10 = f1739;
        int i11 = i10 + 71;
        f1741 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f1750;
        int i13 = i10 + 21;
        f1741 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m1954() {
        int i10 = f1739 + 113;
        f1741 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1752;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1957(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1746[i10 + i12]) ^ (((long) i12) * f1744)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean m1960() {
        int i10 = f1739;
        int i11 = i10 + 69;
        f1741 = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = this.f1747;
        int i13 = i10 + 25;
        f1741 = i13 % 128;
        int i14 = i13 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m1964(Double d10) {
        int i10 = f1741 + 61;
        f1739 = i10 % 128;
        int i11 = i10 % 2;
        this.f1748 = d10.doubleValue();
        int i12 = f1741 + 71;
        f1739 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m1966() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        JSONObject jSONObjectJsonObjectInit2 = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit2.put(ih.f2542, this.f1752);
            double d10 = this.f1748;
            if (d10 > -1.0d) {
                int i10 = f1741 + 25;
                f1739 = i10 % 128;
                if ((i10 % 2 != 0 ? '<' : ',') != ',') {
                    jSONObjectJsonObjectInit2.put(ih.f2491, d10);
                    throw null;
                }
                jSONObjectJsonObjectInit2.put(ih.f2491, d10);
            }
            jSONObjectJsonObjectInit2.put(ih.f2494, this.f1750);
        } catch (JSONException unused) {
        }
        try {
            if (jSONObjectJsonObjectInit2.length() > 0) {
                if (this.f1747) {
                    int i11 = f1741 + 37;
                    f1739 = i11 % 128;
                    int i12 = i11 % 2;
                    jSONObjectJsonObjectInit2.put(ih.f2490, true);
                    int i13 = f1739 + 89;
                    f1741 = i13 % 128;
                    int i14 = i13 % 2;
                }
                jSONObjectJsonObjectInit.put(ih.f2493, jSONObjectJsonObjectInit2);
            }
        } catch (JSONException unused2) {
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m1963(boolean z10) {
        int i10 = f1741 + 91;
        int i11 = i10 % 128;
        f1739 = i11;
        int i12 = i10 % 2;
        this.f1747 = z10;
        int i13 = i11 + 37;
        f1741 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m1965(String str) {
        int i10 = f1739 + 43;
        int i11 = i10 % 128;
        f1741 = i11;
        int i12 = i10 % 2;
        this.f1750 = str;
        int i13 = i11 + 115;
        f1739 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:76:0x0229  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo812(String str, List<Object> list, ch chVar) {
        byte b10;
        switch (str.hashCode()) {
            case -2010356102:
                if (!str.equals(m1957(88 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ImageFormat.getBitsPerPixel(0) + 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 21).intern())) {
                    b10 = -1;
                } else {
                    b10 = 12;
                }
                break;
            case -1679773410:
                if (!str.equals(m1958(null, Color.alpha(0) + 127, null, "\u008f\u0097\u0084\u0087\u0083\u008c\u0083\u0088\u008b\u0099\u009a\u0084\u0083\u0082").intern())) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case -1457409854:
                if (!str.equals(m1958(null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, null, "\u0083\u008c\u008b\u008a\u0089\u0086\u0084\u0088\u0083\u0087\u0087\u0086\u0085\u0084\u0083\u008d").intern())) {
                    b10 = -1;
                } else {
                    int i10 = f1741 + 113;
                    f1739 = i10 % 128;
                    int i11 = i10 % 2;
                }
                break;
            case -1033133001:
                if (!str.equals(m1958(null, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, null, "\u0083\u0096\u0087\u0083\u0095\u0083\u0094\u008f\u0093\u0084\u0083\u0082").intern())) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case -869156349:
                if (!str.equals(m1958(null, TextUtils.indexOf("", "", 0) + 127, null, "\u0087\u0086\u0082\u009b\u0086\u0084").intern())) {
                    b10 = -1;
                } else {
                    b10 = 13;
                }
                break;
            case -303276684:
                if (!str.equals(m1958(null, 127 - Color.green(0), null, "\u0083\u008c\u008b\u008a\u0092\u0089\u0086\u0091\u0084\u0083\u008a\u008f\u0083\u0084\u008b\u0090\u008f\u0083\u008e\u0084\u0083\u008d").intern())) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case 91962794:
                if (!(str.equals(m1958(null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), null, "\u008f\u0097\u0084\u0087\u0083\u008c\u0083\u0088\u008b\u0099\u009a\u0084\u0083\u008d").intern()))) {
                    b10 = -1;
                } else {
                    int i12 = f1739 + 35;
                    f1741 = i12 % 128;
                    int i13 = i12 % 2;
                    b10 = 9;
                }
                break;
            case 701278346:
                if ((str.equals(m1958(null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, null, "\u008f\u0093\u0087\u0083\u0083\u0089\u0088\u0082\u0099\u0099\u0096\u0098\u0082\u0097\u0084\u0083\u0082").intern()) ? ']' : '3') == '3') {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case 1006114614:
                if (str.equals(m1958(null, 127 - (Process.myTid() >> 22), null, "\u0083\u008c\u008b\u008a\u0089\u0086\u0084\u0088\u0083\u0087\u0087\u0086\u0085\u0084\u0083\u0082").intern())) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
                break;
            case 1009851624:
                if (!str.equals(m1957((ViewConfiguration.getFadingEdgeLength() >> 16) + 26, (char) (Process.getGidForName("") + 25001), 22 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 1314266045:
                if ((str.equals(m1958(null, View.resolveSizeAndState(0, 0, 0) + 127, null, "\u008c\u0086\u0084\u0082\u0096\u0085\u0082\u0097\u0084\u0083\u0082").intern()) ? '^' : 'G') == '^') {
                    int i14 = f1739 + 65;
                    f1741 = i14 % 128;
                    b10 = i14 % 2 != 0 ? (byte) 10 : (byte) 103;
                } else {
                    b10 = -1;
                }
                break;
            case 1402845873:
                if (!str.equals(m1957(78 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (KeyEvent.keyCodeFromString("") + 33330), 11 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case 1641431166:
                if (!str.equals(m1957((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 60, (char) (TextUtils.getOffsetBefore("", 0) + 16804), (Process.myPid() >> 22) + 17).intern())) {
                    b10 = -1;
                } else {
                    int i15 = f1739 + 47;
                    f1741 = i15 % 128;
                    b10 = i15 % 2 == 0 ? (byte) 1 : (byte) 7;
                }
                break;
            case 1712841667:
                if ((str.equals(m1957(48 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12).intern()) ? 'N' : '#') == '#') {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                m1962((String) cz.m1851(list, 0, String.class));
                return null;
            case 1:
                return m1954();
            case 2:
                m1961((String) cz.m1851(list, 0, String.class));
                int i16 = f1741 + 3;
                f1739 = i16 % 128;
                int i17 = i16 % 2;
                return null;
            case 3:
                return m1955();
            case 4:
                m1964((Double) cz.m1851(list, 0, Double.class));
                return null;
            case 5:
                return m1956();
            case 6:
                m1959(((Boolean) cz.m1851(list, 0, Boolean.class)).booleanValue());
                return null;
            case 7:
                return Boolean.valueOf(m1952());
            case 8:
                m1965((String) cz.m1851(list, 0, String.class));
                return null;
            case 9:
                return m1953();
            case 10:
                m1963(((Boolean) cz.m1851(list, 0, Boolean.class)).booleanValue());
                return Boolean.valueOf(m1960());
            case 11:
                return Boolean.valueOf(m1960());
            case 12:
                return m1951();
            case 13:
                return m1966();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1958(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2988) {
            char[] cArr2 = f1743;
            int i11 = f1745;
            if (f1742) {
                int length = bArr.length;
                m.f2990 = length;
                char[] cArr3 = new char[length];
                m.f2989 = 0;
                while (m.f2989 < m.f2990) {
                    int i12 = m.f2989;
                    int i13 = m.f2990 - 1;
                    int i14 = m.f2989;
                    cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                    m.f2989 = i14 + 1;
                }
                return new String(cArr3);
            }
            if (f1740) {
                int length2 = cArr.length;
                m.f2990 = length2;
                char[] cArr4 = new char[length2];
                m.f2989 = 0;
                while (m.f2989 < m.f2990) {
                    int i15 = m.f2989;
                    int i16 = m.f2990 - 1;
                    int i17 = m.f2989;
                    cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                    m.f2989 = i17 + 1;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            m.f2990 = length3;
            char[] cArr5 = new char[length3];
            m.f2989 = 0;
            while (m.f2989 < m.f2990) {
                int i18 = m.f2989;
                int i19 = m.f2990 - 1;
                int i20 = m.f2989;
                cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                m.f2989 = i20 + 1;
            }
            return new String(cArr5);
        }
    }
}
