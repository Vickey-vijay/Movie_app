package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class as extends ar.AnonymousClass4 {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f414 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f415 = null;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static byte[] f416 = {5, -1, -3, -2, 17, -2, -7, 7, 1, 14, 11, -8, 4, 14, -6, -3, -1, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f417 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f418 = 80;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f419 = -1932141098783760248L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f420 = 1649618150;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f421 = -547976072;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final int f422 = (int) TimeUnit.SECONDS.toMillis(120);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m563() {
        int i10 = f417 + 27;
        f414 = i10 % 128;
        int i11 = i10 % 2;
        int iOptInt = m517().optInt(m554(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 547976083, (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.getCapsMode("", 0, 0) - 1649618041, (byte) KeyEvent.keyCodeFromString(""), (-77) - View.MeasureSpec.getMode(0)).intern(), 40);
        int i12 = f414 + 33;
        f417 = i12 % 128;
        if ((i12 % 2 == 0 ? '/' : '!') == '!') {
            return iOptInt;
        }
        int i13 = 85 / 0;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m564() {
        int i10 = f417 + 103;
        f414 = i10 % 128;
        int i11 = i10 % 2;
        int iOptInt = m517().optInt(m554((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 547976080, (short) ((-1) - MotionEvent.axisFromString("")), (-1649618050) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), View.MeasureSpec.getSize(0) - 77).intern(), this.f422);
        int i12 = f414 + 11;
        f417 = i12 % 128;
        int i13 = i12 % 2;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m553(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2284) {
            char[] cArrM2243 = h.m2243(f419, cArr, i10);
            h.f2285 = 4;
            while (true) {
                int i11 = h.f2285;
                if (i11 < cArrM2243.length) {
                    h.f2283 = i11 - 4;
                    int i12 = h.f2285;
                    cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f419));
                    h.f2285++;
                } else {
                    str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m554(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f418;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f416;
                i14 = bArr != null ? (byte) (bArr[f421 + i10] + i13) : (short) (f415[f421 + i10] + i13);
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f421 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f420);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f416;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f415;
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
    public final String m555() {
        int i10 = f417 + 103;
        f414 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectOptJSONObject = m517().optJSONObject(m554((KeyEvent.getMaxKeyCode() >> 16) + 547976086, (short) (ExpandableListView.getPackedPositionChild(0L) + 1), Color.rgb(0, 0, 0) - 1632840817, (byte) (Process.myTid() >> 22), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 78).intern());
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optString(m554(547976087 - TextUtils.indexOf((CharSequence) "", '0'), (short) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 1649618049, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 79).intern(), m554(KeyEvent.normalizeMetaState(0) + 547976072, (short) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1649618048, (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) - 71).intern());
        }
        String strIntern = m554((KeyEvent.getMaxKeyCode() >> 16) + 547976072, (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) - 1649618049, (byte) Color.argb(0, 0, 0, 0), AndroidCharacter.getMirror('0') - 'w').intern();
        int i12 = f417 + 115;
        f414 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String m556() {
        int i10 = f417 + 39;
        f414 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectOptJSONObject = m517().optJSONObject(m554(TextUtils.getTrimmedLength("") + 547976086, (short) View.MeasureSpec.getMode(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1649618034, (byte) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (-77) - KeyEvent.normalizeMetaState(0)).intern());
        if (!(jSONObjectOptJSONObject == null)) {
            return jSONObjectOptJSONObject.optString(m553("䙡㭔빜䘑璇", View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), m553("\uf452戊蜎\uf422\uec64싰왱ඈ瘝䃌䑍", ExpandableListView.getPackedPositionGroup(0L)).intern());
        }
        String strIntern = m553("\uf452戊蜎\uf422\uec64싰왱ඈ瘝䃌䑍", (-1) - ExpandableListView.getPackedPositionChild(0L)).intern();
        int i12 = f417 + 63;
        f414 = i12 % 128;
        if ((i12 % 2 != 0 ? '>' : '\'') != '>') {
            return strIntern;
        }
        int i13 = 68 / 0;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final long m557() {
        JSONObject jSONObjectM517;
        int iArgb;
        int i10 = f417 + 87;
        f414 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            jSONObjectM517 = m517();
            iArgb = Color.argb(0, 0, 0, 0);
        } else {
            jSONObjectM517 = m517();
            iArgb = Color.argb(1, 0, 0, 1);
        }
        return jSONObjectM517.optLong(m553("祎\udfabퟰ礽噚罗隓", iArgb).intern(), 0L);
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final long m558() {
        int i10 = f414 + 15;
        f417 = i10 % 128;
        int i11 = i10 % 2;
        long jOptLong = m517().optLong(m554((ViewConfiguration.getScrollBarSize() >> 8) + 547976088, (short) View.resolveSize(0, 0), (-1649618033) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 79).intern(), 0L);
        int i12 = f417 + 93;
        f414 = i12 % 128;
        int i13 = i12 % 2;
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final long m559() {
        int i10 = f414 + 115;
        f417 = i10 % 128;
        int i11 = i10 % 2;
        long jOptLong = m517().optLong(m553("㵓\uead7宱㴧섺䨬", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1).intern(), 0L);
        int i12 = f417 + 87;
        f414 = i12 % 128;
        if (i12 % 2 == 0) {
            return jOptLong;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int m561() {
        JSONObject jSONObjectM517;
        String strIntern;
        int i10;
        int i11 = f414 + 49;
        f417 = i11 % 128;
        if ((i11 % 2 == 0 ? (char) 6 : 'U') != 'U') {
            jSONObjectM517 = m517();
            strIntern = m553("訬向鍁詁ﶜ\uf4ef툢", TextUtils.getOffsetAfter("", 1)).intern();
            i10 = 28366;
        } else {
            jSONObjectM517 = m517();
            strIntern = m553("訬向鍁詁ﶜ\uf4ef툢", TextUtils.getOffsetAfter("", 0)).intern();
            i10 = 9850;
        }
        return jSONObjectM517.optInt(strIntern, i10);
    }

    public as(ax axVar) {
        m553("\uf452戊蜎\uf422\uec64싰왱ඈ瘝䃌䑍", ViewConfiguration.getWindowTouchSlop() >> 8).intern();
        m554(ExpandableListView.getPackedPositionChild(0L) + 547976073, (short) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getEdgeSlop() >> 16) - 1649618049, (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Process.getGidForName("") - 70).intern();
        m520(axVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m560() {
        List<String> listM665 = m518().m665();
        listM665.addAll(jz.m2801(m517(), m553("ꝛ蠟鐍Ꜿꤾ姛핥", ViewConfiguration.getFadingEdgeLength() >> 16).intern(), new ArrayList()));
        int i10 = f414 + 33;
        f417 = i10 % 128;
        int i11 = i10 % 2;
        return listM665;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m562() {
        List<String> listM673 = m518().m673();
        boolean z10 = false;
        listM673.addAll(jz.m2801(m517(), m554((ViewConfiguration.getPressedStateDuration() >> 16) + 547976084, (short) Color.red(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1649618049, (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (-77) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new ArrayList()));
        int i10 = f417 + 101;
        f414 = i10 % 128;
        if (i10 % 2 != 0) {
            z10 = true;
        }
        if (!z10) {
            return listM673;
        }
        throw null;
    }
}
