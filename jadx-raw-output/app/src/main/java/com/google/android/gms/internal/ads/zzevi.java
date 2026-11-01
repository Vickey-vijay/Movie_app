package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzevi {
    public final q5.i zza;
    private final long zzb;
    private final Clock zzc;

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }

    public zzevi(q5.i iVar, long j10, Clock clock) {
        this.zza = iVar;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j10;
    }
}
