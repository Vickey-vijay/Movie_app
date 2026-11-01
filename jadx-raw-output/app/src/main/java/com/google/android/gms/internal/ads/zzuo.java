package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(29)
final class zzuo {
    private static int zzb(boolean z10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.zzm("video/avc");
            zzv zzvVarZzM = zztVar.zzM();
            if (zzvVarZzM.zzo != null) {
                List listZzc = zzvg.zzc(zzuw.zzb, zzvVarZzM, z10, false);
                for (int i10 = 0; i10 < listZzc.size(); i10++) {
                    if (((zzun) listZzc.get(i10)).zzd != null && (videoCapabilities = ((zzun) listZzc.get(i10)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        return zzc(supportedPerformancePoints, new MediaCodecInfo$VideoCapabilities$PerformancePoint(1280, 720, 60));
                    }
                }
            }
        } catch (zzuy unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo$VideoCapabilities$PerformancePoint mediaCodecInfo$VideoCapabilities$PerformancePoint) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((MediaCodecInfo$VideoCapabilities$PerformancePoint) list.get(i10)).covers(mediaCodecInfo$VideoCapabilities$PerformancePoint)) {
                return 2;
            }
        }
        return 1;
    }

    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        int iZzb;
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int iZzc = zzc(supportedPerformancePoints, new MediaCodecInfo$VideoCapabilities$PerformancePoint(i10, i11, (int) d10));
        boolean z10 = true;
        if (iZzc == 1 && zzup.zza == null) {
            if (Build.VERSION.SDK_INT >= 35) {
                iZzb = 2;
            } else {
                iZzb = zzb(false);
            }
            int iZzb2 = zzb(true);
            if (iZzb != 0 && (iZzb2 != 0 ? !(iZzb != 2 || iZzb2 != 2) : iZzb == 2)) {
                z10 = false;
            }
            zzup.zza = Boolean.valueOf(z10);
            if (zzup.zza.booleanValue()) {
                return 0;
            }
        }
        return iZzc;
    }
}
