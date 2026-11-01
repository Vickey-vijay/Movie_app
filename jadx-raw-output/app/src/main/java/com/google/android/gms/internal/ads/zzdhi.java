package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdhi implements zzikg {
    private final zzdhf zza;

    private zzdhi(zzdhf zzdhfVar) {
        this.zza = zzdhfVar;
    }

    public static zzdhi zza(zzdhf zzdhfVar) {
        return new zzdhi(zzdhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }

    public static Set zzc(zzdhf zzdhfVar) {
        Set setEmptySet = Collections.emptySet();
        zziko.zzb(setEmptySet);
        return setEmptySet;
    }
}
