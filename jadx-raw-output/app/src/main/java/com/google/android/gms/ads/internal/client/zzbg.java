package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbct;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbg extends zzbct implements zzbh {
    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }

    public zzbg() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }
}
