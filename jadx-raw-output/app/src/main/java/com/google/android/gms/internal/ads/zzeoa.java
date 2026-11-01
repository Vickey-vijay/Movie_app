package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzeoa {

    @Nullable
    private zzenr zza;

    public zzeoa() {
    }

    private zzeoa(zzenr zzenrVar) {
        this.zza = zzenrVar;
    }

    public static zzeoa zza(zzenr zzenrVar) {
        return new zzeoa(zzenrVar);
    }

    public final zzenr zzb(Clock clock, zzent zzentVar, zzekl zzeklVar, zzfqk zzfqkVar) {
        zzenr zzenrVar = this.zza;
        return zzenrVar != null ? zzenrVar : new zzenr(clock, zzentVar, zzeklVar, zzfqkVar);
    }
}
