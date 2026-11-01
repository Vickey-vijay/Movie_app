package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class gl {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2194 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2195 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2196 = 15;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f2197 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f2198 = {-4, -68, 1, 3, -5, 17, -2, -9, 0, -1, 12, -12, 2, -9};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2199 = 1028029097;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2200 = -1175308846;

    /* JADX INFO: renamed from: ﻐ */
    public abstract bd mo2198();

    /* JADX INFO: renamed from: ｋ */
    public abstract String mo2199();

    /* JADX INFO: renamed from: ﾇ */
    public abstract Class mo2200();

    /* JADX INFO: renamed from: ﾒ */
    public abstract String mo2201();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2221(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f2196;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f2198;
                i14 = bArr != null ? (byte) (bArr[f2200 + i10] + i13) : (short) (f2197[f2200 + i10] + i13);
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f2200 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f2199);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f2198;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f2197;
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final jc.e m2222() {
        int i10 = f2195 + 19;
        f2194 = i10 % 128;
        if (i10 % 2 != 0) {
            ar.m483().mo497().m480();
            try {
                throw null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!ar.m483().mo497().m480()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2221(1175308846 - KeyEvent.normalizeMetaState(0), (short) View.resolveSize(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1028028998, (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 16).intern());
            sb2.append(mo2201());
            return new jc.e(sb2.toString(), m2221((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1175308856, (short) View.getDefaultSize(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1028029042, (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), (-16) - (ViewConfiguration.getScrollBarSize() >> 8)).intern());
        }
        String strM482 = ar.m483().mo497().m482(mo2201());
        if ((TextUtils.isEmpty(strM482) ? '?' : 'B') == '?') {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m2221(1175308846 - KeyEvent.getDeadChar(0, 0), (short) (ViewConfiguration.getTouchSlop() >> 8), (-1028028998) - Gravity.getAbsoluteGravity(0, 0), (byte) (AndroidCharacter.getMirror('0') - '0'), (-16) - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
        sb3.append(mo2201());
        jc.c cVar = new jc.c(sb3.toString(), m2221((ViewConfiguration.getFadingEdgeLength() >> 16) + 1175308857, (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-1028029043) - ExpandableListView.getPackedPositionChild(0L), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-17) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), strM482);
        int i11 = f2194 + 93;
        f2195 = i11 % 128;
        int i12 = i11 % 2;
        return cVar;
    }
}
