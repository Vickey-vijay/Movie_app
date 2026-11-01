package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcau extends zzbcs implements zzcaw {
    public zzcau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final String zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(1, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final int zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        int i10 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i10;
    }
}
