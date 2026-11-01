package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzlr {
    private static final zzlr zza = new zzlr();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzlv zzb = new zzlb();

    public static zzlr zza() {
        return zza;
    }

    public final zzlu zzb(Class cls) {
        zzkk.zzf(cls, "messageType");
        zzlu zzluVarZza = (zzlu) this.zzc.get(cls);
        if (zzluVarZza == null) {
            zzluVarZza = this.zzb.zza(cls);
            zzkk.zzf(cls, "messageType");
            zzkk.zzf(zzluVarZza, "schema");
            zzlu zzluVar = (zzlu) this.zzc.putIfAbsent(cls, zzluVarZza);
            if (zzluVar != null) {
                return zzluVar;
            }
        }
        return zzluVarZza;
    }

    private zzlr() {
    }
}
