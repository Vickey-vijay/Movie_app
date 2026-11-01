package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzbah implements Runnable {
    public final /* synthetic */ zzbak zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzr();
    }

    public zzbah(zzbak zzbakVar) {
        Objects.requireNonNull(zzbakVar);
        this.zza = zzbakVar;
    }
}
