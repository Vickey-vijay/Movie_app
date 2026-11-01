package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzevr implements zzfax {
    private final zzgzy zza;
    private final zzdvu zzb;
    private final String zzc;
    private final zzfjk zzd;

    public zzevr(zzgzy zzgzyVar, zzdvu zzdvuVar, zzfjk zzfjkVar, String str) {
        this.zza = zzgzyVar;
        this.zzb = zzdvuVar;
        this.zzd = zzfjkVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzevq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzevs zzc() {
        zzfjk zzfjkVar = this.zzd;
        zzdvu zzdvuVar = this.zzb;
        return new zzevs(zzdvuVar.zzb(zzfjkVar.zzg, this.zzc), zzdvuVar.zzc());
    }
}
