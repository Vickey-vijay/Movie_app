package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.G5;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends y<Activity> implements jg {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static byte[] f3096 = null;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f3097 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static short[] f3098;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f3099;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f3100;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f3101;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f3102;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String f3103;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private a f3104;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private boolean f3105;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private boolean f3106;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f3107;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Class f3108;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f3109;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private jg f3110;

    public class a extends y.c {

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static short[] f3142 = null;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f3143 = 1;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private static int f3144 = 0;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f3145 = 1045909691;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f3146 = -595238911;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f3148 = 115;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private boolean f3149 = false;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f3150;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f3151;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f3152;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private int f3153;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static byte[] f3147 = {-101, -8, 12, 19, -43, 5, 11, -13, 13, -11, 17, 34, -35, 3, -106, 27, -46, 18, -4, 19, -12, -3, -18, -98, -11, -9, 37, -37, 5, 11, -13, 13, -11, 17, 34, -51, 17, 2, -23, 19, -105, 17, -2, -5, -4, 37, -38, 27, ExifInterface.MARKER_APP1, 9, -106, 15, 3, 1, -13, 34, -28, -6, -3, -99, 6, 9, -4, -3, 41, -52, 18, -4, 19, -12, -3, 14, -14, -14, -2, -97, 6, 9, -4, -3, 41, -34, -8, -2, -3, 10, 37, ExifInterface.MARKER_APP1, -3, 14, -14, -14, -2, -105, 41, -23, -17, -2, -4, 51, -32, -14, -2, -106, 1, 4, 31, -30, 31, -33, 3, 4};

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private static char f3141 = 6;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static char[] f3140 = {'w', 'e', 'b', 'V', 'i', 'C', 'l', 'a', 's', 'N', 'm', 'P', 'r', 'f', 'x', 'c', 't', 'k', 'o', 'D', 'y', ',', 'u', 'W', 'H', 'h', 'J', 'v', 'p', 'M', 'I', 'n', 'T', 'g', 'z', '{'};

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ boolean m3038(a aVar) {
            int i10 = f3143;
            int i11 = i10 + 39;
            f3144 = i11 % 128;
            boolean z10 = i11 % 2 != 0;
            boolean z11 = aVar.f3149;
            if (z10) {
                throw null;
            }
            int i12 = i10 + 67;
            f3144 = i12 % 128;
            int i13 = i12 % 2;
            return z11;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ String m3039(a aVar) {
            int i10 = f3144 + 43;
            int i11 = i10 % 128;
            f3143 = i11;
            char c10 = i10 % 2 == 0 ? '>' : 'P';
            String str = aVar.f3150;
            if (c10 != 'P') {
                throw null;
            }
            int i12 = i11 + 59;
            f3144 = i12 % 128;
            if (!(i12 % 2 != 0)) {
                return str;
            }
            int i13 = 77 / 0;
            return str;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ int m3042(a aVar) {
            int i10 = f3144 + 19;
            int i11 = i10 % 128;
            f3143 = i11;
            int i12 = i10 % 2;
            int i13 = aVar.f3153;
            int i14 = i11 + 31;
            f3144 = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
            return i13;
        }

        public a(u uVar, JSONObject jSONObject) {
            m3044(jSONObject.optString(m3040((short) ExpandableListView.getPackedPositionType(0L), (-1045909691) - KeyEvent.normalizeMetaState(0), Color.blue(0) - 116, 595239009 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) View.MeasureSpec.getMode(0)).intern()));
            m3037(jSONObject.optString(m3045((byte) (67 - View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0001\u0002\u0003\u0004\u0005\u0002\u0001\u0000\u0007\b¶¶\n\b\u0007\u0004\u0006\u0011\u0007\u0013\u0002\u0010", 22 - TextUtils.indexOf("", "")).intern()));
            m3043(jSONObject.optInt(m3040((short) TextUtils.indexOf("", ""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1045909677, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 115, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 595239029, (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), -1));
            m3035(jSONObject.optBoolean(m3040((short) (MotionEvent.axisFromString("") + 1), (-1062686884) - Color.rgb(0, 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 117, 595239012 - Gravity.getAbsoluteGravity(0, 0), (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern()));
            m3034(jSONObject.optBoolean(m3045((byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 50), "\t\r\u0011\u0004\b\u0007\b\u0000\t\r\u000e\u000b\u0006\u0015\u0019\u0007\u0007\b«", 19 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern()));
            m3088(jSONObject.optString(m3040((short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-1045909651) - TextUtils.indexOf("", ""), (-116) - TextUtils.indexOf("", ""), 595239017 - TextUtils.indexOf("", "", 0), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()));
            m3089(TextUtils.isEmpty(jSONObject.optString(m3040((short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + (-1045909641), View.MeasureSpec.getMode(0) + (-116), 595239027 - MotionEvent.axisFromString(""), (byte) ExpandableListView.getPackedPositionType(0L)).intern())) ? null : Arrays.asList(jSONObject.optString(m3040((short) View.getDefaultSize(0, 0), View.getDefaultSize(0, 0) - 1045909641, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 116, 595239028 - ((Process.getThreadPriority(0) + 20) >> 6), (byte) (ViewConfiguration.getPressedStateDuration() >> 16)).intern()).split(m3045((byte) (TextUtils.indexOf("", "") + 69), "q", View.resolveSize(0, 0) + 1).intern())));
            m3090(jSONObject.optBoolean(m3045((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 105), "\u0014\n\u0005\u0013\u0002\u0003\u0004\u0005\u0002\u0001\u0019\u0006\u0007\u001a", TextUtils.indexOf("", "", 0) + 14).intern()));
            m3093(jSONObject.optBoolean(m3045((byte) (110 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0014\n\u0002\u0019\t\u0019\b\t\u0010\r\n\"â", (ViewConfiguration.getPressedStateDuration() >> 16) + 13).intern(), true));
            m3086(!TextUtils.isEmpty(jSONObject.optString(m3040((short) (KeyEvent.getMaxKeyCode() >> 16), (-1045909651) - Color.alpha(0), ExpandableListView.getPackedPositionChild(0L) + (-115), (ViewConfiguration.getPressedStateDuration() >> 16) + 595239017, (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) || jSONObject.optBoolean(m3040((short) ((-1) - Process.getGidForName("")), MotionEvent.axisFromString("") + (-1045909631), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + (-117), 595239028 - View.resolveSizeAndState(0, 0, 0), (byte) (ViewConfiguration.getScrollBarSize() >> 8)).intern()) || jSONObject.optBoolean(m3040((short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0) + (-1045909616), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + (-117), 595239027 - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) (Process.myTid() >> 22)).intern()));
            m3092(jSONObject.optBoolean(m3040((short) (ViewConfiguration.getTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1045909632, (-116) - (KeyEvent.getMaxKeyCode() >> 16), 595239028 - TextUtils.getOffsetAfter("", 0), (byte) Color.blue(0)).intern()));
            m3085(jSONObject.optBoolean(m3040((short) ExpandableListView.getPackedPositionType(0L), (-1045909599) - ((byte) KeyEvent.getModifierMetaStateMask()), Color.rgb(0, 0, 0) + 16777100, TextUtils.indexOf((CharSequence) "", '0') + 595239029, (byte) TextUtils.indexOf("", "", 0, 0)).intern()));
            m3087(jSONObject.optBoolean(m3045((byte) (Color.blue(0) + 125), "\u0014\n\u0005\u0019\u0012\n\u0016\n\u0018\n\u0005\u0013\u0002\u0003\u0004\u0005\u0002\u0001ð", 19 - TextUtils.indexOf("", "")).intern()));
            m3083(jSONObject.optBoolean(m3045((byte) (Color.red(0) + 80), "\u0010\u001c\n\f\n\"\u0007\u0000\u001f \n\u000e\r\u0001\r\u0003Ã", TextUtils.getTrimmedLength("") + 17).intern()));
            m3084(jSONObject.optBoolean(m3040((short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Color.red(0) - 1045909588, ExpandableListView.getPackedPositionChild(0L) - 115, 595239016 - ExpandableListView.getPackedPositionType(0L), (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern()));
            m3091(jz.m2800(jSONObject.optJSONArray(m3045((byte) (TextUtils.lastIndexOf("", '0') + 113), "\u001c\u0003\u0002\u0001\u000e\u0002\u0018\u0000\" \u0018\u0012Õ", TextUtils.indexOf((CharSequence) "", '0', 0) + 14).intern())));
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private a m3034(boolean z10) {
            int i10 = f3143;
            int i11 = i10 + 97;
            f3144 = i11 % 128;
            int i12 = i11 % 2;
            this.f3149 = z10;
            int i13 = i10 + 33;
            f3144 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private a m3035(boolean z10) {
            int i10 = f3144 + 73;
            int i11 = i10 % 128;
            f3143 = i11;
            if (!(i10 % 2 != 0)) {
                this.f3151 = z10;
                throw null;
            }
            this.f3151 = z10;
            int i12 = i11 + 79;
            f3144 = i12 % 128;
            int i13 = i12 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ boolean m3036(a aVar) {
            int i10 = f3144;
            int i11 = i10 + 99;
            f3143 = i11 % 128;
            int i12 = i11 % 2;
            boolean z10 = aVar.f3151;
            int i13 = i10 + 37;
            f3143 = i13 % 128;
            if ((i13 % 2 == 0 ? 'A' : 'P') != 'A') {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private a m3037(String str) {
            int i10 = f3144 + 55;
            f3143 = i10 % 128;
            if (!(i10 % 2 == 0)) {
                this.f3152 = str;
            } else {
                this.f3152 = str;
                int i11 = 32 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m3040(short s10, int i10, int i11, int i12, byte b10) {
            String string;
            synchronized (o.f2993) {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f3148;
                int i14 = i11 + i13;
                boolean z10 = i14 == -1;
                if (z10) {
                    byte[] bArr = f3147;
                    i14 = bArr != null ? (byte) (bArr[f3145 + i10] + i13) : (short) (f3142[f3145 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f2994 = ((i10 + i14) - 2) + f3145 + (z10 ? 1 : 0);
                    o.f2995 = b10;
                    char c10 = (char) (i12 + f3146);
                    o.f2997 = c10;
                    sb2.append(c10);
                    o.f2996 = o.f2997;
                    o.f2998 = 1;
                    while (o.f2998 < i14) {
                        byte[] bArr2 = f3147;
                        if (bArr2 != null) {
                            int i15 = o.f2994;
                            o.f2994 = i15 - 1;
                            o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                        } else {
                            short[] sArr = f3142;
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

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ String m3041(a aVar) {
            int i10 = f3143 + 73;
            int i11 = i10 % 128;
            f3144 = i11;
            int i12 = i10 % 2;
            String str = aVar.f3152;
            int i13 = i11 + 79;
            f3143 = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            return str;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m3044(String str) {
            int i10 = f3144 + 87;
            f3143 = i10 % 128;
            if ((i10 % 2 == 0 ? '?' : 'Z') != 'Z') {
                this.f3150 = str;
                int i11 = 26 / 0;
            } else {
                this.f3150 = str;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m3043(int i10) {
            int i11 = f3143 + 49;
            int i12 = i11 % 128;
            f3144 = i12;
            int i13 = i11 % 2;
            this.f3153 = i10;
            int i14 = i12 + 41;
            f3143 = i14 % 128;
            int i15 = i14 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m3045(byte b10, String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2129) {
                char[] cArr2 = f3140;
                char c10 = f3141;
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
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m3002() {
        int i10 = f3097;
        int i11 = i10 + 117;
        f3099 = i11 % 128;
        int i12 = i11 % 2;
        String str = f3103;
        int i13 = i10 + 121;
        f3099 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private jg m3005() {
        int i10 = f3097;
        int i11 = i10 + 21;
        f3099 = i11 % 128;
        int i12 = i11 % 2;
        jg jgVar = this.f3110;
        int i13 = i10 + 45;
        f3099 = i13 % 128;
        if ((i13 % 2 != 0 ? '%' : '[') == '[') {
            return jgVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static void m3007() {
        f3102 = -1587075845;
        f3101 = 87;
        f3100 = 829340525;
        f3096 = new byte[]{-70, -115, 121, -120, 118, -115, -103, 100, -93, 72, -123, -117, 115, -115, 117, -111, -94, -55, 61, 35, 86, 83, 96, -95, 8, 82, -85, 19, 77, 96, 105, 54, 92, 120, 54, 98, -101, 16, 80, 92, 92, 87, 90, -104, 5, 90, 84, 87, -124, -48, 92, 109, 108, 122, 84, -120, 120, 40, 108, 86, -86, 40, 108, 86, 95, 106, 112, 98, 112, 81, 105, 114, 104, -104, 46, 103, 86, 98, 107, 97, 106, 100, 98, 110, -96, 38, 99, 113};
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Class m3008(u uVar, Class cls) {
        int i10 = f3099 + 89;
        int i11 = i10 % 128;
        f3097 = i11;
        int i12 = i10 % 2;
        uVar.f3108 = cls;
        int i13 = i11 + 79;
        f3099 = i13 % 128;
        if ((i13 % 2 != 0 ? '\\' : '\'') != '\\') {
            return cls;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ a m3012(u uVar) {
        int i10 = f3097 + 125;
        int i11 = i10 % 128;
        f3099 = i11;
        int i12 = i10 % 2;
        a aVar = uVar.f3104;
        int i13 = i11 + 87;
        f3097 = i13 % 128;
        int i14 = i13 % 2;
        return aVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3020() {
        int i10 = f3099 + 27;
        int i11 = i10 % 128;
        f3097 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 31;
        f3099 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return false;
        }
        int i14 = 96 / 0;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ void mo3029(Activity activity, String str) {
        int i10 = f3097;
        char c10 = G5.T;
        int i11 = i10 + 61;
        f3099 = i11 % 128;
        int i12 = i11 % 2;
        m3028(activity, str);
        int i13 = f3097 + 125;
        f3099 = i13 % 128;
        if (i13 % 2 == 0) {
            c10 = 'Q';
        }
        if (c10 == 'Q') {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﾒ */
    public final /* synthetic */ View mo291(Activity activity) {
        int i10 = f3097 + 17;
        f3099 = i10 % 128;
        Activity activity2 = activity;
        if (i10 % 2 != 0) {
            m3011(activity2);
            throw null;
        }
        View viewM3011 = m3011(activity2);
        int i11 = f3099 + 107;
        f3097 = i11 % 128;
        int i12 = i11 % 2;
        return viewM3011;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.u.a.m3036(r3.f3104) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        if ((com.ironsource.adqualitysdk.sdk.i.u.a.m3036(r3.f3104) ? '9' : 14) != '9') goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        return r3.f3108.isAssignableFrom(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.u.f3099 + 35;
        com.ironsource.adqualitysdk.sdk.i.u.f3097 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        return r3.f3108.equals(r4);
     */
    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m3003(android.app.Activity r4) {
        /*
            r3 = this;
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r0 = r3.f3108
            r1 = 26
            if (r0 == 0) goto Lc
            r0 = r1
            goto Le
        Lc:
            r0 = 64
        Le:
            r2 = 0
            if (r0 == r1) goto L2a
            int r4 = com.ironsource.adqualitysdk.sdk.i.u.f3097
            int r4 = r4 + 83
            int r0 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.u.f3099 = r0
            int r4 = r4 % 2
            r0 = 1
            if (r4 == 0) goto L20
            r4 = r0
            goto L21
        L20:
            r4 = r2
        L21:
            if (r4 == r0) goto L24
            return r2
        L24:
            r4 = 34
            int r4 = r4 / r2
            return r2
        L28:
            r4 = move-exception
            throw r4
        L2a:
            int r0 = com.ironsource.adqualitysdk.sdk.i.u.f3099
            int r0 = r0 + 123
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.u.f3097 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L43
            com.ironsource.adqualitysdk.sdk.i.u$a r0 = r3.f3104
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.u.a.m3036(r0)
            r1 = 4
            int r1 = r1 / r2
            if (r0 == 0) goto L53
            goto L5a
        L41:
            r4 = move-exception
            throw r4
        L43:
            com.ironsource.adqualitysdk.sdk.i.u$a r0 = r3.f3104
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.u.a.m3036(r0)
            r1 = 57
            if (r0 == 0) goto L4f
            r0 = r1
            goto L51
        L4f:
            r0 = 14
        L51:
            if (r0 == r1) goto L5a
        L53:
            java.lang.Class r0 = r3.f3108
            boolean r4 = r0.isAssignableFrom(r4)
            return r4
        L5a:
            int r0 = com.ironsource.adqualitysdk.sdk.i.u.f3099
            int r0 = r0 + 35
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.u.f3097 = r1
            int r0 = r0 % 2
            java.lang.Class r0 = r3.f3108
            boolean r4 = r0.equals(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.u.m3003(android.app.Activity):boolean");
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3004(u uVar) {
        int i10 = f3097 + 45;
        f3099 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        boolean z11 = uVar.f3105;
        if (!z10) {
            return z11;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m3006(Activity activity) {
        int i10 = f3097 + 71;
        f3099 = i10 % 128;
        int i11 = i10 % 2;
        String hexString = Integer.toHexString(activity.hashCode());
        int i12 = f3099 + 103;
        f3097 = i12 % 128;
        int i13 = i12 % 2;
        return hexString;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3015(u uVar) {
        int i10 = f3097 + 89;
        f3099 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        boolean z11 = uVar.f3106;
        if (z10) {
            throw null;
        }
        return z11;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3021(u uVar) {
        int i10 = f3099 + 11;
        f3097 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        boolean z11 = uVar.f3107;
        if (z10) {
            return z11;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ jg m3023(u uVar) {
        int i10 = f3097 + 7;
        f3099 = i10 % 128;
        int i11 = i10 % 2;
        jg jgVarM3005 = uVar.m3005();
        int i12 = f3097 + 65;
        f3099 = i12 % 128;
        int i13 = i12 % 2;
        return jgVarM3005;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        m3014(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (u.m3016(u.this, activity)) {
                    u.m3023(u.this).onActivityCreated(activity, bundle);
                    u.m3020();
                    u.m3013(u.this, false);
                    Bundle bundle2 = bundle;
                    if (bundle2 == null) {
                        u.m3017(u.this, false);
                        return;
                    }
                    u.m3017(u.this, bundle2.getBoolean(u.m3002()));
                    if (u.m3021(u.this)) {
                        u.m3013(u.this, true);
                    }
                    u.m3022(u.this, true);
                }
            }
        });
        int i10 = f3099 + 99;
        f3097 = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(final Activity activity) {
        m3014(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (u.m3016(u.this, activity)) {
                    t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.4.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            u.m3023(u.this).onActivityDestroyed(activity);
                        }
                    });
                    if (u.m3009(u.this) && u.m3021(u.this) && activity.isFinishing()) {
                        u.this.m3030(activity);
                    }
                }
            }
        });
        int i10 = f3099 + 19;
        f3097 = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(final Activity activity) {
        t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.6
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (u.m3016(u.this, activity)) {
                    u.m3023(u.this).onActivityPaused(activity);
                }
            }
        });
        int i10 = f3097 + 105;
        f3099 = i10 % 128;
        if ((i10 % 2 != 0 ? 'K' : 'F') == 'F') {
        } else {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        m3014(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.7
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (u.m3016(u.this, activity)) {
                    t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.7.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            u.m3023(u.this).onActivityResumed(activity);
                        }
                    });
                    u.m3010(u.this, false);
                    u.m3013(u.this, true);
                    if ((!u.m3021(u.this) || u.m3015(u.this)) && !activity.isFinishing()) {
                        u uVar = u.this;
                        Activity activity2 = activity;
                        uVar.m3028(activity2, u.m3024(activity2));
                    }
                    u.m3022(u.this, false);
                }
            }
        });
        int i10 = f3099 + 119;
        f3097 = i10 % 128;
        if ((i10 % 2 == 0 ? '?' : '\b') == '\b') {
        } else {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        m3014(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.10
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (u.m3016(u.this, activity)) {
                    u.m3023(u.this).onActivitySaveInstanceState(activity, bundle);
                    Bundle bundle2 = bundle;
                    if (bundle2 != null) {
                        bundle2.putBoolean(u.m3002(), u.m3021(u.this));
                    }
                    u.m3010(u.this, true);
                }
            }
        });
        int i10 = f3099 + 79;
        f3097 = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity activity) {
        t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.8
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (u.m3016(u.this, activity)) {
                    u.m3023(u.this).onActivityStarted(activity);
                }
            }
        });
        int i10 = f3097 + 121;
        f3099 = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final Activity activity) {
        m3014(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.9
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (u.m3016(u.this, activity)) {
                    t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.9.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            u.m3023(u.this).onActivityStopped(activity);
                        }
                    });
                    if (u.m3009(u.this) && !u.m3004(u.this) && activity.isFinishing()) {
                        u.this.m3030(activity);
                    }
                }
            }
        });
        int i10 = f3099 + 99;
        f3097 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 26 : '\'') != 26) {
            return;
        }
        int i11 = 99 / 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﻐ */
    public final /* synthetic */ void mo286(Activity activity, List list) {
        int i10 = f3099 + 43;
        f3097 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m3019(activity, (List<WebView>) list);
        if (!z10) {
            int i11 = 81 / 0;
        }
        int i12 = f3099 + 75;
        f3097 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ void mo3027(Activity activity) {
        int i10 = f3099 + 11;
        f3097 = i10 % 128;
        int i11 = i10 % 2;
        m3030(activity);
        int i12 = f3099 + 33;
        f3097 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    static {
        char c10;
        m3007();
        f3103 = m3018((short) (TextUtils.indexOf("", "") - 101), View.resolveSizeAndState(0, 0, 0) + 1587075894, (ViewConfiguration.getScrollDefaultDelay() >> 16) - 88, (-829340426) - (KeyEvent.getMaxKeyCode() >> 16), (byte) View.MeasureSpec.getMode(0)).intern();
        int i10 = f3099 + 87;
        f3097 = i10 % 128;
        if (i10 % 2 == 0) {
            c10 = '^';
        } else {
            c10 = ',';
        }
        if (c10 != '^') {
        } else {
            throw null;
        }
    }

    public u(JSONObject jSONObject, is isVar) {
        super(isVar);
        this.f3107 = false;
        this.f3109 = false;
        this.f3105 = false;
        this.f3106 = false;
        m3032(jSONObject);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3009(u uVar) {
        int i10 = f3099 + 111;
        int i11 = i10 % 128;
        f3097 = i11;
        int i12 = i10 % 2;
        boolean z10 = uVar.f3109;
        int i13 = i11 + 17;
        f3099 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3013(u uVar, boolean z10) {
        int i10 = f3099 + 125;
        f3097 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '@' : 'L';
        uVar.f3109 = z10;
        if (c10 != '@') {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3016(u uVar, Activity activity) {
        int i10 = f3099 + 43;
        f3097 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        boolean zM3003 = uVar.m3003(activity);
        if (z10) {
            int i11 = 56 / 0;
        }
        return zM3003;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3022(u uVar, boolean z10) {
        int i10 = f3099 + 117;
        int i11 = i10 % 128;
        f3097 = i11;
        int i12 = i10 % 2;
        uVar.f3106 = z10;
        int i13 = i11 + 103;
        f3099 = i13 % 128;
        int i14 = i13 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: avoid collision after fix types in other method and contains not printable characters */
    public static /* synthetic */ String m3024(Activity activity) {
        int i10 = f3099 + 51;
        f3097 = i10 % 128;
        int i11 = i10 % 2;
        String strM3006 = m3006(activity);
        int i12 = f3097 + 117;
        f3099 = i12 % 128;
        int i13 = i12 % 2;
        return strM3006;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3010(u uVar, boolean z10) {
        int i10 = f3099;
        int i11 = i10 + 53;
        f3097 = i11 % 128;
        char c10 = i11 % 2 == 0 ? (char) 11 : '/';
        uVar.f3105 = z10;
        if (c10 == 11) {
            throw null;
        }
        int i12 = i10 + 35;
        f3097 = i12 % 128;
        int i13 = i12 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3017(u uVar, boolean z10) {
        int i10 = f3099 + 51;
        int i11 = i10 % 128;
        f3097 = i11;
        int i12 = i10 % 2;
        uVar.f3107 = z10;
        int i13 = i11 + 107;
        f3099 = i13 % 128;
        int i14 = i13 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m3019(Activity activity, List<WebView> list) {
        int i10 = f3097 + 17;
        f3099 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 20 : ')') != ')') {
            ke.m2887(activity, WebView.class, a.m3042(this.f3104), a.m3041(this.f3104), true, false, null, this.f3104.f3209, list);
        } else {
            ke.m2887(activity, WebView.class, a.m3042(this.f3104), a.m3041(this.f3104), false, false, null, this.f3104.f3209, list);
        }
        int i11 = f3099 + 69;
        f3097 = i11 % 128;
        if ((i11 % 2 == 0 ? '\t' : ':') != '\t') {
            return;
        }
        int i12 = 9 / 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m3026() {
        int i10 = f3099 + 71;
        f3097 = i10 % 128;
        int i11 = i10 % 2;
        m3051((r) null);
        m3031((jg) null);
        jj.m2676().m2678(this);
        int i12 = f3099 + 33;
        f3097 = i12 % 128;
        if ((i12 % 2 == 0 ? 'F' : 'R') == 'R') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m3032(JSONObject jSONObject) {
        a aVar = new a(this, jSONObject);
        m3069(aVar);
        this.f3104 = aVar;
        t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.3

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f3120 = 1;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f3122;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f3121 = {'A', 2420, 4698, 6956, 9258, 11546, 14078, 16344, 18681, 20907, 23214, 25500, 28026, 30287, 32558, 34876, 37122, 'E', 2405, 4700, 6954, 9262, 11603, 14054, 16328, 18635, 20923, 23171, 25491, 28029, 30277, 32549, 34937, 37124, 39656, 41918, 44240, 46522, 48774, 51092, 53605, 55899, 58143, 60473, 62731, 65188, 19265, 16972};

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static long f3119 = 3863225799229114647L;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m3033(char c10, int i10, int i11) {
                String str;
                synchronized (d.f1653) {
                    char[] cArr = new char[i10];
                    d.f1652 = 0;
                    while (true) {
                        int i12 = d.f1652;
                        if (i12 < i10) {
                            cArr[i12] = (char) ((((long) f3121[i11 + i12]) ^ (((long) i12) * f3119)) ^ ((long) c10));
                            d.f1652 = i12 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                }
                return str;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                try {
                    u uVar = u.this;
                    u.m3008(uVar, Class.forName(a.m3039(u.m3012(uVar))));
                    t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.3.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            u.this.m3025();
                        }
                    });
                    int i10 = f3122 + 57;
                    f3120 = i10 % 128;
                    int i11 = i10 % 2;
                } catch (ClassNotFoundException e10) {
                    String strIntern = m3033((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 16 - Process.getGidForName(""), KeyEvent.keyCodeFromString("")).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m3033((char) Drawable.resolveOpacity(0, 0), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 16 - TextUtils.indexOf((CharSequence) "", '0')).intern());
                    sb2.append(a.m3039(u.m3012(u.this)));
                    sb2.append(m3033((char) ((ViewConfiguration.getTouchSlop() >> 8) + 19323), (ViewConfiguration.getEdgeSlop() >> 16) + 2, 46 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
                    sb2.append(e10.getLocalizedMessage());
                    k.m2810(strIntern, sb2.toString());
                }
            }
        });
        int i10 = f3097 + 123;
        f3099 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m3025() {
        int i10 = f3097 + 19;
        f3099 = i10 % 128;
        int i11 = i10 % 2;
        jj.m2676().m2679(this);
        int i12 = f3097 + 25;
        f3099 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ｋ */
    public final r<WebView, Activity> mo290() {
        int i10 = f3097;
        int i11 = i10 + 103;
        f3099 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 79;
        f3099 = i13 % 128;
        if ((i13 % 2 != 0 ? '\n' : ':') == ':') {
            return this;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m3030(Activity activity) {
        int i10 = f3099 + 91;
        f3097 = i10 % 128;
        int i11 = i10 % 2;
        super.mo3027(activity);
        this.f3107 = false;
        int i12 = f3097 + 61;
        f3099 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return;
        }
        int i13 = 66 / 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jg
    /* JADX INFO: renamed from: ﻐ */
    public final void mo384(final Activity activity) {
        t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (u.m3016(u.this, activity)) {
                    u.m3023(u.this).mo384(activity);
                }
            }
        });
        int i10 = f3099 + 103;
        f3097 = i10 % 128;
        if (!(i10 % 2 == 0)) {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jg
    /* JADX INFO: renamed from: ｋ */
    public final void mo385(final Activity activity) {
        t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (u.m3016(u.this, activity)) {
                    u.m3023(u.this).mo385(activity);
                }
            }
        });
        int i10 = f3099 + 85;
        f3097 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m3014(ir irVar) {
        int i10 = f3099 + 33;
        f3097 = i10 % 128;
        int i11 = i10 % 2;
        if (!a.m3038(this.f3104)) {
            t.m2993(irVar);
            return;
        }
        int i12 = f3099 + 71;
        f3097 = i12 % 128;
        int i13 = i12 % 2;
        t.m3000(irVar);
        int i14 = f3099 + 9;
        f3097 = i14 % 128;
        if (i14 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: avoid collision after fix types in other method and contains not printable characters */
    private static View m3011(Activity activity) {
        int i10 = f3097 + 9;
        f3099 = i10 % 128;
        int i11 = i10 % 2;
        View viewFindViewById = activity.findViewById(R.id.content);
        int i12 = f3099 + 69;
        f3097 = i12 % 128;
        if ((i12 % 2 == 0 ? 'X' : 'Q') == 'Q') {
            return viewFindViewById;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m3018(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f3101;
            int i14 = i11 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f3096;
                if (bArr != null) {
                    i14 = (byte) (bArr[f3102 + i10] + i13);
                } else {
                    i14 = (short) (f3098[f3102 + i10] + i13);
                }
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f3102 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i12 + f3100);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f3096;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f3098;
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m3031(jg jgVar) {
        int i10 = f3097 + 73;
        f3099 = i10 % 128;
        char c10 = i10 % 2 != 0 ? (char) 29 : '4';
        this.f3110 = jgVar;
        if (c10 != '4') {
            int i11 = 5 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﾒ */
    public final aa mo292() {
        ab abVar = new ab();
        int i10 = f3099 + 49;
        f3097 = i10 % 128;
        if (i10 % 2 != 0) {
            return abVar;
        }
        int i11 = 96 / 0;
        return abVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: avoid collision after fix types in other method and contains not printable characters */
    public final void m3028(Activity activity, String str) {
        int i10 = f3097 + 57;
        f3099 = i10 % 128;
        int i11 = i10 % 2;
        if ((!this.f3107 ? 'O' : '`') != 'O') {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            try {
                jSONObjectJsonObjectInit.put(ih.f2492, true);
            } catch (JSONException e10) {
                String strIntern = m3018((short) ((-128) - Drawable.resolveOpacity(0, 0)), View.resolveSize(0, 0) + 1587075845, TextUtils.getOffsetBefore("", 0) - 88, (-829340460) - Color.green(0), (byte) View.MeasureSpec.getSize(0)).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m3018((short) ((ViewConfiguration.getScrollBarSize() >> 8) - 87), 1587075862 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getTapTimeout() >> 16) - 88, (-829340456) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) View.combineMeasuredStates(0, 0)).intern());
                sb2.append(e10.getLocalizedMessage());
                k.m2810(strIntern, sb2.toString());
            }
            super.m3070(jSONObjectJsonObjectInit, activity, str);
            return;
        }
        this.f3107 = true;
        super.mo3029(activity, str);
        int i12 = f3097 + 19;
        f3099 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }
}
