package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzbas implements AppOpsManager$OnOpActiveChangedListener {
    public final /* synthetic */ zzbat zza;

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        if (z10) {
            zzbat zzbatVar = this.zza;
            zzbatVar.zze(System.currentTimeMillis());
            zzbatVar.zzh(true);
            return;
        }
        zzbat zzbatVar2 = this.zza;
        long jZzf = zzbatVar2.zzf();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jZzf > 0 && jCurrentTimeMillis >= zzbatVar2.zzf()) {
            zzbatVar2.zzg(jCurrentTimeMillis - zzbatVar2.zzf());
        }
        zzbatVar2.zzh(false);
    }

    public zzbas(zzbat zzbatVar) {
        Objects.requireNonNull(zzbatVar);
        this.zza = zzbatVar;
    }
}
