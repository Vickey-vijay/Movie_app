package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f17007h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f17008i = {44100, 48000, 32000};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f17009j = {32, 64, 96, 128, 160, 192, 224, 256, 288, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 352, 384, 416, 448};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f17010k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f17011l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f17012m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f17013n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17020g;

    public static int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f17008i[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f17009j[i13 - 1] : f17010k[i13 - 1]) * 12000) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f17011l[i13 - 1] : f17012m[i13 - 1];
        } else {
            i15 = f17013n[i13 - 1];
        }
        if (i11 == 3) {
            return ((i15 * 144000) / i16) + i17;
        }
        return (((i12 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000) * i15) / i16) + i17;
    }

    public static boolean a(int i10, n nVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i19 = f17008i[i14];
        if (i11 == 2) {
            i19 /= 2;
        } else if (i11 == 0) {
            i19 /= 4;
        }
        int i20 = (i10 >>> 9) & 1;
        int i21 = 1152;
        if (i12 == 3) {
            i15 = i11 == 3 ? f17009j[i13 - 1] : f17010k[i13 - 1];
            i17 = (((i15 * 12000) / i19) + i20) * 4;
            i18 = 384;
        } else {
            if (i11 == 3) {
                i15 = i12 == 2 ? f17011l[i13 - 1] : f17012m[i13 - 1];
                i16 = (144000 * i15) / i19;
            } else {
                i15 = f17013n[i13 - 1];
                i21 = i12 == 1 ? 576 : 1152;
                i16 = ((i12 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000) * i15) / i19;
            }
            int i22 = i21;
            i17 = i20 + i16;
            i18 = i22;
        }
        String str = f17007h[3 - i12];
        int i23 = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        nVar.f17014a = i11;
        nVar.f17015b = str;
        nVar.f17016c = i17;
        nVar.f17017d = i19;
        nVar.f17018e = i23;
        nVar.f17019f = i15 * 1000;
        nVar.f17020g = i18;
        return true;
    }
}
