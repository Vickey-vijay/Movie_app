package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzefy implements zzeek {
    public final /* synthetic */ zzegb zza;

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpB)).booleanValue()) {
            zzdxy zzdxyVarZza = this.zza.zzd().zza();
            zzdxyVarZza.zzc("action", "ptard");
            zzdxyVarZza.zzc("ptard", "r");
            zzdxyVarZza.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zzb(RemoteException remoteException) {
        this.zza.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpC)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(remoteException, "Preconnect Remote");
        }
    }

    public zzefy(zzegb zzegbVar) {
        Objects.requireNonNull(zzegbVar);
        this.zza = zzegbVar;
    }
}
