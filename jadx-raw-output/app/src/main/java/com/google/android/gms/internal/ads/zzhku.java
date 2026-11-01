package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhku {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhku(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhku zzd(zzhkt zzhktVar, Class cls, Class cls2) {
        return new zzhks(cls, cls2, zzhktVar);
    }

    public abstract Object zza(zzhaz zzhazVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
