package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzccj {
    private final Clock zza;
    private final zzcch zzb;

    public zzccj(Clock clock, zzcch zzcchVar) {
        this.zza = clock;
        this.zzb = zzcchVar;
    }

    public final void zzb() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfv zzfvVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd(int i10, long j10) {
        this.zzb.zza(i10, j10);
    }

    public static zzccj zza(Context context) {
        return zzccr.zzb(context).zza();
    }
}
