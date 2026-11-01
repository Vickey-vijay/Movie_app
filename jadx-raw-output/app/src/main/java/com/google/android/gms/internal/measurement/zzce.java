package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzce extends zzbn implements zzcf {
    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
        zzbo.zzc(parcel);
        zzd(bundle);
        parcel2.writeNoException();
        return true;
    }

    public zzce() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }
}
