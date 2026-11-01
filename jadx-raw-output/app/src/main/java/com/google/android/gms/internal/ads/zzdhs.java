package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdhs implements zzikg {
    private final zzdhf zza;

    private zzdhs(zzdhf zzdhfVar) {
        this.zza = zzdhfVar;
    }

    public static zzdhs zza(zzdhf zzdhfVar) {
        return new zzdhs(zzdhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return this.zza.zzm();
    }

    public static Set zzc(zzdhf zzdhfVar) {
        return zzdhfVar.zzm();
    }
}
