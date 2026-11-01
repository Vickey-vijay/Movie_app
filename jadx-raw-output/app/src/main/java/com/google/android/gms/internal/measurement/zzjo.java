package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzjo {
    public static final zzjo zza = new zzjo(true);
    private static volatile boolean zzb;
    private static volatile zzjo zzc;
    private static volatile zzjo zzd;
    private final Map zze;

    public zzjo() {
        this.zze = new HashMap();
    }

    public zzjo(boolean z10) {
        this.zze = Collections.emptyMap();
    }

    public static zzjo zza() {
        zzjo zzjoVar = zzc;
        if (zzjoVar == null) {
            synchronized (zzjo.class) {
                zzjoVar = zzc;
                if (zzjoVar == null) {
                    zzjoVar = zza;
                    zzc = zzjoVar;
                }
            }
        }
        return zzjoVar;
    }

    public static zzjo zzb() {
        zzjo zzjoVar = zzd;
        if (zzjoVar != null) {
            return zzjoVar;
        }
        synchronized (zzjo.class) {
            zzjo zzjoVar2 = zzd;
            if (zzjoVar2 != null) {
                return zzjoVar2;
            }
            zzjo zzjoVarZzb = zzjw.zzb(zzjo.class);
            zzd = zzjoVarZzb;
            return zzjoVarZzb;
        }
    }

    public final zzka zzc(zzlj zzljVar, int i10) {
        return (zzka) this.zze.get(new zzjn(zzljVar, i10));
    }
}
