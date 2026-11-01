package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzblx extends zzbcs implements zzblz {
    public zzblx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final void zze(zzblm zzblmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, zzblmVar);
        zzda(1, parcelZza);
    }
}
