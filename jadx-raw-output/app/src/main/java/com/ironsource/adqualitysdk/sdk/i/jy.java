package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class jy {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2924 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2925 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2926 = 336176467;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f2927 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2929 = 1533949872;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2930 = 33;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f2928 = {-2, -1, -4, 9, 74, -79, -5, 84, -79, 9, -8, 5, 73, -68, 27, -28, -7, 8, -10, -7, 19, 66, -68, 0, 3, 65, -84, 77, -71, 10, -8, -9, 6, 44, -26, -56, 3, -3, 0, 13, 69, -14, -64, -1, -4, 9, 74, -79, -5, 84, -69, -8, 12, -13, 78, -69, -2, 6, -10, 8, 2, -15, 80, -82, 13, -7, 0, 11, -19, 1, 5, 5, 73, -68, 0, 3, 65, -84, 77, -71, 10, -8, -9, 6, 44, -19, -26, -56, 3, -3, 0, 13, 69, -13, 13, -26, -56, 3, -3, 0, 13, 69, -14, -64, -1, -4, 9, 74, -79, -5, 84, -79, 9, -8, 5, 73, -78, -1, 6, -10, 1, 13, -17, 86, -80, 0, 15, 65, -68, 0, 3, 65, -84, 77, -71, 10, -8, -9, 6, 44, -1, 6, -10, 5, 9, -15, -4, 51, -38, 8, 2, -1, -3, 2, 2, -17, 30, -13, -11, -1, -2, 0, 28, 37, -68, 9, 8, 51, -61, 7, -15, 69, -61, 7, -15, -6, 5, 11, -3, 11, -20, 4, 13, 3, 51, -55, 2, -15, -3, 6, -4, 5, -1, -3, 9, 59, -63, -2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int[] f2923 = {-1949704739, -274059143, 918801494, 867094858, 89040952, 1208467926, 1866012127, 1718190850, 1318084539, -1079933601, -1464048464, 1525099564, 1724939846, 1374522665, -202454741, -252628762, -1971852667, -642393308};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static String m2786(Context context) {
        int i10 = f2925 + 97;
        f2924 = i10 % 128;
        try {
            return ((i10 % 2 == 0 ? ';' : '@') != ';' ? context.getPackageManager().getPackageInfo(context.getPackageName(), 0) : context.getPackageManager().getPackageInfo(context.getPackageName(), 1)).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            String strIntern = m2784(new int[]{-1134611696, -97445865, 1633219784, 1061292222}, 8 - Color.blue(0)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2784(new int[]{1439613806, 1898529912, 1060836092, 1638303530, 459668366, -1022786222, -1895036180, -887213754, 90157308, -1936358588, 1327332697, -1629312144, -1268434279, 935241192, -1007120295, -1309898021, 1599289704, 1020766275}, 33 - View.resolveSizeAndState(0, 0, 0)).intern());
            sb2.append((String) context);
            sb2.append(m2787((-336176381) - TextUtils.getOffsetBefore("", 0), (short) (TextUtils.indexOf((CharSequence) "", '0') + 1), (-1533949840) - ExpandableListView.getPackedPositionType(0L), (byte) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (ViewConfiguration.getScrollBarSize() >> 8) - 23).intern());
            sb2.append(e10.getLocalizedMessage());
            k.m2809(strIntern, sb2.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m2789(Context context, String str) {
        int i10 = f2924 + 63;
        f2925 = i10 % 128;
        if (i10 % 2 != 0) {
            context.checkCallingOrSelfPermission(str);
            throw null;
        }
        if ((context.checkCallingOrSelfPermission(str) == 0 ? '\r' : 'c') == 'c') {
            return false;
        }
        int i11 = f2925 + 77;
        int i12 = i11 % 128;
        f2924 = i12;
        int i13 = i11 % 2;
        int i14 = i12 + 51;
        f2925 = i14 % 128;
        int i15 = i14 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2784(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2923.clone();
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2787(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f2930;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f2928;
                i14 = bArr != null ? (byte) (bArr[f2926 + i10] + i13) : (short) (f2927[f2926 + i10] + i13);
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f2926 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f2929);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f2928;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f2927;
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
    public static void m2788(Context context, JSONObject jSONObject) {
        int i10 = f2924 + 3;
        f2925 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2784(new int[]{-1134611696, -97445865, 1633219784, 1061292222}, 8 - View.resolveSize(0, 0)).intern();
        String packageName = context.getPackageName();
        try {
            jSONObject.put(m2787(Color.red(0) - 336176467, (short) (ViewConfiguration.getWindowTouchSlop() >> 8), (-1533949760) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) View.getDefaultSize(0, 0), Color.blue(0) - 31).intern(), packageName);
            int i12 = f2925 + 19;
            f2924 = i12 % 128;
            int i13 = i12 % 2;
        } catch (JSONException e10) {
            k.m2830(strIntern, m2787((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 336176466, (short) (Process.myPid() >> 22), Color.green(0) - 1533949805, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), -MotionEvent.axisFromString("")).intern(), e10);
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            jSONObject.put(m2784(new int[]{-471904474, -989151847}, 2 - TextUtils.getOffsetBefore("", 0)).intern(), packageManager.getInstallerPackageName(packageName));
        } catch (JSONException e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2787(View.resolveSize(0, 0) - 336176433, (short) TextUtils.getCapsMode("", 0, 0), (Process.myPid() >> 22) - 1533949805, (byte) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18).intern());
            sb2.append(e11.getLocalizedMessage());
            k.m2809(strIntern, sb2.toString());
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            jSONObject.put(m2787((-336176383) - ((byte) KeyEvent.getModifierMetaStateMask()), (short) KeyEvent.keyCodeFromString(""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1533949755, (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-31) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), Integer.toString(packageInfo.versionCode));
            jSONObject.put(m2784(new int[]{-573101226, 1392364308}, 3 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e12) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2784(new int[]{1439613806, 1898529912, 1060836092, 1638303530, 459668366, -1022786222, -1895036180, -887213754, 90157308, -1936358588, 1327332697, -1629312144, -1268434279, 935241192, -1007120295, -1309898021, 1599289704, 1020766275}, 32 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
            sb3.append(packageName);
            sb3.append(m2787((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 336176382, (short) View.combineMeasuredStates(0, 0), TextUtils.indexOf("", "", 0, 0) - 1533949840, (byte) KeyEvent.getDeadChar(0, 0), (-23) - View.resolveSize(0, 0)).intern());
            sb3.append(e12.getLocalizedMessage());
            k.m2809(strIntern, sb3.toString());
        } catch (JSONException e13) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m2787((-336176372) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1533949805, (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 13 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
            sb4.append(e13.getLocalizedMessage());
            k.m2809(strIntern, sb4.toString());
        }
        try {
            jSONObject.put(m2784(new int[]{-2026554350, 1388570155}, TextUtils.getOffsetAfter("", 0) + 2).intern(), packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
            int i14 = f2925 + 37;
            f2924 = i14 % 128;
            if (!(i14 % 2 == 0)) {
            } else {
                throw null;
            }
        } catch (PackageManager.NameNotFoundException e14) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(m2784(new int[]{1439613806, 1898529912, 1060836092, 1638303530, 459668366, -1022786222, -1895036180, -887213754, 90157308, -1936358588, 1327332697, -1629312144, -1268434279, 935241192, -1007120295, -1309898021, 1599289704, 1020766275}, 33 - View.resolveSize(0, 0)).intern());
            sb5.append(packageName);
            sb5.append(m2787((-336176381) - KeyEvent.normalizeMetaState(0), (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (-1533949840) - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) View.MeasureSpec.getMode(0), (-23) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
            sb5.append(e14.getLocalizedMessage());
            k.m2809(strIntern, sb5.toString());
        } catch (JSONException e15) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(m2784(new int[]{1439613806, 1898529912, 1060836092, 1638303530, 897876616, -1044665935, -454870989, -784200662, 1767886346, -161624895, 233956055, 1527761451, -1944396969, 1550934189, 1257865793, -798409426, -225626284, 1604535163, 546630144, 681936741, 460859314, 1572166888}, 43 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
            sb6.append(e15.getLocalizedMessage());
            k.m2809(strIntern, sb6.toString());
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static String m2785() {
        int i10 = f2925 + 93;
        f2924 = i10 % 128;
        int i11 = i10 % 2;
        try {
            try {
                Class.forName(m2784(new int[]{916589208, 741184152, 578673637, -1111384400, 969746595, -1024929210, 1463358066, 1254713696, 449305726, 795319631, 569836471, -1246549197, -236302772, 1264248733, -2024977611, -1019002489}, Drawable.resolveOpacity(0, 0) + 30).intern());
                String strIntern = m2787((-336176327) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (ViewConfiguration.getLongPressTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) - 1533949754, (byte) (ViewConfiguration.getEdgeSlop() >> 16), (-32) - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
                int i12 = f2925 + 33;
                f2924 = i12 % 128;
                if (i12 % 2 != 0) {
                    return strIntern;
                }
                int i13 = 75 / 0;
                return strIntern;
            } catch (ClassNotFoundException unused) {
                return m2787((-336176268) - ExpandableListView.getPackedPositionGroup(0L), (short) (ViewConfiguration.getScrollBarSize() >> 8), (-1533949762) - View.MeasureSpec.getSize(0), (byte) TextUtils.indexOf("", "", 0, 0), (-32) - Color.alpha(0)).intern();
            }
        } catch (ClassNotFoundException unused2) {
            Class.forName(m2787((-336176327) - (ViewConfiguration.getScrollBarSize() >> 8), (short) (ViewConfiguration.getFadingEdgeLength() >> 16), (-1533949773) - TextUtils.getCapsMode("", 0, 0), (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27).intern());
            return m2784(new int[]{-344886061, -1962836370}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern();
        }
    }
}
