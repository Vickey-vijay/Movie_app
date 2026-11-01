package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafq implements zzafy {
    private final zzef zza;
    private final zzef zzb;
    private long zzc;

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return this.zzb.zzd() > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        zzef zzefVar = this.zzb;
        if (zzefVar.zzd() == 0) {
            zzafz zzafzVar = zzafz.zza;
            return new zzafw(zzafzVar, zzafzVar);
        }
        int iZzn = zzfj.zzn(zzefVar, j10, true, true);
        long jZzc = zzefVar.zzc(iZzn);
        zzef zzefVar2 = this.zza;
        zzafz zzafzVar2 = new zzafz(jZzc, zzefVar2.zzc(iZzn));
        if (zzafzVar2.zzb == j10 || iZzn == zzefVar.zzd() - 1) {
            return new zzafw(zzafzVar2, zzafzVar2);
        }
        int i10 = iZzn + 1;
        return new zzafw(zzafzVar2, new zzafz(zzefVar.zzc(i10), zzefVar2.zzc(i10)));
    }

    public zzafq(long[] jArr, long[] jArr2, long j10) {
        boolean z10;
        int length = jArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgrc.zza(z10);
        if (length2 > 0 && jArr2[0] > 0) {
            int i10 = length2 + 1;
            zzef zzefVar = new zzef(i10);
            this.zza = zzefVar;
            zzef zzefVar2 = new zzef(i10);
            this.zzb = zzefVar2;
            zzefVar.zza(0L);
            zzefVar2.zza(0L);
        } else {
            this.zza = new zzef(length2);
            this.zzb = new zzef(length2);
        }
        this.zza.zzb(jArr);
        this.zzb.zzb(jArr2);
        this.zzc = j10;
    }
}
