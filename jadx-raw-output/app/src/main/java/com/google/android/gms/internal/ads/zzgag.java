package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgag implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzgag(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar3;
    }

    public static zzgag zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzgag(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgaf zzb() {
        return new zzgaf((DataStore) this.zza.zzb(), zzcml.zzc(), (zzdvj) this.zzb.zzb(), new zzfze());
    }
}
