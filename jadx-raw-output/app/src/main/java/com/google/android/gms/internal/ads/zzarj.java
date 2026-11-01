package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
final class zzarj implements Runnable {
    public final /* synthetic */ zzary zza;
    public final /* synthetic */ zzark zzb;

    public zzarj(zzark zzarkVar, zzary zzaryVar) {
        this.zza = zzaryVar;
        Objects.requireNonNull(zzarkVar);
        this.zzb = zzarkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzb().put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
