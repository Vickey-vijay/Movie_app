package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadt {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private static int zzc(zzeq zzeqVar) {
        int iZzj = zzeqVar.zzj(5);
        return iZzj == 31 ? zzeqVar.zzj(6) + 32 : iZzj;
    }

    private static int zzd(zzeq zzeqVar) throws zzat {
        int iZzj = zzeqVar.zzj(4);
        if (iZzj == 15) {
            if (zzeqVar.zzc() >= 24) {
                return zzeqVar.zzj(24);
            }
            throw zzat.zzb("AAC header insufficient data", null);
        }
        if (iZzj < 13) {
            return zzb[iZzj];
        }
        throw zzat.zzb("AAC header wrong Sampling Frequency Index", null);
    }

    public static zzads zza(byte[] bArr) throws zzat {
        return zzb(new zzeq(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c9, code lost:
    
        if (r11 != 3) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzads zzb(com.google.android.gms.internal.ads.zzeq r11, boolean r12) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadt.zzb(com.google.android.gms.internal.ads.zzeq, boolean):com.google.android.gms.internal.ads.zzads");
    }
}
