package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbau extends zzbby {
    private final Activity zzh;
    private final View zzi;

    public zzbau(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i10, int i11, View view, Activity activity) {
        super(zzbakVar, "v55I7GonHWsamYbBtyIFKaZFQR/sofAKKTQsUzMKV1C6iCJ1v6Vqzq9x9meUl2ez", "Z7zWno+0eCAtcsPK71T7clKp8ZTgICQrdpeo5cTQYQo=", zzawgVar, i10, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzi;
        if (view == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdp)).booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, view, this.zzh, Boolean.valueOf(zBooleanValue));
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzS(((Long) objArr[0]).longValue());
            zzawgVar.zzT(((Long) objArr[1]).longValue());
            if (zBooleanValue) {
                zzawgVar.zzU((String) objArr[2]);
            }
        }
    }
}
