package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzedm implements zzikg {
    private final zzikp zza;

    private zzedm(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzedm zzc(zzikp zzikpVar) {
        return new zzedm(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzcmj) this.zza).zza().getPackageName();
        zziko.zzb(packageName);
        return packageName;
    }
}
