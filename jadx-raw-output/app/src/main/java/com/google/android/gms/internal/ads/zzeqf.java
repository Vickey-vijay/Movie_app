package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeqf {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdvp zzb;

    public final void zza(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e10);
        }
    }

    public final zzbvs zzb(String str) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbvs) concurrentHashMap.get(str);
        }
        return null;
    }

    public zzeqf(zzdvp zzdvpVar) {
        this.zzb = zzdvpVar;
    }
}
