package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfjw implements zzgzl {
    public final /* synthetic */ zzfjx zza;
    public final /* synthetic */ int zzb;

    public zzfjw(zzfjx zzfjxVar, int i10) {
        this.zzb = i10;
        Objects.requireNonNull(zzfjxVar);
        this.zza = zzfjxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzc((String) obj, this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "BufferingUrlPinger.attributionReportingManager");
    }
}
