package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzikh implements zzikg, zzika {
    private static final zzikh zza = new zzikh(null);
    private final Object zzb;

    private zzikh(Object obj) {
        this.zzb = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        return this.zzb;
    }

    public static zzikg zza(Object obj) {
        zziko.zza(obj, "instance cannot be null");
        return new zzikh(obj);
    }

    public static zzikg zzc(Object obj) {
        return obj == null ? zza : new zzikh(obj);
    }
}
