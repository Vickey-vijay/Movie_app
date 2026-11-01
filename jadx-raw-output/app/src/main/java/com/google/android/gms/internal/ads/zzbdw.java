package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzbdw implements Runnable {
    public final /* synthetic */ zzbdx zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbdx zzbdxVar = this.zza;
        synchronized (zzbdxVar.zzf()) {
            if (zzbdxVar.zzg().get() && zzbdxVar.zzh()) {
                zzbdxVar.zzg().set(false);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App went background");
                Iterator it = zzbdxVar.zzi().iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbdy) it.next()).zza(false);
                    } catch (Exception e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                    }
                }
            } else {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground");
            }
        }
    }

    public zzbdw(zzbdx zzbdxVar) {
        Objects.requireNonNull(zzbdxVar);
        this.zza = zzbdxVar;
    }
}
