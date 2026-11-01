package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class zzgok extends zzbct implements zzgol {
    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
        zzbcu.zzh(parcel);
        zzb(bundle);
        return true;
    }

    public zzgok() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }
}
