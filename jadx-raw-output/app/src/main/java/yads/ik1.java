package yads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Base64;
import android.util.Pair;
import com.ironsource.C3426d4;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public final class ik1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f78683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f78684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f78685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f78686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f78687h;

    public final Point a(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f78683d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = ib3.f78556a;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean b(mx0 mx0Var) {
        if (this.f78687h) {
            return this.f78684e;
        }
        Pair pairB = wk1.b(mx0Var);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final String toString() {
        return this.f78680a;
    }

    public ik1(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        this.f78680a = (String) ni.a((Object) str);
        this.f78681b = str2;
        this.f78682c = str3;
        this.f78683d = codecCapabilities;
        this.f78686g = z10;
        this.f78684e = z11;
        this.f78685f = z12;
        this.f78687h = ht1.f(str2);
    }

    public final va0 a(mx0 mx0Var, mx0 mx0Var2) {
        int i10 = !ib3.a(mx0Var.f80429m, mx0Var2.f80429m) ? 8 : 0;
        if (this.f78687h) {
            if (mx0Var.f80437u != mx0Var2.f80437u) {
                i10 |= 1024;
            }
            if (!this.f78684e && (mx0Var.f80434r != mx0Var2.f80434r || mx0Var.f80435s != mx0Var2.f80435s)) {
                i10 |= 512;
            }
            if (!ib3.a(mx0Var.f80441y, mx0Var2.f80441y)) {
                i10 |= 2048;
            }
            String str = this.f78680a;
            String str2 = ib3.f78559d;
            jk1 jk1Var = pk2.f81440c;
            if (str2.startsWith(jk1Var.b()) && jk1Var.a().equals(str) && !mx0Var.a(mx0Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new va0(this.f78680a, mx0Var, mx0Var2, mx0Var.a(mx0Var2) ? 3 : 2, 0);
            }
        } else {
            if (mx0Var.f80442z != mx0Var2.f80442z) {
                i10 |= 4096;
            }
            if (mx0Var.A != mx0Var2.A) {
                i10 |= 8192;
            }
            if (mx0Var.B != mx0Var2.B) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f78681b)) {
                Pair pairB = wk1.b(mx0Var);
                Pair pairB2 = wk1.b(mx0Var2);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new va0(this.f78680a, mx0Var, mx0Var2, 3, 0);
                    }
                }
            }
            if (!mx0Var.a(mx0Var2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.f78681b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new va0(this.f78680a, mx0Var, mx0Var2, 1, 0);
            }
        }
        return new va0(this.f78680a, mx0Var, mx0Var2, 0, i10);
    }

    public final boolean a(mx0 mx0Var) {
        int i10;
        Pair pairB;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (!this.f78681b.equals(mx0Var.f80429m) && !this.f78681b.equals(wk1.a(mx0Var))) {
            return false;
        }
        int i11 = 16;
        if (mx0Var.f80426j != null && (pairB = wk1.b(mx0Var)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            int iIntValue2 = ((Integer) pairB.second).intValue();
            int i12 = 8;
            if ("video/dolby-vision".equals(mx0Var.f80429m)) {
                if ("video/avc".equals(this.f78681b)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(this.f78681b)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (this.f78687h || iIntValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f78683d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (ib3.f78556a <= 23 && "video/x-vnd.on2.vp9".equals(this.f78681b) && codecProfileLevelArr.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f78683d;
                    int iIntValue3 = (codecCapabilities2 == null || (videoCapabilities = codecCapabilities2.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i12 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i12 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i12 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i12 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i12 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i12 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i12 = 16;
                    } else if (iIntValue3 < 3600000) {
                        if (iIntValue3 >= 1800000) {
                            i12 = 4;
                        } else {
                            i12 = iIntValue3 >= 800000 ? 2 : 1;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i12;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                int length = codecProfileLevelArr.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = codecProfileLevelArr[i13];
                        if (codecProfileLevel2.profile == iIntValue && codecProfileLevel2.level >= iIntValue2) {
                            if (!"video/hevc".equals(this.f78681b) || 2 != iIntValue) {
                                break;
                            }
                            byte[] bArrDecode = Base64.decode("c2FpbGZpc2g=", 0);
                            Charset charset = lk.c.f63591b;
                            String str = new String(bArrDecode, charset);
                            String str2 = ib3.f78557b;
                            if (!str.equals(str2) && !new String(Base64.decode("bWFybGlu", 0), charset).equals(str2)) {
                                break;
                            }
                        }
                        i13++;
                    } else {
                        a("codec.profileLevel, " + mx0Var.f80426j + ", " + this.f78682c);
                        return false;
                    }
                }
            }
        }
        if (this.f78687h) {
            int i14 = mx0Var.f80434r;
            if (i14 <= 0 || (i10 = mx0Var.f80435s) <= 0) {
                return true;
            }
            if (ib3.f78556a >= 21) {
                return a(i14, i10, mx0Var.f80436t);
            }
            boolean z10 = i14 * i10 <= wk1.a();
            if (!z10) {
                a("legacyFrameSize, " + mx0Var.f80434r + VastAttributes.HORIZONTAL_POSITION + mx0Var.f80435s);
            }
            return z10;
        }
        int i15 = ib3.f78556a;
        if (i15 >= 21) {
            int i16 = mx0Var.A;
            if (i16 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f78683d;
                if (codecCapabilities3 == null) {
                    a("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities3.getAudioCapabilities();
                if (audioCapabilities == null) {
                    a("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i16)) {
                    a("sampleRate.support, " + i16);
                    return false;
                }
            }
            int i17 = mx0Var.f80442z;
            if (i17 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities4 = this.f78683d;
                if (codecCapabilities4 == null) {
                    a("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities4.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    a("channelCount.aCaps");
                    return false;
                }
                String str3 = this.f78680a;
                String str4 = this.f78681b;
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i15 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str4) && !"audio/3gpp".equals(str4) && !"audio/amr-wb".equals(str4) && !"audio/mp4a-latm".equals(str4) && !"audio/vorbis".equals(str4) && !"audio/opus".equals(str4) && !"audio/raw".equals(str4) && !"audio/flac".equals(str4) && !"audio/g711-alaw".equals(str4) && !"audio/g711-mlaw".equals(str4) && !"audio/gsm".equals(str4))) {
                    if ("audio/ac3".equals(str4)) {
                        i11 = 6;
                    } else if (!"audio/eac3".equals(str4)) {
                        i11 = 30;
                    }
                    ih1.d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str3 + ", [" + maxInputChannelCount + " to " + i11 + C3426d4.j.f28588e);
                    maxInputChannelCount = i11;
                }
                if (maxInputChannelCount < i17) {
                    a("channelCount.support, " + i17);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean a(int i10, int i11, double d10) {
        boolean zIsSizeSupported;
        boolean zIsSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f78683d;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = ib3.f78556a;
        Point point = new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i13 = point.x;
        int i14 = point.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            zIsSizeSupported = videoCapabilities.areSizeAndRateSupported(i13, i14, Math.floor(d10));
        } else {
            zIsSizeSupported = videoCapabilities.isSizeSupported(i13, i14);
        }
        if (!zIsSizeSupported) {
            if (i10 < i11) {
                String str = this.f78680a;
                byte[] bArrDecode = Base64.decode("T01YLk1USy5WSURFTy5ERUNPREVSLkhFVkM=", 0);
                Charset charset = lk.c.f63591b;
                if (!new String(bArrDecode, charset).equals(str) || !new String(Base64.decode("bWN2NWE=", 0), charset).equals(ib3.f78557b)) {
                    int widthAlignment2 = videoCapabilities.getWidthAlignment();
                    int heightAlignment2 = videoCapabilities.getHeightAlignment();
                    Point point2 = new Point((((i11 + widthAlignment2) - 1) / widthAlignment2) * widthAlignment2, (((i10 + heightAlignment2) - 1) / heightAlignment2) * heightAlignment2);
                    int i15 = point2.x;
                    int i16 = point2.y;
                    if (d10 != -1.0d && d10 >= 1.0d) {
                        zIsSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i15, i16, Math.floor(d10));
                    } else {
                        zIsSizeSupported2 = videoCapabilities.isSizeSupported(i15, i16);
                    }
                    if (zIsSizeSupported2) {
                        ih1.a("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i10 + VastAttributes.HORIZONTAL_POSITION + i11 + VastAttributes.HORIZONTAL_POSITION + d10) + "] [" + this.f78680a + ", " + this.f78681b + "] [" + ib3.f78560e + C3426d4.j.f28588e);
                    }
                }
            }
            a("sizeAndRate.support, " + i10 + VastAttributes.HORIZONTAL_POSITION + i11 + VastAttributes.HORIZONTAL_POSITION + d10);
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    public static ik1 a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        int i10;
        if (codecCapabilities == null || (i10 = ib3.f78556a) < 19 || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z14 = false;
        } else {
            if (i10 <= 22) {
                byte[] bArrDecode = Base64.decode("T0RST0lELVhVMw==", 0);
                Charset charset = lk.c.f63591b;
                String str4 = new String(bArrDecode, charset);
                String str5 = ib3.f78559d;
                if ((str4.equals(str5) || new String(Base64.decode("TmV4dXMgMTA=", 0), charset).equals(str5)) && (new String(Base64.decode("T01YLkV4eW5vcy5BVkMuRGVjb2Rlcg==", 0), charset).equals(str) || new String(Base64.decode("T01YLkV4eW5vcy5BVkMuRGVjb2Rlci5zZWN1cmU=", 0), charset).equals(str))) {
                    z14 = false;
                }
            }
            z14 = true;
        }
        if (codecCapabilities != null && ib3.f78556a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new ik1(str, str2, str3, codecCapabilities, z10, z14, z13 || (codecCapabilities != null && ib3.f78556a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public final boolean a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (ib3.f78556a >= 29 && "video/x-vnd.on2.vp9".equals(this.f78681b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f78683d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(String str) {
        ih1.a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f78680a + ", " + this.f78681b + "] [" + ib3.f78560e + C3426d4.j.f28588e);
    }
}
