package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes7.dex */
public final class fm extends fi<String> {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2057 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2058 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2059 = 320533002;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f2060 = {0};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f2061 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2062 = 59;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2063 = -960068359;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2189(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f2062;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f2060;
                i14 = bArr != null ? (byte) (bArr[f2059 + i10] + i13) : (short) (f2061[f2059 + i10] + i13);
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f2059 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f2063);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f2060;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f2061;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.fi
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2189(TextUtils.lastIndexOf("", '0', 0) - 320533001, (short) ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionGroup(0L) + 960068393, (byte) (Gravity.getAbsoluteGravity(0, 0) - 16), (-58) - KeyEvent.getDeadChar(0, 0)).intern());
        sb2.append(super.toString());
        sb2.append(m2189((-320533002) - ExpandableListView.getPackedPositionGroup(0L), (short) (ViewConfiguration.getLongPressTimeout() >> 16), 960068393 - KeyEvent.normalizeMetaState(0), (byte) ((-16) - View.resolveSize(0, 0)), (-58) - ExpandableListView.getPackedPositionType(0L)).intern());
        String string = sb2.toString();
        int i10 = f2058 + 47;
        f2057 = i10 % 128;
        if (i10 % 2 == 0) {
            return string;
        }
        int i11 = 31 / 0;
        return string;
    }

    public fm(String str, dm dmVar) {
        super(dz.m2133(str), dmVar);
    }
}
