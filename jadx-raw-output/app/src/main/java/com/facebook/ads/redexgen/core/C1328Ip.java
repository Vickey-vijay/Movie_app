package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ip, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
public final class C1328Ip {
    public static String[] A08 = {"AtxLAVOLIQu", "Fle8gwQlySsExFOL9KX8wb0v", "wFpk", "KqR90lH25ch62x6cAj66e37DOVxg4eZG", "XchR4DYnLnD3gtwkslZg", "tO3f9MPY4MkMP3", "", "TthioVfwXchWaR6I8DsFZ4y13Jptm90E"};
    public final int A00;
    public final int A01;
    public final long A02;
    public final C1325Im A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public C1328Ip(C1325Im c1325Im, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        C3M.A07(iArr.length == jArr2.length);
        C3M.A07(jArr.length == jArr2.length);
        C3M.A07(iArr2.length == jArr2.length);
        this.A03 = c1325Im;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i10;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j10;
        this.A01 = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int A00(long j10) {
        for (int iA0L = AbstractC09664a.A0L(this.A07, j10, true, false); iA0L >= 0; iA0L--) {
            int i10 = this.A04[iA0L] & 1;
            int i11 = A08[1].length();
            if (i11 == 25) {
                throw new RuntimeException();
            }
            A08[1] = "GcE";
            if (i10 != 0) {
                return iA0L;
            }
        }
        return -1;
    }

    public final int A01(long j10) {
        for (int i10 = AbstractC09664a.A0K(this.A07, j10, true, false); i10 < startIndex; i10++) {
            int startIndex = this.A04[i10];
            if ((startIndex & 1) != 0) {
                return i10;
            }
        }
        return -1;
    }
}
