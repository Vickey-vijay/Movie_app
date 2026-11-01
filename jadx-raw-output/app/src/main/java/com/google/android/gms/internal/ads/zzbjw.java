package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbjw {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static zzbju zza() {
        return (zzbju) zza.get();
    }

    public static zzbjv zzb() {
        return (zzbjv) zzb.get();
    }

    public static void zzc(zzbju zzbjuVar) {
        zza.set(zzbjuVar);
    }
}
