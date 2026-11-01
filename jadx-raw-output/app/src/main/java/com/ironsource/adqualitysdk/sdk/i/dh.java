package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class dh {

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static int f1702 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1705;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private Map<String, dn> f1707;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private dp f1708;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String f1709;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private du f1710;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String f1711;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String f1712;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private du f1713;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private JSONObject f1714;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1715;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1716;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1717;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char[] f1704 = {'@', 'y', 'y', '{', '2', 'i', 'g', 'W', 'c', 'm', 'f', 'n', 'q', 'n', 'f', '6', 'k', 'k', '`', '[', 'g', '9', 's', 's', 'p', 'n', 'Y', 'W', 'f', 'a', 'h', 'm', 'i', '2', 'c', '\\', '_', 'g', 'n', '`', '^', 'u', '9', 'k', 'i', 'i', 'l', 's', 'n', 'j', 'o'};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char[] f1706 = {29873, 5452, 46953, 20862, 62230, 40206, 16189, 5511, 29797, 54862, 12403, 37430, 64551, 'E', 24988, 50094, 9637, 34762, 59782, 19447, 44528, 3861, 28991, 54072, 13651, 38726, 63857, 23332, 48273, 7823, 32928, 58066, 17615, 42747, 2290, 27163, 52240, 11888, 36957, 62019, 21620, 46702, 6047, 31107, 34882, 59808, 19347, 44440, 4077, 25076, 'm', 24971, 50097, 9640, 34781, 59860, 19431, 's', 24970, 50103, 9630, 34775, 59879, 19443, 44519, 3870, 28970, 54042, 13663, 38746, 63845, 23405, 48285, 7822, 32957};

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static long f1703 = 5635646060697444846L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1911(dh dhVar) {
        int i10 = f1702;
        int i11 = i10 + 59;
        f1705 = i11 % 128;
        int i12 = i11 % 2;
        String str = dhVar.f1716;
        int i13 = i10 + 31;
        f1705 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1913(JSONObject jSONObject) {
        int i10 = f1705 + 21;
        f1702 = i10 % 128;
        if ((i10 % 2 == 0 ? '>' : '*') == '>') {
            jSONObject.keys();
            throw null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            if (!(itKeys.hasNext())) {
                return;
            }
            int i11 = f1705 + 9;
            f1702 = i11 % 128;
            if (i11 % 2 == 0) {
                String next = itKeys.next();
                this.f1713.m2109(next, jSONObject.opt(next));
                throw null;
            }
            String next2 = itKeys.next();
            this.f1713.m2109(next2, jSONObject.opt(next2));
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m1920() {
        int i10 = f1705;
        int i11 = i10 + 125;
        f1702 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f1716;
        int i13 = i10 + 53;
        f1702 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 11 : '4') == '4') {
            return str;
        }
        throw null;
    }

    public dh(String str, du duVar) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            this.f1714 = jSONObjectJsonObjectInit;
            this.f1713 = duVar;
            this.f1716 = jSONObjectJsonObjectInit.optString(m1912(new int[]{0, 4, 18, 0}, "\u0000\u0001\u0000\u0000", false).intern());
            this.f1715 = this.f1714.optString(m1912(new int[]{4, 11, 0, 0}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", true).intern());
            this.f1717 = this.f1714.optString(m1910(ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (29895 - (Process.myPid() >> 22)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7).intern());
            this.f1711 = this.f1714.optString(m1912(new int[]{15, 6, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001", false).intern());
            this.f1709 = this.f1714.optString(m1910(7 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.getOffsetAfter("", 0) + 5610), View.MeasureSpec.getMode(0) + 6).intern());
            if (this.f1714.has(m1912(new int[]{21, 12, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", true).intern())) {
                m1913(this.f1714.optJSONObject(m1912(new int[]{21, 12, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", true).intern()));
            }
        } catch (Throwable th2) {
            co.m1623(this.f1716, m1910(ExpandableListView.getPackedPositionGroup(0L) + 13, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 31 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), th2);
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Map<String, dn> m1914() {
        int i10 = f1702 + 31;
        f1705 = i10 % 128;
        int i11 = i10 % 2;
        if (this.f1707 == null) {
            this.f1707 = jz.m2797(this.f1714.optJSONObject(m1912(new int[]{42, 9, 0, 8}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", true).intern()), new jz.c<dn>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.1
                @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
                /* JADX INFO: renamed from: ﻛ */
                public final /* synthetic */ dn mo549(JSONObject jSONObject, String str) {
                    return new dn(dh.m1911(dh.this), str, jSONObject.optJSONObject(str));
                }
            });
        }
        Map<String, dn> map = this.f1707;
        int i12 = f1705 + 17;
        f1702 = i12 % 128;
        int i13 = i12 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final du m1915() {
        int i10 = f1702 + 81;
        f1705 = i10 % 128;
        if ((i10 % 2 != 0 ? '\f' : '\r') != '\r') {
            throw null;
        }
        if (this.f1710 == null) {
            du duVar = new du(jz.m2797(this.f1714.optJSONObject(m1910((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34850), 6 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()), new jz.c<Object>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.2

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static int f1719 = 1;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static char[] f1720 = {'q', '>', 't', 'u', '~', 'z', 'w', 'v', 'O', '>', 'g', '~', '|', '|', 'U', '9', 'p', 'n', 'i', 'A', ' ', '-', 'W'};

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static int f1721;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m1923(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
                    String str2;
                    Object bytes = str;
                    if (str != null) {
                        bytes = str.getBytes("ISO-8859-1");
                    }
                    byte[] bArr = (byte[]) bytes;
                    synchronized (i.f2448) {
                        int i11 = iArr[0];
                        int i12 = iArr[1];
                        int i13 = iArr[2];
                        int i14 = iArr[3];
                        char[] cArr = new char[i12];
                        System.arraycopy(f1720, i11, cArr, 0, i12);
                        if (bArr != null) {
                            char[] cArr2 = new char[i12];
                            i.f2447 = 0;
                            char c10 = 0;
                            while (true) {
                                int i15 = i.f2447;
                                if (i15 >= i12) {
                                    break;
                                }
                                if (bArr[i15] == 1) {
                                    cArr2[i15] = (char) (((cArr[i15] << 1) + 1) - c10);
                                } else {
                                    cArr2[i15] = (char) ((cArr[i15] << 1) - c10);
                                }
                                c10 = cArr2[i15];
                                i.f2447 = i15 + 1;
                            }
                            cArr = cArr2;
                        }
                        if (i14 > 0) {
                            char[] cArr3 = new char[i12];
                            System.arraycopy(cArr, 0, cArr3, 0, i12);
                            int i16 = i12 - i14;
                            System.arraycopy(cArr3, 0, cArr, i16, i14);
                            System.arraycopy(cArr3, i14, cArr, 0, i16);
                        }
                        if (z10) {
                            char[] cArr4 = new char[i12];
                            i.f2447 = 0;
                            while (true) {
                                int i17 = i.f2447;
                                if (i17 >= i12) {
                                    break;
                                }
                                cArr4[i17] = cArr[(i12 - i17) - 1];
                                i.f2447 = i17 + 1;
                            }
                            cArr = cArr4;
                        }
                        if (i13 > 0) {
                            i.f2447 = 0;
                            while (true) {
                                int i18 = i.f2447;
                                if (i18 >= i12) {
                                    break;
                                }
                                cArr[i18] = (char) (cArr[i18] - iArr[2]);
                                i.f2447 = i18 + 1;
                            }
                        }
                        str2 = new String(cArr);
                    }
                    return str2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
                /* JADX INFO: renamed from: ﻛ */
                public final Object mo549(JSONObject jSONObject, String str) {
                    int i11 = f1719 + 71;
                    f1721 = i11 % 128;
                    int i12 = i11 % 2;
                    try {
                        String strOptString = jSONObject.optString(str);
                        if (jSONObject.opt(str) instanceof String) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m1923(new int[]{0, 1, 193, 0}, "\u0001", true).intern());
                            sb2.append(strOptString);
                            sb2.append(m1923(new int[]{0, 1, 193, 0}, "\u0001", true).intern());
                            strOptString = sb2.toString();
                            int i13 = f1721 + 47;
                            f1719 = i13 % 128;
                            int i14 = i13 % 2;
                        }
                        String strM1911 = dh.m1911(dh.this);
                        return new dq(strM1911, strOptString).m2079(dt.m2099(strM1911, strOptString, strOptString));
                    } catch (Throwable th2) {
                        String strM1912 = dh.m1911(dh.this);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m1923(new int[]{1, 14, 12, 8}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000", false).intern());
                        sb3.append(str);
                        sb3.append(m1923(new int[]{15, 8, 0, 5}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000", true).intern());
                        sb3.append(jSONObject.optString(str));
                        co.m1623(strM1912, sb3.toString(), th2);
                        return null;
                    }
                }
            }), this.f1713, true);
            this.f1710 = duVar;
            duVar.m2107(jz.m2805(this.f1714.optJSONArray(m1910(50 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) View.resolveSizeAndState(0, 0, 0), (Process.myTid() >> 22) + 7).intern()), new jz.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.4
                @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
                /* JADX INFO: renamed from: ﾒ */
                public final /* synthetic */ String mo550(JSONArray jSONArray, int i11) {
                    return dz.m2133(jSONArray.optString(i11));
                }
            }));
            int i11 = f1705 + 57;
            f1702 = i11 % 128;
            int i12 = i11 % 2;
        }
        return this.f1710;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0022  */
    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final dp m1916() {
        int i10 = f1702 + 63;
        f1705 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 6 : 'C') != 'C') {
            int i11 = 60 / 0;
            if (this.f1708 == null) {
                this.f1708 = new dp(this.f1714.optJSONObject(m1912(new int[]{33, 9, 0, 8}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000", false).intern()));
                int i12 = f1705 + 67;
                f1702 = i12 % 128;
                int i13 = i12 % 2;
            }
        } else if (this.f1708 == null) {
            this.f1708 = new dp(this.f1714.optJSONObject(m1912(new int[]{33, 9, 0, 8}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000", false).intern()));
            int i14 = f1705 + 67;
            f1702 = i14 % 128;
            int i15 = i14 % 2;
        }
        return this.f1708;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m1917() {
        int i10 = f1705;
        int i11 = i10 + 57;
        f1702 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f1711;
        int i13 = i10 + 87;
        f1702 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 11 : '@') != 11) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m1918() {
        int i10 = f1702 + 1;
        f1705 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1709;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m1921(String str) {
        Map<String, String> mapM2802;
        int i10 = f1705 + 101;
        f1702 = i10 % 128;
        int i11 = i10 % 2;
        if ((this.f1712 == null ? '(' : '+') != '+' && (mapM2802 = jz.m2802(this.f1714.optJSONObject(m1910(TextUtils.lastIndexOf("", '0', 0, 0) + 58, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 18 - Color.green(0)).intern()))) != null) {
            ArrayList arrayList = new ArrayList(mapM2802.keySet());
            Collections.sort(arrayList, new Comparator<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.5
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(String str2, String str3) {
                    return kc.m2859(str2, str3);
                }
            });
            String str2 = null;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!(it.hasNext())) {
                    break;
                }
                String str3 = (String) it.next();
                if (kc.m2859(str, str3) >= 0) {
                    int i12 = f1702 + 39;
                    f1705 = i12 % 128;
                    int i13 = i12 % 2;
                    str2 = mapM2802.get(str3);
                    int i14 = f1705 + 123;
                    f1702 = i14 % 128;
                    int i15 = i14 % 2;
                }
                int i16 = f1702 + 103;
                f1705 = i16 % 128;
                int i17 = i16 % 2;
            }
            this.f1712 = str2;
        }
        return this.f1712;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m1922() {
        int i10 = f1702 + 117;
        f1705 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 2 : 'Z') != 2) {
            return this.f1717;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1910(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1706[i10 + i12]) ^ (((long) i12) * f1703)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m1919() {
        int i10 = f1705 + 43;
        int i11 = i10 % 128;
        f1702 = i11;
        int i12 = i10 % 2;
        String str = this.f1715;
        int i13 = i11 + 107;
        f1705 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return str;
        }
        int i14 = 50 / 0;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1912(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
            System.arraycopy(f1704, i10, cArr, 0, i11);
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
}
