package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzesu implements zzfax {
    private final Clock zza;
    private final zzfjk zzb;
    private final long zzc;

    public zzesu(Clock clock, zzfjk zzfjkVar, long j10) {
        this.zza = clock;
        this.zzb = zzfjkVar;
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return zzgzo.zza(new zzesv(this.zzb, this.zza.currentTimeMillis(), this.zzc));
    }
}
