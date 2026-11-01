package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.ads.MobileAds;

/* JADX INFO: loaded from: classes7.dex */
public final class fx extends gl {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2111 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2112 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f2113 = {61, 17, -18, -53, 49, 53, -63, 16, 45, -119, 61, 49, 1, -119, 52, 52, 11, -8, -55, -56, -49, 60, -60, 63, 1, -5, -53, 55, -54, 50, 58, 11, -13, -52, 62, 68, -75, 104, -106, -78, 75, -69, 76, 64, 66, 101, -10, 66, 78, 126, -10, 75, 75, 116, -121, -74, -73, -80, 67, -69, 64, 126, -124, -76, 72, -75, 77, 69, 116, -116, -77, 65, -11, 4, 15, 5, 0, 0, 0};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2114 = -551801176;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f2115 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2116 = 117;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2117 = 112251052;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2201() {
        int i10 = f2112 + 103;
        f2111 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2205((-112250980) - (Process.myPid() >> 22), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 551801272, (byte) (6 - Drawable.resolveOpacity(0, 0)), Gravity.getAbsoluteGravity(0, 0) - 112).intern();
        int i12 = f2112 + 121;
        f2111 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean m2204() {
        int i10 = f2111 + 1;
        f2112 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                Prode.m241();
                throw null;
            }
            if (!Prode.m241()) {
                Class.forName(m2205(TextUtils.indexOf("", "") - 112251017, (short) ((Process.getThreadPriority(0) + 20) >> 6), View.combineMeasuredStates(0, 0) + 551801275, (byte) ((Process.myPid() >> 22) + 77), (-79) - TextUtils.indexOf("", "")).intern());
                return true;
            }
            int i11 = f2111 + 97;
            f2112 = i11 % 128;
            int i12 = i11 % 2;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2205(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f2116;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f2113;
                i14 = bArr != null ? (byte) (bArr[f2117 + i10] + i13) : (short) (f2115[f2117 + i10] + i13);
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f2117 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f2114);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f2113;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f2115;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo2198() {
        int i10 = f2112 + 63;
        f2111 = i10 % 128;
        int i11 = i10 % 2;
        if (!m2204()) {
            return new ay(mo2201());
        }
        ay.e eVar = new ay.e(mo2201());
        int i12 = f2111 + 87;
        f2112 = i12 % 128;
        int i13 = i12 % 2;
        return eVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2199() {
        int i10 = f2111 + 39;
        f2112 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m2205((-112251052) - (ViewConfiguration.getLongPressTimeout() >> 16), (short) TextUtils.indexOf("", "", 0, 0), 551801275 - (ViewConfiguration.getTapTimeout() >> 16), (byte) (50 - (ViewConfiguration.getJumpTapTimeout() >> 16)), View.getDefaultSize(0, 0) - 81).intern();
        int i12 = f2111 + 43;
        f2112 = i12 % 128;
        if ((i12 % 2 == 0 ? '<' : '\r') == '\r') {
            return strIntern;
        }
        int i13 = 33 / 0;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2200() {
        int i10 = f2111 + 81;
        int i11 = i10 % 128;
        f2112 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 23;
        f2111 = i13 % 128;
        if ((i13 % 2 != 0 ? 'Y' : (char) 23) == 23) {
            return MobileAds.class;
        }
        throw null;
    }
}
