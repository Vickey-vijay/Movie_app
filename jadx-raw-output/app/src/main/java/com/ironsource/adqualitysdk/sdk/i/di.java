package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class di extends cz implements cl {

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f1723 = 1;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char[] f1724 = {'t', 226, 226, 208, 200, 204, 204, '!', 'R', 'g', 'n', 'h', 'e', 'h', 'j', 'a', 'f', 't', 'j', 'l', 'l', 'l', 143, 141, 152, 161, '|', 150, 143, 145, 137, 152, 149, 137, 'k', 156, 141, 146, 278, 285, 299, 300, 302, 302, 307, 299, 301, 301, 274, 282, 300, 300, 261, 274, 227, 276, 261, 275, 260, 233, 261, 278, 265, 276, 257, 156, 304, 283, 289, 311, 311, 309, 289, 290, 305, 'V', 165, 165, 156, 148, 164, 172, 166, 165, 172, 151, 143, 's', 163, 148, 162, 147, 'x', 159, 162, 134, 262, 262, 246, 245, 267, 243, 236, 257, 264, 258, 255, 258, 260, 245, 240, '2', 'd', 'f', 'm', 'a', 'Z', 'f', 'U', '[', 'l', 'l', '2', 'd', 'f', 'm', 'a', 'Z', 'f', 'U', '[', 'l', 'f', 157, 311, 301, 301, 284, 278, 295, 276, 285, 308, 307, 300, 298, 297};

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static long f1725 = 5147170450295727915L;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1726;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private String f1727;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private String f1728;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String f1729;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String f1730;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String f1731;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String f1732;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String f1733;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1734;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1735;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1736;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1737;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1738;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private void m1926(String str) {
        int i10 = f1726;
        int i11 = i10 + 25;
        f1723 = i11 % 128;
        char c10 = i11 % 2 == 0 ? '.' : '\n';
        this.f1727 = str;
        if (c10 != '\n') {
            throw null;
        }
        int i12 = i10 + 77;
        f1723 = i12 % 128;
        if ((i12 % 2 == 0 ? '/' : 'D') != 'D') {
            int i13 = 74 / 0;
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private Object m1927() {
        int i10 = f1726;
        int i11 = i10 + 5;
        f1723 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = this.f1727;
        int i12 = i10 + 27;
        f1723 = i12 % 128;
        int i13 = i12 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String m1929() {
        int i10 = f1723;
        int i11 = i10 + 7;
        f1726 = i11 % 128;
        if ((i11 % 2 != 0 ? '3' : 'Y') != 'Y') {
            throw null;
        }
        String str = this.f1730;
        int i12 = i10 + 121;
        f1726 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m1932(String str) {
        int i10 = f1726 + 93;
        int i11 = i10 % 128;
        f1723 = i11;
        int i12 = i10 % 2;
        this.f1731 = str;
        int i13 = i11 + 89;
        f1726 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m1933() {
        int i10 = f1723;
        int i11 = i10 + 15;
        f1726 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f1731;
        int i13 = i10 + 91;
        f1726 = i13 % 128;
        if ((i13 % 2 != 0 ? ')' : '\'') == '\'') {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m1936(String str) {
        int i10 = f1726;
        int i11 = i10 + 75;
        f1723 = i11 % 128;
        int i12 = i11 % 2;
        this.f1729 = str;
        int i13 = i10 + 65;
        f1723 = i13 % 128;
        if ((i13 % 2 == 0 ? '\"' : 'E') != '\"') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m1937() {
        int i10 = f1723 + 87;
        int i11 = i10 % 128;
        f1726 = i11;
        if (!(i10 % 2 == 0)) {
            throw null;
        }
        String str = this.f1729;
        int i12 = i11 + 87;
        f1723 = i12 % 128;
        if ((i12 % 2 == 0 ? '2' : '_') == '_') {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m1939() {
        int i10 = f1723 + 53;
        int i11 = i10 % 128;
        f1726 = i11;
        int i12 = i10 % 2;
        String str = this.f1737;
        int i13 = i11 + 87;
        f1723 = i13 % 128;
        if (i13 % 2 != 0) {
            return str;
        }
        int i14 = 6 / 0;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1943(String str) {
        int i10 = f1723 + 1;
        int i11 = i10 % 128;
        f1726 = i11;
        boolean z10 = i10 % 2 != 0;
        this.f1736 = str;
        if (z10) {
            throw null;
        }
        int i12 = i11 + 103;
        f1723 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1945(String str) {
        int i10 = f1723 + 105;
        f1726 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '\f' : 'T';
        this.f1738 = str;
        if (c10 == 'T') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1947(String str) {
        int i10 = f1726 + 113;
        int i11 = i10 % 128;
        f1723 = i11;
        int i12 = i10 % 2;
        this.f1734 = str;
        int i13 = i11 + 63;
        f1726 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1950(String str) {
        int i10 = f1726 + 99;
        f1723 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'T' : (char) 26;
        this.f1737 = str;
        if (c10 == 26) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private Object m1924() {
        int i10 = f1726 + 69;
        int i11 = i10 % 128;
        f1723 = i11;
        int i12 = i10 % 2;
        String str = this.f1728;
        int i13 = i11 + 101;
        f1726 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private JSONObject m1925() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.putOpt(ih.f2514, this.f1734);
            jSONObjectJsonObjectInit.putOpt(ih.f2513, this.f1737);
            jSONObjectJsonObjectInit.putOpt(ih.f2519, this.f1738);
            jSONObjectJsonObjectInit.putOpt(ih.f2518, this.f1735);
            jSONObjectJsonObjectInit.putOpt(ih.f2517, this.f1731);
            jSONObjectJsonObjectInit.putOpt(ih.f2512, this.f1730);
            jSONObjectJsonObjectInit.putOpt(ih.f2511, this.f1732);
            jSONObjectJsonObjectInit.putOpt(ih.f2510, this.f1729);
            jSONObjectJsonObjectInit.putOpt(ih.f2505, this.f1733);
        } catch (JSONException unused) {
        }
        int i10 = f1723 + 71;
        f1726 = i10 % 128;
        int i11 = i10 % 2;
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private void m1928(String str) {
        int i10 = f1723 + 67;
        f1726 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '#' : 'O';
        this.f1728 = str;
        if (c10 != 'O') {
            int i11 = 65 / 0;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m1930(String str) {
        int i10 = f1726 + 31;
        f1723 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        this.f1732 = str;
        if (z10) {
            return;
        }
        int i11 = 76 / 0;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m1931() {
        int i10 = f1726 + 91;
        int i11 = i10 % 128;
        f1723 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f1732;
        int i12 = i11 + 49;
        f1726 = i12 % 128;
        if ((i12 % 2 != 0 ? 'I' : (char) 20) != 'I') {
            return str;
        }
        int i13 = 86 / 0;
        return str;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m1934(String str) {
        int i10 = f1726;
        int i11 = i10 + 1;
        f1723 = i11 % 128;
        char c10 = i11 % 2 == 0 ? (char) 29 : (char) 16;
        this.f1730 = str;
        if (c10 == 29) {
            int i12 = 46 / 0;
        }
        int i13 = i10 + 63;
        f1723 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m1935() {
        int i10 = f1723 + 83;
        int i11 = i10 % 128;
        f1726 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        String str = this.f1733;
        int i12 = i11 + 5;
        f1723 = i12 % 128;
        int i13 = i12 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m1938(String str) {
        int i10 = f1726;
        int i11 = i10 + 55;
        f1723 = i11 % 128;
        int i12 = i11 % 2;
        this.f1733 = str;
        int i13 = i10 + 111;
        f1723 = i13 % 128;
        if (!(i13 % 2 == 0)) {
            return;
        }
        int i14 = 38 / 0;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1941(String str) {
        int i10 = f1723;
        int i11 = i10 + 103;
        f1726 = i11 % 128;
        int i12 = i11 % 2;
        this.f1735 = str;
        int i13 = i10 + 99;
        f1726 = i13 % 128;
        if ((i13 % 2 != 0 ? (char) 26 : 'D') != 26) {
            return;
        }
        int i14 = 70 / 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m1942() {
        int i10 = f1723 + 39;
        int i11 = i10 % 128;
        f1726 = i11;
        int i12 = i10 % 2;
        String str = this.f1735;
        int i13 = i11 + 91;
        f1723 = i13 % 128;
        if (i13 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m1944() {
        int i10 = f1723 + 1;
        f1726 = i10 % 128;
        if ((i10 % 2 != 0 ? 'M' : (char) 16) == 16) {
            return this.f1738;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m1946() {
        int i10 = f1726 + 107;
        f1723 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1734;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Object m1948() {
        String str;
        int i10 = f1723;
        int i11 = i10 + 63;
        f1726 = i11 % 128;
        if ((i11 % 2 != 0 ? '4' : (char) 15) != '4') {
            str = this.f1736;
        } else {
            str = this.f1736;
            int i12 = 54 / 0;
        }
        int i13 = i10 + 35;
        f1726 = i13 % 128;
        if ((i13 % 2 != 0 ? 'S' : (char) 19) != 'S') {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1949(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
            System.arraycopy(f1724, i10, cArr, 0, i11);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:122:0x0326  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo812(String str, List<Object> list, ch chVar) {
        byte b10;
        switch (str.hashCode()) {
            case -2118395364:
                if (str.equals(m1940("뻅꿔뺢ᨔ\u089a⇉吶퐉∍\uec75\uf173뎖蟩伾鷉ཱུ梳튲㸪", -MotionEvent.axisFromString("")).intern())) {
                    int i10 = f1726 + 101;
                    f1723 = i10 % 128;
                    int i11 = i10 % 2;
                    b10 = 7;
                } else {
                    b10 = -1;
                }
                break;
            case -2061646392:
                if (!str.equals(m1949(new int[]{75, 12, 57, 0}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001", false).intern())) {
                    b10 = -1;
                } else {
                    b10 = 12;
                }
                break;
            case -1670022962:
                if ((str.equals(m1949(new int[]{111, 11, 0, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000", true).intern()) ? '2' : '\n') == '\n') {
                    b10 = -1;
                } else {
                    int i12 = f1726 + 115;
                    f1723 = i12 % 128;
                    b10 = i12 % 2 != 0 ? (byte) 20 : (byte) 6;
                }
                break;
            case -1616003519:
                if (!str.equals(m1940("␏⯧⑨ˉ販臓䳫琑룂桝\ue9bb\u139fᴾ쬃蔉꽃\uf26f", 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case -1585083924:
                if (!str.equals(m1949(new int[]{7, 15, 0, 12}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001", false).intern())) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case -1581443134:
                if (!str.equals(m1949(new int[]{122, 11, 0, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000", true).intern())) {
                    b10 = -1;
                } else {
                    b10 = 21;
                }
                break;
            case -1448564938:
                if (!str.equals(m1940("笇⧻筠㬖躵㓂甴섇\ue7d8橜큗Ꚏ䈲줈볙ᩲ굤咺ἅＣ", TextUtils.indexOf("", "", 0, 0) + 1).intern())) {
                    b10 = -1;
                } else {
                    int i13 = f1726 + 33;
                    f1723 = i13 % 128;
                    int i14 = i13 % 2;
                    b10 = 19;
                }
                break;
            case -1295434132:
                if (!str.equals(m1949(new int[]{Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 14, 193, 1}, "\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001", false).intern())) {
                    b10 = -1;
                } else {
                    b10 = 22;
                }
                break;
            case -1207642840:
                if (!str.equals(m1949(new int[]{37, 15, 192, 0}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000", true).intern())) {
                    b10 = -1;
                } else {
                    int i15 = f1726 + 101;
                    f1723 = i15 % 128;
                    int i16 = i15 % 2;
                }
                break;
            case -1027873480:
                if (!str.equals(m1949(new int[]{65, 10, 197, 1}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", true).intern())) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case -869156349:
                if ((str.equals(m1940("赑졚败䎺漞땈ඦ䂺ᆒ诣", 1 - Color.green(0)).intern()) ? '7' : '!') == '!') {
                    b10 = -1;
                } else {
                    int i17 = f1726 + 121;
                    f1723 = i17 % 128;
                    int i18 = i17 % 2;
                    b10 = 24;
                }
                break;
            case -841872307:
                if (!str.equals(m1940("쉊믑숹瓮Ჟ戌㫌韎庇\uf86b龜\uf040ﭻ嬵\uf32e䲜ᐪ", Color.alpha(0) + 1).intern())) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case -587837303:
                if (!(str.equals(m1940("ꑎ옳ꐽꝿ慽\udaaf\ue95d⽪㢑薔䰾䣰鵳⛑₥\uf41f爼뭹荬ᅎ", 1 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern()))) {
                    b10 = -1;
                } else {
                    int i19 = f1726 + 109;
                    f1723 = i19 % 128;
                    int i20 = i19 % 2;
                    b10 = 16;
                }
                break;
            case -75693804:
                if (!str.equals(m1940("ಠ糃ೇኖ\udb8d曩岴錩遨㽝藺", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 476302072:
                if (!str.equals(m1940("\u202e㔏⁉捊鉁\uece1\u2d68ᤢ볫皼蠋纹ᤄ헾\ue481쉖\uf649䡙", (ViewConfiguration.getPressedStateDuration() >> 16) + 1).intern())) {
                    b10 = -1;
                } else {
                    b10 = 23;
                }
                break;
            case 684328276:
                if (!str.equals(m1940("燊\uf7e2熭庛催裎Ⴙ紝\ued03둄뗬᪆䣡\u1715\ud97c꙳", 1 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 13;
                }
                break;
            case 1014959530:
                if (!str.equals(m1949(new int[]{95, 16, 154, 0}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001", false).intern())) {
                    b10 = -1;
                } else {
                    b10 = 18;
                }
                break;
            case 1076166944:
                if (!str.equals(m1940("⛂鞝⚥謨ビ䙀씊뎂먜퐯恋퐙ῳ睨ೣ棐\uf0a2", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    int i21 = f1723 + 31;
                    f1726 = i21 % 128;
                    b10 = (i21 % 2 != 0 ? (char) 23 : 'C') == 23 ? (byte) 95 : (byte) 9;
                }
                break;
            case 1243605525:
                if ((str.equals(m1940("꤬\ue7caꥋ㘼䂄ᕸ砞\ue0bd㗳ꑭ\udd7d蜧逑ܨ뇦㯈罞骀ሯ\ude99", -TextUtils.indexOf((CharSequence) "", '0', 0)).intern()) ? 'a' : (char) 18) == 18) {
                    b10 = -1;
                } else {
                    b10 = 17;
                }
                break;
            case 1330288580:
                if (!str.equals(m1940("\uee34舺\uee53奇╴环ᝥ虩狪솂눰\ue1f2휥拝", -TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case 1390601082:
                if (!str.equals(m1949(new int[]{87, 8, 47, 4}, (String) null, true).intern())) {
                    b10 = -1;
                } else {
                    b10 = 14;
                }
                break;
            case 1799130848:
                if (!(str.equals(m1949(new int[]{22, 15, 40, 1}, (String) null, true).intern()))) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case 1850298156:
                if (!str.equals(m1949(new int[]{52, 13, 160, 6}, (String) null, true).intern())) {
                    b10 = -1;
                } else {
                    int i22 = f1723 + 67;
                    f1726 = i22 % 128;
                    b10 = i22 % 2 == 0 ? (byte) 8 : (byte) 118;
                }
                break;
            case 1951713542:
                if (!str.equals(m1940("騥\uf217驂嗢啙仔ᯀ묑ۺ놰뺩\udc9d", -ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 15;
                }
                break;
            case 1984415776:
                if (!str.equals(m1949(new int[]{0, 7, 118, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001", false).intern())) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                m1947((String) cz.m1851(list, 0, String.class));
                return null;
            case 1:
                return m1946();
            case 2:
                m1945((String) cz.m1851(list, 0, String.class));
                return null;
            case 3:
                return m1944();
            case 4:
                m1943((String) cz.m1851(list, 0, String.class));
                return null;
            case 5:
                return m1948();
            case 6:
                m1950((String) cz.m1851(list, 0, String.class));
                return null;
            case 7:
                return m1939();
            case 8:
                m1941((String) cz.m1851(list, 0, String.class));
                return null;
            case 9:
                return m1942();
            case 10:
                m1932((String) cz.m1851(list, 0, String.class));
                return null;
            case 11:
                return m1933();
            case 12:
                m1934((String) cz.m1851(list, 0, String.class));
                return null;
            case 13:
                return m1929();
            case 14:
                m1930((String) cz.m1851(list, 0, String.class));
                return null;
            case 15:
                return m1931();
            case 16:
                m1936((String) cz.m1851(list, 0, String.class));
                return null;
            case 17:
                return m1937();
            case 18:
                m1938((String) cz.m1851(list, 0, String.class));
                return null;
            case 19:
                return m1935();
            case 20:
                m1926((String) cz.m1851(list, 0, String.class));
                return null;
            case 21:
                return m1927();
            case 22:
                m1928((String) cz.m1851(list, 0, String.class));
                return null;
            case 23:
                return m1924();
            case 24:
                return m1925();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1940(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2284) {
            char[] cArrM2243 = h.m2243(f1725, cArr, i10);
            h.f2285 = 4;
            while (true) {
                int i11 = h.f2285;
                if (i11 < cArrM2243.length) {
                    h.f2283 = i11 - 4;
                    int i12 = h.f2285;
                    cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f1725));
                    h.f2285++;
                } else {
                    str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                }
            }
        }
        return str2;
    }
}
