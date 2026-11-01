package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzabk implements zzabl {
    public final /* synthetic */ Executor zza;
    public final /* synthetic */ zzdr zzb;

    public zzabk(Executor executor, zzdr zzdrVar) {
        this.zza = executor;
        this.zzb = zzdrVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
