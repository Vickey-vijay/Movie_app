package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfbd implements zzfax {
    private final Context zza;
    private final zzgzy zzb;

    public zzfbd(Context context, zzgzy zzgzyVar) {
        this.zza = context;
        this.zzb = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return ((Boolean) zzbiw.zzb.zze()).booleanValue() ? this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        }) : zzgzo.zza(new zzfbe(-1, -1));
    }

    public final /* synthetic */ zzfbe zzc() {
        Context context = this.zza;
        return new zzfbe(zzbgp.zzc(context), zzbgp.zzd(context));
    }
}
