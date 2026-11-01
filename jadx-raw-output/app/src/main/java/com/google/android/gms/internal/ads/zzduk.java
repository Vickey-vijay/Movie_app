package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzduk implements com.google.android.gms.ads.internal.zzn {
    public final /* synthetic */ zzduv zza;

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdk() {
        this.zza.zzb().zza();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdl() {
        this.zza.zzb().zzb();
    }

    public zzduk(zzduv zzduvVar) {
        Objects.requireNonNull(zzduvVar);
        this.zza = zzduvVar;
    }
}
