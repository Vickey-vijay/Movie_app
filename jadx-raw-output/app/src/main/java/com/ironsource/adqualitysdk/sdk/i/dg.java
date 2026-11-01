package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class dg extends cz implements cl {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1688 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1689 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f1695 = 5;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private hl f1697;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1698;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1699;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1700;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f1694 = {'g', 'e', 't', 'A', 'd', 'v', 'r', 'i', 's', 'I', 'T', 'y', 'p', 'D', 'U', 'l', 'F', 'n', 'a', 'S', 'o', 'u', 'c', 'J', 'h'};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char f1691 = 13929;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f1692 = 61044;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f1690 = 12544;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f1693 = 50637;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final JSONObject f1701 = IronSourceVideoBridge.jsonObjectInit();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final List<String> f1696 = new ArrayList();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String m1888() {
        int i10 = f1689 + 19;
        f1688 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = this.f1701.optString(ih.f2525);
        int i12 = f1689 + 39;
        f1688 = i12 % 128;
        int i13 = i12 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m1891(String str) {
        int i10 = f1689 + 87;
        f1688 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f1701.put(ih.f2520, str);
            int i12 = f1688 + 25;
            f1689 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 7 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m1893(String str) {
        int i10 = f1689 + 109;
        f1688 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f1701.put(ih.f2529, str);
            int i12 = f1689 + 117;
            f1688 = i12 % 128;
            int i13 = i12 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1897(String str) {
        int i10 = f1689;
        int i11 = i10 + 109;
        f1688 = i11 % 128;
        int i12 = i11 % 2;
        this.f1700 = str;
        int i13 = i10 + 21;
        f1688 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1899(String str) {
        int i10 = f1688 + 73;
        int i11 = i10 % 128;
        f1689 = i11;
        char c10 = i10 % 2 == 0 ? '9' : 'B';
        this.f1699 = str;
        if (c10 != 'B') {
            throw null;
        }
        int i12 = i11 + 107;
        f1688 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m1900() {
        int i10 = f1688;
        int i11 = i10 + 43;
        f1689 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f1699;
        int i13 = i10 + 45;
        f1689 = i13 % 128;
        if ((i13 % 2 == 0 ? 'I' : 'a') == 'a') {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1906(String str) {
        int i10 = f1689;
        int i11 = i10 + 45;
        f1688 = i11 % 128;
        boolean z10 = i11 % 2 == 0;
        this.f1698 = str;
        if (!z10) {
            throw null;
        }
        int i12 = i10 + 41;
        f1688 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private hl m1907() {
        int i10 = f1689 + 21;
        int i11 = i10 % 128;
        f1688 = i11;
        int i12 = i10 % 2;
        hl hlVar = this.f1697;
        int i13 = i11 + 29;
        f1689 = i13 % 128;
        int i14 = i13 % 2;
        return hlVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private Object m1886() {
        boolean z10;
        if (TextUtils.isEmpty(this.f1699)) {
            int i10 = f1688 + 39;
            f1689 = i10 % 128;
            int i11 = i10 % 2;
            if (TextUtils.isEmpty(this.f1698)) {
                if (TextUtils.isEmpty(this.f1700)) {
                    int i12 = f1688 + 65;
                    f1689 = i12 % 128;
                    if (i12 % 2 == 0) {
                        this.f1696.size();
                        throw null;
                    }
                    z10 = this.f1696.size() <= 0 ? false : true;
                }
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        int i13 = f1688 + 105;
        f1689 = i13 % 128;
        if ((i13 % 2 == 0 ? ' ' : (char) 21) != ' ') {
            return boolValueOf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m1889(String str) {
        int i10 = f1688 + 23;
        f1689 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f1701.put(ih.f2525, str);
            int i12 = f1688 + 41;
            f1689 = i12 % 128;
            if ((i12 % 2 == 0 ? (char) 30 : ';') == ';') {
            } else {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m1894() {
        int i10 = f1688 + 75;
        f1689 = i10 % 128;
        if ((i10 % 2 == 0 ? '4' : '/') == '/') {
            return this.f1701.optString(ih.f2530);
        }
        int i11 = 73 / 0;
        return this.f1701.optString(ih.f2530);
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Object m1895() {
        int i10 = f1688 + 3;
        f1689 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = this.f1701.optString(ih.f2529);
        int i12 = f1689 + 35;
        f1688 = i12 % 128;
        int i13 = i12 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<String> m1896() {
        int i10 = f1689;
        int i11 = i10 + 63;
        f1688 = i11 % 128;
        if ((i11 % 2 != 0 ? 'A' : (char) 6) != 6) {
            throw null;
        }
        List<String> list = this.f1696;
        int i12 = i10 + 67;
        f1688 = i12 % 128;
        int i13 = i12 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m1898() {
        String str;
        int i10 = f1689 + 23;
        int i11 = i10 % 128;
        f1688 = i11;
        if (!(i10 % 2 == 0)) {
            str = this.f1698;
            int i12 = 19 / 0;
        } else {
            str = this.f1698;
        }
        int i13 = i11 + 51;
        f1689 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1901(hl hlVar) {
        int i10 = f1689;
        int i11 = i10 + 83;
        f1688 = i11 % 128;
        int i12 = i11 % 2;
        this.f1697 = hlVar;
        int i13 = i10 + 5;
        f1688 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m1904() {
        int i10 = f1688;
        int i11 = i10 + 61;
        f1689 = i11 % 128;
        if ((i11 % 2 == 0 ? (char) 24 : (char) 2) == 24) {
            throw null;
        }
        String str = this.f1700;
        int i12 = i10 + 27;
        f1689 = i12 % 128;
        if ((i12 % 2 == 0 ? '(' : (char) 21) == 21) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1909(String str) {
        int i10 = f1689 + 41;
        f1688 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f1701.put(ih.f2530, str);
            int i12 = f1688 + 15;
            f1689 = i12 % 128;
            int i13 = i12 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1902(String str) {
        int i10 = f1688 + 23;
        f1689 = i10 % 128;
        int i11 = i10 % 2;
        if ((!TextUtils.isEmpty(str) ? '9' : (char) 7) != '9') {
            return;
        }
        if ((!this.f1696.contains(str) ? (char) 21 : 'Q') != 21) {
            return;
        }
        int i12 = f1689 + 11;
        f1688 = i12 % 128;
        if (i12 % 2 == 0) {
            this.f1696.add(str);
            return;
        }
        this.f1696.add(str);
        try {
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1905(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            char[] cArr2 = f1694;
            char c10 = f1695;
            char[] cArr3 = new char[i10];
            if (i10 % 2 != 0) {
                i10--;
                cArr3[i10] = (char) (cArr[i10] - b10);
            }
            if (i10 > 1) {
                g.f2134 = 0;
                while (true) {
                    int i11 = g.f2134;
                    if (i11 >= i10) {
                        break;
                    }
                    g.f2133 = cArr[i11];
                    g.f2131 = cArr[g.f2134 + 1];
                    if (g.f2133 == g.f2131) {
                        cArr3[g.f2134] = (char) (g.f2133 - b10);
                        cArr3[g.f2134 + 1] = (char) (g.f2131 - b10);
                    } else {
                        g.f2132 = g.f2133 / c10;
                        g.f2130 = g.f2133 % c10;
                        g.f2135 = g.f2131 / c10;
                        g.f2128 = g.f2131 % c10;
                        if (g.f2130 == g.f2128) {
                            g.f2132 = ((g.f2132 + c10) - 1) % c10;
                            g.f2135 = ((g.f2135 + c10) - 1) % c10;
                            int i12 = (g.f2132 * c10) + g.f2130;
                            int i13 = (g.f2135 * c10) + g.f2128;
                            int i14 = g.f2134;
                            cArr3[i14] = cArr2[i12];
                            cArr3[i14 + 1] = cArr2[i13];
                        } else if (g.f2132 == g.f2135) {
                            g.f2130 = ((g.f2130 + c10) - 1) % c10;
                            g.f2128 = ((g.f2128 + c10) - 1) % c10;
                            int i15 = (g.f2132 * c10) + g.f2130;
                            int i16 = (g.f2135 * c10) + g.f2128;
                            int i17 = g.f2134;
                            cArr3[i17] = cArr2[i15];
                            cArr3[i17 + 1] = cArr2[i16];
                        } else {
                            int i18 = (g.f2132 * c10) + g.f2128;
                            int i19 = (g.f2135 * c10) + g.f2130;
                            int i20 = g.f2134;
                            cArr3[i20] = cArr2[i18];
                            cArr3[i20 + 1] = cArr2[i19];
                        }
                    }
                    g.f2134 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x022b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0323  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo812(String str, List<Object> list, ch chVar) {
        byte b10 = 13;
        switch (str.hashCode()) {
            case -2118395364:
                if (!str.equals(m1905("\u0001\u0002\u0003\u0004\u0000\t\u0006\u000b\u0007\f\u0006\u0003\u0007\u0005\u0087", 15 - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (35 - (Process.myPid() >> 22))).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f1689 + 37;
                    f1688 = i10 % 128;
                    if (i10 % 2 == 0) {
                        b10 = 0;
                    } else {
                        b10 = 1;
                    }
                }
                break;
            case -1836320845:
                if (!str.equals(m1905("\u0013\u0003\t\u0018\u0015\u0016\u0007\u0015\u0004\u000b\u0005\u0010", 12 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (TextUtils.getOffsetBefore("", 0) + 55)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 9;
                }
                break;
            case -1700761801:
                if (!str.equals(m1905("\u0001\u0002\u0003\f\u0003\u0006\u0004\f\u0005\u0010", 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) (2 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case -1409157227:
                if ((str.equals(m1908("丿礽ᆢ뤾쿰즸\uf31a싅茄姾뀹刡⛧욵", 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()) ? (char) 30 : ':') == ':') {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case -1296571754:
                if ((str.equals(m1905("\u0006\u0003\u0001\u0011\f\u0016\u0013\u0010\u000b\t\u0010\u000f\u0015\u0016\u0007\u0015\u008e", 17 - View.resolveSizeAndState(0, 0, 0), (byte) (40 - TextUtils.indexOf((CharSequence) "", '0'))).intern()) ? (char) 26 : '/') == '/') {
                    b10 = -1;
                } else {
                    int i11 = f1689 + 105;
                    f1688 = i11 % 128;
                    b10 = i11 % 2 == 0 ? (byte) 16 : (byte) 89;
                }
                break;
            case -1247838300:
                if (!str.equals(m1908("丿礽ࡉꦮ춼㍔ᬵ巏\uedfeൽ䝿☉쬵構쿰즸\uf31a싅Ꭲ䣾㬔ꟸ磅ﶗ", 22 - Process.getGidForName("")).intern())) {
                    b10 = -1;
                } else {
                    b10 = 19;
                }
                break;
            case -1207642840:
                if (!str.equals(m1908("䝿☉ࡉꦮ춼㍔ᬵ巏\uedfeൽ䝿☉ꙧꅣ쀬ਨ", 14 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case -1091371232:
                if (!str.equals(m1905("\u0013\u0003\t\u0018\u0015\u0016\u0007\u0015\u0004\u000b\u0005\u0010ê", 13 - View.getDefaultSize(0, 0), (byte) (Color.argb(0, 0, 0, 0) + 119)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case -869156349:
                if (!str.equals(m1905("\u0000\u0016\u0003\r\u0016\u000f", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 73)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 21;
                }
                break;
            case -772930430:
                if (!str.equals(m1905("\u0006\u0003\u0003\u0004\u0000\t\u0006\u000b\u0007\f\u0006\u0003\u0007\u0005\u0000\u000e\f\r~", KeyEvent.getDeadChar(0, 0) + 19, (byte) (View.resolveSizeAndState(0, 0, 0) + 25)).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f1688 + 119;
                    f1689 = i12 % 128;
                    int i13 = i12 % 2;
                    b10 = 3;
                }
                break;
            case -407028174:
                if (!str.equals(m1905("\u0001\u0002\u0003\f\u0003\u0006\u0004\f\u0005\u0010\u000f\u0018\u0001\u000b\u0015\u0002", 16 - KeyEvent.keyCodeFromString(""), (byte) (View.resolveSizeAndState(0, 0, 0) + 100)).intern())) {
                    b10 = -1;
                }
                break;
            case -356418934:
                if (!str.equals(m1905("\u0001\u0002\u0001\u0011\f\u0016\u0013\u0010\u000b\t\u0010\u000f\u0015\u0016\u0007\u0015¡", (ViewConfiguration.getPressedStateDuration() >> 16) + 17, (byte) (60 - (ViewConfiguration.getTapTimeout() >> 16))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 15;
                }
                break;
            case -140869031:
                if (!str.equals(m1908("丿礽ᆢ뤾쿰즸\uf31a싅茄姾뀹刡诊篩昦嘜䜧\u1adf", 17 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 17;
                }
                break;
            case 205499235:
                if (!str.equals(m1905("\u0006\u0003\u0003\u0004\u0000\t\u0006\u000b\u0007\f\u0006\u0003\u0007\u0005\t\u0018\u0015\u0016\u0007\u0015y", AndroidCharacter.getMirror('0') - 27, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 20)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 12;
                }
                break;
            case 236043435:
                if (!(!str.equals(m1908("䝿☉\u2fec쀰殓\ue1a8㹝咪뀹刡", 10 - TextUtils.indexOf("", "", 0, 0)).intern()))) {
                    int i14 = f1689 + 33;
                    f1688 = i14 % 128;
                    int i15 = i14 % 2;
                    b10 = 5;
                } else {
                    b10 = -1;
                }
                break;
            case 770797430:
                if (!str.equals(m1908("丿礽ࡉꦮ춼㍔ᬵ巏\uedfeൽ䝿☉ꙧꅣ\ue72a\uefe3\ufddc\uf59c㡣챪", 19 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 779164621:
                if (!str.equals(m1908("䝿☉ᆢ뤾쿰즸\uf31a싅茄姾뀹刡诊篩昦嘜䜧\u1adf", 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 18;
                }
                break;
            case 1308044955:
                if (!str.equals(m1905("\u0006\u0003\u0001\u0011\f\u0016\u0013\u0010\u000b\t\u0091", 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (KeyEvent.getDeadChar(0, 0) + 37)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 1396624783:
                if (!str.equals(m1908("丿礽\ud812┼꺣䁇\udb13錴\u07bb躇窩䆠", Color.argb(0, 0, 0, 0) + 11).intern())) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case 1924460979:
                if ((str.equals(m1908("⩍ｭ蟙\uf1b2춼㍔ᬵ巏\uedfeൽ䝿☉ꙧꅣꌴ떠貖犙", Color.alpha(0) + 17).intern()) ? ']' : '\r') == '\r') {
                    b10 = -1;
                } else {
                    b10 = 20;
                }
                break;
            case 1964255575:
                if (!str.equals(m1905("\u0001\u0002\u0003\u0004\u0000\t\u0006\u000b\u0007\f\u0006\u0003\u0007\u0005\t\u0018\u0015\u0016\u0007\u0015Â", 22 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (Color.green(0) + 93)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case 2056496294:
                if ((str.equals(m1908("䝿☉\u2fec쀰殓\ue1a8㹝咪뀹刡诊篩昦嘜䜧\u1adf", 15 - ExpandableListView.getPackedPositionChild(0L)).intern()) ? '/' : '!') == '/') {
                    b10 = 14;
                } else {
                    b10 = -1;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return m1900();
            case 1:
                m1899((String) cz.m1851(list, 0, String.class));
                return null;
            case 2:
                if (!(m1907() == null)) {
                    return Integer.valueOf(m1907().m2263());
                }
                return null;
            case 3:
                m1901(hl.m2260(((Integer) cz.m1851(list, 0, Integer.class)).intValue()));
                return null;
            case 4:
                return m1898();
            case 5:
                m1906((String) cz.m1851(list, 0, String.class));
                return null;
            case 6:
                return m1904();
            case 7:
                m1897((String) cz.m1851(list, 0, String.class));
                return null;
            case 8:
                return m1896();
            case 9:
                m1902((String) cz.m1851(list, 0, String.class));
                return null;
            case 10:
                m1903((List<String>) cz.m1851(list, 0, List.class));
                return null;
            case 11:
                return m1894();
            case 12:
                m1909((String) cz.m1851(list, 0, String.class));
                return null;
            case 13:
                return m1888();
            case 14:
                m1889((String) cz.m1851(list, 0, String.class));
                int i16 = f1689 + 75;
                f1688 = i16 % 128;
                int i17 = i16 % 2;
                return null;
            case 15:
                return m1895();
            case 16:
                m1893((String) cz.m1851(list, 0, String.class));
                return null;
            case 17:
                return m1892();
            case 18:
                m1891((String) cz.m1851(list, 0, String.class));
                return null;
            case 19:
                return m1890();
            case 20:
                return m1886();
            case 21:
                return m1887();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private JSONObject m1890() {
        JSONObject jSONObject;
        int i10 = f1689 + 113;
        int i11 = i10 % 128;
        f1688 = i11;
        if (!(i10 % 2 != 0)) {
            jSONObject = this.f1701;
        } else {
            jSONObject = this.f1701;
            int i12 = 69 / 0;
        }
        int i13 = i11 + 61;
        f1689 = i13 % 128;
        int i14 = i13 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m1892() {
        int i10 = f1688 + 1;
        f1689 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = this.f1701.optString(ih.f2520);
        int i12 = f1688 + 71;
        f1689 = i12 % 128;
        if (i12 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private JSONObject m1887() {
        char c10;
        boolean z10;
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            String str = this.f1699;
            if (str != null) {
                if (this.f1697 != null) {
                    c10 = 4;
                } else {
                    c10 = '[';
                }
                if (c10 == 4) {
                    int i10 = f1689 + 45;
                    f1688 = i10 % 128;
                    if (i10 % 2 != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        jSONObjectJsonObjectInit.putOpt(ih.f2530, str);
                        jSONObjectJsonObjectInit.putOpt(ih.f2532, Integer.valueOf(this.f1697.m2263()));
                    } else {
                        jSONObjectJsonObjectInit.putOpt(ih.f2530, str);
                        jSONObjectJsonObjectInit.putOpt(ih.f2532, Integer.valueOf(this.f1697.m2263()));
                        throw null;
                    }
                }
            }
            jSONObjectJsonObjectInit.putOpt(ih.f2525, this.f1698);
            jSONObjectJsonObjectInit.putOpt(ih.f2529, this.f1700);
            if (this.f1696.size() > 0) {
                jSONObjectJsonObjectInit.putOpt(ih.f2520, new JSONArray((Collection) this.f1696));
                int i11 = f1688 + 85;
                f1689 = i11 % 128;
                int i12 = i11 % 2;
            }
            if (this.f1701.length() > 0) {
                int i13 = f1688 + 115;
                f1689 = i13 % 128;
                int i14 = i13 % 2;
                jSONObjectJsonObjectInit.putOpt(ih.f2533, this.f1701.toString());
            }
        } catch (JSONException unused) {
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1908(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1691)) ^ ((c11 >>> 5) + f1690)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1692) ^ ((c12 + i12) ^ ((c12 << 4) + f1693))));
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1903(List<String> list) {
        int i10 = f1688 + 41;
        f1689 = i10 % 128;
        if (i10 % 2 != 0) {
            Iterator<String> it = list.iterator();
            while (true) {
                if (!(it.hasNext())) {
                    break;
                }
                int i11 = f1689 + 123;
                f1688 = i11 % 128;
                int i12 = i11 % 2;
                m1902(it.next());
            }
            int i13 = f1688 + 63;
            f1689 = i13 % 128;
            if ((i13 % 2 == 0 ? '.' : '?') != '.') {
                return;
            } else {
                throw null;
            }
        }
        list.iterator();
        throw null;
    }
}
