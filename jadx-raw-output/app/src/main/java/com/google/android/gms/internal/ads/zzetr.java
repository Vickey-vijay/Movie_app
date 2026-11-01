package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzetr {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    @Nullable
    private zzetq zzb;

    public final void zzc(zzetq zzetqVar) {
        this.zzb = zzetqVar;
    }

    @Nullable
    public final zzetq zzd() {
        return this.zzb;
    }

    public final void zza(boolean z10) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }
}
