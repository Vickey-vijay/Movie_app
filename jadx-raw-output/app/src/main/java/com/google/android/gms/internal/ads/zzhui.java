package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhui {
    public static final zzhui zza = new zzhui("SHA256");
    public static final zzhui zzb = new zzhui("SHA384");
    public static final zzhui zzc = new zzhui("SHA512");
    private final String zzd;

    private zzhui(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
