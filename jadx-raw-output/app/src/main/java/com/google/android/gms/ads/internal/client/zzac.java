package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzbyp;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzac extends zzba {
    public final /* synthetic */ Activity zza;
    public final /* synthetic */ zzaz zzb;

    public zzac(zzaz zzazVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzazVar);
        this.zzb = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzm(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        Activity activity = this.zza;
        zzbhe.zza(activity);
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzmf)).booleanValue()) {
            zzaz zzazVar = this.zzb;
            return zzazVar.zzr().zza(this.zza);
        }
        try {
            return zzbxr.zzI(((zzbxv) com.google.android.gms.ads.internal.util.client.zzs.zza(activity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzab
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final /* synthetic */ Object zza(Object obj) {
                    return zzbxu.zzb((IBinder) obj);
                }
            })).zze(ObjectWrapper.wrap(activity)));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e10) {
            zzaz zzazVar2 = this.zzb;
            zzazVar2.zzu(zzbyp.zza(this.zza.getApplicationContext()));
            zzazVar2.zzt().zzh(e10, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc(zzcr zzcrVar) throws RemoteException {
        return zzcrVar.zzg(ObjectWrapper.wrap(this.zza));
    }
}
