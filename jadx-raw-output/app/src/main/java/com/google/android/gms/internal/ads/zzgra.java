package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class zzgra implements Serializable {
    public static zzgra zzc() {
        return zzgqj.zza;
    }

    public abstract Object zza(Object obj);

    public abstract zzgra zzb(zzgqt zzgqtVar);

    public static zzgra zzd(Object obj) {
        return obj == null ? zzgqj.zza : new zzgrh(obj);
    }
}
