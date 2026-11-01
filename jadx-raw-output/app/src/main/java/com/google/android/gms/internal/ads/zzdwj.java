package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwj implements zzikg {
    private final zzikp zza;

    private zzdwj(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzdwj zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdwj(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setEmptySet;
        zzgzy zzgzyVarZzc = zzfmk.zzc();
        zzdxb zzdxbVarZzb = ((zzdxc) this.zza).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgd)).booleanValue()) {
            setEmptySet = Collections.singleton(new zzdje(zzdxbVarZzb, zzgzyVarZzc));
        } else {
            setEmptySet = Collections.emptySet();
        }
        zziko.zzb(setEmptySet);
        return setEmptySet;
    }
}
