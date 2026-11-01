package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdtc implements zzgzl {
    public final /* synthetic */ String zza = "sendMessageToNativeJs";
    public final /* synthetic */ Map zzb;

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
    }

    public zzdtc(zzdtk zzdtkVar, String str, Map map) {
        this.zzb = map;
        Objects.requireNonNull(zzdtkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcjl) obj).zze(this.zza, this.zzb);
    }
}
