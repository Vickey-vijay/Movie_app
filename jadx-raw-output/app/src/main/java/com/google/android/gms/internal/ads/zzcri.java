package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzcri implements zzikg {
    private final zzikp zza;

    private zzcri(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcri zza(zzikp zzikpVar) {
        return new zzcri(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcrh((Context) this.zza.zzb());
    }
}
