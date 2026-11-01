package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzext implements zzfax {
    private final zzgzy zza;

    public zzext(zzgzy zzgzyVar) {
        this.zza = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzexs
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzexu(com.google.android.gms.ads.internal.zzt.zzo().zzi(), com.google.android.gms.ads.internal.zzt.zzo().zzm());
            }
        });
    }
}
