package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhsd {
    public static final zzhsd zza = new zzhsd("SHA256");
    public static final zzhsd zzb = new zzhsd("SHA384");
    public static final zzhsd zzc = new zzhsd("SHA512");
    private final String zzd;

    private zzhsd(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
