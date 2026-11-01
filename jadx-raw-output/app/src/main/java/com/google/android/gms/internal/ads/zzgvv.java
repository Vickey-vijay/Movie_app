package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgvv extends zzgse {
    public final transient zzgru zza;

    @Override // com.google.android.gms.internal.ads.zzgse, com.google.android.gms.internal.ads.zzgsv
    public final /* bridge */ /* synthetic */ Collection zzc() {
        return (List) this.zza.zza();
    }

    public zzgvv(Map map, zzgru zzgruVar) {
        super(map);
        this.zza = zzgruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsv, com.google.android.gms.internal.ads.zzgsy
    public final Set zzh() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgsv, com.google.android.gms.internal.ads.zzgsy
    public final Map zzl() {
        return zzm();
    }
}
