package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzczz {
    private final AtomicLong zza;

    public final long zza() {
        return this.zza.get();
    }

    public final void zzb(long j10) {
        this.zza.set(j10);
    }

    public zzczz(zzfjc zzfjcVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.zza = atomicLong;
        atomicLong.set(zzfjcVar.zza.zza.zzu.get());
    }
}
