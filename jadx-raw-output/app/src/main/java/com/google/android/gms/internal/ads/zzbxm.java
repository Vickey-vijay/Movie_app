package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzbxm extends zzbcs implements zzbxo {
    public zzbxm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbxo
    public final zzbxl zze(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i10) throws RemoteException {
        zzbxl zzbxjVar;
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzbcu.zze(parcelZza, zzbttVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbxjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (iInterfaceQueryLocalInterface instanceof zzbxl) {
                zzbxjVar = (zzbxl) iInterfaceQueryLocalInterface;
            } else {
                zzbxjVar = new zzbxj(strongBinder);
            }
        }
        parcelZzcZ.recycle();
        return zzbxjVar;
    }
}
