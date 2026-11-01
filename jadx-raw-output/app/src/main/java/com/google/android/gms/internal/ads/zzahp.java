package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzahp implements zzaeu {
    private final zzaeu zza;

    public zzahp() {
        this(0);
    }

    public zzahp(int i10) {
        this.zza = new zzaho();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        return this.zza.zza(zzaevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zza.zzc(zzaexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        return this.zza.zzd(zzaevVar, zzafvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        this.zza.zze(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
        this.zza.zzf();
    }
}
