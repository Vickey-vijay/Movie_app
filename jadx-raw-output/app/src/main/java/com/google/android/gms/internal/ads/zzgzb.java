package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
abstract class zzgzb extends zzgzv {
    private final Executor zza;
    public final /* synthetic */ zzgzc zzb;

    public abstract void zzb(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzd() {
        return this.zzb.isDone();
    }

    public final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e10) {
            this.zzb.zzb(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzf(Object obj) {
        this.zzb.zzD(null);
        zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzg(Throwable th2) {
        zzgzc zzgzcVar = this.zzb;
        zzgzcVar.zzD(null);
        if (th2 instanceof ExecutionException) {
            zzgzcVar.zzb(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            zzgzcVar.cancel(false);
        } else {
            zzgzcVar.zzb(th2);
        }
    }

    public zzgzb(zzgzc zzgzcVar, Executor executor) {
        Objects.requireNonNull(zzgzcVar);
        this.zzb = zzgzcVar;
        executor.getClass();
        this.zza = executor;
    }
}
