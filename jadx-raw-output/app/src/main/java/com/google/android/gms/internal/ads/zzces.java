package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzces implements zzgzl {
    public final /* synthetic */ zzceu zza;

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        this.zza.zzj().set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(@Nullable Object obj) {
        this.zza.zzj().set(1);
    }

    public zzces(zzceu zzceuVar) {
        Objects.requireNonNull(zzceuVar);
        this.zza = zzceuVar;
    }
}
