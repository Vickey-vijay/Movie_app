package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbgi {

    @VisibleForTesting
    public zzbda zza;

    @VisibleForTesting
    public boolean zzb;
    private final ExecutorService zzc;

    public zzbgi() {
        this.zzc = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }

    public final /* synthetic */ ExecutorService zza() {
        return this.zzc;
    }

    public zzbgi(final Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbge
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgd)).booleanValue();
                Context context2 = context;
                zzbgi zzbgiVar = this.zza;
                if (zBooleanValue) {
                    try {
                        zzbgiVar.zza = (zzbda) com.google.android.gms.ads.internal.util.client.zzs.zza(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzbgf
                            @Override // com.google.android.gms.ads.internal.util.client.zzq
                            public final /* synthetic */ Object zza(Object obj) {
                                return zzbcz.zzb((IBinder) obj);
                            }
                        });
                        zzbgiVar.zza.zze(ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzbgiVar.zzb = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
