package com.google.android.gms.ads.internal.util;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zza implements Runnable {
    public final /* synthetic */ zzb zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzb zzbVar = this.zza;
        zzbVar.zzc(Thread.currentThread());
        zzbVar.zza();
    }

    public zza(zzb zzbVar) {
        Objects.requireNonNull(zzbVar);
        this.zza = zzbVar;
    }
}
