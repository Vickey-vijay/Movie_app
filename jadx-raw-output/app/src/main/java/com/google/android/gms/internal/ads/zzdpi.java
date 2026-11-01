package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdpi {
    private final zzdxz zza;

    public zzdpi(zzdxz zzdxzVar) {
        this.zza = zzdxzVar;
    }

    public final void zza(@Nullable View view, zzfir zzfirVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzos)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(view) ? "0" : "1";
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("action", "hcp");
        zzdxyVarZza.zzc("hcp", str);
        zzdxyVarZza.zzb(zzfirVar);
        zzdxyVarZza.zzd();
    }
}
