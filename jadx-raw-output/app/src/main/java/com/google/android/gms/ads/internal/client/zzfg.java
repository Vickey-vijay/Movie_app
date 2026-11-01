package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzfg implements Runnable {
    public final /* synthetic */ zzfh zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzfi zzfiVar = this.zza.zza;
        if (zzfiVar.zzc() != null) {
            try {
                zzfiVar.zzc().zzc(1);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }

    public zzfg(zzfh zzfhVar) {
        Objects.requireNonNull(zzfhVar);
        this.zza = zzfhVar;
    }
}
