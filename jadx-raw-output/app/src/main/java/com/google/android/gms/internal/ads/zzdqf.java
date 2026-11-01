package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdqf implements zzgzl {
    public final /* synthetic */ zzdqh zza;

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzcjl zzcjlVar = (zzcjl) list.get(0);
            if (zzcjlVar != null) {
                this.zza.zza(zzcjlVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e10) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgr)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "omid native display exp");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgr)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "omid native display exp");
        }
    }

    public zzdqf(zzdqh zzdqhVar) {
        Objects.requireNonNull(zzdqhVar);
        this.zza = zzdqhVar;
    }
}
