package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbqx extends zzbct implements zzbqy {
    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            parcel.readInt();
            zzbcu.zzh(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzbqx() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }
}
