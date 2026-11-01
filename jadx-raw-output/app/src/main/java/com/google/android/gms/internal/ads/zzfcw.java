package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfcw implements zzfax {
    public final zzgzy zza;
    public final List zzb;

    public zzfcw(zzbgo zzbgoVar, zzgzy zzgzyVar, List list) {
        this.zza = zzgzyVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfcx(this.zza.zzb);
            }
        });
    }
}
