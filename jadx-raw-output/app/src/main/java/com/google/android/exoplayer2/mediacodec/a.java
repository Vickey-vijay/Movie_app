package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.ironsource.C3426d4;
import g5.k0;
import g5.m;
import g5.p;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: compiled from: MediaCodecInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f19248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f19249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final MediaCodecInfo.CodecCapabilities f19250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19256j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f19257k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f19258l;

    public static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((k0.f53108a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        if ("audio/ac3".equals(str2)) {
            i11 = 6;
        } else {
            i11 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        m.h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + C3426d4.j.f28588e);
        return i11;
    }

    public static final boolean e(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(k0.f53109b)) ? false : true;
    }

    public static boolean g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return k0.f53108a >= 19 && h(codecCapabilities);
    }

    @TargetApi(19)
    public static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean p(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return k0.f53108a >= 21 && q(codecCapabilities);
    }

    @TargetApi(21)
    public static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return k0.f53108a >= 21 && s(codecCapabilities);
    }

    @TargetApi(21)
    public static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static a w(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new a(str, str2, str3, codecCapabilities, false, z10, z11, z12, z13, z14);
    }

    public static a x(String str) {
        return new a(str, null, null, null, true, false, true, false, false, false);
    }

    @TargetApi(21)
    public Point b(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19250d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i10, i11);
    }

    public MediaCodecInfo.CodecProfileLevel[] f() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19250d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @TargetApi(21)
    public boolean i(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19250d;
        if (codecCapabilities == null) {
            v("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            v("channelCount.aCaps");
            return false;
        }
        if (a(this.f19247a, this.f19248b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        v("channelCount.support, " + i10);
        return false;
    }

    @TargetApi(21)
    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19250d;
        if (codecCapabilities == null) {
            v("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            v("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        v("sampleRate.support, " + i10);
        return false;
    }

    public boolean k(Format format) {
        String strE;
        String str = format.f18967g;
        if (str == null || this.f19248b == null || (strE = p.e(str)) == null) {
            return true;
        }
        if (!this.f19248b.equals(strE)) {
            v("codec.mime " + format.f18967g + ", " + strE);
            return false;
        }
        Pair<Integer, Integer> pairL = MediaCodecUtil.l(format);
        if (pairL == null) {
            return true;
        }
        int iIntValue = ((Integer) pairL.first).intValue();
        int iIntValue2 = ((Integer) pairL.second).intValue();
        if (!this.f19258l && iIntValue != 42) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : f()) {
            if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2) {
                return true;
            }
        }
        v("codec.profileLevel, " + format.f18967g + ", " + strE);
        return false;
    }

    public boolean m() {
        if (k0.f53108a >= 29 && "video/x-vnd.on2.vp9".equals(this.f19248b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : f()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean n(Format format) {
        if (this.f19258l) {
            return this.f19251e;
        }
        Pair<Integer, Integer> pairL = MediaCodecUtil.l(format);
        return pairL != null && ((Integer) pairL.first).intValue() == 42;
    }

    public boolean o(Format format, Format format2, boolean z10) {
        if (this.f19258l) {
            return format.f18970j.equals(format2.f18970j) && format.f18978r == format2.f18978r && (this.f19251e || (format.f18975o == format2.f18975o && format.f18976p == format2.f18976p)) && ((!z10 && format2.f18982v == null) || k0.c(format.f18982v, format2.f18982v));
        }
        if ("audio/mp4a-latm".equals(this.f19248b) && format.f18970j.equals(format2.f18970j) && format.f18983w == format2.f18983w && format.f18984x == format2.f18984x) {
            Pair<Integer, Integer> pairL = MediaCodecUtil.l(format);
            Pair<Integer, Integer> pairL2 = MediaCodecUtil.l(format2);
            if (pairL != null && pairL2 != null) {
                return ((Integer) pairL.first).intValue() == 42 && ((Integer) pairL2.first).intValue() == 42;
            }
        }
        return false;
    }

    @TargetApi(21)
    public boolean t(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19250d;
        if (codecCapabilities == null) {
            v("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            v("sizeAndRate.vCaps");
            return false;
        }
        if (d(videoCapabilities, i10, i11, d10)) {
            return true;
        }
        if (i10 < i11 && e(this.f19247a) && d(videoCapabilities, i11, i10, d10)) {
            u("sizeAndRate.rotated, " + i10 + VastAttributes.HORIZONTAL_POSITION + i11 + VastAttributes.HORIZONTAL_POSITION + d10);
            return true;
        }
        v("sizeAndRate.support, " + i10 + VastAttributes.HORIZONTAL_POSITION + i11 + VastAttributes.HORIZONTAL_POSITION + d10);
        return false;
    }

    public String toString() {
        return this.f19247a;
    }

    public final void u(String str) {
        m.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f19247a + ", " + this.f19248b + "] [" + k0.f53112e + C3426d4.j.f28588e);
    }

    public final void v(String str) {
        m.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f19247a + ", " + this.f19248b + "] [" + k0.f53112e + C3426d4.j.f28588e);
    }

    public a(String str, @Nullable String str2, @Nullable String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        boolean z16;
        boolean z17;
        this.f19247a = (String) g5.a.e(str);
        this.f19248b = str2;
        this.f19249c = str3;
        this.f19250d = codecCapabilities;
        this.f19254h = z10;
        this.f19255i = z11;
        this.f19256j = z12;
        this.f19257k = z13;
        boolean z18 = true;
        if (!z14 && codecCapabilities != null && g(codecCapabilities)) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.f19251e = z16;
        if (codecCapabilities != null && r(codecCapabilities)) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.f19252f = z17;
        if (!z15 && (codecCapabilities == null || !p(codecCapabilities))) {
            z18 = false;
        }
        this.f19253g = z18;
        this.f19258l = p.n(str2);
    }

    @TargetApi(21)
    public static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(k0.k(i10, widthAlignment) * widthAlignment, k0.k(i11, heightAlignment) * heightAlignment);
    }

    @TargetApi(21)
    public static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointC = c(videoCapabilities, i10, i11);
        int i12 = pointC.x;
        int i13 = pointC.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    public boolean l(Format format) throws MediaCodecUtil.DecoderQueryException {
        int i10;
        boolean z10 = false;
        if (!k(format)) {
            return false;
        }
        if (this.f19258l) {
            int i11 = format.f18975o;
            if (i11 <= 0 || (i10 = format.f18976p) <= 0) {
                return true;
            }
            if (k0.f53108a >= 21) {
                return t(i11, i10, format.f18977q);
            }
            if (i11 * i10 <= MediaCodecUtil.H()) {
                z10 = true;
            }
            if (!z10) {
                v("legacyFrameSize, " + format.f18975o + VastAttributes.HORIZONTAL_POSITION + format.f18976p);
            }
            return z10;
        }
        if (k0.f53108a >= 21) {
            int i12 = format.f18984x;
            if (i12 != -1 && !j(i12)) {
                return false;
            }
            int i13 = format.f18983w;
            if (i13 != -1 && !i(i13)) {
                return false;
            }
        }
        return true;
    }
}
