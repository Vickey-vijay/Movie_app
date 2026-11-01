package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bg extends bd {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f787 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f788 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f789 = 47;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f790 = {-126, 124, -115, -124, 118, -116, 0};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f791 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f792 = -1813798625;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f793 = -374900078;

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        int i10 = f787 + 107;
        f788 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m822(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f789;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f790;
                i14 = bArr != null ? (byte) (bArr[f792 + i10] + i13) : (short) (f791[f792 + i10] + i13);
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f792 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f793);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f790;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f791;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﺙ */
    public final boolean mo810() {
        int i10 = f787;
        int i11 = i10 + 23;
        f788 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 37;
        f788 = i13 % 128;
        int i14 = i13 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo811() {
        int i10 = f787 + 17;
        f788 = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        int i10 = f787 + 103;
        f788 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m822(1813798625 - Color.argb(0, 0, 0, 0), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 124), 374900146 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) View.resolveSize(0, 0), (-40) - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
        int i12 = f787 + 65;
        f788 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return strIntern;
        }
        int i13 = 24 / 0;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        int i10 = f788 + 107;
        int i11 = i10 % 128;
        f787 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 75;
        f788 = i13 % 128;
        int i14 = i13 % 2;
        return null;
    }

    public bg(String str) {
        super(str);
    }
}
