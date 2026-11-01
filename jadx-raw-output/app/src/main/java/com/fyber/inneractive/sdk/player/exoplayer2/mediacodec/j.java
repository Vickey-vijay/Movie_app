package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f17457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f17458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseIntArray f17459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SparseIntArray f17460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f17461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f17462f;

    public static a a(boolean z10, String str) {
        List listUnmodifiableList;
        synchronized (j.class) {
            e eVar = new e(z10, str);
            listUnmodifiableList = (List) f17458b.get(eVar);
            if (listUnmodifiableList == null) {
                int i10 = z.f17873a;
                ArrayList arrayListA = a(eVar, i10 >= 21 ? new i(z10) : new h());
                if (z10 && arrayListA.isEmpty() && 21 <= i10 && i10 <= 23) {
                    arrayListA = a(eVar, new h());
                    if (!arrayListA.isEmpty()) {
                        Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((a) arrayListA.get(0)).f17428a);
                    }
                }
                if (i10 < 26) {
                    if (arrayListA.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(((a) arrayListA.get(0)).f17428a)) {
                        for (int i11 = 1; i11 < arrayListA.size(); i11++) {
                            a aVar = (a) arrayListA.get(i11);
                            if ("OMX.google.raw.decoder".equals(aVar.f17428a)) {
                                arrayListA.remove(i11);
                                arrayListA.add(0, aVar);
                                break;
                            }
                        }
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayListA);
                f17458b.put(eVar, listUnmodifiableList);
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            return null;
        }
        return (a) listUnmodifiableList.get(0);
    }

    static {
        new a("OMX.google.raw.decoder", null, null, false);
        f17457a = Pattern.compile("^\\D?(\\d+)$");
        f17458b = new HashMap();
        f17462f = -1;
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17459c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f17460d = sparseIntArray2;
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
        HashMap map = new HashMap();
        f17461e = map;
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
    }

    public static int a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (f17462f == -1) {
            int iMax = 0;
            a aVarA = a(false, "video/avc");
            if (aVarA != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = aVarA.f17432e;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i11 = codecProfileLevelArr[iMax].level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    iMax2 = Math.max(i10, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, z.f17873a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            f17462f = iMax;
        }
        return f17462f;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    public static ArrayList a(e eVar, g gVar) throws f {
        boolean z10;
        try {
            ArrayList arrayList = new ArrayList();
            String str = eVar.f17453a;
            int iA = gVar.a();
            boolean zB = gVar.b();
            for (int i10 = 0; i10 < iA; i10++) {
                MediaCodecInfo mediaCodecInfoA = gVar.a(i10);
                String name = mediaCodecInfoA.getName();
                if (a(mediaCodecInfoA, name, zB)) {
                    String[] supportedTypes = mediaCodecInfoA.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i11 = 0;
                    while (i11 < length) {
                        String str2 = supportedTypes[i11];
                        if (str2.equalsIgnoreCase(str)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(str2);
                                boolean zA = gVar.a(str, capabilitiesForType);
                                if (z.f17873a <= 22) {
                                    String str3 = z.f17876d;
                                    if ((str3.equals("ODROID-XU3") || str3.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                } else {
                                    z10 = false;
                                }
                                if ((zB && eVar.f17454b == zA) || !(zB || eVar.f17454b)) {
                                    arrayList.add(new a(name, str, capabilitiesForType, z10));
                                } else if (!zB && zA) {
                                    arrayList.add(new a(name + ".secure", str, capabilitiesForType, z10));
                                    return arrayList;
                                }
                            } catch (Exception e10) {
                                if (z.f17873a > 23 || arrayList.isEmpty()) {
                                    Log.e("MediaCodecUtil", "Failed to query codec " + name + " (" + str2 + ")");
                                    throw e10;
                                }
                                Log.e("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                            }
                        }
                        i11++;
                        gVar = gVar;
                    }
                }
            }
            return arrayList;
        } catch (Exception e11) {
            throw new f(e11);
        }
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z10) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = z.f17873a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && "a70".equals(z.f17874b)) {
            return false;
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str2 = z.f17874b;
            if ("dlxu".equals(str2) || "protou".equals(str2) || "ville".equals(str2) || "villeplus".equals(str2) || "villec2".equals(str2) || str2.startsWith("gee") || "C6602".equals(str2) || "C6603".equals(str2) || "C6606".equals(str2) || "C6616".equals(str2) || "L36h".equals(str2) || "SO-02E".equals(str2)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str3 = z.f17874b;
            if ("C1504".equals(str3) || "C1505".equals(str3) || "C1604".equals(str3) || "C1605".equals(str3)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(z.f17875c)) {
            String str4 = z.f17874b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        return (i10 <= 19 && z.f17874b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) ? false : true;
    }
}
