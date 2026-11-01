package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class zzccz extends zzbct implements zzcda {
    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            parcel.readString();
            parcel.readString();
            zzbcu.zzh(parcel);
        } else if (i10 == 2) {
            String string = parcel.readString();
            zzbcu.zzh(parcel);
            zzb(string);
        } else {
            if (i10 != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
            zzbcu.zzh(parcel);
            zzc(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzccz() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }
}
