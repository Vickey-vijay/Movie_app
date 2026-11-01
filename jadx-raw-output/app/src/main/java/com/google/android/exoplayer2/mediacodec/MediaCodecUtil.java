package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.video.ColorInfo;
import com.inmobi.media.core.config.models.AdConfig;
import g5.k0;
import g5.m;
import g5.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseIntArray f19232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SparseIntArray f19233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f19234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f19235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map<String, Integer> f19236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map<String, Integer> f19237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map<String, Integer> f19238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f19239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final SparseIntArray f19240k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f19230a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<b, List<com.google.android.exoplayer2.mediacodec.a>> f19231b = new HashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f19241l = -1;

    public static class DecoderQueryException extends Exception {
        public DecoderQueryException(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f19243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19244c;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f19242a, bVar.f19242a) && this.f19243b == bVar.f19243b && this.f19244c == bVar.f19244c;
        }

        public int hashCode() {
            return ((((this.f19242a.hashCode() + 31) * 31) + (this.f19243b ? 1231 : 1237)) * 31) + (this.f19244c ? 1231 : 1237);
        }

        public b(String str, boolean z10, boolean z11) {
            this.f19242a = str;
            this.f19243b = z10;
            this.f19244c = z11;
        }
    }

    public interface c {
        int getCodecCount();

        MediaCodecInfo getCodecInfoAt(int i10);

        boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    public static final class d implements c {
        public d() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean secureDecodersExplicit() {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo getCodecInfoAt(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }
    }

    @TargetApi(21)
    public static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public MediaCodecInfo[] f19246b;

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean secureDecodersExplicit() {
            return true;
        }

        public final void a() {
            if (this.f19246b == null) {
                this.f19246b = new MediaCodecList(this.f19245a).getCodecInfos();
            }
        }

        public e(boolean z10, boolean z11) {
            int i10;
            if (!z10 && !z11) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            this.f19245a = i10;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int getCodecCount() {
            a();
            return this.f19246b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo getCodecInfoAt(int i10) {
            a();
            return this.f19246b[i10];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }
    }

    public interface f<T> {
        int getScore(T t10);
    }

    public static int f(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    @Nullable
    public static Pair<Integer, Integer> h(String str, String[] strArr) {
        if (strArr.length != 3) {
            m.h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(p.f(Integer.parseInt(strArr[1], 16)))) {
                int i10 = f19240k.get(Integer.parseInt(strArr[2]), -1);
                if (i10 != -1) {
                    return new Pair<>(Integer.valueOf(i10), 0);
                }
            }
        } catch (NumberFormatException unused) {
            m.h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    @Nullable
    public static Pair<Integer, Integer> i(String str, String[] strArr, @Nullable ColorInfo colorInfo) {
        int i10;
        if (strArr.length < 4) {
            m.h("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i11 = 1;
        try {
            int i12 = Integer.parseInt(strArr[1]);
            int i13 = Integer.parseInt(strArr[2].substring(0, 2));
            int i14 = Integer.parseInt(strArr[3]);
            if (i12 != 0) {
                m.h("MediaCodecUtil", "Unknown AV1 profile: " + i12);
                return null;
            }
            if (i14 != 8 && i14 != 10) {
                m.h("MediaCodecUtil", "Unknown AV1 bit depth: " + i14);
                return null;
            }
            if (i14 != 8) {
                i11 = (colorInfo == null || !(colorInfo.f20209e != null || (i10 = colorInfo.f20208d) == 7 || i10 == 6)) ? 2 : 4096;
            }
            int i15 = f19239j.get(i13, -1);
            if (i15 != -1) {
                return new Pair<>(Integer.valueOf(i11), Integer.valueOf(i15));
            }
            m.h("MediaCodecUtil", "Unknown AV1 level: " + i13);
            return null;
        } catch (NumberFormatException unused) {
            m.h("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    @Nullable
    public static Pair<Integer, Integer> j(String str, String[] strArr) {
        int i10;
        int i11;
        if (strArr.length < 2) {
            m.h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    m.h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i12 = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                i11 = i12;
            }
            int i13 = f19232c.get(i11, -1);
            if (i13 == -1) {
                m.h("MediaCodecUtil", "Unknown AVC profile: " + i11);
                return null;
            }
            int i14 = f19233d.get(i10, -1);
            if (i14 != -1) {
                return new Pair<>(Integer.valueOf(i13), Integer.valueOf(i14));
            }
            m.h("MediaCodecUtil", "Unknown AVC level: " + i10);
            return null;
        } catch (NumberFormatException unused) {
            m.h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    @Nullable
    public static Pair<Integer, Integer> q(String str, String[] strArr) {
        if (strArr.length < 3) {
            m.h("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f19230a.matcher(strArr[1]);
        if (!matcher.matches()) {
            m.h("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer num = f19237h.get(strGroup);
        if (num == null) {
            m.h("MediaCodecUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer num2 = f19238i.get(str2);
        if (num2 != null) {
            return new Pair<>(num, num2);
        }
        m.h("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    @Nullable
    public static Pair<Integer, Integer> r(String str, String[] strArr) {
        if (strArr.length < 4) {
            m.h("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i10 = 1;
        Matcher matcher = f19230a.matcher(strArr[1]);
        if (!matcher.matches()) {
            m.h("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                m.h("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
            i10 = 2;
        }
        String str2 = strArr[3];
        Integer num = f19236g.get(str2);
        if (num != null) {
            return new Pair<>(Integer.valueOf(i10), num);
        }
        m.h("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    @Nullable
    public static Pair<Integer, Integer> t(String str, String[] strArr) {
        if (strArr.length < 3) {
            m.h("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i10 = Integer.parseInt(strArr[1]);
            int i11 = Integer.parseInt(strArr[2]);
            int i12 = f19234e.get(i10, -1);
            if (i12 == -1) {
                m.h("MediaCodecUtil", "Unknown VP9 profile: " + i10);
                return null;
            }
            int i13 = f19235f.get(i11, -1);
            if (i13 != -1) {
                return new Pair<>(Integer.valueOf(i12), Integer.valueOf(i13));
            }
            m.h("MediaCodecUtil", "Unknown VP9 level: " + i11);
            return null;
        } catch (NumberFormatException unused) {
            m.h("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19232c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        sparseIntArray.put(110, 16);
        sparseIntArray.put(122, 32);
        sparseIntArray.put(244, 64);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f19233d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        f19234e = sparseIntArray3;
        sparseIntArray3.put(0, 1);
        sparseIntArray3.put(1, 2);
        sparseIntArray3.put(2, 4);
        sparseIntArray3.put(3, 8);
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        f19235f = sparseIntArray4;
        sparseIntArray4.put(10, 1);
        sparseIntArray4.put(11, 2);
        sparseIntArray4.put(20, 4);
        sparseIntArray4.put(21, 8);
        sparseIntArray4.put(30, 16);
        sparseIntArray4.put(31, 32);
        sparseIntArray4.put(40, 64);
        sparseIntArray4.put(41, 128);
        sparseIntArray4.put(50, 256);
        sparseIntArray4.put(51, 512);
        sparseIntArray4.put(60, 2048);
        sparseIntArray4.put(61, 4096);
        sparseIntArray4.put(62, 8192);
        HashMap map = new HashMap();
        f19236g = map;
        map.put("L30", 1);
        map.put("L60", 4);
        map.put("L63", 16);
        map.put("L90", 64);
        map.put("L93", 256);
        map.put("L120", 1024);
        map.put("L123", 4096);
        map.put("L150", 16384);
        map.put("L153", 65536);
        map.put("L156", 262144);
        map.put("L180", 1048576);
        map.put("L183", 4194304);
        map.put("L186", 16777216);
        map.put("H30", 2);
        map.put("H60", 8);
        map.put("H63", 32);
        map.put("H90", 128);
        map.put("H93", 512);
        map.put("H120", 2048);
        map.put("H123", 8192);
        map.put("H150", 32768);
        map.put("H153", 131072);
        map.put("H156", 524288);
        map.put("H180", 2097152);
        map.put("H183", 8388608);
        map.put("H186", 33554432);
        HashMap map2 = new HashMap();
        f19237h = map2;
        map2.put("00", 1);
        map2.put("01", 2);
        map2.put("02", 4);
        map2.put("03", 8);
        map2.put("04", 16);
        map2.put("05", 32);
        map2.put("06", 64);
        map2.put("07", 128);
        map2.put("08", 256);
        map2.put("09", 512);
        HashMap map3 = new HashMap();
        f19238i = map3;
        map3.put("01", 1);
        map3.put("02", 2);
        map3.put("03", 4);
        map3.put("04", 8);
        map3.put("05", 16);
        map3.put("06", 32);
        map3.put("07", 64);
        map3.put("08", 128);
        map3.put("09", 256);
        SparseIntArray sparseIntArray5 = new SparseIntArray();
        f19239j = sparseIntArray5;
        sparseIntArray5.put(0, 1);
        sparseIntArray5.put(1, 2);
        sparseIntArray5.put(2, 4);
        sparseIntArray5.put(3, 8);
        sparseIntArray5.put(4, 16);
        sparseIntArray5.put(5, 32);
        sparseIntArray5.put(6, 64);
        sparseIntArray5.put(7, 128);
        sparseIntArray5.put(8, 256);
        sparseIntArray5.put(9, 512);
        sparseIntArray5.put(10, 1024);
        sparseIntArray5.put(11, 2048);
        sparseIntArray5.put(12, 4096);
        sparseIntArray5.put(13, 8192);
        sparseIntArray5.put(14, 16384);
        sparseIntArray5.put(15, 32768);
        sparseIntArray5.put(16, 65536);
        sparseIntArray5.put(17, 131072);
        sparseIntArray5.put(18, 262144);
        sparseIntArray5.put(19, 524288);
        sparseIntArray5.put(20, 1048576);
        sparseIntArray5.put(21, 2097152);
        sparseIntArray5.put(22, 4194304);
        sparseIntArray5.put(23, 8388608);
        SparseIntArray sparseIntArray6 = new SparseIntArray();
        f19240k = sparseIntArray6;
        sparseIntArray6.put(1, 1);
        sparseIntArray6.put(2, 2);
        sparseIntArray6.put(3, 3);
        sparseIntArray6.put(4, 4);
        sparseIntArray6.put(5, 5);
        sparseIntArray6.put(6, 6);
        sparseIntArray6.put(17, 17);
        sparseIntArray6.put(20, 20);
        sparseIntArray6.put(23, 23);
        sparseIntArray6.put(29, 29);
        sparseIntArray6.put(39, 39);
        sparseIntArray6.put(42, 42);
    }

    public static boolean B(MediaCodecInfo mediaCodecInfo) {
        if (k0.f53108a >= 29) {
            return C(mediaCodecInfo);
        }
        String strK0 = k0.K0(mediaCodecInfo.getName());
        return (strK0.startsWith("omx.google.") || strK0.startsWith("c2.android.") || strK0.startsWith("c2.google.")) ? false : true;
    }

    public static /* synthetic */ int D(com.google.android.exoplayer2.mediacodec.a aVar) {
        String str = aVar.f19247a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (k0.f53108a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int E(com.google.android.exoplayer2.mediacodec.a aVar) {
        return aVar.f19247a.startsWith("OMX.google") ? 1 : 0;
    }

    public static int H() throws DecoderQueryException {
        if (f19241l == -1) {
            int iMax = 0;
            com.google.android.exoplayer2.mediacodec.a aVarM = m("video/avc", false, false);
            if (aVarM != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrF = aVarM.f();
                int length = codecProfileLevelArrF.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(f(codecProfileLevelArrF[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, k0.f53108a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            f19241l = iMax;
        }
        return f19241l;
    }

    public static <T> void I(List<T> list, final f<T> fVar) {
        Collections.sort(list, new Comparator() { // from class: b4.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.G(fVar, obj, obj2);
            }
        });
    }

    public static void e(String str, List<com.google.android.exoplayer2.mediacodec.a> list) {
        if ("audio/raw".equals(str)) {
            if (k0.f53108a < 26 && k0.f53109b.equals("R9") && list.size() == 1 && list.get(0).f19247a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(com.google.android.exoplayer2.mediacodec.a.w("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            I(list, new f() { // from class: b4.a
                @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                public final int getScore(Object obj) {
                    return MediaCodecUtil.D((com.google.android.exoplayer2.mediacodec.a) obj);
                }
            });
        }
        int i10 = k0.f53108a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = list.get(0).f19247a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                I(list, new f() { // from class: b4.b
                    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                    public final int getScore(Object obj) {
                        return MediaCodecUtil.E((com.google.android.exoplayer2.mediacodec.a) obj);
                    }
                });
            }
        }
        if (i10 >= 30 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f19247a)) {
            return;
        }
        list.add(list.remove(0));
    }

    public static boolean g(String str) {
        if (k0.f53108a <= 22) {
            String str2 = k0.f53111d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static Pair<Integer, Integer> l(Format format) {
        String str = format.f18967g;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(format.f18970j)) {
            return q(format.f18967g, strArrSplit);
        }
        byte b10 = 0;
        String str2 = strArrSplit[0];
        str2.hashCode();
        switch (str2.hashCode()) {
            case 3004662:
                if (!str2.equals("av01")) {
                    b10 = -1;
                }
                break;
            case 3006243:
                b10 = !str2.equals("avc1") ? (byte) -1 : (byte) 1;
                break;
            case 3006244:
                b10 = !str2.equals("avc2") ? (byte) -1 : (byte) 2;
                break;
            case 3199032:
                b10 = !str2.equals("hev1") ? (byte) -1 : (byte) 3;
                break;
            case 3214780:
                b10 = !str2.equals("hvc1") ? (byte) -1 : (byte) 4;
                break;
            case 3356560:
                b10 = !str2.equals("mp4a") ? (byte) -1 : (byte) 5;
                break;
            case 3624515:
                b10 = !str2.equals("vp09") ? (byte) -1 : (byte) 6;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return i(format.f18967g, strArrSplit, format.f18982v);
            case 1:
            case 2:
                return j(format.f18967g, strArrSplit);
            case 3:
            case 4:
                return r(format.f18967g, strArrSplit);
            case 5:
                return h(format.f18967g, strArrSplit);
            case 6:
                return t(format.f18967g, strArrSplit);
            default:
                return null;
        }
    }

    public static synchronized List<com.google.android.exoplayer2.mediacodec.a> n(String str, boolean z10, boolean z11) throws DecoderQueryException {
        b bVar = new b(str, z10, z11);
        HashMap<b, List<com.google.android.exoplayer2.mediacodec.a>> map = f19231b;
        List<com.google.android.exoplayer2.mediacodec.a> list = map.get(bVar);
        if (list != null) {
            return list;
        }
        int i10 = k0.f53108a;
        ArrayList<com.google.android.exoplayer2.mediacodec.a> arrayListO = o(bVar, i10 >= 21 ? new e(z10, z11) : new d());
        if (z10 && arrayListO.isEmpty() && 21 <= i10 && i10 <= 23) {
            arrayListO = o(bVar, new d());
            if (!arrayListO.isEmpty()) {
                m.h("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListO.get(0).f19247a);
            }
        }
        e(str, arrayListO);
        List<com.google.android.exoplayer2.mediacodec.a> listUnmodifiableList = Collections.unmodifiableList(arrayListO);
        map.put(bVar, listUnmodifiableList);
        return listUnmodifiableList;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x0104 A[Catch: Exception -> 0x0152, TRY_ENTER, TryCatch #5 {Exception -> 0x0152, blocks: (B:3:0x0008, B:5:0x001b, B:60:0x0123, B:8:0x002d, B:11:0x0038, B:54:0x00fc, B:57:0x0104, B:59:0x010a, B:61:0x012d, B:62:0x0150), top: B:77:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:81:0x012d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static ArrayList<com.google.android.exoplayer2.mediacodec.a> o(b bVar, c cVar) throws DecoderQueryException {
        String strK;
        String str;
        String str2;
        int i10;
        boolean z10;
        int i11;
        b bVar2 = bVar;
        try {
            ArrayList<com.google.android.exoplayer2.mediacodec.a> arrayList = new ArrayList<>();
            String str3 = bVar2.f19242a;
            boolean zSecureDecodersExplicit = cVar.secureDecodersExplicit();
            int i12 = 0;
            for (int codecCount = cVar.getCodecCount(); i12 < codecCount; codecCount = i11) {
                MediaCodecInfo codecInfoAt = cVar.getCodecInfoAt(i12);
                if (u(codecInfoAt)) {
                    i10 = i12;
                    z10 = zSecureDecodersExplicit;
                    i11 = codecCount;
                } else {
                    String name = codecInfoAt.getName();
                    if (w(codecInfoAt, name, zSecureDecodersExplicit, str3) && (strK = k(codecInfoAt, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(strK);
                            boolean zIsFeatureSupported = cVar.isFeatureSupported("tunneled-playback", strK, capabilitiesForType);
                            boolean zIsFeatureRequired = cVar.isFeatureRequired("tunneled-playback", strK, capabilitiesForType);
                            boolean z11 = bVar2.f19244c;
                            if ((z11 || !zIsFeatureRequired) && (!z11 || zIsFeatureSupported)) {
                                boolean zIsFeatureSupported2 = cVar.isFeatureSupported("secure-playback", strK, capabilitiesForType);
                                boolean zIsFeatureRequired2 = cVar.isFeatureRequired("secure-playback", strK, capabilitiesForType);
                                boolean z12 = bVar2.f19243b;
                                if ((z12 || !zIsFeatureRequired2) && (!z12 || zIsFeatureSupported2)) {
                                    boolean zX = x(codecInfoAt);
                                    boolean z13 = z(codecInfoAt);
                                    boolean zB = B(codecInfoAt);
                                    boolean zG = g(name);
                                    if (zSecureDecodersExplicit && bVar2.f19243b == zIsFeatureSupported2) {
                                        str = strK;
                                        i10 = i12;
                                        z10 = zSecureDecodersExplicit;
                                        i11 = codecCount;
                                        arrayList.add(com.google.android.exoplayer2.mediacodec.a.w(name, str3, strK, capabilitiesForType, zX, z13, zB, zG, false));
                                    } else if (zSecureDecodersExplicit) {
                                        str = strK;
                                        i10 = i12;
                                        z10 = zSecureDecodersExplicit;
                                        i11 = codecCount;
                                        if (!z10) {
                                            continue;
                                        }
                                    } else {
                                        try {
                                            if (bVar2.f19243b) {
                                                str = strK;
                                                i10 = i12;
                                                z10 = zSecureDecodersExplicit;
                                                i11 = codecCount;
                                                if (!z10 && zIsFeatureSupported2) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    try {
                                                        sb2.append(name);
                                                        sb2.append(".secure");
                                                        str2 = name;
                                                        try {
                                                            arrayList.add(com.google.android.exoplayer2.mediacodec.a.w(sb2.toString(), str3, str, capabilitiesForType, zX, z13, zB, zG, true));
                                                            return arrayList;
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            if (k0.f53108a <= 23 || arrayList.isEmpty()) {
                                                                m.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                                throw e;
                                                            }
                                                            m.c("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                            i12 = i10 + 1;
                                                            bVar2 = bVar;
                                                            zSecureDecodersExplicit = z10;
                                                        }
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        str2 = name;
                                                    }
                                                }
                                            } else {
                                                str = strK;
                                                i10 = i12;
                                                z10 = zSecureDecodersExplicit;
                                                i11 = codecCount;
                                                try {
                                                    arrayList.add(com.google.android.exoplayer2.mediacodec.a.w(name, str3, strK, capabilitiesForType, zX, z13, zB, zG, false));
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    str2 = name;
                                                    if (k0.f53108a <= 23) {
                                                    }
                                                    m.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                            str = strK;
                                            i10 = i12;
                                            z10 = zSecureDecodersExplicit;
                                            i11 = codecCount;
                                            str2 = name;
                                            if (k0.f53108a <= 23) {
                                            }
                                            m.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                } else {
                                    i10 = i12;
                                    z10 = zSecureDecodersExplicit;
                                    i11 = codecCount;
                                }
                            } else {
                                i10 = i12;
                                z10 = zSecureDecodersExplicit;
                                i11 = codecCount;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            str = strK;
                            str2 = name;
                            i10 = i12;
                            z10 = zSecureDecodersExplicit;
                            i11 = codecCount;
                        }
                    } else {
                        i10 = i12;
                        z10 = zSecureDecodersExplicit;
                        i11 = codecCount;
                    }
                }
                i12 = i10 + 1;
                bVar2 = bVar;
                zSecureDecodersExplicit = z10;
            }
            return arrayList;
        } catch (Exception e15) {
            throw new DecoderQueryException(e15);
        }
    }

    @CheckResult
    public static List<com.google.android.exoplayer2.mediacodec.a> p(List<com.google.android.exoplayer2.mediacodec.a> list, final Format format) {
        ArrayList arrayList = new ArrayList(list);
        I(arrayList, new f() { // from class: b4.c
            @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
            public final int getScore(Object obj) {
                return MediaCodecUtil.F(format, (com.google.android.exoplayer2.mediacodec.a) obj);
            }
        });
        return arrayList;
    }

    @Nullable
    public static com.google.android.exoplayer2.mediacodec.a s() throws DecoderQueryException {
        com.google.android.exoplayer2.mediacodec.a aVarM = m("audio/raw", false, false);
        if (aVarM == null) {
            return null;
        }
        return com.google.android.exoplayer2.mediacodec.a.x(aVarM.f19247a);
    }

    public static boolean u(MediaCodecInfo mediaCodecInfo) {
        return k0.f53108a >= 29 && v(mediaCodecInfo);
    }

    public static boolean x(MediaCodecInfo mediaCodecInfo) {
        return k0.f53108a >= 29 ? y(mediaCodecInfo) : !z(mediaCodecInfo);
    }

    public static boolean z(MediaCodecInfo mediaCodecInfo) {
        if (k0.f53108a >= 29) {
            return A(mediaCodecInfo);
        }
        String strK0 = k0.K0(mediaCodecInfo.getName());
        if (strK0.startsWith("arc.")) {
            return false;
        }
        return strK0.startsWith("omx.google.") || strK0.startsWith("omx.ffmpeg.") || (strK0.startsWith("omx.sec.") && strK0.contains(".sw.")) || strK0.equals("omx.qcom.video.decoder.hevcswvdec") || strK0.startsWith("c2.android.") || strK0.startsWith("c2.google.") || !(strK0.startsWith("omx.") || strK0.startsWith("c2."));
    }

    @TargetApi(29)
    public static boolean A(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    @TargetApi(29)
    public static boolean C(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static /* synthetic */ int F(Format format, com.google.android.exoplayer2.mediacodec.a aVar) {
        try {
            return aVar.l(format) ? 1 : 0;
        } catch (DecoderQueryException unused) {
            return -1;
        }
    }

    public static /* synthetic */ int G(f fVar, Object obj, Object obj2) {
        return fVar.getScore(obj2) - fVar.getScore(obj);
    }

    @Nullable
    public static String k(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    @Nullable
    public static com.google.android.exoplayer2.mediacodec.a m(String str, boolean z10, boolean z11) throws DecoderQueryException {
        List<com.google.android.exoplayer2.mediacodec.a> listN = n(str, z10, z11);
        if (listN.isEmpty()) {
            return null;
        }
        return listN.get(0);
    }

    @RequiresApi(29)
    public static boolean v(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean w(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = k0.f53108a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = k0.f53109b;
            if ("a70".equals(str3) || ("Xiaomi".equals(k0.f53110c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = k0.f53109b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = k0.f53109b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(k0.f53110c))) {
            String str6 = k0.f53109b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(k0.f53110c)) {
            String str7 = k0.f53109b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && k0.f53109b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    @TargetApi(29)
    public static boolean y(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }
}
