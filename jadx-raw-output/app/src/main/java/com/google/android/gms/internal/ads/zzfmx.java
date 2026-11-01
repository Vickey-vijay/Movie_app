package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfmx {
    public final Runnable zza;
    public final long zzb;
    public ScheduledFuture zzc;
    public final /* synthetic */ zzfmy zzd;

    public zzfmx(zzfmy zzfmyVar, Runnable runnable, long j10) {
        Objects.requireNonNull(zzfmyVar);
        this.zzd = zzfmyVar;
        this.zza = runnable;
        this.zzb = j10;
    }
}
