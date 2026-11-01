package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhyg {
    private final zzhye zza;

    private zzhyg(zzhye zzhyeVar) {
        this.zza = zzhyeVar;
    }

    public final int zzd() {
        return this.zza.zzd();
    }

    public static zzhyg zza(byte[] bArr, zzhbt zzhbtVar) {
        return new zzhyg(zzhye.zza(bArr));
    }

    public static zzhyg zzb(int i10) {
        return new zzhyg(zzhye.zza(zzhle.zza(i10)));
    }

    public final byte[] zzc(zzhbt zzhbtVar) {
        return this.zza.zzc();
    }
}
