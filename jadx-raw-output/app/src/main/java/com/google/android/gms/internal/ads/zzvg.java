package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"InlinedApi"})
public final class zzvg {
    public static final /* synthetic */ int zza = 0;

    @GuardedBy("MediaCodecUtil.class")
    private static final HashMap zzb = new HashMap();

    @Nullable
    public static zzun zza() throws zzuy {
        List listZzb = zzb("audio/raw", false, false);
        if (listZzb.isEmpty()) {
            return null;
        }
        return (zzun) listZzb.get(0);
    }

    public static synchronized List zzb(String str, boolean z10, boolean z11) throws zzuy {
        zzux zzuxVar = new zzux(str, z10, z11);
        HashMap map = zzb;
        List list = (List) map.get(zzuxVar);
        if (list != null) {
            return list;
        }
        ArrayList arrayListZzh = zzh(zzuxVar, new zzvb(z10, z11, str.equals("video/mv-hevc")));
        if (z10) {
            arrayListZzh.isEmpty();
        }
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListZzh.size() == 1 && ((zzun) arrayListZzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayListZzh.add(zzun.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            zzj(arrayListZzh, new zzvf() { // from class: com.google.android.gms.internal.ads.zzvc
                @Override // com.google.android.gms.internal.ads.zzvf
                public final /* synthetic */ int zza(Object obj) {
                    int i10 = zzvg.zza;
                    String str2 = ((zzun) obj).zza;
                    if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                        return 1;
                    }
                    return (Build.VERSION.SDK_INT >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                }
            });
        }
        if (Build.VERSION.SDK_INT < 32 && arrayListZzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzun) arrayListZzh.get(0)).zza)) {
            arrayListZzh.add((zzun) arrayListZzh.remove(0));
        }
        zzguf zzgufVarZzq = zzguf.zzq(arrayListZzh);
        map.put(zzuxVar, zzgufVarZzq);
        return zzgufVarZzq;
    }

    public static List zzc(zzuw zzuwVar, zzv zzvVar, boolean z10, boolean z11) throws zzuy {
        List listZza = zzuwVar.zza(zzvVar.zzo, z10, z11);
        List listZzd = zzd(zzuwVar, zzvVar, z10, z11);
        int i10 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        zzgucVar.zzh(listZza);
        zzgucVar.zzh(listZzd);
        return zzgucVar.zzi();
    }

    @CheckResult
    public static List zze(List list, final zzv zzvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zzvf() { // from class: com.google.android.gms.internal.ads.zzve
            @Override // com.google.android.gms.internal.ads.zzvf
            public final /* synthetic */ int zza(Object obj) {
                int i10 = zzvg.zza;
                return ((zzun) obj).zzd(zzvVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i10, int i11) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i10;
        codecProfileLevel.level = i11;
        return codecProfileLevel;
    }

    @Nullable
    public static String zzg(zzv zzvVar) {
        Pair pairZzd;
        String str = zzvVar.zzo;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairZzd = zzdo.zzd(zzvVar)) != null) {
            int iIntValue = ((Integer) pairZzd.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x020b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00af A[EDGE_INSN: B:39:0x00af->B:57:0x00ee BREAK  A[LOOP:1: B:17:0x005c->B:21:0x006b]] */
    /* JADX WARN: Code duplicated, block: B:69:0x011c  */
    /* JADX WARN: Code duplicated, block: B:70:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0120  */
    /* JADX WARN: Code duplicated, block: B:74:0x0128 A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:59:0x00f2, B:66:0x010e, B:72:0x0122, B:74:0x0128, B:79:0x0138, B:81:0x0142, B:82:0x0147, B:84:0x0157, B:86:0x015f, B:75:0x012d), top: B:118:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x012d A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:59:0x00f2, B:66:0x010e, B:72:0x0122, B:74:0x0128, B:79:0x0138, B:81:0x0142, B:82:0x0147, B:84:0x0157, B:86:0x015f, B:75:0x012d), top: B:118:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0133  */
    /* JADX WARN: Code duplicated, block: B:78:0x0136  */
    /* JADX WARN: Code duplicated, block: B:81:0x0142 A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:59:0x00f2, B:66:0x010e, B:72:0x0122, B:74:0x0128, B:79:0x0138, B:81:0x0142, B:82:0x0147, B:84:0x0157, B:86:0x015f, B:75:0x012d), top: B:118:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0147 A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:59:0x00f2, B:66:0x010e, B:72:0x0122, B:74:0x0128, B:79:0x0138, B:81:0x0142, B:82:0x0147, B:84:0x0157, B:86:0x015f, B:75:0x012d), top: B:118:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0157 A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:59:0x00f2, B:66:0x010e, B:72:0x0122, B:74:0x0128, B:79:0x0138, B:81:0x0142, B:82:0x0147, B:84:0x0157, B:86:0x015f, B:75:0x012d), top: B:118:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x016a  */
    /* JADX WARN: Code duplicated, block: B:91:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:94:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    private static ArrayList zzh(zzux zzuxVar, zzuz zzuzVar) throws zzuy {
        String str;
        String str2;
        String str3;
        int i10;
        String str4;
        int i11;
        String str5;
        boolean zZzd;
        boolean z10;
        int i12;
        boolean zIsHardwareAccelerated;
        boolean zZzi;
        String strZza;
        boolean zIsVendor;
        zzux zzuxVar2 = zzuxVar;
        String str6 = "secure-playback";
        String str7 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str8 = zzuxVar2.zza;
            int iZza = zzuzVar.zza();
            boolean zZzc = zzuzVar.zzc();
            int i13 = 0;
            while (i13 < iZza) {
                MediaCodecInfo mediaCodecInfoZzb = zzuzVar.zzb(i13);
                if (Build.VERSION.SDK_INT < 29 || !mediaCodecInfoZzb.isAlias()) {
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || (!zZzc && name.endsWith(".secure"))) {
                        str6 = str6;
                        str3 = str7;
                        i11 = i13;
                        i10 = iZza;
                        str4 = str8;
                    } else {
                        String[] supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i14 = i13;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                int i16 = length;
                                str = supportedTypes[i15];
                                if (!str.equalsIgnoreCase(str8)) {
                                    i15++;
                                    length = i16;
                                }
                            } else if (str8.equals("video/dolby-vision")) {
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if (!"OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str2 = null;
                                        break;
                                    }
                                    str = "video/dv_hevc";
                                } else {
                                    str = "video/hevcdv";
                                }
                            } else if (str8.equals("video/mv-hevc")) {
                                if (!"c2.qti.mvhevc.decoder".equals(name) && !"c2.qti.mvhevc.decoder.secure".equals(name)) {
                                    str2 = null;
                                    break;
                                }
                                str = "video/x-mvhevc";
                            } else if (str8.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str = "audio/x-lg-alac";
                            } else if (str8.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str = "audio/x-lg-flac";
                            } else {
                                if (!str8.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(name)) {
                                    str2 = null;
                                    break;
                                }
                                str = "audio/lg-ac3";
                            }
                            str2 = str;
                            break;
                        }
                        if (str2 != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str2);
                                boolean zZzd2 = zzuzVar.zzd(str7, str2, capabilitiesForType);
                                boolean zZze = zzuzVar.zze(str7, str2, capabilitiesForType);
                                str3 = str7;
                                if (zzuxVar2.zzc) {
                                    if (zZzd2) {
                                        zZzd = zzuzVar.zzd(str6, str2, capabilitiesForType);
                                        boolean zZze2 = zzuzVar.zze(str6, str2, capabilitiesForType);
                                        z10 = zzuxVar2.zzb;
                                        if (z10) {
                                            if (z10) {
                                                if (zZzd) {
                                                    zZzd = true;
                                                }
                                            }
                                            i12 = Build.VERSION.SDK_INT;
                                            if (i12 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str8)) {
                                                zIsHardwareAccelerated = false;
                                            } else {
                                                zIsHardwareAccelerated = true;
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str8);
                                            str6 = str6;
                                            if (i12 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzgql.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZzc) {
                                                if (z10 != zZzd) {
                                                    zZzd = true;
                                                }
                                                i11 = i14;
                                                i10 = iZza;
                                                str4 = str8;
                                                arrayList.add(zzun.zza(name, str8, str2, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                            }
                                            if (!zZzc) {
                                            }
                                            str5 = name;
                                            i10 = iZza;
                                            str4 = str8;
                                            i11 = i14;
                                            if (zZzc) {
                                                continue;
                                            }
                                        } else {
                                            if (z10) {
                                                if (zZzd) {
                                                    zZzd = true;
                                                }
                                            }
                                            i12 = Build.VERSION.SDK_INT;
                                            if (i12 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str8)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str8);
                                            str6 = str6;
                                            if (i12 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzgql.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZzc) {
                                                if (z10 != zZzd) {
                                                    zZzd = true;
                                                }
                                                i11 = i14;
                                                i10 = iZza;
                                                str4 = str8;
                                                arrayList.add(zzun.zza(name, str8, str2, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                            }
                                            if (!zZzc) {
                                            }
                                            str5 = name;
                                            i10 = iZza;
                                            str4 = str8;
                                            i11 = i14;
                                            if (zZzc) {
                                                continue;
                                            }
                                        }
                                    }
                                } else if (!zZze) {
                                    zZzd = zzuzVar.zzd(str6, str2, capabilitiesForType);
                                    boolean zZze3 = zzuzVar.zze(str6, str2, capabilitiesForType);
                                    z10 = zzuxVar2.zzb;
                                    if (z10 || !zZze3) {
                                        if (z10) {
                                            if (zZzd) {
                                                zZzd = true;
                                            }
                                        }
                                        i12 = Build.VERSION.SDK_INT;
                                        if (i12 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (zzi(mediaCodecInfoZzb, str8)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zZzi = zzi(mediaCodecInfoZzb, str8);
                                        str6 = str6;
                                        if (i12 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzgql.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = true;
                                            }
                                        }
                                        try {
                                            if (zZzc) {
                                                if (z10 != zZzd) {
                                                    zZzd = true;
                                                }
                                                i11 = i14;
                                                i10 = iZza;
                                                str4 = str8;
                                                arrayList.add(zzun.zza(name, str8, str2, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                            }
                                            arrayList.add(zzun.zza(name, str8, str2, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                        } catch (Exception e10) {
                                            e = e10;
                                            str5 = name;
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 24 + str2.length() + 1);
                                            sb2.append("Failed to query codec ");
                                            sb2.append(str5);
                                            sb2.append(" (");
                                            sb2.append(str2);
                                            sb2.append(")");
                                            zzee.zze("MediaCodecUtil", sb2.toString());
                                            throw e;
                                        }
                                        if (!zZzc || z10) {
                                            str5 = name;
                                            i10 = iZza;
                                            str4 = str8;
                                            i11 = i14;
                                            if (zZzc && zZzd) {
                                                try {
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 7);
                                                    sb3.append(str5);
                                                    sb3.append(".secure");
                                                    arrayList.add(zzun.zza(sb3.toString(), str4, str2, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, true));
                                                    break;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(str5).length() + 24 + str2.length() + 1);
                                                    sb4.append("Failed to query codec ");
                                                    sb4.append(str5);
                                                    sb4.append(" (");
                                                    sb4.append(str2);
                                                    sb4.append(")");
                                                    zzee.zze("MediaCodecUtil", sb4.toString());
                                                    throw e;
                                                }
                                            }
                                        }
                                        i11 = i14;
                                        i10 = iZza;
                                        str4 = str8;
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                str5 = name;
                            }
                        } else {
                            str3 = str7;
                        }
                        i10 = iZza;
                        str4 = str8;
                        i11 = i14;
                    }
                } else {
                    str6 = str6;
                    str3 = str7;
                    i11 = i13;
                    i10 = iZza;
                    str4 = str8;
                }
                i13 = i11 + 1;
                zzuxVar2 = zzuxVar;
                str7 = str3;
                str6 = str6;
                iZza = i10;
                str8 = str4;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new zzuy(e13, null);
        }
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzas.zza(str)) {
            return true;
        }
        String strZza = zzgql.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, final zzvf zzvfVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvd
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i10 = zzvg.zza;
                zzvf zzvfVar2 = zzvfVar;
                return zzvfVar2.zza(obj2) - zzvfVar2.zza(obj);
            }
        });
    }

    public static List zzd(zzuw zzuwVar, zzv zzvVar, boolean z10, boolean z11) throws zzuy {
        String strZzg = zzg(zzvVar);
        if (strZzg == null) {
            return zzguf.zzi();
        }
        return zzuwVar.zza(strZzg, z10, z11);
    }
}
