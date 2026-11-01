package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class zzafx implements zzafy {
    private final long zza;
    private final zzafw zzb;

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        return this.zzb;
    }

    public zzafx(long j10, long j11) {
        zzafz zzafzVar;
        this.zza = j10;
        if (j11 == 0) {
            zzafzVar = zzafz.zza;
        } else {
            zzafzVar = new zzafz(0L, j11);
        }
        this.zzb = new zzafw(zzafzVar, zzafzVar);
    }
}
