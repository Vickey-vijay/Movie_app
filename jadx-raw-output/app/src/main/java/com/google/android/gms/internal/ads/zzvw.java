package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzvw {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private zzha zzc;

    public final void zza(zzha zzhaVar) {
        if (zzhaVar != this.zzc) {
            this.zzc = zzhaVar;
            this.zza.clear();
            this.zzb.clear();
        }
    }

    public zzvw(zzafa zzafaVar, zzamd zzamdVar) {
    }
}
