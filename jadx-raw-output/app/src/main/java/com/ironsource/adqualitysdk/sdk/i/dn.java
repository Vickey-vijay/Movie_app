package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class dn {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1780 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static short[] f1781 = null;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static byte[] f1782 = {75, -77, -67, 68, -24, -5, 22, 7, -8, -24, -8, 12, 0, 14, -8, 5, -11, -128, 122, 116, -119, -3, 4, 11, -19, 19, -15, 11, -7, 10, -15, 6, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1783 = 0;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1784 = -728715457;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1785 = -1658449544;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1786 = 53;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Map<String, dl> f1787;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private Map<String, ds> f1788;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1789;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<Cdo> f1790;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1791;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1792;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<String> f1793;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <T> List<T> m2014(List<T> list) {
        int i10 = f1780 + 41;
        int i11 = i10 % 128;
        f1783 = i11;
        if ((i10 % 2 != 0 ? '#' : (char) 14) != 14) {
            throw null;
        }
        if (list == null) {
            return new ArrayList();
        }
        int i12 = i11 + 89;
        f1780 = i12 % 128;
        int i13 = i12 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Map<String, ds> m2019() {
        Map<String, ds> map;
        int i10 = f1783 + 111;
        int i11 = i10 % 128;
        f1780 = i11;
        if ((i10 % 2 == 0 ? 'N' : 'O') != 'O') {
            map = this.f1788;
            int i12 = 99 / 0;
        } else {
            map = this.f1788;
        }
        int i13 = i11 + 5;
        f1783 = i13 % 128;
        int i14 = i13 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2013(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f1786;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f1782;
                i14 = bArr != null ? (byte) (bArr[f1785 + i10] + i13) : (short) (f1781[f1785 + i10] + i13);
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f1785 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f1784);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f1782;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f1781;
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

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Map<String, dl> m2016() {
        int i10 = f1780 + 7;
        f1783 = i10 % 128;
        if ((i10 % 2 != 0 ? 'S' : '.') == '.') {
            return this.f1787;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final List<Cdo> m2017() {
        int i10 = f1780 + 97;
        int i11 = i10 % 128;
        f1783 = i11;
        int i12 = i10 % 2;
        List<Cdo> list = this.f1790;
        int i13 = i11 + 25;
        f1780 = i13 % 128;
        int i14 = i13 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2018() {
        int i10 = f1783 + 107;
        int i11 = i10 % 128;
        f1780 = i11;
        int i12 = i10 % 2;
        boolean z10 = this.f1789;
        int i13 = i11 + 3;
        f1783 = i13 % 128;
        if ((i13 % 2 != 0 ? 'J' : (char) 30) == 30) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2021() {
        int i10 = f1783 + 7;
        int i11 = i10 % 128;
        f1780 = i11;
        int i12 = i10 % 2;
        String str = this.f1792;
        int i13 = i11 + 91;
        f1783 = i13 % 128;
        if ((i13 % 2 != 0 ? ',' : (char) 5) == 5) {
            return str;
        }
        int i14 = 40 / 0;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m2022() {
        int i10 = f1783 + 9;
        f1780 = i10 % 128;
        if ((i10 % 2 == 0 ? 'P' : '\b') != 'P') {
            return this.f1793;
        }
        throw null;
    }

    public dn(final String str, String str2, JSONObject jSONObject) {
        this.f1792 = dz.m2133(str2);
        this.f1791 = dz.m2133(jSONObject.optString(m2013((ViewConfiguration.getScrollBarSize() >> 8) + 1658449544, (short) ((-1) - Process.getGidForName("")), 728715572 - (KeyEvent.getMaxKeyCode() >> 16), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 69), (-47) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern()));
        this.f1789 = jSONObject.optBoolean(m2013(1658449548 - Color.argb(0, 0, 0, 0), (short) Gravity.getAbsoluteGravity(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 728715553, (byte) ((-7) - View.MeasureSpec.getSize(0)), Color.argb(0, 0, 0, 0) - 45).intern());
        this.f1793 = m2014(jz.m2805(jSONObject.optJSONArray(m2013(1658449554 - TextUtils.lastIndexOf("", '0', 0, 0), (short) (ImageFormat.getBitsPerPixel(0) + 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 728715565, (byte) (13 - TextUtils.getTrimmedLength("")), (-47) - MotionEvent.axisFromString("")).intern()), new jz.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dn.1
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ String mo550(JSONArray jSONArray, int i10) {
                return dz.m2133(jSONArray.optString(i10));
            }
        }));
        this.f1790 = m2014(jz.m2805(jSONObject.optJSONArray(m2013(KeyEvent.keyCodeFromString("") + 1658449561, (short) (MotionEvent.axisFromString("") + 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 728715572, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 123), Color.red(0) - 48).intern()), new jz.b<Cdo>() { // from class: com.ironsource.adqualitysdk.sdk.i.dn.3
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ Cdo mo550(JSONArray jSONArray, int i10) {
                return new Cdo(jSONArray.optJSONObject(i10));
            }
        }));
        this.f1787 = m2015(jz.m2797(jSONObject.optJSONObject(m2013((ViewConfiguration.getLongPressTimeout() >> 16) + 1658449565, (short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 728715559 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2), Drawable.resolveOpacity(0, 0) - 47).intern()), new jz.c<dl>() { // from class: com.ironsource.adqualitysdk.sdk.i.dn.4
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ dl mo549(JSONObject jSONObject2, String str3) {
                return new dl(jSONObject2.optJSONObject(str3));
            }
        }));
        this.f1788 = m2015(jz.m2797(jSONObject.optJSONObject(m2013(1658449570 - (Process.myTid() >> 22), (short) View.MeasureSpec.getSize(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 728715566, (byte) (TextUtils.indexOf((CharSequence) "", '0') - 1), (-46) - KeyEvent.normalizeMetaState(0)).intern()), new jz.c<ds>() { // from class: com.ironsource.adqualitysdk.sdk.i.dn.5
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ ds mo549(JSONObject jSONObject2, String str3) {
                return new ds(str, str3, jSONObject2.optJSONObject(str3));
            }
        }));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <K, V> Map<K, V> m2015(Map<K, V> map) {
        int i10 = f1780;
        int i11 = i10 + 79;
        f1783 = i11 % 128;
        int i12 = i11 % 2;
        if (!(map == null)) {
            int i13 = i10 + 111;
            f1783 = i13 % 128;
            if ((i13 % 2 != 0 ? 'b' : 'K') == 'K') {
                return map;
            }
            throw null;
        }
        HashMap map2 = new HashMap();
        int i14 = f1780 + 41;
        f1783 = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        return map2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2020() {
        int i10 = f1780;
        int i11 = i10 + 51;
        f1783 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f1791;
        int i13 = i10 + 115;
        f1783 = i13 % 128;
        if ((i13 % 2 != 0 ? (char) 2 : '@') != 2) {
            return str;
        }
        throw null;
    }
}
