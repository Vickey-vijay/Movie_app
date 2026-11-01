package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhkk {
    private final zzhye zza;
    private final Class zzb;

    public /* synthetic */ zzhkk(zzhye zzhyeVar, Class cls, byte[] bArr) {
        this.zza = zzhyeVar;
        this.zzb = cls;
    }

    public static zzhkk zzd(zzhkj zzhkjVar, zzhye zzhyeVar, Class cls) {
        return new zzhki(zzhyeVar, cls, zzhkjVar);
    }

    public abstract zzhbp zza(zzhlg zzhlgVar) throws GeneralSecurityException;

    public final zzhye zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
