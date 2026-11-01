package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfcs implements zzfax {
    public zzfcs(zzcdj zzcdjVar, zzgzy zzgzyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        final q5.i iVarZza = zzgzo.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgN)).booleanValue()) {
            iVarZza = zzgzo.zza(null);
        }
        final q5.i iVarZza2 = zzgzo.zza(null);
        return zzgzo.zzo(iVarZza, iVarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfct((String) iVarZza.get(), (String) iVarZza2.get());
            }
        }, zzcei.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 47;
    }
}
