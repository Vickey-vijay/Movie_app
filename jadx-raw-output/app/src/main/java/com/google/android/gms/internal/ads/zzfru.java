package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfru implements Runnable {
    public final /* synthetic */ zzfsa zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzG();
    }

    public zzfru(zzfsa zzfsaVar) {
        Objects.requireNonNull(zzfsaVar);
        this.zza = zzfsaVar;
    }
}
