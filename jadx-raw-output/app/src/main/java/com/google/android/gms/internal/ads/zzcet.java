package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcet implements zzgzl {
    public final /* synthetic */ zzcer zza;
    public final /* synthetic */ zzcep zzb;

    public zzcet(zzceu zzceuVar, zzcer zzcerVar, zzcep zzcepVar) {
        this.zza = zzcerVar;
        this.zzb = zzcepVar;
        Objects.requireNonNull(zzceuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(@Nullable Object obj) {
        this.zza.zza(obj);
    }
}
