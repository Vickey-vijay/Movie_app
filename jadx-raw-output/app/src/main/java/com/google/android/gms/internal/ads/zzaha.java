package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaha implements zzaeu {
    private final zzer zza = new zzer(4);
    private final zzaga zzb = new zzaga(-1, -1, "image/avif");

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        ((zzael) zzaevVar).zzj(4, false);
        return zzh(zzaevVar, 1718909296) && zzh(zzaevVar, 1635150182);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    private final boolean zzh(zzaev zzaevVar, int i10) throws IOException {
        zzer zzerVar = this.zza;
        zzerVar.zza(4);
        ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, 4, false);
        return zzerVar.zzz() == ((long) i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzb.zzc(zzaexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        return this.zzb.zzd(zzaevVar, zzafvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        this.zzb.zze(j10, j11);
    }
}
