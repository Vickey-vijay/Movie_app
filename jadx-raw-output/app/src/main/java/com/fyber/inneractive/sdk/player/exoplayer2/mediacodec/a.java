package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C3426d4;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f17432e;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean a(String str) {
        String strA;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Integer numValueOf;
        Integer numValueOf2;
        if (str == null || this.f17431d == null || (strA = com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str)) == null) {
            return true;
        }
        if (!this.f17431d.equals(strA)) {
            b("codec.mime " + str + ", " + strA);
            return false;
        }
        Pattern pattern = j.f17457a;
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit[0];
        str2.getClass();
        byte b10 = -1;
        int i10 = 2;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    b10 = 0;
                }
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    b10 = 1;
                }
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    b10 = 2;
                }
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    b10 = 3;
                }
                break;
        }
        Pair pair = null;
        switch (b10) {
            case 0:
            case 1:
                if (strArrSplit.length < 2) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                } else {
                    try {
                        if (strArrSplit[1].length() == 6) {
                            numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(0, 2), 16));
                            numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(4), 16));
                        } else if (strArrSplit.length < 3) {
                            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                        } else {
                            numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                            numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[2]));
                        }
                        pair = new Pair(Integer.valueOf(j.f17459c.get(numValueOf.intValue())), Integer.valueOf(j.f17460d.get(numValueOf2.intValue())));
                    } catch (NumberFormatException unused) {
                        Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                    }
                }
                break;
            case 2:
            case 3:
                if (strArrSplit.length < 4) {
                    Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                } else {
                    Matcher matcher = j.f17457a.matcher(strArrSplit[1]);
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        if ("1".equals(strGroup)) {
                            i10 = 1;
                        } else if (!"2".equals(strGroup)) {
                            Log.w("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                            break;
                        }
                        Integer num = (Integer) j.f17461e.get(strArrSplit[3]);
                        if (num == null) {
                            Log.w("MediaCodecUtil", "Unknown HEVC level string: " + matcher.group(1));
                        } else {
                            pair = new Pair(Integer.valueOf(i10), num);
                        }
                    } else {
                        Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                    }
                }
                break;
        }
        if (pair == null) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17432e;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == ((Integer) pair.first).intValue() && codecProfileLevel.level >= ((Integer) pair.second).intValue()) {
                return true;
            }
        }
        b("codec.profileLevel, " + str + ", " + strA);
        return false;
    }

    public final boolean b(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17432e;
        if (codecCapabilities == null) {
            b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        b("sampleRate.support, " + i10);
        return false;
    }

    public a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10) {
        boolean z11;
        str.getClass();
        this.f17428a = str;
        this.f17431d = str2;
        this.f17432e = codecCapabilities;
        if (!z10 && codecCapabilities != null && z.f17873a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f17429b = z11;
        this.f17430c = codecCapabilities != null && z.f17873a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public final void b(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f17428a + ", " + this.f17431d + "] [" + z.f17877e + C3426d4.j.f28588e);
    }

    public final boolean a(int i10, int i11, double d10) {
        boolean zIsSizeSupported;
        boolean zIsSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17432e;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        }
        if (d10 != -1.0d && d10 > 0.0d) {
            zIsSizeSupported = videoCapabilities.areSizeAndRateSupported(i10, i11, d10);
        } else {
            zIsSizeSupported = videoCapabilities.isSizeSupported(i10, i11);
        }
        if (zIsSizeSupported) {
            return true;
        }
        if (i10 < i11) {
            if (d10 != -1.0d && d10 > 0.0d) {
                zIsSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i11, i10, d10);
            } else {
                zIsSizeSupported2 = videoCapabilities.isSizeSupported(i11, i10);
            }
            if (zIsSizeSupported2) {
                Log.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i10 + VastAttributes.HORIZONTAL_POSITION + i11 + VastAttributes.HORIZONTAL_POSITION + d10) + "] [" + this.f17428a + ", " + this.f17431d + "] [" + z.f17877e + C3426d4.j.f28588e);
                return true;
            }
        }
        b("sizeAndRate.support, " + i10 + VastAttributes.HORIZONTAL_POSITION + i11 + VastAttributes.HORIZONTAL_POSITION + d10);
        return false;
    }

    public final Point a(int i10, int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17432e;
        if (codecCapabilities == null) {
            b("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = z.f17873a;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean a(int i10) {
        int i11;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17432e;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        }
        String str = this.f17428a;
        String str2 = this.f17431d;
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((z.f17873a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            if ("audio/ac3".equals(str2)) {
                i11 = 6;
            } else {
                i11 = "audio/eac3".equals(str2) ? 16 : 30;
            }
            Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i11 + C3426d4.j.f28588e);
            maxInputChannelCount = i11;
        }
        if (maxInputChannelCount >= i10) {
            return true;
        }
        b("channelCount.support, " + i10);
        return false;
    }
}
