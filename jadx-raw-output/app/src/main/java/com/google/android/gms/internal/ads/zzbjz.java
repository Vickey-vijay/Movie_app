package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbjz extends zzbcs {
    public zzbjz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbyv zzbyvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, zzbyvVar);
        zzda(1, parcelZza);
    }
}
