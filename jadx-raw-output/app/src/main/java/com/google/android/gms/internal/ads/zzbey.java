package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbey extends zzbcs implements zzbfa {
    public zzbey(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzb(zzbex zzbexVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, zzbexVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzc(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }
}
