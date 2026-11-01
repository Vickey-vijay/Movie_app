package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
final class zzaqg implements zzaqh {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzaex zzc;
    private final zzagh zzd;
    private final zzaql zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzer zzh;
    private final int zzi;
    private final zzv zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    private final int zzf(int i10) {
        return (i10 + i10) * this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza(long j10) {
        this.zzk = 0;
        this.zzl = j10;
        this.zzm = 0;
        this.zzn = 0L;
    }

    private final void zzd(int i10) {
        long jZzt = this.zzl + zzfj.zzt(this.zzn, 1000000L, this.zze.zzc, RoundingMode.DOWN);
        int iZzf = zzf(i10);
        this.zzd.zze(jZzt, 1, iZzf, this.zzm - iZzf, null);
        this.zzn += (long) i10;
        this.zzm -= iZzf;
    }

    private final int zze(int i10) {
        int i11 = this.zze.zzb;
        return i10 / (i11 + i11);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(int i10, long j10) {
        zzaqo zzaqoVar = new zzaqo(this.zze, this.zzf, i10, j10);
        this.zzc.zzw(zzaqoVar);
        zzagh zzaghVar = this.zzd;
        zzaghVar.zzz(this.zzj);
        zzaghVar.zzN(zzaqoVar.zza());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f A[LOOP:0: B:6:0x0024->B:12:0x003f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:4:0x0021). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.android.gms.internal.ads.zzaqh
    public final boolean zzc(com.google.android.gms.internal.ads.zzaev r26, long r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqg.zzc(com.google.android.gms.internal.ads.zzaev, long):boolean");
    }

    public zzaqg(zzaex zzaexVar, zzagh zzaghVar, zzaql zzaqlVar) throws zzat {
        this.zzc = zzaexVar;
        this.zzd = zzaghVar;
        this.zze = zzaqlVar;
        int iMax = Math.max(1, zzaqlVar.zzc / 10);
        this.zzi = iMax;
        zzer zzerVar = new zzer(zzaqlVar.zzf);
        zzerVar.zzu();
        int iZzu = zzerVar.zzu();
        this.zzf = iZzu;
        int i10 = zzaqlVar.zzb;
        int i11 = zzaqlVar.zzd;
        int i12 = (((i11 - (i10 * 4)) * 8) / (zzaqlVar.zze * i10)) + 1;
        if (iZzu == i12) {
            String str = zzfj.zza;
            int i13 = ((iMax + iZzu) - 1) / iZzu;
            this.zzg = new byte[i11 * i13];
            this.zzh = new zzer(i13 * (iZzu + iZzu) * i10);
            int i14 = ((zzaqlVar.zzc * zzaqlVar.zzd) * 8) / iZzu;
            zzt zztVar = new zzt();
            zztVar.zzm("audio/raw");
            zztVar.zzh(i14);
            zztVar.zzi(i14);
            zztVar.zzn((iMax + iMax) * i10);
            zztVar.zzE(zzaqlVar.zzb);
            zztVar.zzF(zzaqlVar.zzc);
            zztVar.zzG(2);
            this.zzj = zztVar.zzM();
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 34 + String.valueOf(iZzu).length());
        sb2.append("Expected frames per block: ");
        sb2.append(i12);
        sb2.append("; got: ");
        sb2.append(iZzu);
        throw zzat.zzb(sb2.toString(), null);
    }
}
