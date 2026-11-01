package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzbqc implements Runnable {
    public final /* synthetic */ zzbqf zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }

    public zzbqc(zzbqf zzbqfVar) {
        Objects.requireNonNull(zzbqfVar);
        this.zza = zzbqfVar;
    }
}
