package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcd extends zzbct implements zzce {
    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzft zzftVar = (zzft) zzbcu.zzb(parcel, zzft.CREATOR);
            zzbcu.zzh(parcel);
            zze(zzftVar);
        } else {
            if (i10 != 2) {
                return false;
            }
            zzft zzftVar2 = (zzft) zzbcu.zzb(parcel, zzft.CREATOR);
            zzbcu.zzh(parcel);
            zzf(zzftVar2);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }
}
