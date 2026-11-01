package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzfss extends TimerTask {
    public final /* synthetic */ zzfsu zza;
    public final /* synthetic */ Timer zzb;
    public final /* synthetic */ zzfsv zzc;

    public zzfss(zzfsv zzfsvVar, zzfsu zzfsuVar, Timer timer) {
        this.zza = zzfsuVar;
        this.zzb = timer;
        Objects.requireNonNull(zzfsvVar);
        this.zzc = zzfsvVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzc.zze();
        this.zza.zza(true);
        this.zzb.cancel();
    }
}
