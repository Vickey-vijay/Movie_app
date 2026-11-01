package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzftb implements Runnable {
    public final /* synthetic */ float zza;
    public final /* synthetic */ zzftc zzb;

    public zzftb(zzftc zzftcVar, float f10) {
        this.zza = f10;
        Objects.requireNonNull(zzftcVar);
        this.zzb = zzftcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
