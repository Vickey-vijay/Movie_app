package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbba extends zzbby {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzbba(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i10, int i11) {
        super(zzbakVar, "FynI9c5fEiMzQz2B7twhubBCGA6OmnD4m4mZd8FrJbuEtgSrrhq+E+F7XsfWYfqR", "1Y9Pw3JU+olt+lWU2l7rblcsXGsm1mQtokTJIYT27m0=", zzawgVar, i10, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                if (zzh == null) {
                    zzh = (Long) this.zze.invoke(null, new Object[0]);
                }
            }
        }
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzB(zzh.longValue());
        }
    }
}
