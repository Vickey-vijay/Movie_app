package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgau implements zzikg {
    private final zzikp zza;

    private zzgau(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzgau zza(zzikp zzikpVar) {
        return new zzgau(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        File dir = ((Context) this.zza.zzb()).getDir("yqzdkcache", 0);
        zziko.zzb(dir);
        return dir;
    }
}
