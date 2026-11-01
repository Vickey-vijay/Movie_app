package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhkb {
    private static final zzhkb zza = new zzhkb();
    private static final zzhka zzb = new zzhka(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzhkb zza() {
        return zza;
    }

    public final zzhjt zzb() {
        zzhjt zzhjtVar = (zzhjt) this.zzc.get();
        return zzhjtVar == null ? zzb : zzhjtVar;
    }
}
