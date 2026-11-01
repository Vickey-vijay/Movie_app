package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzikc implements zzikg {
    private final Map zza;

    public final Map zza() {
        return this.zza;
    }

    public zzikc(Map map) {
        this.zza = Collections.unmodifiableMap(map);
    }
}
