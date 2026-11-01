package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcei;
import q5.i;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    public final /* synthetic */ void zzc(Thread thread) {
        this.zzb = thread;
    }

    public i zzb() {
        return zzcei.zza.submit(this.zza);
    }
}
