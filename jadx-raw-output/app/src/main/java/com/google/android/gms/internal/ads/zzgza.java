package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgza extends zzgzb {
    public final /* synthetic */ zzgzc zza;
    private final Callable zzc;

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgzb
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final String zzc() {
        return this.zzc.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgza(zzgzc zzgzcVar, Callable callable, Executor executor) {
        super(zzgzcVar, executor);
        Objects.requireNonNull(zzgzcVar);
        this.zza = zzgzcVar;
        this.zzc = callable;
    }
}
