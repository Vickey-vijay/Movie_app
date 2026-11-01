package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzgzn {
    private final boolean zza;
    private final zzguf zzb;

    public /* synthetic */ zzgzn(boolean z10, zzguf zzgufVar, byte[] bArr) {
        this.zza = z10;
        this.zzb = zzgufVar;
    }

    public final q5.i zza(Callable callable, Executor executor) {
        return new zzgzc(this.zzb, this.zza, executor, callable);
    }
}
