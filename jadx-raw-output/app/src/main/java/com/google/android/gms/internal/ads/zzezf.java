package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzezf implements zzfax {
    private final zzgzy zza;
    private final zzdzc zzb;

    public zzezf(zzgzy zzgzyVar, zzdzc zzdzcVar) {
        this.zza = zzgzyVar;
        this.zzb = zzdzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 62;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeze
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzezg zzc() {
        return new zzezg(this.zzb.zzb());
    }
}
