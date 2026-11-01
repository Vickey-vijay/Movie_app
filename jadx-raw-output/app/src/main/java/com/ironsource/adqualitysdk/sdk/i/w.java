package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class w<K, T> implements r<K, T> {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f3154 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f3155 = 40555;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f3156 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f3157 = 25658;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f3158 = 61114;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f3159 = 36;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f3160 = 15383;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private r<K, T> f3161;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private r<K, T> f3162 = new r<K, T>() { // from class: com.ironsource.adqualitysdk.sdk.i.w.5
        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﻐ */
        public final void mo1703(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﻐ */
        public final void mo1704(JSONObject jSONObject, K k10, Object obj, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﻛ */
        public final void mo1706(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ｋ */
        public final void mo262(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ｋ */
        public final void mo1709(JSONObject jSONObject, K k10, Object obj, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﾇ */
        public final void mo1712(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﾇ */
        public final void mo1713(JSONObject jSONObject, K k10, Object obj, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﾒ */
        public final void mo267(JSONObject jSONObject, K k10, T t10) {
        }
    };

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private r<K, T> m3049() {
        int i10 = f3156 + 55;
        int i11 = i10 % 128;
        f3154 = i11;
        if ((i10 % 2 == 0 ? '#' : (char) 21) != 21) {
            throw null;
        }
        r<K, T> rVar = this.f3161;
        if (rVar == null) {
            return this.f3162;
        }
        int i12 = i11 + 81;
        f3156 = i12 % 128;
        int i13 = i12 % 2;
        return rVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﻐ */
    public final void mo1704(JSONObject jSONObject, K k10, Object obj, T t10) {
        int i10 = f3154 + 49;
        f3156 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM3048 = m3048(jSONObject, t10);
        m3046(m3047("ﵲ戴\ufd4cꋶ俹\uef46犯摎∜\ue85a⽘龃", 10 - TextUtils.indexOf((CharSequence) "", '0')).intern(), jSONObjectM3048);
        m3049().mo1704(jSONObjectM3048, k10, obj, t10);
        int i12 = f3156 + 105;
        f3154 = i12 % 128;
        if ((i12 % 2 == 0 ? '/' : '.') == '.') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m3051(r<K, T> rVar) {
        int i10 = f3156;
        int i11 = i10 + 9;
        f3154 = i11 % 128;
        int i12 = i11 % 2;
        this.f3161 = rVar;
        int i13 = i10 + 75;
        f3154 = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ｋ */
    public void mo262(JSONObject jSONObject, K k10, T t10) {
        int i10 = f3154 + 77;
        f3156 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM3048 = m3048(jSONObject, t10);
        m3046(m3050(Process.getGidForName("") + 14, TextUtils.indexOf((CharSequence) "", '0') + 130, TextUtils.indexOf((CharSequence) "", '0') + 3, "\u0007￤\uffdd\u0007\b\u001c\u0004\u000f\u0013\u0016\f\u0007ￃ", true).intern(), jSONObjectM3048);
        m3049().mo262(jSONObjectM3048, k10, t10);
        int i12 = f3156 + 93;
        f3154 = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        int i13 = 53 / 0;
    }

    /* JADX INFO: renamed from: ﾇ */
    public abstract String mo263(T t10);

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾇ */
    public final void mo1713(JSONObject jSONObject, K k10, Object obj, T t10) {
        int i10 = f3154 + 7;
        f3156 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM3048 = m3048(jSONObject, t10);
        m3046(m3050((ViewConfiguration.getFadingEdgeLength() >> 16) + 19, TextUtils.getOffsetAfter("", 0) + 125, 14 - Color.argb(0, 0, 0, 0), "\u0010\n\u0012\f\u000bￇ\r\u0019\u0016\u0014ￇ\u0011\u001a￡￨\u000bￇ\n\u0013", false).intern(), jSONObjectM3048);
        m3049().mo1713(jSONObjectM3048, k10, obj, t10);
        int i12 = f3156 + 89;
        f3154 = i12 % 128;
        if ((i12 % 2 == 0 ? ':' : (char) 29) != ':') {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﻛ */
    public final void mo1706(JSONObject jSONObject, K k10, T t10) {
        int i10 = f3156 + 51;
        f3154 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM3048 = m3048(jSONObject, t10);
        m3046(m3050(8 - TextUtils.lastIndexOf("", '0', 0, 0), 128 - View.MeasureSpec.getMode(0), 4 - (Process.myTid() >> 22), "\u0007ￄ\b￥\b\t\u0017\u0013\u0010", true).intern(), jSONObjectM3048);
        m3049().mo1706(jSONObjectM3048, k10, t10);
        int i12 = f3154 + 81;
        f3156 = i12 % 128;
        if ((i12 % 2 != 0 ? '1' : '$') == '$') {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﻐ */
    public final void mo1703(JSONObject jSONObject, K k10, T t10) {
        int i10 = f3156 + 7;
        f3154 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM3048 = m3048(jSONObject, t10);
        m3046(m3050(14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-16777083) - Color.rgb(0, 0, 0), Color.red(0) + 3, "\u0004\b\u0015\uffd9\u0003\u0004\u0007\u0002\u0000\u0013\u0013\u0000\uffbf\u0016", true).intern(), jSONObjectM3048);
        m3049().mo1703(jSONObjectM3048, k10, t10);
        int i12 = f3156 + 111;
        f3154 = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        int i13 = 91 / 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ｋ */
    public final void mo1709(JSONObject jSONObject, K k10, Object obj, T t10) {
        JSONObject jSONObjectM3048;
        int iArgb;
        int i10 = f3154 + 123;
        f3156 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 17 : (char) 25) != 17) {
            jSONObjectM3048 = m3048(jSONObject, t10);
            iArgb = 10 - Color.argb(0, 0, 0, 0);
        } else {
            jSONObjectM3048 = m3048(jSONObject, t10);
            iArgb = 34 << Color.argb(0, 0, 1, 0);
        }
        m3046(m3047("㠍샧ᧉ짼\uf5f5퉋靐䨬퐃歰", iArgb).intern(), jSONObjectM3048);
        m3049().mo1709(jSONObjectM3048, k10, obj, t10);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾇ */
    public final void mo1712(JSONObject jSONObject, K k10, T t10) {
        int i10 = f3156 + 57;
        f3154 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM3048 = m3048(jSONObject, t10);
        m3046(m3050(14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 4 - (KeyEvent.getMaxKeyCode() >> 16), "\u0004\r\u0013\uffd9￢\u0014\u0012\u0013\u000e\f\uffbf\u0004\u0015", false).intern(), jSONObjectM3048);
        m3049().mo1712(jSONObjectM3048, k10, t10);
        int i12 = f3156 + 65;
        f3154 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 69 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m3046(String str, JSONObject jSONObject) {
        String strIntern = m3050((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15, Process.getGidForName("") + Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, '<' - AndroidCharacter.getMirror('0'), "￤�\n\u0000\b\u0001\u000e￬\u000e\u000b\u0014\u0015\uffdd\u0000", false).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append(m3047("腇ឭ\uee9cऎ", ExpandableListView.getPackedPositionChild(0L) + 4).intern());
        sb2.append(str);
        k.m2822(strIntern, sb2.toString(), jSONObject);
        int i10 = f3156 + 47;
        f3154 = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾒ */
    public void mo267(JSONObject jSONObject, K k10, T t10) {
        int i10 = f3154 + 5;
        f3156 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM3048 = m3048(jSONObject, t10);
        m3046(m3050((ViewConfiguration.getPressedStateDuration() >> 16) + 19, 129 - TextUtils.lastIndexOf("", '0', 0), 4 - TextUtils.indexOf("", "", 0), "\u0016\u0014\u0003ￜ￣\u0006ￂ\u0006\u000b\u0015\u0012\u000e\u0003\u001b\u0007\u0006ￂ\u0007\u001a", false).intern(), jSONObjectM3048);
        m3049().mo267(jSONObjectM3048, k10, t10);
        int i12 = f3154 + 49;
        f3156 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private JSONObject m3048(JSONObject jSONObject, T t10) {
        try {
            if (!(jSONObject.has(ih.f2541))) {
                jSONObject.put(ih.f2541, mo263(t10));
                int i10 = f3156 + 71;
                f3154 = i10 % 128;
                int i11 = i10 % 2;
            }
            if ((!jSONObject.has(ih.f2535) ? (char) 23 : '#') == 23) {
                int i12 = f3156 + 63;
                f3154 = i12 % 128;
                int i13 = i12 % 2;
                jSONObject.put(ih.f2535, jx.m2780());
                int i14 = f3154 + 7;
                f3156 = i14 % 128;
                int i15 = i14 % 2;
            }
        } catch (JSONException e10) {
            k.m2830(m3050(14 - (KeyEvent.getMaxKeyCode() >> 16), 136 - (ViewConfiguration.getPressedStateDuration() >> 16), MotionEvent.axisFromString("") + 13, "￤�\n\u0000\b\u0001\u000e￬\u000e\u000b\u0014\u0015\uffdd\u0000", false).intern(), m3047("\uf347七¼ᭂỔ랳㴣\ue180\ufae7鲌⊾י\ua7eb뾄禗됻血혊泥\uebe1㩪읎䐥법ⴴ兌", TextUtils.indexOf("", "", 0) + 25).intern(), e10);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m3050(int i10, int i11, int i12, String str, boolean z10) {
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
                cArr2[b.f704] = (char) (b.f705 + i11);
                int i14 = b.f704;
                cArr2[i14] = (char) (cArr2[i14] - f3159);
                b.f704 = i14 + 1;
            }
            if (i12 > 0) {
                b.f707 = i12;
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m3047(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f3157)) ^ ((c11 >>> 5) + f3155)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f3158) ^ ((c12 + i12) ^ ((c12 << 4) + f3160))));
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
}
