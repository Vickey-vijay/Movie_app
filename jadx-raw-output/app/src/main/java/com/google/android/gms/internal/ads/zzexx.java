package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzexx implements zzfax {
    private final Context zza;
    private final zzgzy zzb;

    public zzexx(zzgzy zzgzyVar, Context context) {
        this.zzb = zzgzyVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzexw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzexy zzc() {
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzexy(com.google.android.gms.ads.internal.util.zzs.zzw(this.zza));
    }
}
