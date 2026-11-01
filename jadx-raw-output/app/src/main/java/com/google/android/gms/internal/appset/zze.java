package com.google.android.gms.internal.appset;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class zze extends zzb implements zzf {
    @Override // com.google.android.gms.internal.appset.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        zzb((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.appset.zzc) zzc.zza(parcel, com.google.android.gms.appset.zzc.CREATOR));
        return true;
    }

    public zze() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }
}
