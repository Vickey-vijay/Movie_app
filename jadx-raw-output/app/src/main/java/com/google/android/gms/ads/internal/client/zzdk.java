package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdk implements MuteThisAdReason {
    private final String zza;
    private final zzdj zzb;

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.zza;
    }

    public final String toString() {
        return this.zza;
    }

    public final zzdj zza() {
        return this.zzb;
    }

    public zzdk(zzdj zzdjVar) {
        String strZze;
        this.zzb = zzdjVar;
        try {
            strZze = zzdjVar.zze();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            strZze = null;
        }
        this.zza = strZze;
    }
}
