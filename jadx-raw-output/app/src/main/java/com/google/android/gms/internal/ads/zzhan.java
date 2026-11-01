package com.google.android.gms.internal.ads;

import com.ironsource.C3426d4;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzhan extends zzgzf implements RunnableFuture {
    private volatile zzgzv zza;

    public zzhan(zzgyv zzgyvVar) {
        this.zza = new zzhal(this, zzgyvVar);
    }

    public zzhan(Callable callable) {
        this.zza = new zzham(this, callable);
    }

    public static zzhan zze(Runnable runnable, Object obj) {
        return new zzhan(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgzv zzgzvVar = this.zza;
        if (zzgzvVar != null) {
            zzgzvVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        zzgzv zzgzvVar = this.zza;
        if (zzgzvVar == null) {
            return super.zzd();
        }
        String string = zzgzvVar.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 7);
        sb2.append("task=[");
        sb2.append(string);
        sb2.append(C3426d4.j.f28588e);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzc() {
        zzgzv zzgzvVar;
        if (zzj() && (zzgzvVar = this.zza) != null) {
            zzgzvVar.zzh();
        }
        this.zza = null;
    }
}
