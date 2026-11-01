package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzeej extends zzeeq {
    private final Context zzg;
    private final Executor zzh;

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zze(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzou)).booleanValue() ? new zzeep(this.zza, this.zze) : new zzeeo(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzeff(1));
                } catch (Throwable th2) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "RemoteAdRequestClientTask.onConnected");
                    this.zza.zzd(new zzeff(1));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeeq, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzeff(1));
    }

    public final q5.i zza(zzbzu zzbzuVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbzuVar;
            this.zzf.checkAvailabilityAndConnect();
            zzcen zzcenVar = this.zza;
            zzcenVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeei
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            }, zzcei.zzg);
            zzeeq.zzc(this.zzg, zzcenVar, this.zzh);
            return zzcenVar;
        }
    }

    public zzeej(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbyw(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }
}
