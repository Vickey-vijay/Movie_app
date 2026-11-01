package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzham extends zzgzv {
    public final /* synthetic */ zzhan zza;
    private final Callable zzb;

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzf(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzg(Throwable th2) {
        this.zza.zzb(th2);
    }

    public zzham(zzhan zzhanVar, Callable callable) {
        Objects.requireNonNull(zzhanVar);
        this.zza = zzhanVar;
        callable.getClass();
        this.zzb = callable;
    }
}
