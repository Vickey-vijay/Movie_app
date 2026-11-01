package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeua implements zzfax {
    private final zzgzy zza;
    private final zzfjk zzb;
    private final zzcdz zzc;

    public zzeua(zzgzy zzgzyVar, zzfjk zzfjkVar, zzcdz zzcdzVar) {
        this.zza = zzgzyVar;
        this.zzb = zzfjkVar;
        this.zzc = zzcdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 9;
    }

    public final /* synthetic */ zzeub zzc() {
        return new zzeub(this.zzb.zzk, this.zzc.zzl());
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzetz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }
}
