package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbqm;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzew extends zzbqm {
    public final /* synthetic */ zzex zza;

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(List list) throws RemoteException {
        int i10;
        ArrayList arrayList;
        zzex zzexVar = this.zza;
        synchronized (zzexVar.zzw()) {
            zzexVar.zzy(false);
            zzexVar.zzz(true);
            arrayList = new ArrayList(zzexVar.zzx());
            zzexVar.zzx().clear();
        }
        InitializationStatus initializationStatusZzB = zzex.zzB(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((OnInitializationCompleteListener) arrayList.get(i10)).onInitializationComplete(initializationStatusZzB);
        }
    }

    public /* synthetic */ zzew(zzex zzexVar, byte[] bArr) {
        Objects.requireNonNull(zzexVar);
        this.zza = zzexVar;
    }
}
